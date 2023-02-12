/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymathang;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class QuanLyMatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DSMatHang ds=new DSMatHang();
        MatHang []mh=new MatHang[3];
        mh[0]=new MatHang("001","Chuoi", 5, 110, 19, 12);
        mh[1]=new MatHang("002","Oi", 6, 90, 16, 19);
        mh[2]=new MatHang("003","Coc", 2, 100, 18, 16);
        for(int i=0;i<3;i++){
            ds.themMatHang(mh[i]);
        }
        System.out.println("Mat hang co so luong ton nheu nhat:");
        ds.matHangSoLuongTonNhieuNhat();
        System.out.println("Mat hang co don gia cao nhat:");
        ds.timMatHangCoDonGiaCaoNhat();
        System.out.println("Nhung mat hang co thoi gian bao hanh lon hon 12 thang:");
        ds.inMatHangThoiGianBaoHanhLonHon12Thang();
        System.out.println("Sap xep cac mat hang theo thu tu tang dan cua so luong ton:");
        ds.sapXepTangDanTheoSoLuongTon();
        ds.hienThi();
    }
    
}
