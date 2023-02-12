/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltruongdaihoc;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class DanhSachPhong {
    private Vector ds;
    public DanhSachPhong(){
        ds=new Vector();
    }
    public void them(PhongHoc p){
        if(ds.contains(p)==false){
            ds.add(p);
        }
    }
    public void inDanhSachTatCaCacLoaiPhong(){
        for(int i=0;i<ds.size();i++){
            ((PhongHoc)ds.elementAt(i)).hienThi();
        }
    }
    public void timPhongHocKhiBietmaPhong(int maPhong){
        for(int i=0;i<ds.size();i++){
            if(((PhongHoc)ds.elementAt(i)).layMaPhong()==maPhong){
                ((PhongHoc)ds.elementAt(i)).hienThi();
            }
        }
    }
    public void inPhongDatChuan(){
        for(int i=0;i<ds.size();i++){
            if(((PhongHoc)ds.elementAt(i)).datChuan()==true){
                ((PhongHoc)ds.elementAt(i)).hienThi();
            }
        }
    }
    public void capNhatSoMayTinhKhiBietMaPhong(int maphong,int somaytinh){
        for(int i=0;i<ds.size();i++){
            if(((PhongHoc)ds.elementAt(i)).layMaPhong()==maphong&&((PhongHoc)ds.elementAt(i)).loaiPhong().equals("PMT")){
                ((PhongMayTinh)ds.elementAt(i)).setMaPhong(somaytinh);
            }
        }
    }
    public void xoaPhongKhiBietMaPhong(int maphong){
        for(int i=0;i<ds.size();i++){
            if(((PhongHoc)ds.elementAt(i)).layMaPhong()==maphong){
                System.out.println("Đã tim được phòng muốn xóa:");
                System.out.println("Nhập Yes để xóa và No để không xóa: ");
                System.out.println("Bạn có chắc chắn xóa không:");
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                if(s.equalsIgnoreCase("NO")){
                    System.out.println("Ngừng không xóa");
                }else{
                    ds.removeElementAt(i);
                    break;
                }
            }
        }
    }
    public int tongSoPhongHoc(){
        int dem=0;
        for(int i=0;i<ds.size();i++){
            dem +=1;
        }
        return dem;
    }
    public void inDanhSachPhongMayTinhCoHon30May(){
        for(int i=0;i<ds.size();i++){
            if(((PhongHoc)ds.elementAt(i)).loaiPhong().equals("PMT")){
                if(((PhongMayTinh)ds.elementAt(i)).laySoMayTinh()>30){
                    ((PhongHoc)ds.elementAt(i)).hienThi();
                }
            }
        }
    }
}
