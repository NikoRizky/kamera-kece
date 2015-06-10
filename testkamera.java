package com.company;

/**
 * Created by Ritz on 10/06/2015.
 */
public class testkamera {

    public static void main(String[] args) {
        lensa Samyang = new lensa("Samyang","Manual","100 mm");
        System.out.println(Samyang.toString());
        KAMERADSLR Canon = new KAMERADSLR("Canon","600D","30 MP",9500000.0,Samyang);
        System.out.println(Canon.toString());
    }
}
