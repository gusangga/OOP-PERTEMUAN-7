package pert702;

/**
 *
 * @author 19103028,I Gusti Ngurah Angga Putra Sukanta
 */
public class Pert702 {

    public static void main(String[] args) {
        
        buah B = new buah();
        B.setNAMA("Anggur");
        B.setWARNA("Ungu");
        B.setHARGA(17000);
        B.TampilInfo();
        
        Apel A = new Apel();
        A.setNAMA("Apel Merah");
        A.setWARNA("Hijau");
        A.setHARGA(15000);
        A.TampilInfo();
    }
    
}
