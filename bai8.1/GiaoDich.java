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
abstract public class GiaoDich {
    protected int maGiaoDich;
    protected int ngayDaoDich;
    protected int thangGiaoDich;
    protected int namGiaoDich;
    protected double donGia;
    protected int soLuong;
    public GiaoDich(){
        maGiaoDich=0;
        ngayDaoDich=0;
        thangGiaoDich=0;
        namGiaoDich=0;
        donGia=0;
        soLuong=0;        
    }
    public GiaoDich(int mgd,int ngaygd,int tgd,int ngd,double dg,int sl){
        maGiaoDich=mgd;
        ngayDaoDich=ngaygd;
        thangGiaoDich=tgd;
        namGiaoDich=ngd;
        donGia=dg;
        soLuong=sl;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mã giao dịch:");
        maGiaoDich=sc.nextInt();
        System.out.println("Ngày giao dịch:");
        ngayDaoDich=sc.nextInt();
        System.out.println("Tháng giao dịch:");
        thangGiaoDich=sc.nextInt();
        System.out.println("Năm giao dịch:");
        namGiaoDich=sc.nextInt();
        System.out.println("Đơn giá:");
        donGia=sc.nextDouble();
        System.out.println("Số lượng:");
        soLuong=sc.nextInt();
    }
    public int laySoLuong(){
        return soLuong;
    }
    public double layDonGia(){
        return donGia;
    }
    public String loaiGiaoDich(){
        return "";
    }
    abstract public double thanhTien();
    public void hienThi(){
        System.out.print("MaGiaoDich:"+maGiaoDich+",NgayGiaoDich:"+ngayDaoDich+",ThangGiaoDich:"+thangGiaoDich+",NamGiaoDich:"+namGiaoDich+",DonGia:"+donGia+",SoLuong:"+soLuong);
    }
}
