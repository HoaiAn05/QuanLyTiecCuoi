/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyTiecCuoi {
    private List<TiecCuoi> dstc= new ArrayList<>();
    
      public void themTiecCuoi(TiecCuoi...a) {
          this.getDstc().addAll(Arrays.asList(a));
    }
      
       public void hienThi(){
           this.getDstc().forEach(s->s.hienThi());
    }
    
       public void sapXep(){
           this.getDstc().sort((h1,h2) -> -(h1.getDs().size() - h2.getDs().size()));
    }
    
  public int tinhTongSoLanThue(String kw) {
        TiecCuoi nn= this.getDstc().stream().filter(n->n.getTenTiec().contains(kw)).findFirst().orElse(null);
        if(nn!=null) {
            return nn.demSoLanThue();
        }
        return 0;
    }
//    public void thueSanh(String kw) {
//        TiecCuoi m= this.getDstc().stream().filter(g->g.getTenTiec().contains(kw)).findFirst().orElse(null);
//        if(m!=null) {
//            m.hienThi();
//            System.out.printf("Gia Sanh cuoi la: %d\nTong gia menu la: %d\nTong gia dich vu la: %d\n",
//                    1000,m.tongMenu(),m.tongDichVu());
//
//    }
//  }

    public List<TiecCuoi> getDstc() {
        return dstc;
    }

    /**
     * @param dstc the dstc to set
     */
    public void setDstc(List<TiecCuoi> dstc) {
        this.dstc = dstc;
    }
  
}
