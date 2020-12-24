package com.example.zamovl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ZakasDetails extends AppCompatActivity {
    TextView product;
    TextView price;
    TextView count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tovar_details);

        product = findViewById(R.id.product);
        price = findViewById(R.id.price);
        count = findViewById(R.id.count);

    }


    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}