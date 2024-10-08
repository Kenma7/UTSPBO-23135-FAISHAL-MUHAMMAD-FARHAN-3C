/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author DELL
 */
public class Hotel implements Reservasi {
        public int jmlkamarTersedia;
    
    public Hotel(int jmlkamarTersedia){
        this.jmlkamarTersedia = jmlkamarTersedia;
    }
   
    
        @Override
    public void pesanKamar(int jmlkmr, int hariInap) {
        if(jmlkmr <= jmlkamarTersedia) {
            jmlkamarTersedia -= jmlkmr;
            System.out.println("Pesanan berhasil! Sisa kamar: " + jmlkamarTersedia);
            System.out.println("Detail Pesanan: "+ jmlkmr + " kamar untuk "+hariInap+" hari");
        }else{
            System.out.println("Maaf, Kamar tidak tersedia");
        }
    }
   
        @Override
    public void cekKamar(){
        System.out.println("Jumlah kamar tersedia: "+ jmlkamarTersedia);
    }
    
    public void addKamar(int jmlkmr){
        jmlkamarTersedia += jmlkmr;
        System.out.println("Kamar berhasil ditambah. Total kamar sekarang: "+jmlkamarTersedia);
    }
}
