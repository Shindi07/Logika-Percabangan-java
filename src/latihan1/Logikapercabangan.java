
package Latihan1;
import java.util.Scanner;

public class Logikapercabangan {

   
    public static void main(String[] args) {
        // Deklarasi variabel dan Scanner
        Scanner input= new Scanner(System.in);
        int belanjaan, diskon, bayar;
        String kartu;
       
       
        // mengambil input
        System.out.println("Apakah Ada Kartu Member:");
        kartu= input.next();
        System.out.println("Total Belanjaan:");
        belanjaan= input.nextInt();
       
       
        // Proses
        if (kartu.equalsIgnoreCase("Ya")){
            if (belanjaan > 500000){
                diskon=50000;
            }else if (belanjaan > 100000){
                diskon = 15000;
            }else{
                diskon=0;
            }
        }else{
            if (belanjaan > 100000){
                diskon= 5000;
            }else{
                diskon= 0;
            }
           
        // Total yang harus dibayar
        } bayar= belanjaan-diskon;
       
        //Output
        System.out.println("Total Bayar: Rp" + bayar);
       
    }
   
}