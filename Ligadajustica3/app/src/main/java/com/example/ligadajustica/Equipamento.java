package com.example.ligadajustica;

public class Equipamento {
    public String Nome;
    public String Descrição;
    public String Usabilidade;

    public Equipamento (){}

    public Equipamento(String nome, String descrição, String usabilidade) {
        Nome = nome;
        Descrição = descrição;
        Usabilidade = usabilidade;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescrição() {
        return Descrição;
    }

    public String getUsabilidade() {
        return Usabilidade;
    }

}
