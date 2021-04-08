package com.company.Ejercicio1;

public class Author {
    private String name, lastName, mail;
    private char gender;
    public Author(){

    }
    public Author(String name, String lastName, String mail, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nApellido: " + lastName + "\nMail: " + mail + "\nGenero: " + gender;
    }

}
