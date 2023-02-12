/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymathang;
import java.util.Vector;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSMatHang {
    private Vector ds;
    public DSMatHang(){
        ds=new Vector();
    }
    public void themMatHang(MatHang mh){
        ds.add(mh);
    }
    public void matHangSoLuongTonNhieuNhat(){
        MatHang mh=(MatHang)ds.elementAt(0);
        int vt=0;
        for(int i=1;i<ds.size();i++){
            if(((MatHang)ds.elementAt(i)).laySoLuongTon()>mh.laySoLuongTon()){
                vt=i;
            }
        }
        System.out.println("Mat hang do la:");
        ((MatHang)ds.elementAt(vt)).hienThi();
    }
    public void timMatHangCoDonGiaCaoNhat(){
        MatHang mh=(MatHang)ds.elementAt(0);
        int vt=0;
                for(int i=1;i<ds.size();i++){
                    if(((MatHang)ds.elementAt(i)).laydonGia()>mh.laydonGia()){
                     vt=i;
                    }   
                }
                ((MatHang)ds.elementAt(vt)).hienThi();
    }
    public void inMatHangThoiGianBaoHanhLonHon12Thang(){
        for(int i=0;i<ds.size();i++){
            if(((MatHang)ds.elementAt(i)).layThoiGianBaoHanh()>12){
                ((MatHang)ds.elementAt(i)).hienThi();
            }
        }
    }
    // chưa chạy được
    public void sapXepTangDanTheoSoLuongTon(){
        for(int i=0;i<ds.size()-1;i++){
            MatHang mh1=(MatHang)ds.elementAt(i);
            for(int j=i+1;j<ds.size();j++){
                MatHang mh2=(MatHang)ds.elementAt(j);
                if(mh1.laySoLuongTon()>mh2.laySoLuongTon()){
                    MatHang temp=mh1;
                    ds.set(ds.indexOf(mh1), mh2);
                    ds.set(ds.indexOf(mh2),temp);
                }
            }
        }
    }
    public void hienThi(){
      for(int i=0;i<ds.size();i++){
        ((MatHang)ds.elementAt(i)).hienThi();
      }  
    }
}
