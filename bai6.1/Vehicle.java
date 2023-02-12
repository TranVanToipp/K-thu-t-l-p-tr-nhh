/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlxe;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
// Vehicle: phương tiện.
public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    public Vehicle(){
        tenChuXe="";
        loaiXe="";
        dungTich=0;
        triGia=0;
    }
    public Vehicle(String tcx,String lx,int dt,double tg){
        tenChuXe=tcx;
        loaiXe=lx;
        dungTich=dt;
        triGia=tg;
    }
    public void nhapVehicle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten chu xe:");
        tenChuXe=sc.nextLine();
        System.out.println("Nhap loai xe:");
        loaiXe=sc.nextLine();
        System.out.println("Nhap dung tich:");
        dungTich=sc.nextInt();
        System.out.println("Nhap tri gia:");
        triGia=sc.nextDouble();
    }
    public double thue(){
        double tienthue=0;
        if(dungTich<100){
            tienthue=triGia*((double)1/(double)100);
        }else{
            if(dungTich<=200){
                tienthue=triGia*((double)3/(double)100);
            }else{
                tienthue=triGia*((double)5/(double)100);
            }
        }
        return tienthue;
    }
    public String toString(){
        return tenChuXe+"-"+loaiXe+"-"+dungTich+"-"+triGia;
    }
    public  void hienThi(){
        // "format-string" là chuỗi định dạng, trong đó có chứa các định dạng
        // và chuỗi tạo ra bằng cách điền tham số arg theo thứ tự tương ứng vào định dạng.
        String s=String.format("%-10s %10s %5d %5.2f %5.2f",tenChuXe,loaiXe,dungTich,triGia,this.thue());
        System.out.println(s);
    }
}
