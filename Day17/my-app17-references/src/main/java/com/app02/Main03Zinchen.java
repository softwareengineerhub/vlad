package com.app02;

public class Main03Zinchen {

    public static void main(String[] args) {
        Player zMC = new Player();
        zMC.surname = "Zinchenko";
        zMC.number=11;

        Player zAr = new Player();
        zAr.surname = "Zinchenko";
        zAr.number=11;

        System.out.println("zMC.number="+zMC.number);
        System.out.println("zMC.surname="+zMC.surname);
        System.out.println("zAr.number="+zAr.number);
        System.out.println("zAr.surname="+zAr.surname);

        boolean isSame = (zMC==zAr);
        boolean isEquals = zMC.equals(zAr);
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);

        System.out.println("-----------Update-----------------");
        zAr.number=34;
        System.out.println("zMC.number="+zMC.number);
        System.out.println("zMC.surname="+zMC.surname);
        System.out.println("zAr.number="+zAr.number);
        System.out.println("zAr.surname="+zAr.surname);

        isSame = (zMC==zAr);
        isEquals = zMC.equals(zAr);
        System.out.println("isSame="+isSame);
        System.out.println("isEquals="+isEquals);


    }

}
