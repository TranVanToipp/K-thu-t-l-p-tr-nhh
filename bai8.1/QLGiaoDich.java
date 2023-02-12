/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgiaodich;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QLGiaoDich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DSGiaoDich ds=new DSGiaoDich();
         GiaoDich []gd=null;
         boolean flag=true;
         do {        
             System.out.println("1. Nhập các giao dịch bao gồm giao dịch vàng và giao dịch tiền tệ.");
             System.out.println("2. In ra tất cả các giao dịch có trong danh sách.");
             System.out.println("3. Tính tổng số lượng cho từng loại giao dịch.");
             System.out.println("4. Tính trung bình thành tiền của giao dịch tiền tệ.");
             System.out.println("5. Xuất ra các giao dich lớn hơn 1 tỷ.");
             System.out.println("Nhập một số khác để thoát khỏi chương trình.");
             System.out.println("Nhập một số để chọn công việc trên menu.");
             Scanner sc=new Scanner(System.in);
             int menu=sc.nextInt();
             switch(menu){
                 case 1:
                     System.out.println("Nhập số lượng các giao dịch muốn thêm vào danh sách.");
                     int n=sc.nextInt();
                     sc.nextLine();
                     gd=new GiaoDich[n];
                     for(int i=0;i<n;i++){
                         System.out.println("Nhập giao dịch vàng hay giao dịch tiền đê thêm lần lượt là GDV, GDTT");
                         String s=sc.nextLine();
                         if(s.equalsIgnoreCase("GDV")){
                             gd[i]=new GiaoDichVang();
                             gd[i].nhap();
                         }else{
                             gd[i]=new GiaoDichTienTe();
                             gd[i].nhap();
                         }
                     }
                     for(int i=0;i<n;i++){
                         ds.them(gd[i]);
                     }
                     break;
                 case 2:
                     System.out.println("Tất cả các giao dịch trong danh sach:");
                     ds.hienThi();
                     break;
                 case 3:
                     System.out.println("Tổng số lượng cho từng loại giao dịch:");
                     ds.tinhTongSoLuongChoTungLoai();
                     break;
                 case 4:
                     System.out.println("Trung bình thành tiền của giao dịch tiền tệ:"+ds.trungBinhThanhTienGiaoDichTienTe());
                     break;
                 case 5:
                     System.out.println("Xuất ra các giao dịch lớn hơn 1 tỷ:");
                     ds.xuatCacGiaoDichCoDonGiaHon1Ty();
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
