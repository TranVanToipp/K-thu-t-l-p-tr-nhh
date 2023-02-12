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
public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soKM;
    private int soTuyen;
    public ChuyenXeNoiThanh(){
      super();  
      soKM=0;
      soTuyen=0;
    }
    public ChuyenXeNoiThanh(int mcx,String ttx,int sx,double dt,int sokm,int st){
        super(mcx,ttx,sx,dt);
        soKM=sokm;
        soTuyen=st;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Số km:");
        Scanner sc=new Scanner(System.in);
        soKM=sc.nextInt();
        System.out.println("Số tuyến:");
        soTuyen=sc.nextInt();
    }   
    public String tenChuyenXe(){
        return "ChuyenXeNoiThanh";
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",SoKM:"+soKM+",SoTuyen:"+soTuyen);
    }
}
