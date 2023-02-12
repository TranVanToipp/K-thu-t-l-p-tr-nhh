/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvienx;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
abstract public class Sach {
    protected  int maSach;
    protected int ngay;
    protected int thang;
    protected int nam;
    protected double donGia;
    protected int soLuong;
    protected String nhaSanXuat;
    public Sach(){
        maSach=0;
        ngay=0;
        thang=0;
        nam=0;
        donGia=0;
        soLuong=0;
        nhaSanXuat="";
    }
    public Sach(int ms,int n,int t,int na,double dg,int sl,String nsx){
        maSach=ms;
        ngay=n;
        thang=t;
        nam=na;
        donGia=dg;
        soLuong=sl;
        nhaSanXuat=nsx;
    }
    public void nhap(){
        System.out.println("Mã sách:");
        Scanner sc=new Scanner(System.in);
        maSach=sc.nextInt();
        System.out.println("Ngày:");
        ngay=sc.nextInt();
        System.out.println("Tháng:");
        thang=sc.nextInt();
        System.out.println("Năm:");
        nam=sc.nextInt();
        System.out.println("Đơn giá:");
        donGia=sc.nextDouble();
        System.out.println("Số lượng:");
        soLuong=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhà sản xuất:");
        nhaSanXuat=sc.nextLine();
    }
    public String loaiSach(){
        return "";
    }
    public String layNhaXuatBan(){
        return nhaSanXuat;
    }
    abstract public double thanhTien();
    public void hienThi(){
        System.out.print("MaSach:"+maSach+",Ngay:"+ngay+",Thang:"+thang+",Nam:"+nam+",DonGia:"+donGia+",SoLuong:"+soLuong+",NhaSanXuat:"+nhaSanXuat);
    }
}
