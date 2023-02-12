/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luutruthongtinsinhvien;

import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class SV implements Serializable{
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    public SV(){
        maSV=0;
        hoTen="";
        diaChi="";
        soDienThoai="";
    }
    public SV(int msv,String ht,String dc,String sdt){
        maSV=msv;
        hoTen=ht;
        diaChi=dc;
        soDienThoai=sdt;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập mã sinh viên:");
        maSV=sc.nextInt();
        System.out.println("Nhập họ tên:");
        sc.nextLine();
        hoTen=sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        diaChi=sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        soDienThoai=sc.nextLine();
    }
    public void hienThi(){
        System.out.println("MaSV:"+maSV+"HoTen:"+hoTen+",DiaChi:"+diaChi+",SoDienThoai:"+soDienThoai);
    }
    public boolean equals(Object s){
        if(s instanceof SV){
            SV ss=(SV)s;
            return maSV==ss.maSV&hoTen.equalsIgnoreCase(ss.hoTen)&diaChi.equalsIgnoreCase(ss.diaChi)&soDienThoai.equalsIgnoreCase(ss.soDienThoai);
        }
        return false;
    }
    public String toString(){
        return maSV+"-"+hoTen+"-"+diaChi+"-"+soDienThoai;
    }
}
