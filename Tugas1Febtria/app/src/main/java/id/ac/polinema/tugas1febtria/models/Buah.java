package id.ac.polinema.tugas1febtria.models;

public class Buah {
    public String NamaBuah;
    public String DetailBuah;
    public int buah;

    public Buah(String NamaBuah, String DetailBuah, int buah) {
        this.NamaBuah = NamaBuah;
        this.DetailBuah = DetailBuah;
        this.buah = buah;
    }

    public String getNamaBuah() {
        return NamaBuah;
    }

    public void setNamaBuah(String namaBuah) {
        NamaBuah = namaBuah;
    }

    public String getDetailBuah() {
        return DetailBuah;
    }

    public void setDetailBuah(String detailBuah) {
        DetailBuah = detailBuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }
}
