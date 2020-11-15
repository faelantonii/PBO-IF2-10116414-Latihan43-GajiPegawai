/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan43_GajiPegawai;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan gaji pegawai
 */
public class PBO_IF2_10116414_GajiPegawai {
    public static void main(String[] args) {
        GajiPegawai gajiPegawai1 = new GajiPegawai();
        Scanner scan = new Scanner (System.in);
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        
        System.out.print("Nama Karyawan\t: ");
        String namaK = scan.nextLine();
        
        System.out.print("Alamat\t: ");
        String alamat = scan.nextLine();
        
        System.out.print("Uang Transport\t: Rp. ");
        int uangTrans = scan.nextInt();
        
        System.out.print("Uang Tunjangan\t: Rp. ");
        int uangTun = scan.nextInt();
        
        System.out.print("Gaji Pokok\t: Rp. ");
        int GajiPok = scan.nextInt();
        
        System.out.println("Total Gaji\t: Rp. "+gajiPegawai1.totalGaji(uangTun, uangTrans, GajiPok));
       
    }
}
