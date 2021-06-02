/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author Iswanto
 */
public class KomputerCetak {
    public static void main (String[] args){
        komputer [] asus=new komputer [3];
        
        asus[0]=new PC();
        asus[1]=new laptop();
        asus[2]=new netbook();
        
        for (komputer asuz : asus) {
            asuz.hidupkan_os();
            asuz.matikan_os();
            asuz.klik_kanan();
            asuz.klik_kiri();
            asuz.tekan_enter();
            asuz.cetak_data();
        }
    }
}
