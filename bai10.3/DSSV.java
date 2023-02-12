/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luutruthongtinsinhvien;

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
    public void them(SV sv){
     if(ds.contains(sv)==false){
         ds.addElement(sv);
     }
    }        
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
           ((SV)ds.elementAt(i)).hienThi();
        }
    }
    public void ghiTepDoiTuong(String tenTep){
        try {
            ObjectOutputStream oj=new ObjectOutputStream(new FileOutputStream(tenTep));
            for(int i=0;i<ds.size();i++){
                oj.writeObject(ds.elementAt(i));
            }
            oj.close();
        } catch (Exception e) {
        }
    }
    public void docTepDoiTuongDuaVaoMang(String tenTep){
        try {
            FileInputStream f=new FileInputStream(tenTep);
            ObjectInputStream oj=new ObjectInputStream(f);
            while(f.available()>0){
                SV sv=(SV)oj.readObject();
                ds.addElement(sv);
            }
            oj.close();
            f.close();
        } catch (Exception e) {
        }
    }
}
