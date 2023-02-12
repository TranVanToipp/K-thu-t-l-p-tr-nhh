/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcd;
import java.util.Vector;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSCD {
    private Vector ds;
    public DSCD(){
        ds=new Vector();
    }
    public void them(CD cd){
        if(ds.contains(cd)==false){
            ds.add(cd);
        }
    }
    public int tinhSoLuongCD(){
        int sum=0;
        for(int i=0;i<ds.size();i++){
            sum +=1;
        }
        return sum;
    }
    public double tongGiaThanhCD(){
        double tong=0;
        for(int i=0;i<ds.size();i++){
            tong +=((CD)ds.elementAt(i)).getGiaThanh();
        }
        return tong;
    }
    public void sapXepGiamDanTheoGiaThanh(){
        for(int i=0;i<ds.size()-1;i++){
            CD cdi=(CD)ds.elementAt(i);
            for(int j=i+1;j<ds.size();j++){
                CD cdj=(CD)ds.elementAt(j);
                if(cdi.getGiaThanh()<cdj.getGiaThanh()){
                    CD temp=cdi;
                    ds.set(i, cdj);
                    ds.set(j, temp);
                }
            }
        }
    }
    public void sapXepTangDanTheoTenCD(){
        for(int i=0;i<ds.size()-1;i++){
            CD cdi=(CD)ds.elementAt(i);
            for(int j=i+1;j<ds.size();j++){
                CD cdj=(CD)ds.elementAt(i);
                //Phương thức compareTo() so sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển
                if(cdi.getTenCD().compareTo(cdj.getTenCD())>0){
                    CD temp=cdi;
                    ds.set(i,cdj);
                    ds.set(j, temp);
                }
            }
        }
    }
    public void hienThi(){
        System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
        for(int i=0;i<ds.size();i++){
            ((CD)ds.elementAt(i)).hienThi();
        }
    }
}
