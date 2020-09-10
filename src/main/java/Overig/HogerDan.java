package Overig;

public class HogerDan {
    /**
     * Dit programma bepaalt of iets hoger is dan tien
     * @param getal het getal waarvan je wilt weten of het hoger is dan tien
     * @return of het hoger dan tien is of niet, in stringvorm.
     */
    public static String hogerDanTien(int getal){
    if (getal > 10) {
        return "Dit is hoger dan 10!";
    }
    else {return "Dit is niet hoger dan 10.";}
    }
}

