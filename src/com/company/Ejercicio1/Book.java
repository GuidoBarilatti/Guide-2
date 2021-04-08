package com.company.Ejercicio1;

public class Book {
    private  String title;
    private double price;
    private int stock;
    private Author[] authors;
    public Book(){
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Book(String title, double price, int stock, Author[] author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = author;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                "\nprice=" + price +
                "\nstock=" + stock +
                "\nauthor=\n" + authors;
    }
    public String showMessage(){
        StringBuilder names= new StringBuilder();
        for (Author author:authors){
            if(authors!=null){
                names.append(author.getName());
                names.append(" ");
                names.append(author.getLastName());
                names.append(", ");
            }
        }
        String s = "El libro" + this.title + "escrito por" + names + "cuesta " + this.price + "pesos";
        return s;
    }
}
