package com.example.banco.classes;

public class Cliente {
    private String nome;
    private String saldo;
    private String senha;
    
    public Cliente(String nome, String saldo, String senha) {
        this.nome = nome;
        this.saldo = saldo;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
