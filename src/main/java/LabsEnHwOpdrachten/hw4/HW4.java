package LabsEnHwOpdrachten.hw4;

public class HW4 {
    public static void main(String[] args) throws EvenNumberException {
//        Seizoenen winter = Seizoenen.WINTER;
//        seizoenTemp(winter);
        try {
            hourGlass(11);
        }
        catch(EvenNumberException e){
            System.out.println("Error gespot, alleen oneven nummers");
        }
    }

//    public static void seizoenTemp(Seizoenen seizoen){
//        switch(seizoen){
//            case SPRING:
//
//            case SUMMER:
//                System.out.println("warm"); break;
//
//            case FALL:
//
//            case WINTER:
//                System.out.println("cold"); break;
//
//            default:
//                System.out.println("unknown");
//        }
//    }
    /*
    Volgende algoritme gebruikt na proberen in excel:
    Er zijn evenveel rijen als kolommen in deze zandloper, eerste en laatste rij volledig met sterren
    Voor de rest is er steeds een ster als het rijnummer en kolomnummer opgeteld aantal rijen +1 is, of
    wanneer kolomnummer - rijnummer 0 is. Voor de rest, zie code.
     */
    public static void hourGlass (int a) throws EvenNumberException {
        if (a % 2 == 0){
            throw new EvenNumberException(a);
        }
        else{
            for(int rij = 1;rij<=a;rij++){
                for (int col = 1;col<=a;col++){
                    if (rij==a || rij==1 || (rij+col)==(a+1) || (col-rij)==0){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
}
