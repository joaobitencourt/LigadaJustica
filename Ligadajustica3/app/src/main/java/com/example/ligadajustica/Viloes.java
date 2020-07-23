package com.example.ligadajustica;

import java.util.Date;

public class Viloes  extends Membros {
    public String Heroisrivais ;
    public String Esconderijos;
    public String dataFightConfir;

    public Viloes () {}

   /* public Viloes(String heroisrivais, String esconderijos, String dataFightConfir) {
        Heroisrivais = heroisrivais;
        Esconderijos = esconderijos;
        this.dataFightConfir = dataFightConfir;
    }*/

    public Viloes(String Nome, String Codinome, String Especie, String Habilidades, String Vulnerabilidades,  String heroisrivais, String esconderijos, String dataFightConfir) {
        this.Codinome = Codinome;
        this.Nome = Nome;
        this.Especie = Especie;
        this.Habilidades = Habilidades;
        this.Vulnerabilidades = Vulnerabilidades;
        Heroisrivais = heroisrivais;
        Esconderijos = esconderijos;
        this.dataFightConfir = dataFightConfir;
    }

    public String getHeroisrivais() {
        return Heroisrivais;
    }

    public String getEsconderijos() {
        return Esconderijos;
    }

    public String getDataFightConfir() {
        return dataFightConfir;
    }
}
