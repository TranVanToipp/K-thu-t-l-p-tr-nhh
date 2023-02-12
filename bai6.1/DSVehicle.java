/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlxe;
import java.util.Vector;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class DSVehicle {
    private Vector ds;
    public DSVehicle(){
        ds=new Vector();
    }
    public void them(Vehicle vh){
        ds.add(vh);
    }
    public void xuatThue(){
       String s=String.format("%10s %10s %10s %10s %10s","Tenchuxe","Loaixe","Dungtich","Trigia","Thue");
       System.out.println(s);
       System.out.println("-------------------------------------------------------------");
       for(int i=0;i<ds.size();i++){
           ((Vehicle)ds.elementAt(i)).hienThi();
       }
    }
}
