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
public class SachThamKhao extends Sach{
    private double thue;
    public SachThamKhao(){
        super();
        thue=0;
    }
    public SachThamKhao(int ms,int n,int t,int na,double dg,int sl,String nsx,double thue){
        super(ms,n,t,na,dg,sl,nsx);
        this.thue=thue;
    }
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Thuế:");
        thue=sc.nextDouble();
    }
    public double thanhTien(){
        return (soLuong*donGia)+thue;
    }
    public String loaiSach(){
        return "STK";
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",Thue:"+thue);
    }
}
