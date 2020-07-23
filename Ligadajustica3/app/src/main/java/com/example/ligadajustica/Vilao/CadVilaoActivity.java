package com.example.ligadajustica.Vilao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ligadajustica.MainActivity;
import com.example.ligadajustica.Membros;
import com.example.ligadajustica.R;
import com.example.ligadajustica.Viloes;

import static com.example.ligadajustica.MainActivity.Vilaoe;

public class CadVilaoActivity extends AppCompatActivity {
    public Button btnvialocad, buttonHomeVilao;
    public EditText CadnomeEquipa, CadCodinomeEquipa, CadEspecieEquipa, CadHabilidadesEquipa, CadVulnerabilidadesEquipa, CadHeroisrivais, CadEsconderijos, CaddataFightConfir;
    //txtHeroisrivais, txtEsconderijos, txtdataFightConfir
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_vilao);

        btnvialocad = findViewById(R.id.buttonCadastrarVilao);
        CadnomeEquipa = findViewById(R.id.txtNomeHeroi);
        CadCodinomeEquipa = findViewById(R.id.txtCodinomeHeroi);
        CadEspecieEquipa = findViewById(R.id.txtEspecieHeroi);
        CadHabilidadesEquipa = findViewById(R.id.txtHabilidades);
        CadVulnerabilidadesEquipa = findViewById(R.id.txtVulnerabilidades);
        CadHeroisrivais = findViewById(R.id.txtHeroisrivais);
        CadEsconderijos = findViewById(R.id.txtEsconderijos);
        CaddataFightConfir = findViewById(R.id.txtdataFightConfir);
        buttonHomeVilao = findViewById(R.id.buttonHomeVilao);

        btnvialocad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = (CadnomeEquipa.getText().toString());
                String Codinome = (CadCodinomeEquipa.getText().toString());
                String Especie = (CadEspecieEquipa.getText().toString());
                String Habilidades = (CadHabilidadesEquipa.getText().toString());
                String Vulnerabilidades = (CadVulnerabilidadesEquipa.getText().toString());
                String heroisrivais = (CadVulnerabilidadesEquipa.getText().toString());
                String esconderijos = (CadVulnerabilidadesEquipa.getText().toString());
                String dataFightConfir = (CadVulnerabilidadesEquipa.getText().toString());
                Viloes V = new Viloes(nome, Codinome, Especie, Habilidades, Vulnerabilidades,heroisrivais,esconderijos,dataFightConfir);
                Vilaoe.add(V);
            }
        });

        buttonHomeVilao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(CadVilaoActivity.this, VilaoActivity.class);
                startActivity(home);

            }
        });
    }
}