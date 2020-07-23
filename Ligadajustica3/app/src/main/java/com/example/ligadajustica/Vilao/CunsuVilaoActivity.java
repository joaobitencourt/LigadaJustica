package com.example.ligadajustica.Vilao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.ligadajustica.Equipa.CadEquipaActivity;
import com.example.ligadajustica.Equipa.ConsuEquipaActivity;
import com.example.ligadajustica.Membros;
import com.example.ligadajustica.R;
import com.example.ligadajustica.Viloes;

import java.util.ArrayList;

import static com.example.ligadajustica.MainActivity.Vilaoe;

public class CunsuVilaoActivity extends AppCompatActivity {
public ListView ListViewVilao;
public Button  buttonCadastrarVilao, buttonHomeVilao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cunsu_vilao);

        ListViewVilao = findViewById(R.id.ListviewtuVilao);
        buttonCadastrarVilao = findViewById(R.id.buttonCadastrarVilao);
        buttonHomeVilao = findViewById(R.id.buttonHomeVilao);

        ArrayList<String> consuvilao = new ArrayList<>();
        for (Viloes objListVilao : Vilaoe) {
            consuvilao.add(objListVilao.getNome());
            consuvilao.add(objListVilao.getCodinome());
            consuvilao.add(objListVilao.getEspecie());
            consuvilao.add(objListVilao.getHabilidades());
            consuvilao.add(objListVilao.getVulnerabilidades());
            consuvilao.add(objListVilao.getHeroisrivais());
            consuvilao.add(objListVilao.getEsconderijos());
            consuvilao.add(objListVilao.getDataFightConfir());
        }

        ArrayAdapter adapterVilao = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,consuvilao);
        ListViewVilao.setAdapter(adapterVilao);

        buttonCadastrarVilao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagevilao = new Intent(CunsuVilaoActivity.this, CadVilaoActivity.class);
                startActivity(pagevilao);
            }
        });

        buttonHomeVilao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagevilao = new Intent(CunsuVilaoActivity.this, VilaoActivity.class);
                startActivity(pagevilao);
            }
        });

    }
}