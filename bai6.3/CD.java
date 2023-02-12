/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcd;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class CD{
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;
    public CD(){
        maCD=0;
        tenCD="";
        caSy="";
        soBaiHat=0;
        giaThanh=0;
    }
    public CD(int macd, String tenCD, String caSy, int soBH, double giaThanh) {
        this.maCD = macd;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBaiHat = soBH;
        this.giaThanh = giaThanh;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã cd:");
        maCD=sc.nextInt();
        System.out.println("Nhập tên cd:");
        tenCD=sc.nextLine();
        System.out.println("Nhập ca sỹ:");
        caSy=sc.nextLine();
        System.out.println("Nhập số bài hát:");
        soBaiHat=sc.nextInt();
        System.out.println("Nhập giá thành:");
        giaThanh=sc.nextDouble();
    }
    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String getTenCD() {
        return tenCD;
    }
 
    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBH() {
        return soBaiHat;
    }
 
    public void setSoBH(int soBH) {
        this.soBaiHat= soBH;
    }
 
    public double getGiaThanh() {
        return giaThanh;
    }
    public String toString(){
        return maCD+"-"+tenCD+"-"+caSy+"-"+soBaiHat+"-"+giaThanh;
    }
    public void hienThi(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tenCD,caSy,soBaiHat,giaThanh);
    }
    public boolean eguals (Object s){
        if(s instanceof CD){
            CD ss=(CD)s;
            return maCD==ss.maCD;
        }
        return false;
    }    
}
