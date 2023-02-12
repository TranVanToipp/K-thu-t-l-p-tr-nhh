/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganhang;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTrongTaiKhoan;
    public Account(){
        soTaiKhoan=0;
        tenTaiKhoan="";
        soTienTrongTaiKhoan=50;
    }
    public Account(long stk,String ttk,double stttk){
        soTaiKhoan=stk;
        tenTaiKhoan=ttk;
        soTienTrongTaiKhoan=stttk;
    }
    public void nhap(){
        System.out.println("Nhập số tài khoản:");
        Scanner sc=new Scanner(System.in);
        soTaiKhoan=sc.nextLong();
        System.out.println("Nhập tên tài khoản:");
        tenTaiKhoan=sc.nextLine();
        System.out.println("Nhập số tiền trong tài khoản:");
        soTienTrongTaiKhoan=sc.nextDouble();
    }
    public long getSoTaiKhoan(){
        return soTaiKhoan;
    }
    public String getTenTaiKhoan(){
        return tenTaiKhoan;
    }
    public double getSoTienTrongTaiKhoan(){
        return soTienTrongTaiKhoan;
    }
    public void setSoTaiKhoan(long stk){
        soTaiKhoan=stk;
    }
    public void setTenTaiKhoan(String ttk){
        tenTaiKhoan=ttk;
    }
    public void setSoTienTrongTaiKhoan(double stttk){
        soTienTrongTaiKhoan=stttk;
    }
    public double hangSoLaiSuat(){
        return 0.035;
    }
    public void napTien(long soTk,double stn){
        soTienTrongTaiKhoan +=stn;
    }
    // do có phí rút tiền ta không biết bao nhiêu giả sử cứ rút 100 là mất 1.
    public Boolean rutTien(double str){
        if(soTienTrongTaiKhoan<str){
            return false;
        }else{
            soTienTrongTaiKhoan=soTienTrongTaiKhoan-(str)-(str*0.01);
            return true;
        }
    }
    //Lấy ngày hiện tại: java.time.LocalDate
    //System.out.println(java.time.LocalDate.now());
    public void daoHan(){
            
    } 
    public Boolean chuyenKhoan(Account tk,double st){
        if(soTienTrongTaiKhoan<st){
            return false;
        }else{
            soTienTrongTaiKhoan -=st;
            tk.soTienTrongTaiKhoan +=st;
            return true;
        }       
    }
    public String toString(){
        return soTaiKhoan+"-"+tenTaiKhoan+"-"+soTienTrongTaiKhoan;
    }
}
