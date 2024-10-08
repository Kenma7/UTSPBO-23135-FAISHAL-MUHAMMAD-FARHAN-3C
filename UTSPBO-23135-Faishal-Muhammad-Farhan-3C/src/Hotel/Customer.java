/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Customer {
    public String namaPelanggan;
    public String detailPesanan;
    
    public void pesanKamar(Hotel hotel) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kamar yang ingin dipesan: ");
        int jmlkmr = input.nextInt();
        System.out.print("Jumlah hari menginap: ");
        int hariInap = input.nextInt();
        
        hotel.pesanKamar(jmlkmr, hariInap);
        this.detailPesanan = "Detail Pesanan: Pelangan memesan " + jmlkmr + " Kamar untuk " + hariInap + " hari";
    }
   
    public void showPesanan(){
        if(detailPesanan != null) {
            System.out.println(detailPesanan);
        }else{
            System.out.println("Belum ada pesanan");
        }
    }
}
