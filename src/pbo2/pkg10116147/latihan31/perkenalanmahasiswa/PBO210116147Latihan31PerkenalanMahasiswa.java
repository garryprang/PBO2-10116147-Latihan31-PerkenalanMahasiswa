/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan31.perkenalanmahasiswa;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan perkenalan mahasiswa.
 */


class Mahasiswa{
    String nama;
    String nim;
    
    void perkenalkanDiri(){
        System.out.println("Hello Everyone!");
        System.out.println("My NIM is "+nim);
        System.out.println("My name is "+nama+"\n");
    }
}
public class PBO210116147Latihan31PerkenalanMahasiswa {
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa1=new Mahasiswa();
        mahasiswa1.nim="10110269";
        mahasiswa1.nama="Rizki Adam Kurniawan";
        Mahasiswa mahasiswa2=new Mahasiswa();
        mahasiswa2.nim="10110270";
        mahasiswa2.nama="Indra Tiola";
        Mahasiswa mahasiswa3=new Mahasiswa();
        mahasiswa3.nim="10110271";
        mahasiswa3.nama="Robi tansil Genefi";
        Mahasiswa mahasiswa4=new Mahasiswa();
        mahasiswa4.nim="10110269";
        mahasiswa4.nama="Muhamad nur awaludin";
        
        mahasiswa1.perkenalkanDiri();
        mahasiswa2.perkenalkanDiri();
        mahasiswa3.perkenalkanDiri();
        mahasiswa4.perkenalkanDiri();
        
    }
    
}
