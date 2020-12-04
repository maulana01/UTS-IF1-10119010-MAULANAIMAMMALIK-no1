/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119010.maulanaimammalik.no1;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF-1
 * NIM      : 10119010
 * Deskripsi Program : Program ini untuk menampilkan sifat berdasarkan tahun 
 *                     lahir yang telah di input berbasis objek
 */
public class Age {
    private int yearBirth, yearNow;
    private static String red = "\033[0;31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int getYearBirth() {
        return this.yearBirth;
    }
        
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return this.yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        String tandanyaKamu;
        
        if (umur >= 0 && umur <= 5) {
            tandanyaKamu = "lagi lucu-lucu nya";
        } else if (umur > 5 && umur <= 10) {
            tandanyaKamu = "masih anak-anak";
        } else if (umur > 10 && umur <= 13) {
            tandanyaKamu = "masih remadja";
        } else if (umur > 13 && umur <= 19) {
            tandanyaKamu = "alay";
        } else if (umur > 19 && umur <= 29) {
            tandanyaKamu = "lagi galau nyari jodoh";
        } else if (umur > 29 && umur <= 35) {
            tandanyaKamu = "lagi sibuk nyari uang";
        } else if (umur > 35 && umur <= 150) {
            tandanyaKamu = "sudah tua";
        } else {
            tandanyaKamu = "tidak terdeteksi di kehidupan";
        }
        String kapital = tandanyaKamu.toUpperCase();
        return red.concat(kapital);
    }
}
