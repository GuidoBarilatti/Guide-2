package com.company;

import com.company.Ejercicio1.Author;
import com.company.Ejercicio1.Book;
import com.company.Ejercicio2.Bill;
import com.company.Ejercicio2.Cliente;
import com.company.Ejercicio2.SaleItem;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int option=1;
        while (option!=0){
            System.out.println("Elija un ejercicio a realizar");
            option= scanner.nextInt();
            switch (option){
                case 1:
                    exercise1();
                    break;
                case 2:
                    exercise2();
                    break;
                case 0:
                    option=0;
                    break;
                default:
                    System.out.println("No existe ese ejercicio... o no lo hice gg");
            }

        }
    }

    public static void exercise1(){
        Author[] authors = new Author[2];
        Author joshua= new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        Author marta= new Author("Marta", "Pepis", "Pepis@gmail.com", 'F');
        authors[0]=joshua;
        authors[1]=marta;
        System.out.println(authors[0]);
        Book book= new Book("Effective Java",450,150,authors);

        book.setPrice(500);
        book.setStock(book.getStock()+50);
        System.out.println(book.showMessage());
    }
    public static void exercise2(){
        Cliente client=new Cliente(UUID.randomUUID().toString().substring(5,15).replace("-",""),"pepe","pepe@hotmai.com",15);
        System.out.println(client.toString());
        SaleItem [] items = new SaleItem[10];
        SaleItem item1= new SaleItem(UUID.randomUUID().toString().substring(3,15).replace("-",""),"silla","aca te sentas",450);
        SaleItem item2= new SaleItem(UUID.randomUUID().toString().substring(2,15).replace("-",""),",esa","aca comes",600);
        items[0]=item1;
        items[1]=item2;
        Bill bill=new Bill(UUID.randomUUID().toString().substring(4,15).replace("-",""), LocalDate.now(),client,items);
        System.out.println(bill.toString());

    }
}
