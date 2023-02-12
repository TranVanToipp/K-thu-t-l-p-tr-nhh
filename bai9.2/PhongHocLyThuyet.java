/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltruongdaihoc;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class PhongHocLyThuyet extends PhongHoc{
       private String mayChieu;
       public PhongHocLyThuyet(){
           super();
           mayChieu="";
       }
       public PhongHocLyThuyet(int mp,String dn,String dt,int sbd,String mc){
           super(mp,dn,dt,sbd);
           mayChieu=mc;
       }
       public String layMayChieu(){
           Boolean s=Boolean.parseBoolean(mayChieu);
           if(s==true){
               return "Co";
           }else{
               return "Khong";
           }
       }
       public void nhap(){
           Scanner sc=new Scanner(System.in);
           super.nhap();
           System.out.println("Nhập máy chiếu nhập True(có) False(Không):");
           mayChieu=sc.nextLine();
       }
       public Boolean datChuan(){
           Boolean s=Boolean.parseBoolean(mayChieu);
           int dtich=Integer.parseInt(dienTich);
           int soBongDenDatChuan=dtich/1020;
           if(s==true&&soBongDen>=soBongDenDatChuan)
               return true;
           else
               return false;
       }
       public String loaiPhong(){
           return "PHLT";
       }
       public void hienThi(){
           super.hienThi();
           System.out.println(",MayChieu:"+this.layMayChieu());
       }
       public boolean equals(Object s){
        if(s instanceof PhongHocLyThuyet){
            PhongHocLyThuyet ss=(PhongHocLyThuyet)s;
            return maPhong==ss.maPhong;
        }
        return false;
        }
}
