/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlchuyenxe;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QLChuyenXe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DanhSachChuyenXe ds=new DanhSachChuyenXe();
        ChuyenXe []cx=null;
        boolean flag=true;
        do {            
            System.out.println("1. Nhập các chuyến xe theo ý muốn bao gồm cả 2 chuyến xe.");
            System.out.println("2. Xuất các chuyến xe có trong danh sách chuyến xe ra màn hình.");
            System.out.println("3. Tính tổng doanh thu cho từng loại xe.");
            System.out.println("Nhâp một số khác để thoát khỏi chương trình");
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhập một số trong menu để thực hiện công việc: ");
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng các chuyến xe muốn thêm vào danh sách:");
                    int n=sc.nextInt();
                    sc.nextLine();
                    cx=new ChuyenXe[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Nhập tên chuyến xe cua 2 loại xe NoiThanh và NgoaiThanh:");
                        String p=sc.nextLine();
                        if(p.equalsIgnoreCase("NoiThanh")){
                            cx[i]=new ChuyenXeNoiThanh();
                            cx[i].nhap();
                        }else{
                            cx[i]=new ChuyenXeNgoaiThanh();
                            cx[i].nhap();
                        }
                    }
                    // thêm tất cả các chuyến xe mới nhập
                    for(int i=0;i<n;i++){
                        ds.them(cx[i]);
                    }
                    break;
                case 2:
                    System.out.println("Cac chuyen xe co trong danh sach:");
                    ds.hienThi();
                    break;
                case 3:
                    System.out.println("Tổng doanh thu của từng loại xe:");
                    ds.tinhTongDoanhThuTungLoaiXe();
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
