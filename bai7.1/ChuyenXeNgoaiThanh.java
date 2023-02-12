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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgay;
    public ChuyenXeNgoaiThanh(){
        super();
        noiDen="";
        soNgay=0;
    }
    public ChuyenXeNgoaiThanh(int mcx,String ttx,int sx,double dt,String nd,int sn){
        super(mcx,ttx,sx,dt);
        noiDen=nd;
        soNgay=sn;
    }    
    public void nhap(){
        super.nhap();
        System.out.println("Nơi đến:");
        Scanner sc=new Scanner(System.in);
        noiDen=sc.nextLine();
        System.out.println("Số ngày:");
        soNgay=sc.nextInt();
    }
    public String tenChuyenXe(){
        return "ChuyenXeNgoaiThanh";
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",NoiDen:"+noiDen+",SoNgay:"+soNgay);
    }
}
