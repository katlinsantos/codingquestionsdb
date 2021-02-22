package com.mychelantonacio.cqdb.util.enums;


public enum CategoryEnum {

    CODING("COD"),
    DESIGN("DES");

    private final String categoryCode;


    CategoryEnum(String categoryCode){
        this.categoryCode = categoryCode;
    }

    public String getCategoryCode(){
        return this.categoryCode;
    }
}