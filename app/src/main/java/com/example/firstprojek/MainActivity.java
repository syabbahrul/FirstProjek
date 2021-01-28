package com.example.firstprojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public int jumlah = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txthw = findViewById(R.id.tv_hw);
        final TextView txtalamat = findViewById(R.id.tv_alamat);
        final TextView txtuy = findViewById(R.id.tv_uy);
        Button btnMove = findViewById(R.id.btn_pindah);

        txthw.setText("Selamat Datang");
        txtalamat.setText("Ujang");
        txtuy.setText("Bandung");

        txthw.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Selamat Datang",
                        Toast.LENGTH_SHORT).show();

            }
        });

        txtalamat.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "anda menekan tulisan alamat",
                        Toast.LENGTH_SHORT).show();

            }
        });

        txthw.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumlah++;
                Toast.makeText(MainActivity.this, "anda menekan sebanyak"+jumlah+"kali",
                        Toast.LENGTH_SHORT).show();

            }
        });
    btnMove.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            intent.putExtra("nama",)
            startActivity(intent);
       //     finish();
            onDestroy();
        }
    });
    }
}