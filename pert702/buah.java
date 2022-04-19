package pert702;

/**
 *
 * @author 19103028,I Gusti Ngurah Angga Putra Sukanta
 */
public class buah {
    private String NAMA, WARNA;
    protected double Harga;
    
    public void setNAMA(String N){
        this.NAMA = N;
    }
    protected String getNAMA(){
        
        return this.NAMA;
    }
    
    public void setWARNA(String color){
        this.WARNA = color;
    }
    public String getWARNA(){
        return this.WARNA;
    }
    public void setHARGA(double H){
        this.Harga = H;
    }
    public double getHARGA(){
        return this.Harga;
    }
    public void TampilInfo(){
        System.out.println("Informasi Harga Buah");
        System.out.println("Nama Buah  :"+this.NAMA);
        System.out.println("Warna Buah :"+this.WARNA);
        System.out.println("Harga      :"+this.Harga);
    }
    
}
