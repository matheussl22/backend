package br.com.core.support.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class BaseEntity {

    public Object getId() {
        return null;
    }

    @JsonIgnore
    public boolean isNew() {
        return getId() == null;
    }

}
