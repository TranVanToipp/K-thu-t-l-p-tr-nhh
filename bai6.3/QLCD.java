/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcd;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QLCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DSCD ds=new DSCD();
        CD []cd=null;
        boolean flag=true;
        do {            
            System.out.println("1. Nhập cd tùy ý rồi thêm vào dánh sách:");
            System.out.println("2. Tính số lượng cd có trong danh sách:");
            System.out.println("3. Tính tổng giá thành của các cd:");
            System.out.println("4. Sắp xếp danh sách giảm dần theo giá thành:");
            System.out.println("5. Sắp xếp danh sách tăng dần theo tên cd:");
            System.out.println("6. Xuất toàn bộ danh sách:");
            System.out.println("Nhập một số khác để thoát:");
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhập một số trên menu:");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Nhập số lượng CD muốn thêm:");
                    int a=sc.nextInt();
                    cd=new CD[a];
                    for(int i=0;i<a;i++){
                        cd[i]=new CD();
                        System.out.println("Cd thứ "+(i+1)+" là:");
                        cd[i].nhap();
                    }
                    for(int i=0;i<a;i++){
                        ds.them(cd[i]);
                    }
                    break;
                case 2:
                    System.out.println("Số lượng cd có trong danh sách là:"+ds.tinhSoLuongCD());
                    break;
                case 3:
                    System.out.println("Tổng giá thành các cd:"+ds.tongGiaThanhCD());
                    break;
                case 4:
                    ds.sapXepGiamDanTheoGiaThanh();
                    System.out.println("Menu xuất hiện nhập số 6 để xem kết quả:");
                    break;
                case 5:
                    ds.sapXepTangDanTheoTenCD();
                    System.out.println("Menu xuất hiện nhấn số 6 để xem kết quả:");
                    break;
                case 6:
                    System.out.println("Hiển thị toàn bộ các cd có trong danh sách:");
                    ds.hienThi();
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
