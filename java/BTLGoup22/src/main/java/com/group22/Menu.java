/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public abstract class Menu extends DichVuChoThue {

    protected int maMn;

    public Menu(String name, double price) {
        super(name, price);
    }

    public Menu() {
    }
    
//    public Menu(String ten) {
//        this.ten=ten;
//    }
    @Override
    public void hienThi() {
        System.out.printf("Ma mon:%d\nTen mon:%s\nGia:%.1f",this.maMn,this.name,this.price);
    }

    @Override
    public void nhap1DichVu() {
        super.nhap1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
