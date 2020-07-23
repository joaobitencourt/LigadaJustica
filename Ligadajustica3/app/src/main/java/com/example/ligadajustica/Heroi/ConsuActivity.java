package com.example.ligadajustica.Heroi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ligadajustica.Membros;
import com.example.ligadajustica.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.ligadajustica.MainActivity.Herois;

public class ConsuActivity extends AppCompatActivity {
    TextView   indice_heroiscad;
    public Button buttonCadastrarHeroi, buttonHomeHeroi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consu);

        ListView   ListviewMembros = (ListView)findViewById(R.id.Listviewtu);
        buttonCadastrarHeroi = findViewById(R.id.buttonCadastrarHeroi);
        buttonHomeHeroi = findViewById(R.id.buttonHomeHeroi);
        //indice_heroiscad = (TextView)findViewById(R.id.tvIndice);

        ArrayList<String> ConsuHeroi = new ArrayList<>();
        for (Membros objtdaLista : Herois) {
            ConsuHeroi.add(objtdaLista.getNome());
            ConsuHeroi.add(objtdaLista.getCodinome());
            ConsuHeroi.add(objtdaLista.getEspecie());
            ConsuHeroi.add(objtdaLista.getHabilidades());
            ConsuHeroi.add(objtdaLista.getVulnerabilidades());
            ConsuHeroi.add(objtdaLista.getNívelAcesso());
        }


        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,ConsuHeroi);
        ListviewMembros.setAdapter(adapter);

       // indice_heroiscad.setText(  Herois.size());
        buttonCadastrarHeroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Homepageheori2 = new Intent(ConsuActivity.this, CadHeroi.class);
                startActivity(Homepageheori2);
            }
        });

        buttonHomeHeroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Homepageheori2 = new Intent(ConsuActivity.this, HeroiActivity.class);
                startActivity(Homepageheori2);
            }
        });
    }
}
/*
public class MainActivity extends AppCompatActivity {

    ListView listadias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listadias = (ListView) findViewById(R.id.Listviewtu);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.arrayDias,
                android.R.layout.simple_list_item_1);
        listadias.setAdapter(adapter);

        listadias.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"Selecionou o :" + parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }

}*/
/* System.out.println(Herois.get(i).getNome());
            System.out.println(Herois.get(i).getCodinome());
            System.out.println(Herois.get(i).getEspecie());
            System.out.println(Herois.get(i).getHabilidades());
            System.out.println(Herois.get(i).getVulnerabilidades());
            System.out.println(Herois.get(i).getNívelAcesso());*/
/*for (int i = 0; i < Herois.size(); i++) {

 *//*Herois.get(i).getNome();
            Herois.get(i).getCodinome();
            Herois.get(i).getEspecie();
            Herois.get(i).getHabilidades();
            Herois.get(i).getVulnerabilidades();
            Herois.get(i).getNívelAcesso();*//*
            System.out.println(Herois.get(i).getNome());
            System.out.println(Herois.get(i).getCodinome());
            System.out.println(Herois.get(i).getEspecie());
            System.out.println(Herois.get(i).getHabilidades());
            System.out.println(Herois.get(i).getVulnerabilidades());
            System.out.println(Herois.get(i).getNívelAcesso());
        }*/
