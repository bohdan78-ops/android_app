package com.example.products;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main1 extends AppCompatActivity {

    EditText product;
    EditText price;
    EditText count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        product = findViewById(R.id.product);
        price = findViewById(R.id.price);
        count = findViewById(R.id.count);
        EditText[] inputArr = {product, price, count};
        this.focusEdit(inputArr);

    }

    private void focusEdit(EditText[] inputArr) {
        int length = inputArr.length;
        for(int i = 0; i < length; i++ ) {
            final EditText input = inputArr[i];
            input.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean hasFocus) {
                    if (hasFocus) {
                        input.setBackgroundResource(R.drawable.edit_text_border);
                    }
                }
            });
        }
    }

    public void save(View view){
        Toast toast = Toast.makeText(this, "Click",Toast.LENGTH_LONG);
        toast.show();
    }


}