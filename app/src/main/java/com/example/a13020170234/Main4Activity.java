package com.example.a13020170234;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main4Activity extends AppCompatActivity {
    LinearLayout btnLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnLayout = findViewById(R.id.btnPindah);

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, Main4Activity.class);
                startActivity(intent);
                startActivity(new Intent(Main4Activity.this, Main4Activity.class));
            }
        });
    }
}
