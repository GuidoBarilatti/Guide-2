package com.company.Ejercicio2;

public class Cliente {
    private String id;
    private String name;
    private String mail;
    private double off;
    public Cliente(){
    }

    public Cliente(String id, String name, String mail, double off) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.off = off;
    }

    public double getOff() {
        return off;
    }

    @Override
    public String toString() {
        return "Cliente[id= " + id + ", name= " + name + ", mail= " + mail  + ", off= %" + off + ']';
    }
}
