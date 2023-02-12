/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QLSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DSSV ds=new DSSV();
        SinhVien []sv=null;
        boolean flag=true;
        do {            
            System.out.println("1. Nhập các đối tượng sinh viên muốn thêm vào danh sách.");
            System.out.println("2. In các đối tượng sinh viên trong danh sách ra màn hình.");
            System.out.println("3. In thông tin các sinh viên có tuổi lớn hơn 22.");
            System.out.println("4. Tìm thông tin sinh viên khi biết tên hoặc tuổi.");
            System.out.println("Nhập một số khác để thoát.");
            System.out.println("Nhập một số trong menu để thực hiện công việc.");
            Scanner sc=new Scanner(System.in);
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng sinh viên muốn thêm vào dánh sách:");
                    int n=sc.nextInt();
                    sv=new SinhVien[n];
                    for(int i=0;i<n;i++){
                        sv[i]=new SinhVien();
                        sv[i].nhap();
                    }
                    for(int i=0;i<n;i++){
                        ds.them(sv[i]);
                    }
                    break;
                case 2:
                    System.out.println("In các sinh viên có trong danh sách.");
                    ds.hienThi();
                    break;
                case 3:
                    System.out.println("Các sinh viên có tuổi lớn hơn 22:");
                    ds.inDanhSachTuoiLonHon22();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Nhập tên sinh viên hoặc tuổi cần tìm:");
                    String ten=sc.nextLine();
                    ds.timTHongTinSinhVienKhiBietTenHoacTuoi(ten);
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
