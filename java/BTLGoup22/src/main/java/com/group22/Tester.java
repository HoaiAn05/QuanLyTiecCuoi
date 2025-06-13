/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) throws InvocationTargetException {

        TiecCuoi t = new TiecCuoi();

        TiecCuoi t1 = new TiecCuoi("MARY & JONH", LocalDate.of(2024, 3, 31));
        TiecCuoi t2 = new TiecCuoi("LISA && SONG YONG KI", "22/05/2024");

        DichVuChoThue s1 = new SanhCuoi("Sanh A", 10000000, 1, 400, ThoiDiem.TOI_THUONG);
        DichVuChoThue s2 = new SanhCuoi("Sanh B", 20000000, 3, 500, ThoiDiem.TOI_CUOITUAN);

        Menu m1 = new ThucAn("Lau ga la e", 400000, false);
        Menu m2 = new ThucAn("Dau hu ", 200000, true);
        Menu m3 = new ThucUong("bia tiger", 450000, "tiger");
        Menu m4 = new ThucUong("Nuoc suoi", 100000, "Lavie");

        DichVu d1 = new Karaoke("Karaoke", 100000, 5);
        DichVu d2 = new MoiCaSi("Moi ca si", 5000000, "Khoi My", 2);
        DichVu d3 = new TrangTri("Trang tri", 10000000);

        t1.themMenu(m1, m3);
        t2.themMenu(m2, m4);

        t1.themDv(d1, d3);
        t2.themDv(d2);

        t1.themSanhCuoi(s1);
        t2.themSanhCuoi(s2);

        t1.hienThi();
        System.out.println("============================\n");
        t2.hienThi();

        System.out.println("============================\n");
        System.out.println("Tong hoa don: \n");
        t1.hoaDon();

        System.out.println("============================");
        t1.xoaSanhCuoi("Sanh B");
        t1.hienThi();
        System.out.println("============================");

        t1.timMenu("bia tiger").forEach((Menu s) -> {
            s.hienThi();
        });
        
        System.out.println("============================");
        t1.timKiemSanhCuoi("Sanh A").forEach((DichVuChoThue s) -> s.hienThi());

        System.out.println("============================");
        try {
//            t1.them1TiecCuoi("com.group22.SanhCuoi");
            t1.them1TiecCuoi("com.group22.ThucAn");
            t1.them1TiecCuoi("com.group22.ThucUong");
            t1.them1TiecCuoi("com.group22.Karaoke");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.hienThi();    
    }
}
