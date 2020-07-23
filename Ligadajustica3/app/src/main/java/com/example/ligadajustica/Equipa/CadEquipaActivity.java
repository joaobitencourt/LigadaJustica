package com.example.ligadajustica.Equipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ligadajustica.Equipamento;
import com.example.ligadajustica.MainActivity;
import com.example.ligadajustica.R;

import static com.example.ligadajustica.MainActivity.Equipamentos;

public class CadEquipaActivity extends AppCompatActivity {
public Button btnCadEquipamento ,buttonHomeEquipa;
public EditText etNomeEquipa, etDescriçãoEquipa, etUsabilidadeEquipa;
//txtNomeEquipa, txtDescriçãoEquipa, txtUsabilidadeEquipa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_equipa);


        etNomeEquipa = findViewById(R.id.txtNomeEquipa);
        etDescriçãoEquipa = findViewById(R.id.txtDescriçãoEquipa);
        etUsabilidadeEquipa = findViewById(R.id.txtUsabilidadeEquipa);
        btnCadEquipamento = findViewById(R.id.buttonCadastrarEquipa);
        buttonHomeEquipa = findViewById(R.id.buttonHomeEquipa);

        btnCadEquipamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nome = (etNomeEquipa.getText().toString());
                String Descrição =(etDescriçãoEquipa.getText().toString());
                String Usabilidade = (etUsabilidadeEquipa.getText().toString());
                Equipamento E = new Equipamento(Nome, Descrição, Usabilidade );
                Equipamentos.add(E);
            }
        });

        buttonHomeEquipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(CadEquipaActivity.this, EquipaActivity.class);
                startActivity(home);
            }
        });

    }
}