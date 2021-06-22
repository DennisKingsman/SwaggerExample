package com.nf.swagger.model;

import liquibase.datatype.core.ClobType;
import lombok.Data;
import oracle.sql.CLOB;

import java.sql.Clob;

@Data
public class Doc {

    private Long id;
    private String title;
    private String author;
    private String text;

}
