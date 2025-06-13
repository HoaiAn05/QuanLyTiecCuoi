/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public class ThucUong extends Menu {

    private static int dem;
    private String hangSanXuat;

    public ThucUong(String name, double price, String hangSanXuat) {
        super(name, price);
        this.maMn = ++dem;
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("\nhang san xuat: %s\n", this.getHangSanXuat());
    }

    public ThucUong() {
    }

    @Override
    public void nhap1DichVu() {
        super.nhap1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("ten hang san xuat:\n");
        this.hangSanXuat = CauHinh.SC.nextLine();
    }

    /**
     * @return the hangSanXuat
     */
    public String getHangSanXuat() {
        return hangSanXuat;
    }

    /**
     * @param hangSanXuat the hangSanXuat to set
     */
    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
}
