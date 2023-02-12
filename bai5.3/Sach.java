/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int soLuong;
    public Sach(){
        maSach="";
        tenSach="";
        tacGia="";
        soLuong=0;
    }
    public Sach(String ms,String ts,String tg,int sl){
        maSach=ms;
        tenSach=ts;
        tacGia=tg;
        soLuong=sl;
    }
    public String layTenSach(){
        return tenSach;
    }
    public String layTenTacGia(){
        return tacGia;
    }
    public void hienThi(){
        System.out.println("MaSach:"+maSach+",TenSach:"+tenSach+",TacGia:"+tacGia+",SoLuong:"+soLuong);
    }
}
