package com.delivery.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.delivery.R;

public class InicioActivity extends AppCompatActivity {
    private ConstraintLayout Startbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Startbutton=findViewById(R.id.Startbutton);
        Startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InicioActivity.this,MainActivity.class));
            }
        });
    }
}