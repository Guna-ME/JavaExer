package com.twitterclone.infra.base;

import java.util.Date;

public interface IEntidadeBase {
    Integer getId();
    void setId(Integer id);
    Boolean getInativo();
    void setInativo(Boolean inativo);
    Date getDataCadastro();
    void setDataCadastro(Date dataCadastro);
}