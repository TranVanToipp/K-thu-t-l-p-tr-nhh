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
public class PhongThiNghiem extends PhongHoc{
    private String chuyenNganh;
    private int sucChua;
    private String bonRua;
    public PhongThiNghiem(){
        super();
        chuyenNganh="";
        sucChua=0;
        bonRua="";
    }
    public PhongThiNghiem(int mp,String dn,String dt,int sbd,String cn,int sc,String br){
        super(mp,dn,dt,sbd);
        chuyenNganh=cn;
        sucChua=sc;
        bonRua=br;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Chuyên ngành:");
        Scanner sc=new Scanner(System.in);
        chuyenNganh=sc.nextLine();
        System.out.println("Sức chứa:");
        sucChua=sc.nextInt();
        System.out.println("Bồn rửa nhập true là có false là không:");
        bonRua=sc.nextLine();
    }
    public String layBonRua(){
        Boolean bonrua=Boolean.parseBoolean(bonRua);
        if(bonrua==true){
            return "Co";
        }else{
            return "Khong";
        }
    }
    public Boolean datChuan(){
        Boolean bonrua=Boolean.parseBoolean(bonRua);
        int dtich=Integer.parseInt(dienTich);
        int soBongDenDatChuan=dtich/1020;
        if(soBongDenDatChuan>=soBongDen&&bonrua==true){
            return true;
        }else{
            return false;
        }
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",ChuyenNganh:"+chuyenNganh+",SucChua:"+sucChua+",BonRua:");
    }
    public String loaiPhong(){
           return "PTN";
       }
    public boolean equals(Object s){
        if(s instanceof PhongThiNghiem){
            PhongThiNghiem ss=(PhongThiNghiem)s;
            return maPhong==ss.maPhong;
        }
        return false;
     }
}
