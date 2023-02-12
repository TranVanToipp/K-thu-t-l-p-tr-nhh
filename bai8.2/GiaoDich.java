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
abstract public class GiaoDich {
    protected int maGiaoDich;
    protected int ngayGiaoDich;
    protected int thangGiaoDich;
    protected int namGiaoDich;
    protected double donGia;
    protected int dienTich;
    public GiaoDich(){
        maGiaoDich=0;
        ngayGiaoDich=0;
        thangGiaoDich=0;
        namGiaoDich=0;
        donGia=0;
        dienTich=0;
    }
    public GiaoDich(int mgd,int ngd,int tgd,int namgd,double dg,int dt){
        maGiaoDich=mgd;
        ngayGiaoDich=ngd;
        thangGiaoDich=tgd;
        namGiaoDich=namgd;
        donGia=dg;
        dienTich=dt;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mã giao dịch:");
        maGiaoDich=sc.nextInt();
        System.out.println("Ngày giao dịch:");
        ngayGiaoDich=sc.nextInt();
        System.out.println("Tháng giao dịch:");
        thangGiaoDich=sc.nextInt();
        System.out.println("Năm giao dịch:");
        namGiaoDich=sc.nextInt();
        System.out.println("Đơn giá:");
        donGia=sc.nextDouble();
        System.out.println("Diện tích:");
        dienTich=sc.nextInt();
    }
    public String loaiGiaoDich(){
        return "";
    }
    public int layThang(){
        return thangGiaoDich;
    }
    public int layNam(){
        return namGiaoDich;
    }
    abstract public double thanhTien();
    public void hienThi(){
         System.out.print("MaGiaoDich:"+maGiaoDich+",NgayGiaoDich:"+ngayGiaoDich+",ThangGiaoDich:"+thangGiaoDich+",NamGiaoDich:"+namGiaoDich+",DonGia:"+donGia+"DienTich:"+dienTich);
    }
}
