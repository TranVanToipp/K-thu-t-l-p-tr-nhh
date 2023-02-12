/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taotepsinhvien;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class TaotepSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        DSSV ds1=new DSSV();
        DSSV ds2=new DSSV();
        SinhVien []sv=null;
        boolean flag=true;
        do {            
            System.out.println("1. Nhập sinh viên muốn ghi ra tệp dssv.txt");
            System.out.println("2. Hiển thị thông tin tất cả các sinh viên có trong danh sach.");
            System.out.println("3. Ghi các sinh viên ra tệp dssv.txt.");
            System.out.println("4. Đọc tệp dssv.txt lưu vào mảng.");
            System.out.println("Nhập một số khác để thoát.");
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhập một số để chọn công việc trong menu:");
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng sinh viên muốn ghi ra tệp:");
                    int n=sc.nextInt();
                    sv=new SinhVien[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Sinh viên thứ "+(i+1)+":");
                        sv[i]=new SinhVien();
                        sv[i].nhap();
                    }
                    for(int i=0;i<n;i++){
                        ds1.them(sv[i]);
                    }
                    break;
                case 2:
                    System.out.println("Sinh viên trong danh sách lưu ra mảng mới là:");
                    ds2.hienThi();
                    break;
                case 3:
                    System.out.println("Ghi các đối tượng ra tệp dssv.txt:");
                    ds1.ghiDoiTuong("dssv.txt");
                    System.out.println("Ghi thành công");
                    break;
                case 4:
                    System.out.println("Đọc tệp dssv.txt lưu vào mảng mới:");
                    ds2.docDoiTuong("dssv.txt");
                    System.out.println("Đọc thành công.");
                    System.out.println("Nhấn nút số 2 trên menu để kiểm tra:");
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
