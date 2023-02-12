/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganhang;

import java.util.Scanner;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class NganHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account []a=null;
        int n=0;
        boolean flag=true;
        do{
            System.out.println("1. Nhập các account theo ý muốn:\n"+
                    "2. Nạp tiền vào một tài khoản bất kỳ:\n"+
                    "3. Rút tiền trong một tài khoản bất kì:\n"+
                    "4. Chuyển tiền vào một tìa khoản bất kì từ một tài khoản khác:\n"+
                    "Nhập một số khác để thoát.");
            System.out.println("Nhập một số để chọn công việc trong menu:");
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng tài khoản muốn nhập:");
                     n=sc.nextInt();
                    a=new Account[n];
                    for(int i=0;i<n;i++){
                        a[i]=new Account();
                        a[i].nhap();
                    }
                    break;
                case 2:
                    System.out.println("Nhập số tài khoản muốn nạp tiền vào:");
                    long stk=sc.nextLong();
                    System.out.println("Nhập số tiền muốn nạp:");
                    double sotien=sc.nextDouble();
                    for(int i=0;i<n;i++){
                        if(a[i].getSoTaiKhoan()==stk){
                            a[i].napTien(stk, sotien);
                        }
                        System.out.println(a[i]);
                    }
                    break;
                case 3:   
                    System.out.println("Nhập số tài khoản muốn rút:");
                    long stkr=sc.nextLong();
                    System.out.println("Nhập số tiền muốn rút:");
                    double str=sc.nextDouble();
                    for(int i=0;i<n;i++){
                        if(a[i].getSoTaiKhoan()==stkr){
                            if(a[i].getSoTienTrongTaiKhoan()<str){
                                do{
                                    a[i].nhap();
                                }while(a[i].getSoTienTrongTaiKhoan()<str);
                            }   
                        }
                        a[i].rutTien(str);
                        System.out.println(a[i]);
                    }
                    break;
                case 4:
                    System.out.println("Nhập số tài khoản muốn chuyển tiền:");
                    long stkct=sc.nextLong();
                    System.out.println("Nhập số tài khoản nhận tiền:");
                    long stknt=sc.nextLong();
                    System.out.println("Nhập số tiền muốn chuyển:");
                    double stmc=sc.nextDouble();
                    for(int i=0;i<n;i++){
                        if(a[i].getSoTaiKhoan()==stkct){
                            for(int j=0;j<n;j++){
                                if(a[j].getSoTaiKhoan()==stknt){
                                    a[i].chuyenKhoan(a[j], stmc);
                                    System.out.println(a[i]);
                                    System.out.println(a[j]);
                                }    
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Bye");
                    flag=false;
                    break;
            }
        }while(flag);
        // TODO code application logic here
    }
    
}
