/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlchuyenxe;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class ChuyenXe {
    protected int maChuyenXe;
    protected String tenTaiXe;
    protected int soXe;
    protected double doanhThu;
    public ChuyenXe(){
        maChuyenXe=0;
        tenTaiXe="";
        soXe=0;
        doanhThu=0;
    }
    public ChuyenXe(int mcx,String ttx,int sx,double dt){
        maChuyenXe=mcx;
        tenTaiXe=ttx;
        soXe=sx;
        doanhThu=dt;
    }
    public void nhap(){
        System.out.println("Nhập mã chuyến xe:");
        Scanner sc=new Scanner(System.in);
        maChuyenXe=sc.nextInt();
        sc.nextLine();
        System.out.println("Tên tài xế:");
        tenTaiXe=sc.nextLine();
        System.out.println("Số xe:");
        soXe=sc.nextInt();
        System.out.println("Doanh thu:");
        doanhThu=sc.nextDouble();
    }
    public double  layDoanhThu(){
        return doanhThu;
    }
    public String tenChuyenXe(){
        return "";
    }
    public void hienThi(){
        System.out.print("MaChuyenXe:"+maChuyenXe+",TenTaiXe:"+tenTaiXe+",SoXe:"+soXe+",DoanhThu:"+doanhThu);
    }
}
