/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public class Karaoke extends DichVu{
    private static int dem;
    private double khoangThoiGianThue;

    public Karaoke( String name,double price,double khoangThoiGianThue) {
        super( name,price);
        this.id=String.format("K%03d", ++dem);
        this.khoangThoiGianThue = khoangThoiGianThue;
    }

    public Karaoke() {
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("khoang thoi gian thue:%.1f\n",this.khoangThoiGianThue);
    }

    /**
     * @return the khoangThoiGianThue
     */
    public double getKhoangThoiGianThue() {
        return khoangThoiGianThue;
    }

    /**
     * @param khoangThoiGianThue the khoangThoiGianThue to set
     */
    public void setKhoangThoiGianThue(int khoangThoiGianThue) {
        this.khoangThoiGianThue = khoangThoiGianThue;
    }

    @Override
    public void nhap1DichVu() {
        super.nhap1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("khoang thoi gian thue: ");
        this.khoangThoiGianThue=Integer.parseInt(CauHinh.SC.nextLine());
    } 
}
