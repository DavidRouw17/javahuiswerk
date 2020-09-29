package LabsEnHwOpdrachten.scannerMocking;

import java.util.Scanner;

public class ScannerMocking {

    private ScannerWrap wrap = new ScannerWrap();
    public static void main(String[] args) {
        ScannerMocking s = new ScannerMocking();
        System.out.println(s.returnWhatWasScanned());
    }

    public String returnWhatWasScanned(){
        System.out.println("Typ iets");
        String resultaat = wrap.wrapNextLine();
        return resultaat;
    }

    public void setWrap(ScannerWrap wrap) {
        this.wrap = wrap;
    }
}
