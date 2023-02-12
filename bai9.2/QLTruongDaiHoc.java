/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltruongdaihoc;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QLTruongDaiHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DanhSachPhong ds=new DanhSachPhong();
        PhongHoc []ph=null;
        boolean flag=true;
        do {   
            System.out.println("1. Nhập phong học rồi thêm vào danh sách.");
            System.out.println("2. Thêm một phòng học danh sách thêm thành công nếu không bị trùng mã phòng.");
            System.out.println("3. Tìm kiếm một phòng nào đó khi biết mã phòng.");
            System.out.println("4. In toàn bộ danh sách phòng học ra màn hình.");
            System.out.println("5. In danh sách các phòng học đạt chuẩn.");
            System.out.println("6. Cập nhật số máy tính cho phòng máy tính khi biết mã phòng.");
            System.out.println("7. Xóa một phòng học nào đó khi biết mã phòng.");
            System.out.println("8. In ra tổng số phòng học.");
            System.out.println("9. In danh sách các phòng máy tính có hơn 30 máy.");
            System.out.println("Nhập một số bất kì để thoát khỏi chuuowng trình");
            System.out.println("Nhập số bất kì trong menu để bắt đầu công việc:");
            Scanner sc=new Scanner(System.in);
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng sinh viên muốn thêm vào danh sách:");
                    int n=sc.nextInt();
                    ph=new PhongHoc[n];
                    sc.nextLine();
                    for(int i=0;i<n;i++){
                        System.out.println("Nhập loại phòng muốn thêm vào danh sách PHLT PMT PTN:");
                        String loai=sc.nextLine();
                        if(loai.equalsIgnoreCase("PHLT")){
                            ph[i]=new PhongHocLyThuyet();
                            ph[i].nhap();
                        }else{
                            if(loai.equalsIgnoreCase("PMT")){
                                ph[i]=new PhongMayTinh();
                                ph[i].nhap();
                            }else{
                                ph[i]=new PhongThiNghiem();
                                ph[i].nhap();
                            }
                        }
                    }
                    // thêm tất cả các phòng học đã nhập vào danh sách
                    for(int i=0;i<n;i++){
                        ds.them(ph[i]);
                    }
                    break;
                case 2:
                    int n1=1;
                    ph=new PhongHoc[n1];
                    sc.nextLine();
                    System.out.println("Nhập loại phòng muốn thêm vào danh sách PHLT PMT PTN:");
                    String loai1=sc.nextLine();
                    if(loai1.equalsIgnoreCase("PHLT")){
                        ph[0]=new PhongHocLyThuyet();
                        ph[0].nhap();
                    }else{
                        if(loai1.equalsIgnoreCase("PMT")){
                            ph[0]=new PhongMayTinh();
                            ph[0].nhap();
                        }else{
                            ph[0]=new PhongThiNghiem();
                            ph[0].nhap();
                        }
                    }
                    ds.them(ph[0]);
                    System.out.println("Bấm vào menu để chọn nút số 4 để xem kết quả.");
                    break;
                case 3:
                    System.out.println("Nhập mã phòng muốn tìm kiếm:");
                    int maphong=sc.nextInt();
                    System.out.println("Phòng xuất hiện sau khi tìm kiếm là:");
                    ds.timPhongHocKhiBietmaPhong(maphong);
                    break;
                case 4:    
                    System.out.println("In toàn bộ danh sách phòng học ra màn hình:");
                    ds.inDanhSachTatCaCacLoaiPhong();
                    break;
                case 5:
                    System.out.println("In danh sách phòng đạt chuẩn:");
                    ds.inPhongDatChuan();
                    break;
                case 6:
                    System.out.println("Cập nhật số máy tính cho phòng máy tính khi biết mã phòng:");
                    System.out.println("Nhập mã phòng muốn cập nhật:");
                    int maphong1=sc.nextInt();
                    System.out.println("Nhập số máy tính muốn cập nhật:");
                    int smt=sc.nextInt();
                    ds.capNhatSoMayTinhKhiBietMaPhong(maphong1, smt);
                    break;
                case 7:
                    System.out.println("Xóa một phòng học nào đó khi biết mã phòng:");
                    System.out.println("Nhập mã phòng muốn xóa:");
                    int maphong2=sc.nextInt();
                    ds.xoaPhongKhiBietMaPhong(maphong2);
                    break;
                case 8:
                    System.out.println("Tổng số phòng học của dánh sách là:"+ds.tongSoPhongHoc());
                    break;
                case 9:
                    System.out.println("In danh sách phòng máy tính có hơn 30 máy.");
                    ds.inDanhSachPhongMayTinhCoHon30May();
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
