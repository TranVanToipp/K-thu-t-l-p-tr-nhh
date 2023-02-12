/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;
import java.util.Scanner;
import java.util.Vector;
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
            System.out.println("1. Nhập sinh viên vào danh sách.");
            System.out.println("2. Xuất danh sách sinh viên  ra màn hình.");
            System.out.println("3. Tìm và in thông tin của những sinh viên có điểm trung bình cao nhất.");
            System.out.println("4. Sắp xếp dánh sách sinh viên theo thứ tự giảm dần của điểm trung bình.");
            System.out.println("5. In danh sách sinh viên có điểm trung bình lớn hơn 7 và không có môn nào dưới 4.");
            System.out.println("Nhập một số khác để thoát.");
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhập một số trong menu để chọn công việc muốn thực hiện.");
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nhập số lượng sinh viên muốn thêm vào danh sách:");
                    int n=sc.nextInt();
                    sv=new SinhVien[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Sinh vien thứ"+(i+1)+":");
                        sv[i]=new SinhVien();
                        sv[i].nhap();
                        ds.them(sv[i]);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách các sinh viên là:");
                    ds.hienThi();
                    break;
                case 3:
                    System.out.println("Những sinh viên có điểm trung bình cao nhất là:");
                    ds.sinhVienCoDiemTrungBinhCaoNhat();
                    break;
                case 4:
                    System.out.println("Sắp xếp danh sách sinh viên theo thứ tự giảm dần của điểm trung bình.");
                    ds.sapXepGiamDanDTB();
                    System.out.println("Chọn nút số 2 trong menu để xem kết quả.");
                    break;
                case 5:
                     System.out.println("5. Danh sách sinh viên có điểm trung bình lớn hơn 7 và không có môn nào dưới 4.");
                     ds.diemTBHon7VaDiemCacMonHon4();
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
class SinhVien{
    private String maSV;
    private String hoTen;
    private int namSinh;
    private float diemToan;
    private float  diemLy;
    private float diemHoa;
    // Điểm trung bình là điểm tổng các môn chia cho số (index) các môn
   public SinhVien(){
       // phương thức khởi tạo rỗng
       maSV="";
       hoTen="";
       namSinh=0;
       diemToan=0;
       diemLy=0;
       diemHoa=0;
   }
   public SinhVien(String msv,String ht,int ns,int dt,int dl,int dh){
       maSV=msv;
       hoTen=ht;
       namSinh=ns;
       diemToan=dt;
       diemLy=dl;
       diemHoa=dh;
   }
   public void nhap(){
       System.out.println("Mã sinh viên:");
       Scanner sc = new Scanner(System.in);
       maSV=sc.nextLine();
       System.out.println("Họ tên:");
       hoTen=sc.nextLine();
       System.out.println("Năm sinh:");
       namSinh=sc.nextInt();
       System.out.println("Điểm toán:");
       diemToan=sc.nextFloat();
       System.out.println("Điểm lý:");
       diemLy=sc.nextFloat();
       System.out.println("Điểm hóa:");
       diemHoa=sc.nextFloat();
   }
   public float layDiemToan(){
       return diemToan;
   }
    public float layDiemLy(){
       return diemLy;
   }
     public float layDiemHoa(){
       return diemHoa;
   }
   public float diemTrungBinh(){
       float diemTB=0;
       diemTB=(float)((diemToan+diemLy+diemHoa)/3);
       return diemTB;
   }
   public void hienthi(){
       System.out.println("MaSinhVien"+maSV+",Hoten:"+hoTen+",NamSinh:"+namSinh+",DiemToan:"+diemToan+",DiemLy:"+diemLy+",DiemHoa:"+diemHoa+",DiemTB:"+this.diemTrungBinh());
   }
}
class DSSV{
    private Vector ds;
    public DSSV(){
        ds=new Vector();
    }
    public void them(SinhVien s){
        ds.add(s);
    }
    public void hienThi(){
        for(int i=0;i<ds.size();i++){
            ((SinhVien)ds.elementAt(i)).hienthi();
        }
    }
    public void sinhVienCoDiemTrungBinhCaoNhat(){
        SinhVien a=(SinhVien)ds.elementAt(0);
        int vt=0;
        for(int i=1;i<ds.size();i++){
            if(((SinhVien)ds.elementAt(i)).diemTrungBinh()>a.diemTrungBinh()){
                vt=i;
            }
        }
        System.out.println("Sinh vien do la:");
        ((SinhVien)ds.elementAt(vt)).hienthi();
    }
    public void sapXepGiamDanDTB(){
        for(int i=0;i<ds.size();i++){
            SinhVien svi=(SinhVien)ds.elementAt(i);
            for(int j=i+1;j<ds.size();j++){
                SinhVien svj=(SinhVien)ds.elementAt(j);
                if(svi.diemTrungBinh()<svj.diemTrungBinh()){
                    SinhVien temp=new SinhVien();
                    temp=svi;
                    svi=svj;
                    svj=temp;
                }
            }
        }
    }
    public void diemTBHon7VaDiemCacMonHon4(){
        for(int i=0;i<ds.size();i++){
            if(((SinhVien)ds.elementAt(i)).diemTrungBinh()>7&((SinhVien)ds.elementAt(i)).layDiemToan()>=4&((SinhVien)ds.elementAt(i)).layDiemLy()>=4&((SinhVien)ds.elementAt(i)).layDiemHoa()>=4){
                ((SinhVien)ds.elementAt(i)).hienthi();
            }
        }
    }
}
