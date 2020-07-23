package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ligadajustica.Equipa.EquipaActivity;
import com.example.ligadajustica.Heroi.ConsuActivity;
import com.example.ligadajustica.Heroi.HeroiActivity;
import com.example.ligadajustica.Vilao.VilaoActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Membros> Herois = new ArrayList<>();
    public static ArrayList<Viloes> Vilaoe = new ArrayList<>();
    public static ArrayList<Equipamento> Equipamentos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void homepageheroi (View view){
        Intent pageheroi = new Intent(MainActivity.this, HeroiActivity.class);
        startActivity(pageheroi);
    }

    public void homepageVilao (View view){
        Intent pagevilao = new Intent(MainActivity.this, VilaoActivity.class);
        startActivity(pagevilao);
    }

    public void homepageEquipa (View view){
        Intent pageequip = new Intent(MainActivity.this, EquipaActivity.class);
        startActivity(pageequip);
    }
}