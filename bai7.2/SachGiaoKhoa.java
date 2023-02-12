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
public class SachGiaoKhoa extends Sach{
    private boolean tinhTrang;
    public SachGiaoKhoa(){
        super();
        tinhTrang=false;
    }
    public SachGiaoKhoa(int ms,int n,int t,int na,double dg,int sl,String nsx,boolean tt){
        super(ms,n,t,na,dg,sl,nsx);
        tinhTrang=tt;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Nhập tình trạng:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("Moi")){
            tinhTrang=true;
        }else{
            tinhTrang=false;
        }
    }
    public String layTinhTrang(){
        if(tinhTrang==true){
            return "moi";
        }else{
            return "cu";
        }
    }
    public double thanhTien(){
        double tt=0;
        if(tinhTrang==true){
            tt=soLuong*donGia;
        }else{
            tt=soLuong*donGia*0.5;
        }
        return tt;
    }
    public String loaiSach(){
        return "SGK";
    }
    public void hienThi(){
        super.hienThi();
        System.out.print(",TinhTrang:"+this.layTinhTrang());
    }
}
