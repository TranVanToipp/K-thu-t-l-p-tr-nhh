/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgiaodichnhadat;

import java.util.Vector;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSGiaoDich {
    protected Vector ds;
    public DSGiaoDich(){
        ds=new Vector();
    }
    public void them(GiaoDich gd){
        ds.add(gd);
    }
    public void tinhTongSoLuongTungLoai(){
        int sum=0;
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).loaiGiaoDich().equalsIgnoreCase("GDD")){
                sum +=1;
            }
        }
        System.out.println("Tổng số giao dịch đất là:"+sum);
        int sum1=0;
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).loaiGiaoDich().equalsIgnoreCase("GDN")){
                sum1 +=1;
            }
        }
         System.out.println("Tổng số giao dịch nhà là:"+sum1);
    }
    public double tinhTrungBinhThanhTienGĐat(){
        double tt=0;
        int dem=0;
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).loaiGiaoDich().equalsIgnoreCase("GDD")){
                tt +=((GiaoDich)ds.elementAt(i)).thanhTien();
                dem +=1;
            }
        }
        tt /=dem;
        return tt;
    }
    public void xuatCacGiaoDichThang9Nam2016(){
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).layThang()==9&&((GiaoDich)ds.elementAt(i)).layNam()==2016){
                ((GiaoDich)ds.elementAt(i)).hienThi();
            }
        }
    }
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
            ((GiaoDich)ds.elementAt(i)).hienThi();
            System.out.print("\n");
        }
    }
}

