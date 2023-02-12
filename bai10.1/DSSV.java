/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taotepsinhvien;

import java.util.Vector;
import java.io.*;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSSV {
    private Vector ds;
    public DSSV(){
        ds=new Vector();
    }
    public void them(SinhVien sv){
        ds.add(sv);
    }
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
            ((SinhVien)ds.elementAt(i)).hienThi();
        }
    }
    public void ghiDoiTuong(String tenTep){
        try {
            FileOutputStream f=new FileOutputStream(tenTep);
            ObjectOutputStream oj=new ObjectOutputStream(f);
            for(int i=0;i<ds.size();i++){
                oj.writeObject((SinhVien)ds.elementAt(i));
            }
            oj.close();
            f.close();
        } catch (Exception e) {
        }
    }
    public void docDoiTuong(String tenTep){
        try {
            FileInputStream f=new FileInputStream(tenTep);
            ObjectInputStream oj=new ObjectInputStream(f) ;
            while(f.available()>0){
                SinhVien sv=(SinhVien)oj.readObject();
                ds.add(sv);
            }
            oj.close();
            f.close();
        } catch (Exception e) {
        }
    }
}
