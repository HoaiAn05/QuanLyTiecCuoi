/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class TiecCuoi {

    private String tenTiec;
    private LocalDate ngayThue;
    private List<DichVuChoThue> ds = new ArrayList<>();
    private List<Menu> menu = new ArrayList<>();
    private List<SanhCuoi> sc = new ArrayList<>();
    private List<DichVu> dv = new ArrayList<>();

    public TiecCuoi(String tenTiec, LocalDate ngayThue) {
        this.tenTiec = tenTiec;
        this.ngayThue = ngayThue;
    }

    public TiecCuoi() {
    }

    public TiecCuoi(String tenTiec, String ngayThue) {
        this(tenTiec, LocalDate.parse(ngayThue, DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)));
    }

    public void hienThi() {
        System.out.printf("ten tiec: %s\nNgay thue: %s\n", this.getTenTiec(),
                this.getNgayThue().format(DateTimeFormatter.ofPattern(CauHinh.DATE_FORMAT)));
        this.ds.forEach(s -> s.hienThi());
        System.out.println();
        this.menu.forEach(m -> m.hienThi());
        System.out.println();
        this.dv.forEach(d -> d.hienThi());
    }

    public void hoaDon() {
        System.out.printf("Tong so tien phai thanh toan la: %d\nHen gap lai quy khach!!!!!\n",
                this.tongDichVu() + this.tongMenu() + this.tongSanhCuoi());
    }

    public int demSoLanThue() {
        int t = 0;
        for (DichVuChoThue v : this.getDs()) {
            if (v instanceof SanhCuoi) {
                t++;
            }
        }
        return t;
    }

//    public void themDichVuChoThue(DichVuChoThue... d) {
//        this.getDs().addAll(Arrays.asList(d));
//    }
    public void themDv(DichVu... d) {
        this.dv.addAll(Arrays.asList(d));
    }

    public void themMenu(Menu... m) {
        this.menu.addAll(Arrays.asList(m));
    }

    public void themSanhCuoi(DichVuChoThue... s) {
        this.ds.addAll(Arrays.asList(s));
    }

    /**
     *
     * @param kw
     * @return
     */
    public List<DichVuChoThue> timKiemSanhCuoi(String kw) {
        return this.ds.stream().filter(s -> s.getName().contains(kw)).collect(Collectors.toList());
    }

    public List<DichVu> timDichVuDiKem(String kw) {
        return this.dv.stream().filter(s -> s.getName().contains(kw)).collect(Collectors.toList());

    }

    public List<Menu> timMenu(String kw) {
        return this.menu.stream().filter(s -> s.getName().contains(kw)).collect(Collectors.toList());
    }

    public DichVuChoThue timKiemVt(int vt) {
        return this.sc.stream().filter(h -> h.getViTri() == vt).findAny().get();
    }

    public DichVuChoThue timKiemSc(int sc) {
        return this.sc.stream().filter(h -> h.getSucChua() == sc).findAny().get();
    }

//    public List<DichVuChoThue> timKiemTheoSc(int sc) {
//        return this.getSc().stream().filter(s -> s.getSucChua() == sc).findFirst().get();
//    }
    public void xoaSanhCuoi(String kw) {
        this.getDs().removeIf(h -> h.getName().contains(kw));
    }

    public void xoaMenu(String kw) {
        this.getMenu().removeIf(h -> h.getName().contains(kw));
    }

    public void xoaDichVuDiKem(String kw) {
        this.getDv().removeIf(h -> h.getName().contains(kw));
    }

    public void them1TiecCuoi(String classPath) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class c = Class.forName(classPath);
        DichVuChoThue s = (DichVuChoThue) c.getConstructor().newInstance();//new Sach();
        s.nhap1DichVu();

        this.ds.add(s);
    }

    public int tongMenu() {
        int t = 0;
        for (Menu v : this.menu) {
            if (v instanceof ThucAn) {
                t += ((ThucAn) v).getPrice();
            }
        }
        for (Menu n : this.menu) {
            if (n instanceof ThucUong) {
                t += ((ThucUong) n).getPrice();
            }
        }
        return t;
    }

    public int tongDichVu() {
        int t = 0;
        for (DichVu d : this.getDv()) {
            if (d instanceof TrangTri) {
                t += ((TrangTri) d).getPrice();
            }
        }

        for (DichVu p : this.getDv()) {
            if (p instanceof Karaoke) {
                t += ((Karaoke) p).getPrice() * ((Karaoke) p).getKhoangThoiGianThue();
            }
        }

        for (DichVu p : this.getDv()) {
            if (p instanceof MoiCaSi) {
                t += ((MoiCaSi) p).getPrice() * ((MoiCaSi) p).getSoLuongBaiHat();
            }
        }
        return t;
    }

    public int tongSanhCuoi() {
        int n = 0;
        for (DichVuChoThue a : this.ds) {
            if (a instanceof SanhCuoi) {
                n += ((SanhCuoi) a).tienSanh();
            }
        }
        return n;
    }

    public String getTenTiec() {
        return tenTiec;
    }

    /**
     * @param tenTiec the tenTiec to set
     */
    public void setTenTiec(String tenTiec) {
        this.tenTiec = tenTiec;
    }

    public List<SanhCuoi> getSc() {
        return sc;
    }
//
//    /**
//    * @param sc the sc to set
//     */

    public void setSc(List<SanhCuoi> sc) {
        this.sc = sc;
    }

    /**
     * @return the ngayThue
     */
    public LocalDate getNgayThue() {
        return ngayThue;
    }

    /**
     * @param ngayThue the ngayThue to set
     */
    public void setNgayThue(LocalDate ngayThue) {
        this.ngayThue = ngayThue;
    }

    /**
     * @return the menu
     */
    public List<Menu> getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    /**
     * @return the dv
     */
    public List<DichVu> getDv() {
        return dv;
    }

    /**
     * @param dv the dv to set
     */
    public void setDv(List<DichVu> dv) {
        this.dv = dv;
    }

    /**
     * @return the ds
     */
    public List<DichVuChoThue> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<DichVuChoThue> ds) {
        this.ds = ds;
    }

}
