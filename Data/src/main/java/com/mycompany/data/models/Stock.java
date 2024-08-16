/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data.models;

/**
 *
 * @author pulkit
 */
public class Stock{
    public int id,price;
    public String name,type;
    public Stock(){}
    public Stock(int id,String name,int price, String type){
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Stock [ id : "+id+" , "+name+" , "+price+" , "+type+" ]";
    }
} 

