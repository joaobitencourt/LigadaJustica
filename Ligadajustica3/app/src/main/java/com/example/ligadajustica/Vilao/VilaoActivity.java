package com.example.ligadajustica.Vilao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ligadajustica.MainActivity;
import com.example.ligadajustica.R;

public class VilaoActivity extends AppCompatActivity {
    private Button btncad_vilao, btnVilao_Homepage, btnconsu_Vilao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vilao);

        btnVilao_Homepage = findViewById(R.id.btnBtns2);
        btncad_vilao = findViewById(R.id.btnBtns);
        btnconsu_Vilao = findViewById(R.id.btnBtns4);

        btnVilao_Homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(VilaoActivity.this, MainActivity.class);
                startActivity(home);
            }
        });


        btncad_vilao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cad_vilao = new Intent(VilaoActivity.this, CadVilaoActivity.class);
                startActivity(cad_vilao);
            }
        });
        btnconsu_Vilao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caonsu_vilao = new Intent(VilaoActivity.this, CunsuVilaoActivity.class);
                startActivity(caonsu_vilao);
            }
        });

    }


}