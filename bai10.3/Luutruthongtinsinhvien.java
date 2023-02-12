/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luutruthongtinsinhvien;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class Luutruthongtinsinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DSSV ds1=new DSSV();
        DSSV ds2=new DSSV();
        SV []sv=null;
        boolean flag=true;
        do {            
            System.out.println("1. Nhập sinh viên vào muốn viết vào file");
            System.out.println("2. Hiển thị thông tin của sinh viên được thêm vào mảng mới");
            System.out.println("3. Ghi đối tượng sinh viên ra file data.dat");
            System.out.println("4. Đọc đối tượng file data.dat roi luu vao mảng mới.");
            System.out.println("Nhập một số khác để thoát");
            System.out.println("Nhập một số trong menu để chọn công việc.");
            Scanner sc=new Scanner(System.in);
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng sinh viên muốn ghi vào tệp data.dat");
                    int n=sc.nextInt();
                    sv=new SV[n];
                    for(int i=0;i<n;i++){
                        sv[i]=new SV();
                        sv[i].nhap();
                        ds1.them(sv[i]);
                    }
                    break;
                case 2:
                    System.out.println("Dữ liệu trong mảng mới là:");
                    ds2.hienThi();
                    break;
                case 3:
                    ds1.ghiTepDoiTuong("data.dat");
                    System.out.println("Ghi thành công");
                    break;
                case 4:
                    ds2.docTepDoiTuongDuaVaoMang("data.dat");
                    System.out.println("Đọc thành công");
                    System.out.println("Nhấn chọn số 2 trong menu để xem dữ liệu của đối tượng trên màn hình.");
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
