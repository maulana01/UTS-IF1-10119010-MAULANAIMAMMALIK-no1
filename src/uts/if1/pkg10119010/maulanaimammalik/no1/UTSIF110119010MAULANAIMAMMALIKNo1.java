/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119010.maulanaimammalik.no1;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF-1
 * NIM      : 10119010
 * Deskripsi Program : Program ini untuk menampilkan sifat berdasarkan tahun 
 *                     lahir yang telah di input berbasis objek
 */
public class UTSIF110119010MAULANAIMAMMALIKNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age umur = new Age(2020);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        
        System.out.println();
        System.out.println();
        System.out.println("======Hasil Perhitungan Umur======");
        int yearBirth = umur.getYearBirth();
        System.out.println("Tahun Lahir Anda : " + yearBirth);
        int yearNow = umur.getYearNow();
        System.out.println("Hari ini Tahun : " + yearNow);
        int usia = umur.hitungUmur();
        System.out.println("Umur kamu sampai hari ini adalah " + usia + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(usia));
    }
}
