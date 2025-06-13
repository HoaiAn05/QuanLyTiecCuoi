/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public class ThucAn extends Menu {

    private static int dem;
    private boolean isAnChay;

    public ThucAn(String name, double price, boolean isAnChay) {
        super(name, price);
        this.maMn = ++dem;
        this.isAnChay = isAnChay;
    }

    public ThucAn() {
    }

    @Override
    public void hienThi() {
        super.hienThi();
        if (isAnChay == true) {
            System.out.println("\nAn chay duoc");
        } else {
            System.out.println("\nKhong an chay duoc");
        }
    }

    @Override
    public void nhap1DichVu() {
        super.nhap1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("\nan chay duoc khong :");
        this.isAnChay = Boolean.parseBoolean(CauHinh.SC.nextLine());
    }

    /**
     * @return the isAnChay
     */
    public boolean isIsAnChay() {
        return true;
    }

    /**
     * @param isAnChay the isAnChay to set
     */
    public void setIsAnChay(boolean isAnChay) {
        this.isAnChay = isAnChay;
    }

}
