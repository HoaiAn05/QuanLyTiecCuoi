/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public class TrangTri extends DichVu {

    private static int dem;

    public TrangTri( String  name,double price) {
        super( name,price);
        this.id = String.format("T%03d", ++dem);
    }

    public TrangTri() {
    }

    @Override
    public void hienThi() {
        super.hienThi();
    }

    @Override
    public void nhap1DichVu() {
        super.nhap1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


}
