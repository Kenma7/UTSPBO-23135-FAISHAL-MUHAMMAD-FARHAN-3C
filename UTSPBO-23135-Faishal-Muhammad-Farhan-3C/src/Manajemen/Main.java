/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Manajemen;
import java.util.Scanner;
import Hotel.Hotel;
import Hotel.Customer;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel(10);
        Customer cstmr = new Customer();
        Admin admin = new Admin();
        
        System.out.println("====Selamat Datang di Hotela Star====");
        System.out.println("--------------------------------------");
        System.out.print("Apakah Anda Customer? (Y/N): ");
        char user = input.next().charAt(0);
        
        if(user == 'Y' || user == 'y') {
            int menu;
            
            do{
                System.out.print("\n");
                System.out.println("===Menu Customer===");
                System.out.println("1. Cek Ketersediaan Kamar");
                System.out.println("2. Pesan Kamar");
                System.out.println("3. Detail Pesanan");
                System.out.println("4. Keluar");
                System.out.print("Pilih Menu: ");
                menu = input.nextInt();
                
                switch(menu){
                    case 1:
                        hotel.cekKamar();
                        break;
                    case 2:
                        cstmr.pesanKamar(hotel);
                        break;
                    case 3:
                        cstmr.showPesanan();
                        break;
                    case 4:
                        System.out.println("Terima Kasih sudah datang...");
                        break;
                    default:
                        System.out.println("menu tidak valid");
                }
            } while (menu !=4);
        }else if (user == 'N' || user == 'n'){
            admin.kelolaHotel(hotel);
        }else {
            System.out.println("Input tidak valid");
        }
    }    
}
