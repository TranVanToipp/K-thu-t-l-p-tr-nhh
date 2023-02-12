/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taotepsinhvien;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
import java.io.Serializable;
public class SinhVien implements Serializable{
    private String hoTen;
    public SinhVien(){
        hoTen="";
    }
    public SinhVien(String ht){
        hoTen=ht;
    }
    public void nhap(){
        System.out.println("Nhập họ tên sinh viên:");
        Scanner sc=new Scanner(System.in);
        hoTen=sc.nextLine();
    }
    public void hienThi(){
        System.out.println("HoTen:"+hoTen);
    }
    public String toString(){
        return hoTen;
    }
}
