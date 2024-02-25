/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int nilai=0;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Nilai Ujian:");
        nilai=scan.nextInt();
        
        if (nilai >=70){
            System.out.println("Selamat Anda Lulus Ujian");
        }
        else{
            System.out.println("Anda Tidak Lulus Ujian");
        }
    }
    
}
