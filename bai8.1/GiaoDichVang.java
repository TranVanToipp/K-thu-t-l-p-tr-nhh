/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgiaodich;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class GiaoDichVang extends GiaoDich{
    private String loaiVang;
    public GiaoDichVang(){
        super();
        loaiVang="";
    }
    public GiaoDichVang(int mgd,int ngaygd,int tgd,int ngd,double dg,int sl,String lv){
        super(mgd,ngaygd,tgd,ngd,dg,sl);
        loaiVang=lv;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Loại vàng:");
        Scanner sc=new Scanner(System.in);
        loaiVang=sc.nextLine();
    }
    public String loaiGiaoDich(){
        return "GDV";
    }
    public double thanhTien(){
        double tt=0;
        tt=soLuong*donGia;
        return tt;
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",LoaiVang:"+loaiVang+"\n");
    }
}
