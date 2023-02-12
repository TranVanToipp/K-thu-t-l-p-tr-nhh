/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymathang;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class MatHang {
    private String maHang;
    private String tenMatHang;
    private int soLuong;
    private int dongGia;
    private int soLuongTon;
    // tính theo đơn vị tháng cho thới gian bảo hành
    private int thoiGianBaoHanh;
    public MatHang(){
        maHang="";
        tenMatHang="";
        soLuong=0;
        dongGia=0;
        soLuongTon=0;
        thoiGianBaoHanh=0;
    }
    public MatHang(String mh,String tmh,int sl,int dg,int slt,int tgbh){
        maHang=mh;
        tenMatHang=tmh;
        soLuong=sl;
        dongGia=dg;
        soLuongTon=slt;
        thoiGianBaoHanh=tgbh;
    }
    public int laySoLuong(){
        return soLuong;
    }
    public int laydonGia(){
        return dongGia;
    }
    public int laySoLuongTon(){
        return soLuongTon;
    }
    public int layThoiGianBaoHanh(){
        return thoiGianBaoHanh;
    }
    public void hienThi(){
        System.out.println("MaHang:"+maHang+",TenMatHang:"+tenMatHang+",SoLuong:"+soLuong+",DonGia:"+dongGia+",SoLuongTon:"+soLuongTon+",ThoiGianBaoHanh:"+thoiGianBaoHanh);
    }
}
