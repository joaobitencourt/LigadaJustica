package com.example.ligadajustica.Heroi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.ligadajustica.MainActivity;
import com.example.ligadajustica.Membros;
import com.example.ligadajustica.R;

import static com.example.ligadajustica.MainActivity.Herois;

public class CadHeroi extends AppCompatActivity {
    public Button CadHeroButton, HomeHeroi;
    public EditText CadnomeHero, CadCodinomeHero, CadEspecieHero, CadHabilidadesHero, CadVulnerabilidadesHero, CadNivelAcesssHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_heroi);

        CadHeroButton = findViewById(R.id.buttonCadastrarHeroi);
        CadnomeHero = findViewById(R.id.txtNomeHeroi);
        CadCodinomeHero = findViewById(R.id.txtCodinomeHeroi);
        CadEspecieHero = findViewById(R.id.txtEspecieHeroi);
        CadHabilidadesHero = findViewById(R.id.txtHabilidades);
        CadVulnerabilidadesHero = findViewById(R.id.txtVulnerabilidades);
        CadNivelAcesssHero = findViewById(R.id.txtNívelAcesso);
        HomeHeroi = findViewById(R.id.buttonHomeHeroi);

        CadHeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = (CadnomeHero.getText().toString());
                String Codinome = (CadCodinomeHero.getText().toString());
                String Especie = (CadEspecieHero.getText().toString());
                String Habilidades = (CadHabilidadesHero.getText().toString());
                String Vulnerabilidades = (CadVulnerabilidadesHero.getText().toString());
                String NívelAcesso = (CadNivelAcesssHero.getText().toString());
                Membros m = new Membros(nome, Codinome, Especie, Habilidades, Vulnerabilidades, NívelAcesso);
                Herois.add(m);
                Log.d("FRA", m.getNome());
                Log.d("DEucerto", Herois.toString());
               /* for (int i = 0; i < Herois.size(); i++) {
                    System.out.println(Herois.get(i).getNome());
                    System.out.println(Herois.get(i).getCodinome());
                    System.out.println(Herois.get(i).getEspecie());
                    System.out.println(Herois.get(i).getHabilidades());
                    System.out.println(Herois.get(i).getVulnerabilidades());
                    System.out.println(Herois.get(i).getNívelAcesso());
                }*/


            }
        });

        HomeHeroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Homepageheori2 = new Intent(CadHeroi.this, HeroiActivity.class);
                startActivity(Homepageheori2);
            }
        });
    }

}
