/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seccionb;

/**
 *
 * @author asala
 */
public class Technology extends PhysicalProduct{
       public Technology(String name, double price, double weight){
        super(name,price,weight);
    }
    
    @Override
    public double calculateIVA(double price) {
        return getPrice() * 0.15; 
    }
    
}