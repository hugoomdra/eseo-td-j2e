package main.model;

public class NirModel {

    private String nir;

    public NirModel(String nir) {
        this.nir = nir;
    }

    public int getCle(){


        return (int) (97 - (Long.parseLong(this.nir) % 97));
    }

    public String getNir() {
        return nir;
    }

    public void setNir(String nir) {
        this.nir = nir;
    }
}
