package com.company;

/**
 * Created by Ritz on 10/06/2015.
 */
public class lensa {
    private String namamerklensa;
    private String tipesensorlensa;
    private String ukuranlensa;

    public lensa(String namamerklensa, String tipesensorlensa, String ukuranlensa) {
        this.namamerklensa = namamerklensa;
        this.tipesensorlensa = tipesensorlensa;
        this.ukuranlensa = ukuranlensa;
    }

    public String getNamamerklensa() {
        return namamerklensa;
    }

    public void setNamamerklensa(String namamerklensa) {
        this.namamerklensa = namamerklensa;
    }

    public String getTipesensorlensa() {
        return tipesensorlensa;
    }

    public void setTipesensorlensa(String tipesensorlensa) {
        this.tipesensorlensa = tipesensorlensa;
    }

    public String getUkuranlensa() {
        return ukuranlensa;
    }

    public void setUkuranlensa(String ukuranlensa) {
        this.ukuranlensa = ukuranlensa;
    }

    @Override
    public String toString() {
        return "lensa{" +
                "namamerklensa='" + namamerklensa + '\'' +
                ", tipesensorlensa='" + tipesensorlensa + '\'' +
                ", ukuranlensa='" + ukuranlensa + '\'' +
                '}';
    }
}
