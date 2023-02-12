/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgiaodich;
import java.util.Vector;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSGiaoDich {
    private Vector ds;
    public DSGiaoDich(){
        ds=new Vector();
    }
    public void them(GiaoDich gd){
        ds.add(gd);
    }
    public void tinhTongSoLuongChoTungLoai(){
        int sum=0;
        System.out.print("Tổng số lượng của giao dịch vàng là:");
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).loaiGiaoDich().equalsIgnoreCase("GDV")){
                sum +=((GiaoDich)ds.elementAt(i)).laySoLuong();
            }
        }
        System.out.print(sum+"\n");
        int sum1=0;
        System.out.print("Tổng số lượng của giao dich tiền tệ là:");
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).loaiGiaoDich().equalsIgnoreCase("GDTT")){
                sum1 +=((GiaoDich)ds.elementAt(i)).laySoLuong();
            }
        }
        System.out.print(sum1+"\n");
    }
    public double trungBinhThanhTienGiaoDichTienTe(){
        double tt=0;
        int dem=0;
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).loaiGiaoDich().equalsIgnoreCase("GDTT")){
                tt += ((GiaoDich)ds.elementAt(i)).thanhTien();
                dem +=1;
            }
        }
        tt /=dem;
        return tt;
    }
    public void xuatCacGiaoDichCoDonGiaHon1Ty(){
        for(int i=0;i<ds.size();i++){
            if(((GiaoDich)ds.elementAt(i)).layDonGia()>1000000000){
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
