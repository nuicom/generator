package com.nui.generator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Generator {
    @Id
    private String genName;
    private Integer genValue;

    public String getGenName() {
        return genName;
    }

    public void setGenName(String genName) {
        this.genName = genName;
    }

    public Integer getGenValue() {
        return genValue;
    }

    public void setGenValue(Integer genValue) {
        this.genValue = genValue;
    }
}
