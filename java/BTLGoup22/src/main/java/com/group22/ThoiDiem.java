/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.group22;

/**
 *
 * @author Admin
 */
public enum ThoiDiem {
    SANG_THUONG {
         @Override
        public double price(double d) {
            return d;
        }
    },
    CHIEU_THUONG  {
         @Override
        public double price(double d) {
            return d;
        }
    },
    TOI_THUONG {
         @Override
        public double price(double d) {
            return d;
        }
    },
    SANG_CUOITUAN {
        @Override
        public double price(double d) {
            return d+this.ngayCuoiTuan;
        }     
    },
    TRUA_CUOITUAN {
        @Override
        public double price(double d) {
            return d+this.ngayCuoiTuan;
        }    
    },
    TOI_CUOITUAN {
        @Override
        public double price(double d) {
            return d+this.ngayCuoiTuan;
        }
        
    };
    
    protected double ngayCuoiTuan=5000000;
   public abstract double price(double d);
     
}
