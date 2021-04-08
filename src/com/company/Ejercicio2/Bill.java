package com.company.Ejercicio2;

import java.time.LocalDate;


public class Bill {
    private String id;
    private LocalDate day=LocalDate.now();
    private Cliente cliente;
    private SaleItem [] items;


    public Bill(String id, LocalDate day, Cliente cliente, SaleItem[] items) {
        this.id = id;
        this.day = day;
        this.cliente = cliente;
        this.items = items;
    }

    public double calculateTotal(){
        double total = 0;
        for (SaleItem item : items){
            if(item!=null) {
                total += item.getPrice();
            }
        }
        return total;
    }

    public double finalAmount(){
        double total=calculateTotal();
        double descuento=0;
        descuento= total*cliente.getOff()/100;
        return total-descuento;
    }



    @Override
    public String toString() {
        return "id= " + id + ", totalAmount=" + finalAmount() + ", day=" + day+ ", " + cliente ;
    }
}

