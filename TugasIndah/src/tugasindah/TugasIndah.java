/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasindah;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasIndah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kode_nama,kode_kelas,hobi,kode_hobi,nama_hobi;
        
        Scanner scan = new Scanner (System.in);
        
        for (int i=1;i<=2;i++) {
            System.out.print("Nama : ");
            kode_nama=scan.nextLine();
            System.out.print("Kelas : ");
            kode_kelas=scan.nextLine();
            System.out.print("Hobi [bas/ban/mad] : ");
            kode_hobi=scan.nextLine();
            
            
            switch (kode_hobi) {
                case "bas" :
                    nama_hobi="Basket";
                    break;
                case "ban" :
                    nama_hobi="Band";
                    break;
                case "mad" :
                    nama_hobi="Mading";
                    break;
                default :
                    nama_hobi="Tidak Tersedia";
                    break;
            }
            
            System.out.println("Terimakasih telah menginput "+kode_nama+" kelas "+kode_kelas+" dan hobi "+nama_hobi+"");
    }
    
}
}

