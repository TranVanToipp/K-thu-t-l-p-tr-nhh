/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgiaodichnhadat;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class GiaoDichNha extends GiaoDich{
    // loại nhà có 2 loại: loại nhà cao cấp và loại nhà thường
    protected String loaiNha;
    protected String diaChi;
    public GiaoDichNha(){
        super();
        loaiNha="";
        diaChi="";
    }
    public GiaoDichNha(int mgd,int ngd,int tgd,int namgd,double dg,int dt,String ln,String dc){
        super(mgd,ngd,tgd,namgd,dg,dt);
        loaiNha=ln;
        diaChi=dc;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Loại nhà CaoCap và Thuong:");
        Scanner sc=new Scanner(System.in);
        loaiNha=sc.nextLine();
        System.out.println("Địa chỉ:");
        diaChi=sc.nextLine();
    }
    public double thanhTien(){
        double tt=0;
        if(loaiNha.equalsIgnoreCase("CaoCap")){
            tt=dienTich*donGia;
        }else{
            tt=dienTich*donGia*0.9;
        }
        return tt;
    }
    public String loaiGiaoDich(){
        return "GDN";
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",LoaiNha:"+loaiNha+",DiaChi:"+diaChi);
    }
}
