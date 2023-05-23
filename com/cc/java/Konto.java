package com.cc.java;

public class Konto {
    
private int kontostandAnfang;
private int multiplikatorGeld;


public Konto(int kontostandAnfang, int multiplikatorGeld){
    this.kontostandAnfang = kontostandAnfang;
    this.multiplikatorGeld = multiplikatorGeld;

}


public int getKontostandAnfang() {
    return kontostandAnfang;
}


public void setKontostandAnfang(int kontostandAnfang) {
    this.kontostandAnfang = kontostandAnfang;
}


public int getMultiplikatorGeld() {
    return multiplikatorGeld;
}


public void setMultiplikatorGeld(int multiplikatorGeld) {
    this.multiplikatorGeld = multiplikatorGeld;
}


}
