package com.geek.baust_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_CSE, btn_EEE, btn_ME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_CSE = findViewById(R.id.btn_cse);
        btn_EEE = findViewById(R.id.btn_eee);
        btn_ME = findViewById(R.id.btn_me);

        btn_CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Computer Science & Engineering", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CseActivity.class);
                startActivity(intent);
            }
        });
        btn_EEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Electronics & Electrical Engineering", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, EeeActivity.class);
                startActivity(intent);
            }
        });
        btn_ME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Mechanical Engineering", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MeActivity.class);
                startActivity(intent);
            }
        });

    }
}
