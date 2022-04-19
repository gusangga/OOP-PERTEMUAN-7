package pert702;

/**
 *
 * @author 19103028,I Gusti Ngurah Angga Putra Sukanta
 */
public class Apel extends buah {
    //turunan
    @Override
    public void TampilInfo(){
        System.out.println("Informasi Harga Buah Apel");
        System.out.println("Nama Buah  :"+this.getNAMA()  );
        System.out.println("Warna Buah :"+this.getWARNA() );
        System.out.println("Harga      :"+this.getHARGA() );
    }
    
}
