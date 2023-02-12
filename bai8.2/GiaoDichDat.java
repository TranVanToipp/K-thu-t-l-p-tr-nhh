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
public class GiaoDichDat extends GiaoDich{
    protected String loaiDat;
    public GiaoDichDat(){
        super();
        loaiDat="";
    }
    public GiaoDichDat(int mgd,int ngd,int tgd,int namgd,double dg,int dt,String ld){
        super(mgd,ngd,tgd,namgd,dg,dt);
        loaiDat=ld;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Loai đất loại A B C: ");
        Scanner sc=new Scanner(System.in);
        loaiDat=sc.nextLine();
    }
    public double thanhTien(){
        double tt=0;
        if(loaiDat.equalsIgnoreCase("B")||loaiDat.equalsIgnoreCase("C")){
            tt=dienTich*donGia;
        }else{
            tt=dienTich*donGia*1.5;
        }
        return tt;
    }
    public String loaiGiaoDich(){
        return "GDD";
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",LoaiDat:"+loaiDat);
    }
}
