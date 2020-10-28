/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan19.tabungan;

/**
 *
 * @author Rheiza
 * NAMA  : Rheiza Akaml R
 * KELAS : IF2   
 * NIM   : 10119061
 */
import java.util.Scanner;
public class PBOIF210119061Latihan19Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int lama,i;
        String hasil;
        float bunga;
        double saldoAwal, saldoTotal;
        
        System.out.print("Saldo Awal :Rp. ");
        saldoAwal=input.nextDouble();
        System.out.print("Bunga/bulan(%): ");
        bunga=input.nextFloat();
        System.out.print("Lama (bulan) : ");
        lama=input.nextInt();
        
        bunga = (float) (bunga/100);
        System.out.println(bunga);
        
        for (i=1; i<=lama;i++){
            saldoTotal = saldoAwal + (bunga*saldoAwal);
            System.out.println("Saldo dibulan ke-" + i +saldoTotal);
        }
    }
    
}
