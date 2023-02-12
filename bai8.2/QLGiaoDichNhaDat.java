/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgiaodichnhadat;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QLGiaoDichNhaDat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DSGiaoDich ds=new DSGiaoDich();
        GiaoDich []gd=null;
        boolean flag=true;
        do {            
            System.out.println("\n1. Nhập các giao dịch nhà và đất.");
            System.out.println("2. In ra tất cả các giao dịch có trong danh sách.");
            System.out.println("3. Tính tổng số lượng từng loại các giao dịch.");
            System.out.println("4. Tính trung bình thành tiền của giao dich đất.");
            System.out.println("5. Xuất ra các giao dịch của tháng 9 năm 2016.");
            System.out.println("Nhập một số khác để thoát.");
            System.out.println("Nhập một số trong menu để chọn chức năng làm việc.");
            Scanner sc=new Scanner(System.in);
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng giao dịch muốn thêm vào danh sách:");
                    int n=sc.nextInt();
                    sc.nextLine();
                    gd=new GiaoDich[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Nhập Giao dịch GDN, GDD:");
                        String s=sc.nextLine();
                        if(s.equalsIgnoreCase("GDN")){
                            gd[i]=new GiaoDichNha();
                            gd[i].nhap();
                        }else{
                            gd[i]=new GiaoDichDat();
                            gd[i].nhap();
                        }
                    }
                    for(int i=0;i<n;i++){
                        ds.them(gd[i]);
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị tất cả các giao dịch có trong danh sách:");
                    ds.hienThi();
                    break;
                case 3:
                    System.out.println("Tính tổng số lượng từng loại các giao dịch:");
                    ds.tinhTongSoLuongTungLoai();
                    break;
                case 4:
                    System.out.println("Tổng trung bình thành tiền giao dịch nhà đất là: "+ds.tinhTrungBinhThanhTienGĐat());
                    break;
                case 5:
                    System.out.println("Xuất ra các giao dịch của tháng 9 năm 2016:");
                    ds.xuatCacGiaoDichThang9Nam2016();
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
