package com.company;

/**
 * Created by Ritz on 10/06/2015.
 */
public class KAMERADSLR {
    private String merkkamera;
    private String tipemerk;
    private String resolusi;
    private Double harga;
    private lensa spesifikasi;

    public KAMERADSLR(String merkkamera, String tipemerk, String resolusi, Double harga, lensa spesifikasi) {
        this.merkkamera = merkkamera;
        this.tipemerk = tipemerk;
        this.resolusi = resolusi;
        this.harga = harga;
        this.spesifikasi = spesifikasi;
    }

    public String getMerkkamera() {
        return merkkamera;
    }

    public void setMerkkamera(String merkkamera) {
        this.merkkamera = merkkamera;
    }

    public String getTipemerk() {
        return tipemerk;
    }

    public void setTipemerk(String tipemerk) {
        this.tipemerk = tipemerk;
    }

    public String getResolusi() {
        return resolusi;
    }

    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public lensa getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(lensa spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    @Override
    public String toString() {
        return "KAMERADSLR{" +
                "merkkamera='" + merkkamera + '\'' +
                ", tipemerk='" + tipemerk + '\'' +
                ", resolusi='" + resolusi + '\'' +
                ", harga=" + harga +
                ", spesifikasi=" + spesifikasi +
                '}';
    }
}
