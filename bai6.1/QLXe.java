/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlxe;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QLXe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DSVehicle ds=new DSVehicle();
        Vehicle []v=null;
        boolean flag=true;
        do {            
            System.out.println("Bạn chọn làm gì:");
            System.out.println("1. Nhập các đối tượng phương tiện:");
            System.out.println("2. In ra cac đối tượng phương tiện và tiền thuế: ");
            System.out.println("Nhập một số khác để thoát:");
            System.out.println("Nhập số muốn thực hiện:");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("Nhập số lượng phương tiện theo ý muốn:");
                    int sl=sc.nextInt();
                    v=new Vehicle[sl];
                    for(int i=0;i<sl;i++){
                       System.out.println("Phương tiện thứ "+(i+1)+" là:");
                       v[i]=new Vehicle();
                       v[i].nhapVehicle();
                    }
                    for(int i=0;i<sl;i++){
                        ds.them(v[i]);
                    }
                    break;
                case 2:
                    ds.xuatThue();
                    break;
                default:
                    System.out.println("Bye");
                    flag=false;
                    break;
            }
        } while (flag);
        // TODO code application logic here
    }
    
}
