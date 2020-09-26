package kofferslot;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class KofferslotLauncher {

    public static void main(String[] args) {

//        Kofferslot kofferslot = new Kofferslot();
//
//        System.out.println(kofferslot.getEersteLetter());
//        System.out.println(kofferslot.getTweedeLetter());
//        System.out.println(kofferslot.getCijfer());

        Kofferslot kofferslot2 = new Kofferslot('Z', 'Z', 9);
        kofferslot2.volgende();
        System.out.println(kofferslot2.getEersteLetter());
        System.out.println(kofferslot2.getTweedeLetter());
        System.out.println(kofferslot2.getCijfer());


    }

}
