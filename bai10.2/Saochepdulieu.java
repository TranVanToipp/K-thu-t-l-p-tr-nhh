/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saochepdulieu;
import java.io.*;
/**
 *
 * @author LAPTOP TAI THINH
 */
public class Saochepdulieu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File source=new File("D:\\thuchanhlaptrinh\\bai10.2\\saochepdulieu\\filedulieu1.txt");
        File dest=new File("D:\\thuchanhlaptrinh\\bai10.2\\saochepdulieu\\filedulieu2.txt");
        InputStream inp;
        OutputStream outp;
        try {
            inp=new FileInputStream(source);
            outp=new FileOutputStream(dest);
            byte []b=new byte[1024];
            int leght;
            while((leght=inp.read(b))>0){
                outp.write(b,0,leght);
            }
            inp.close();
            outp.close();
            System.out.println("Coppy thành công");
        }catch(Exception e){
            
        }
        // TODO code application logic here
    }
    
}
