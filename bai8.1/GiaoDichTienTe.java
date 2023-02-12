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
public class GiaoDichTienTe extends GiaoDich{
    private int tiGia;
    private String loaiTien;
    public GiaoDichTienTe(){
        super();
        tiGia=0;
        loaiTien="";
    }
    public GiaoDichTienTe(int mgd,int ngaygd,int tgd,int ngd,double dg,int sl,int tg,String lt){
        super(mgd,ngaygd,tgd,ngd,dg,sl);
        tiGia=tg;
        loaiTien=lt;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Tỉ giá");
        int tg=sc.nextInt();
        sc.nextLine();
        System.out.println("Lọai tiền USD Euro và VND:");
        String lt=sc.nextLine();
    }
    public String loaiGiaoDich(){
        return "GDTT";
    }
    public String layLoaiTien(){
        return loaiTien;
    }
    public double thanhTien(){
        double tt=0;
        if(loaiTien.equalsIgnoreCase("USD")||loaiTien.equalsIgnoreCase("Euro")){
            tt=soLuong*donGia*tiGia;
        }else{
            tt=soLuong*donGia;
        }
        return tt;
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",TiGia:"+tiGia+",LoaiTien:"+loaiTien+"\n");
    }
}   
