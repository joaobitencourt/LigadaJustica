package com.example.ligadajustica.Equipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.ligadajustica.Equipamento;
import com.example.ligadajustica.MainActivity;
import com.example.ligadajustica.Membros;
import com.example.ligadajustica.R;
import com.example.ligadajustica.Vilao.VilaoActivity;

import java.util.ArrayList;

import static com.example.ligadajustica.MainActivity.Equipamentos;
import static com.example.ligadajustica.MainActivity.Herois;

public class ConsuEquipaActivity extends AppCompatActivity {
    public ListView Equipamentolist;
    public Button buttonHomeHeroi, buttonCadastrarVilao;
//ListviewtuEquipa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consu_equipa);

        Equipamentolist = findViewById(R.id.ListviewtuEquipa);
        buttonHomeHeroi = findViewById(R.id.buttonHomeHeroi);
        buttonCadastrarVilao = findViewById(R.id.buttonCadastrarVilao);
        ArrayList<String> ConsuEquipa = new ArrayList<>();
        for (Equipamento objtdaListaEquipa : Equipamentos) {
            ConsuEquipa.add(objtdaListaEquipa.getNome());
            ConsuEquipa.add(objtdaListaEquipa.getUsabilidade());
            ConsuEquipa.add(objtdaListaEquipa.getDescrição());

        }


        ArrayAdapter adapterEquipamento = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,ConsuEquipa);
        Equipamentolist.setAdapter(adapterEquipamento);

        buttonHomeHeroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consuEquipa_HomeEquipa = new Intent(ConsuEquipaActivity.this, EquipaActivity.class);
                startActivity(consuEquipa_HomeEquipa);
            }
        });

        buttonCadastrarVilao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagevilao = new Intent(ConsuEquipaActivity.this, CadEquipaActivity.class);
                startActivity(pagevilao);
            }
        });

    }
}