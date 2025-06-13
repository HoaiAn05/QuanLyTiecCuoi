/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.group22;

/**
 *
 * @author Admin
 */
public abstract class DichVuChoThue {
    protected String id;
    protected String name;
    protected double price;

    public DichVuChoThue( String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void hienThi(){
        System.out.printf("id:%s\nName:%s\nPrice:%.1f\n",this.id,this.name,this.price);
    }

    public DichVuChoThue() {
    }

    public void nhap1DichVu() {
        System.out.println("ten: ");
        this.name = CauHinh.SC.nextLine();
        System.out.println("price: ");
        this.price=Double.parseDouble(CauHinh.SC.nextLine());
    }
    public void hoaDon(){
        
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }


}
