package com.example.ligadajustica.Equipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ligadajustica.MainActivity;
import com.example.ligadajustica.R;

public class EquipaActivity extends AppCompatActivity {
private Button btnEquipa_Home, btncad_Equipa, btnconsu_Equipa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipa);

        btnEquipa_Home = findViewById(R.id.btnBtns2);
        btncad_Equipa = findViewById(R.id.btnBtns);
        btnconsu_Equipa = findViewById(R.id.btnBtns4);

        btnEquipa_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(EquipaActivity.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncad_Equipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cad_equipa = new Intent(EquipaActivity.this, CadEquipaActivity.class);
                startActivity(cad_equipa);
            }
        });

        btnconsu_Equipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consu_equipa = new Intent(EquipaActivity.this, ConsuEquipaActivity.class);
                startActivity(consu_equipa);
            }
        });

    }
}