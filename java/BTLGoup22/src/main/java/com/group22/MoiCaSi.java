/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public class MoiCaSi extends DichVu {

    private static int dem;
    private String tenCaSi;
    private int soLuongBaiHat;

    public MoiCaSi(String name, double price, String tenCaSi, int soLuongBaiHat) {
        super(name, price);
        this.id = String.format("CS%03d", ++dem);
        this.tenCaSi = tenCaSi;
        this.soLuongBaiHat = soLuongBaiHat;
    }

    public MoiCaSi() {
    }

    @Override
    public void nhap1DichVu() {
        super.nhap1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("ten ca si:");
        this.tenCaSi = CauHinh.SC.nextLine();
        System.out.println("so luong bai hat:");
        this.soLuongBaiHat = Integer.parseInt(CauHinh.SC.nextLine());
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("ten ca si:%s\nSo luong bai hat:%d\n ", this.tenCaSi, this.soLuongBaiHat);
    }

    /**
     * @return the tenCaSi
     */
    public String getTenCaSi() {
        return tenCaSi;
    }

    /**
     * @param tenCaSi the tenCaSi to set
     */
    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    /**
     * @return the soLuongBaiHat
     */
    public int getSoLuongBaiHat() {
        return soLuongBaiHat;
    }

    /**
     * @param soLuongBaiHat the soLuongBaiHat to set
     */
    public void setSoLuongBaiHat(int soLuongBaiHat) {
        this.soLuongBaiHat = soLuongBaiHat;
    }
}
