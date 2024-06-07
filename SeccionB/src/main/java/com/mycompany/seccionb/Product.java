/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccionb;

/**
 *
 * @author asala
 */
public abstract class Product implements IvaCalculator{
    private String name;
    protected double price;
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
     public double getPrice(){
        return price;
    }
     
     
}
