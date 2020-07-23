package com.example.ligadajustica;

import android.text.Editable;
import android.widget.EditText;

public class Membros {
    public  String Nome;
    public  String Codinome;
    public  String Especie;
    public  String Habilidades;
    public  String Vulnerabilidades;
    public  String NívelAcesso;

public Membros (){ }

    public Membros (String Nome, String Codinome,String Especie,String Habilidades, String Vulnerabilidades, String NívelAcesso ){
        this.Codinome = Codinome;
        this.Nome = Nome;
        this.Especie = Especie;
        this.Habilidades = Habilidades;
        this.Vulnerabilidades = Vulnerabilidades;
        this.NívelAcesso = NívelAcesso;
    }

    public String getNome() {
        return Nome;
    }


    public String getCodinome() {
        return Codinome;
    }


    public String getEspecie() {
        return Especie;
    }



    public String getHabilidades() {
        return Habilidades;
    }


    public String getVulnerabilidades() {
        return Vulnerabilidades;
    }

    public String getNívelAcesso() {
        return NívelAcesso;
    }



    public static String GetInfo (EditText getinfo){
        return String.valueOf((getinfo.getText()));
    }
}
