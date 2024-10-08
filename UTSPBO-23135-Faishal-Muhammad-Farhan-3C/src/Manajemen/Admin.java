/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen;
import java.util.Scanner;
import Hotel.Hotel;
/**
 *
 * @author DELL
 */
public class Admin {
    public void kelolaHotel(Hotel hotel) {
        Scanner input = new Scanner(System.in);
        int menu;
        
        do{
            System.out.println("\n");
            System.out.println("===Menu Admin===");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Cek Ketersediaan Kamar");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();
            
            switch(menu){
                case 1:
                    System.out.print("Jumlah kamar yang ingin ditambah: ");
                    int jmlkmr = input.nextInt();
                    hotel.addKamar(jmlkmr);
                    break;
                case 2:
                    hotel.cekKamar();
                case 3:
                    System.out.println("Terima kasih sudah datang");
                    break;
                default:
                    System.out.println("menu tidak valid");
            }
        } while (menu !=3);
    }
}
