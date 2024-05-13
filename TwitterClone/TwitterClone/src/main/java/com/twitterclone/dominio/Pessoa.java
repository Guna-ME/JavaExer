package com.twitterclone.dominio;

import com.twitterclone.dominio.enums.Sexo;
import com.twitterclone.infra.base.EntidadeBase;
import com.twitterclone.infra.base.IEntidadeBase;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

//Por conta do "extends EntidadeBase"
//eu não preciso criar os campos id, inativo e dataCriacao
//pois eles são herdados da entidade base
//e por conta do "implements IEntidadeBase"
//o meus metodos abstratos (bases) conseguem saber que aquela entidade generica
//vai ter id, inativo e dataCriacao

@Component
public class Pessoa extends EntidadeBase implements IEntidadeBase {
    private String nome;
    private String nomeUsuario;
    private Date dataNascimento;
    private Sexo sexo;
    private String email;
    private String senha; //todo Angelo: Mover para entidade separada
    private String urlImagem;


    //region Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date setDataNasimento() {
        return dataNascimento;
    }

    public void setDataNasimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
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

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
    //endregion
}
