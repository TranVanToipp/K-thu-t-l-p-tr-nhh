/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlchuyenxe;
import java.util.Vector;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class DanhSachChuyenXe {
    private Vector ds;
    public DanhSachChuyenXe(){
        ds=new Vector();
    }
    public void them(ChuyenXe cx){
        ds.add(cx);
    }
    public void tinhTongDoanhThuTungLoaiXe(){
        int sum=0;
        System.out.print("Doanh thu của chuyến xe nội thành là: ");
        for(int i=0;i<ds.size();i++){
            if(((ChuyenXe)ds.elementAt(i)).tenChuyenXe().equalsIgnoreCase("ChuyenXeNoiThanh")){
                sum +=((ChuyenXe)ds.elementAt(i)).layDoanhThu();
            }
        }
        System.out.print(sum+"\n");
        int sum1=0;
        System.out.print("Doanh thu của chuyến xe ngoại thành:");
        for(int i=0;i<ds.size();i++){
            if(((ChuyenXe)ds.elementAt(i)).tenChuyenXe().equalsIgnoreCase("ChuyenXeNgoaiThanh")){
                sum1 +=((ChuyenXe)ds.elementAt(i)).layDoanhThu();
            }   
        }
        System.out.print(sum1+"\n");
    }
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
            ((ChuyenXe)ds.elementAt(i)).hienThi();
            System.out.println("\n");
        }
    }
}