/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taphop;

/**
 *
 * @author LAPTOP TAI THINH
 */
public class TapHop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={1,2,5,7,9};
        int []c=new int[10];
        int []d=new int[10];
        System.out.println("Phép giao cho kết quả là:");
        giaoTapHop(a,b);
        System.out.println("\nPhép hội cho kết quả là:");
        hoiTapHop(a, b,c);
        System.out.println("\nPhép trừ hai tập hợp cho kết quả là:");
        tapATruTapB(a, b, d);
        // TODO code application logic here
    }
    public static void giaoTapHop(int a[],int b[]){
            for(int i=0;i<5;i++){
                int dem=0;
                for(int j=0;j<5;j++){
                    if(a[i]==b[j]){
                        dem +=1;
                    }
                }
                 if(dem>0){
                    System.out.print(a[i]);
            }
        }
    }
    public static void hoiTapHop(int a[],int b[],int c[]){
        int vt=0;
        for(int i=0;i<5;i++){
            c[i]=a[i];
            vt +=1;
        }
        for(int j=0;j<5;j++){
                int dem=0;
            for(int f=0;f<5;f++){
                if(b[j]==c[f]){
                    dem +=1;
                }
            }
            if(dem==0){
                c[vt]=b[j];
                 vt +=1;
            }
        }
        for(int i=0;i<7;i++){
            System.out.print(c[i]);
        }
    }
    public static void tapATruTapB(int a[],int b[],int d[]){
       for(int i=0;i<5;i++){
           int dem=0;
           for(int j=0;j<5;j++){
               if(a[i]==b[j]){
                   dem +=1;
               }
           }
           int vt=0;
           if(dem==0){
               d[vt]=a[i];
               vt++;
           }
       }
       for(int i=0;i<1;i++){
           System.out.println(d[i]);
       }
    }
}
