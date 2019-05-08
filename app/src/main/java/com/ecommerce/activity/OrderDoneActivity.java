package com.ecommerce.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ecommerce.R;

public class OrderDoneActivity extends AppCompatActivity {

    private Button btnContinueShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_done);

        btnContinueShopping=findViewById(R.id.continue_shopping);
        btnContinueShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderDoneActivity.this,MainActivity.class));
            }
        });
    }
}
