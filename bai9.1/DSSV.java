/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.util.Vector;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSSV {
    private Vector ds;
    public DSSV(){
        ds=new Vector();
    }
    public void them(SinhVien s){
        ds.add(s);
    }
    public void inDanhSachTuoiLonHon22(){
        for(int i=0;i<ds.size();i++){
            if(((SinhVien)ds.elementAt(i)).layTuoi()>22){
                ((SinhVien)ds.elementAt(i)).hienThi();
            }
        }
    }
    public void timTHongTinSinhVienKhiBietTenHoacTuoi(String dkt){
        String ten=dkt;
        int tuoi=Integer.parseInt(dkt);
        for(int i=0;i<ds.size();i++){
            if(((SinhVien)ds.elementAt(i)).layTen().equalsIgnoreCase(ten)||((SinhVien)ds.elementAt(i)).layTuoi()==tuoi){
                ((SinhVien)ds.elementAt(i)).hienThi();
            }
        }
    }
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
            ((SinhVien)ds.elementAt(i)).hienThi();
        }
    }
}
