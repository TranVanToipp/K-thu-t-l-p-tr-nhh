/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvienx;
import java.util.Vector;
/*
 *
 * @author LAPTOP TAI THINH
 */
public class DanhSachSach {
    private Vector ds;
    public DanhSachSach(){
        ds=new Vector();
    }
    public void them(Sach s){
        ds.add(s);
    }
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
            ((Sach)ds.elementAt(i)).hienThi();
        }
    }
    public void tinhTongThanhTienChoTungLoai(){
        System.out.print("Tổng thành tiền cho loại sách giáo khoa:");
        int sum=0;
        for(int i=0;i<ds.size();i++){
            if(((Sach)ds.elementAt(i)).loaiSach().equalsIgnoreCase("SGK")){
            sum +=((Sach)ds.elementAt(i)).thanhTien();
            }
        }
        System.out.print(sum+"\n");
        System.out.print("Tổng thành tiền cho sloaij sách tham khảo:");
        int sum1=0;
        for(int i=0;i<ds.size();i++){
            if(((Sach)ds.elementAt(i)).loaiSach().equalsIgnoreCase("STK")){
                sum1 +=((Sach)ds.elementAt(i)).thanhTien();
            }
        }
        System.out.print(sum1+"\n");
    }
    public double tinhTrungBinhCongDonGiaCuaSachThamKhao(){
        double sum=0;
        int dem=0;
        for(int i=0;i<ds.size();i++){
            if(((Sach)ds.elementAt(i)).loaiSach().equalsIgnoreCase("STK")){
                sum +=((Sach)ds.elementAt(i)).thanhTien();
                dem +=1;
            }
        }
        sum /=dem;
        return sum;
    }
    public void xuatSachGiaoKhoaNhaXuatBanX(String x){
        for(int i=0;i<ds.size();i++){
            if(((Sach)ds.elementAt(i)).loaiSach().equalsIgnoreCase("SGK")&&((Sach)ds.elementAt(i)).layNhaXuatBan().equalsIgnoreCase(x)){
                ((Sach)ds.elementAt(i)).hienThi();
                System.out.print("\n");
            }
        }
    }
}
