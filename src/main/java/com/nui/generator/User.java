package com.nui.generator;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @TableGenerator(name = "UserGen",
            table = "GENERATOR",
            pkColumnName = "GEN_NAME",
            pkColumnValue = "USER_Gen",
            valueColumnName = "GEN_VALUE",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "UserGen")
    private Integer id;
    private String name;

//    @TableGenerator(name = "UserGen",
//            table = "GENERATOR",
//            pkColumnName = "GEN_NAME",
//            pkColumnValue = "USER_Gen",
//            valueColumnName = "GEN_VALUE",
//            initialValue = 1,
//            allocationSize = 1
//    )
////    @GeneratedValue(strategy = GenerationType.TABLE,generator = "UserGen")
    private String gen;

    public User(){
        super();
    }

    public User(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }
}
