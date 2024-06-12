package com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String email;
  private String senha;
  private String nome;
  private String celular;
  private String cpf;

  @ManyToOne
  @JoinColumn(name = "endereco_id")
  private Endereco endereco;

  // Getters e Setters
  public Long getId() {
      return id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getSenha() {
      return senha;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getCelular() {
      return celular;
  }

  public void setCelular(String celular) {
      this.celular = celular;
  }

  public String getCpf() {
      return cpf;
  }

  public void setCpf(String cpf) {
      this.cpf = cpf;
  }

  public Endereco getEndereco() {
      return endereco;
  }

  public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
  }
}
