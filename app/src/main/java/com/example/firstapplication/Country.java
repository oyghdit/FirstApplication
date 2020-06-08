package com.example.firstapplication;

public class Country {
    private String name;
    private int imgeId;
    public Country(String name,int imgeId){
        this.name=name;
        this.imgeId=imgeId;

    }
    public String getName(){
        return name;
    }
    public int getImgeId(){
        return imgeId;
    }
}
