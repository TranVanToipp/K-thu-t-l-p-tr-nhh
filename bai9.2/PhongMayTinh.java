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
public class PhongMayTinh extends PhongHoc{
    private int soMayTinh;
    public PhongMayTinh(){
        super();
        soMayTinh=0;
    }
    public PhongMayTinh(int mp,String dn,String dt,int sbd,String mc,int smt){
        super(mp,dn,dt,sbd);
        soMayTinh=smt;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Nhập số máy tính:");
        Scanner sc=new Scanner(System.in);
        soMayTinh=sc.nextInt();
    }
    
    // 1.5m2 có nghĩa là theo quy ước bên phòng học là: 152
    public Boolean datChuan(){
           int dtich=Integer.parseInt(dienTich);
           int soBongDenDatChuan=dtich/1020;
           int soMayTinhDatChuan=dtich/152;
           if(soBongDenDatChuan>=soBongDen&&soMayTinhDatChuan>=soMayTinh){
               return true;
           }else{
               return false;
           }
    }
    public void setMaPhong(int smt){
        soMayTinh=smt;
    }
    public String loaiPhong(){
           return "PMT";
    }
    public int laySoMayTinh(){
        return soMayTinh;
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",SoMayTinh:"+soMayTinh);
    }
    public boolean equals(Object s){
        if(s instanceof PhongMayTinh){
            PhongMayTinh ss=(PhongMayTinh)s;
            return maPhong==ss.maPhong;
        }
        return false;
    }
}
