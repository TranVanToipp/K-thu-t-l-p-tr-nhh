/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class SinhVien {
    private String ten;
    private int tuoi;
    public SinhVien(){
        ten="";
        tuoi=0;
    }
    public SinhVien(String t,int tuoi){
        ten=t;
        this.tuoi=tuoi;
    }
    public void nhap(){
        System.out.println("Họ tên:");
        Scanner sc=new Scanner(System.in);
        ten=sc.nextLine();
        System.out.println("Tuổi:");
        tuoi=sc.nextInt();
    }
    public String layTen(){
        return ten;
    }
    public int layTuoi(){
        return tuoi;
    }
    public void hienThi(){
        System.out.println("Ten:"+ten+",Tuoi:"+tuoi);
    }
}
