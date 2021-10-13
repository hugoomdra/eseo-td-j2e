package main.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NirModel {

    private String nir;

    public NirModel(String nir) {
        this.nir = nir;
    }

    public int getCle(){


        return (int) (97 - (Long.parseLong(this.nir) % 97));
    }

    public String getGenre(){
        switch (this.nir.charAt(0)){
            case '1':
                return "Homme";
            case '2':
                return "Femme";
            default:
                return "ERREUR";
        }
    }

    public String getNir() {
        return nir;
    }

    public void setNir(String nir) {
        this.nir = nir;
    }

    public ArrayList<String> validate(){

        ArrayList<String> errors = new ArrayList<String>();

        if (!((int) this.nir.charAt(0) == 1 || (int) this.nir.charAt(0) == 2)){
            errors.add("Erreur dans le NIR au premier numéro.");
        }

        // validations

        return errors;


    }
}
