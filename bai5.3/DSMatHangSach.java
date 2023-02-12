/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;
import java.util.Vector;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSMatHangSach {
    private Vector ds;
    public DSMatHangSach(){
        ds=new Vector();
    }
    public void themSach(Sach s){
        ds.add(s);
    }
    public void nhapTenSachInThongTinSach(String tensach){
        int xuatHien=0;
        for(int i=0;i<ds.size();i++){
            if(((Sach)ds.elementAt(i)).layTenSach().equalsIgnoreCase(tensach)){
                ((Sach)ds.elementAt(i)).hienThi();
                xuatHien++;
            }
        }
        if(xuatHien==0){
            System.out.println("Khong tim thay");
        }
    }
    public void nhapTenTacGiaInRaSachCuatacGia(String tentacgia){
       for(int i=0;i<ds.size();i++){
           if(((Sach)ds.elementAt(i)).layTenTacGia().equalsIgnoreCase(tentacgia)){
               ((Sach)ds.elementAt(i)).hienThi();
           }
       }
    }
    public int tinhTongSoSach(){
        int sum=0;
        for(int i=0;i<ds.size();i++){
            sum +=1;
        }
        return sum;
    }
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
            ((Sach)ds.elementAt(i)).hienThi();
        }
    }
}
