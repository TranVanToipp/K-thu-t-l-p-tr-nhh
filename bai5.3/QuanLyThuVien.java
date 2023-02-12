/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QuanLyThuVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DSMatHangSach ds=new DSMatHangSach();
      Sach []s=new Sach[3];
      s[0]=new Sach("001","Sach Toan","Nguyen Van A",10);
      s[1]=new Sach("002","Sach Van","Nguyen Van B",9);
      s[2]=new Sach("003","Sach Van Nang Cao","Nguyen Van B",19);
      for(int i=0;i<3;i++){
          ds.themSach(s[i]);
      }
      System.out.println("Thông tin tat ca sach:");
      ds.hienThi();
      System.out.println("---------------------------------");
      System.out.println("Nhap ten cuon sach can tim:");
      Scanner sc=new Scanner(System.in);
      String tensach=sc.nextLine();
      System.out.println("Thong tin cuon sach do :");
      ds.nhapTenSachInThongTinSach(tensach);
      System.out.println("---------------------------------");
      System.out.println("Nhap ten tac gia:");
      String tacgia=sc.nextLine();
      System.out.println("Cac cuon sach cua tac gia do la:");
      ds.nhapTenTacGiaInRaSachCuatacGia(tacgia);
      System.out.println("---------------------------------");
      System.out.println("So cuon sach co trong danh sach la: "+ds.tinhTongSoSach());  
        
      // TODO code application logic here
    }
    
}
