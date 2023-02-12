/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvienx;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QuanLyThuVienX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DanhSachSach ds=new DanhSachSach();
        Sach []s=null;
        boolean flag=true;
        do{            
            System.out.println("1. Nhập sách bao gồm sách giáo khoa và sách tham khảo.");
            System.out.println("2. Xuất danh sách các loại sách.");
            System.out.println("3. Tính tổng thành tiền cho từng loại sách.");
            System.out.println("4. Tính trung bình cộng đơn giá của các sách tham khảo.");
            System.out.println("5. Xuất các sách giáo khoa của nhà sản xuất x.");
            System.out.println("Nhập một số khác để thoát.");
            System.out.println("Nhập một số để chọn công việc trong menu.");
            Scanner sc=new Scanner(System.in);
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng sách muốn thêm:");
                    int n=sc.nextInt();
                    sc.nextLine();
                    s=new Sach[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Nhập loại sách muốn thêm vào danh sách SGK và STK:");
                        String loaiSach=sc.nextLine();
                        if(loaiSach.equalsIgnoreCase("SGK")){
                            s[i]=new SachGiaoKhoa();
                            s[i].nhap();
                        }else{
                            s[i]=new SachThamKhao();
                            s[i].nhap();
                        }
                    }
                    for(int i=0;i<n;i++){
                        ds.them(s[i]);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach toàn bộ các loại sách:");
                    ds.hienThi();
                    break;
                case 3:    
                    System.out.println("Tổng thành tiền của từng loại sách:");
                    ds.tinhTongThanhTienChoTungLoai();
                    break;
                case 4:
                    System.out.println("Trung bình cộng đơn giá của các sách tham khảo là: "+ds.tinhTrungBinhCongDonGiaCuaSachThamKhao());
                    break;
                case 5:
                    System.out.println("Xuât các sách giáo khoa của nhà sản xuất x:");
                    System.out.println("Nhập tên nhà sản xuất:");
                    String tenx=sc.nextLine();
                    ds.xuatSachGiaoKhoaNhaXuatBanX(tenx);
                    break;
                default:
                    System.out.println("Bye");
                    flag=false;
                    break;
            }
        } while (flag);
        // TODO cod application logic here
    }
    
}
