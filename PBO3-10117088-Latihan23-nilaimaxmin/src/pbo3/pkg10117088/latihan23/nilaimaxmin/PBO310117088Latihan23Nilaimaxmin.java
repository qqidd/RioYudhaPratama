/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan23.nilaimaxmin;

import java.util.Scanner;



/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Program ini berisi program untuk perhitungan nilai maksimum 
 * dan nilai minimum
 * 
 */
public class PBO310117088Latihan23Nilaimaxmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	//deklarasi variabel
        String petugas;
        int nMhs; //jumlah mahasiswa
        int nBesar;
        int nKecil;
        int nilaiMhs;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
//        inisialisasi variabel
        nBesar = 0;
        nKecil = 100;
//        looping sesuai jumlahh mahasiswa
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMhs = scn.nextInt();
            
            //menentukan nilai terbesar dan nilai terkecil
            nBesar = ((nBesar<=nilaiMhs)?nilaiMhs:nBesar);
            nKecil = ((nKecil>=nilaiMhs)?nilaiMhs:nKecil);
        }
        
//        menampilkan hasil dari nilai terbesar dan nilai terkecil
        System.out.print("\nNilai Terbesar adalah  "+ nBesar);
        System.out.println("\nNilai Terkecil adalah  "+ nKecil);   
        System.out.println("\nPetugas : " + petugas);
    }
    
}
