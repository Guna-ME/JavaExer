package com.twitterclone.infra.base;

import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class EntidadeBase implements IEntidadeBase {
    private Integer id;
    private Boolean inativo = false;
    private Date dataCadastro = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInativo() {
        return inativo;
    }

    public void setInativo(Boolean inativo) {
        this.inativo = inativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}