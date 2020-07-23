package com.example.ligadajustica.Heroi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ligadajustica.MainActivity;
import com.example.ligadajustica.R;

public class HeroiActivity extends AppCompatActivity {

    private Button btncad_heroi, btnHeroi_Homepage, btnconsu_Heroi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroi);

        btncad_heroi = findViewById(R.id.btnBtns);
        btnHeroi_Homepage = findViewById(R.id.btnBtns2);
        btnconsu_Heroi = findViewById(R.id.btnBtns4);

        btncad_heroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CadastroHeroi = new Intent(HeroiActivity.this, CadHeroi.class);
                startActivity(CadastroHeroi);
            }
        });

        btnHeroi_Homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainHome = new Intent(HeroiActivity.this, MainActivity.class);
                startActivity(MainHome);
            }
        });

        btnconsu_Heroi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainHome = new Intent(HeroiActivity.this, ConsuActivity.class);
                startActivity(MainHome);
            }
        });

    }
}