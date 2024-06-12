package com.example.demo.controllers;

import com.example.demo.models.Usuario;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
@Autowired
private UsuarioService usuarioService;

@GetMapping
public List<Usuario> getAllUsuarios() {
    return usuarioService.findAll();
}

@GetMapping("/{id}")
public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
    Optional<Usuario> usuario = usuarioService.findById(id);
    if (usuario.isPresent()) {
        return ResponseEntity.ok(usuario.get());
    } else {
        return ResponseEntity.notFound().build();
    }
}

@PostMapping
public Usuario createUsuario(@RequestBody Usuario usuario) {
    return usuarioService.save(usuario);
}

@PutMapping("/{id}")
public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails) {
    Optional<Usuario> usuario = usuarioService.findById(id);
    if (usuario.isPresent()) {
        Usuario updatedUsuario = usuario.get();
        updatedUsuario.setEmail(usuarioDetails.getEmail());
        updatedUsuario.setSenha(usuarioDetails.getSenha());
        updatedUsuario.setNome(usuarioDetails.getNome());
        updatedUsuario.setCelular(usuarioDetails.getCelular());
        updatedUsuario.setCpf(usuarioDetails.getCpf());
        updatedUsuario.setEndereco(usuarioDetails.getEndereco());
        return ResponseEntity.ok(usuarioService.save(updatedUsuario));
    } else {
        return ResponseEntity.notFound().build();
    }
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
    Optional<Usuario> usuario = usuarioService.findById(id);
    if (usuario.isPresent()) {
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    } else {
        return ResponseEntity.notFound().build();
    }
}
}