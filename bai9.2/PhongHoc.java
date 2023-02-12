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
abstract public class PhongHoc {
    protected int maPhong;
    protected String dayNha;
    // Quy định 1m:là 100 10m: là 1000 10.2m: là 1020;
    protected String dienTich;
    protected int soBongDen;
    public PhongHoc(){
        maPhong=0;
        dayNha="";
        dienTich="";
        soBongDen=0;
    }
    public PhongHoc(int mp,String dn,String dt,int sbd){
        maPhong=mp;
        dayNha=dn;
        dienTich=dt;
        soBongDen=sbd;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mã phòng: ");
        maPhong=sc.nextInt();
        System.out.println("Dãy nhà:");
        sc.nextLine();
        dayNha=sc.nextLine();
        System.out.println("Diện tích:");
        dienTich=sc.nextLine();
        System.out.println("Số bóng đèn:");
        soBongDen=sc.nextInt();
    }
    public int layMaPhong(){
        return maPhong;
    }
    abstract public String loaiPhong();
    abstract public Boolean datChuan();
    public void hienThi(){
        System.out.print("MaPhong:"+maPhong+",DayNha:"+dayNha+",DienTich:"+dienTich+",SoBongDen:"+soBongDen);
    }
    public boolean equals(Object s){
        if(s instanceof PhongHoc){
            PhongHoc ss=(PhongHoc)s;
            return maPhong==ss.maPhong;
        }
        return false;
    }
}
