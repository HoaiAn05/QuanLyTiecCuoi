/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public class SanhCuoi extends DichVuChoThue {

    private static int dem;
    private int viTri;
    private int sucChua;
    private ThoiDiem thoiDiem;

    public SanhCuoi(String name, double price, int viTri, int sucChua, ThoiDiem thoiDiem) {
        super(name, price);
        this.id = String.format("S%03d", ++dem);
        this.viTri = viTri;
        this.sucChua = sucChua;
        this.thoiDiem = thoiDiem;
    }


    public double tienSanh() {
        return this.thoiDiem.price(this.price);
    }

    public SanhCuoi() {
    }

    @Override
    public void hienThi() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Id:%s\nTen:%s\nThoi diem:%s\nGia:%.1f\nvi tri:%d\nSuc chua:%d\n", this.id, this.name, this.thoiDiem, tienSanh(), this.viTri, this.sucChua);
    }

    @Override
    public void nhap1DichVu() {
        super.nhap1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("vi tri:");
        this.viTri = Integer.parseInt(CauHinh.SC.nextLine());
        System.out.println("suc chua:");
        this.sucChua = Integer.parseInt(CauHinh.SC.nextLine());
    }

    /**
     * @return the viTri
     */
    public int getViTri() {
        return viTri;
    }

    /**
     * @param viTri the viTri to set
     */
    public void setViTri(byte viTri) {
        this.viTri = viTri;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    /**
     * @return the thoiDiem
     */
    public ThoiDiem getThoiDiem() {
        return thoiDiem;
    }

    /**
     * @param thoiDiem the thoiDiem to set
     */
    public void setThoiDiem(ThoiDiem thoiDiem) {
        this.thoiDiem = thoiDiem;
    }

}
