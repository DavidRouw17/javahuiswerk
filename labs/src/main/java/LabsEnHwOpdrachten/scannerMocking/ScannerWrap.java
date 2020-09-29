package LabsEnHwOpdrachten.scannerMocking;

import java.util.Scanner;

public class ScannerWrap {

    private Scanner scanner = new Scanner(System.in);

    public String wrapNextLine(){
        return scanner.nextLine();
    }
}
