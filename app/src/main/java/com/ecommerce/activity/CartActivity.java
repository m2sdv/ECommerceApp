package com.ecommerce.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ecommerce.R;
import com.ecommerce.adapter.AdapterCart;
import com.ecommerce.adapter.AdapterProduct;
import com.ecommerce.model.Cart;
import com.ecommerce.model.Product;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerCart;
    private ArrayList<Cart> cartArrayList;
    private AdapterCart adapterCart;
    private Button btnPlaceOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        init();

        cartArrayList=new ArrayList<>();
        adapterCart=new AdapterCart(cartArrayList);
        recyclerCart.setAdapter(adapterCart);
        recyclerCart.setLayoutManager(new GridLayoutManager(this,1));

        btnPlaceOrder.setOnClickListener(this);

        prepareCart();
    }

    private void prepareCart() {

        Cart cart=new Cart("100","Cookies","IMG");
        cartArrayList.add(cart);

        cart=new Cart("150","Breads","IMG");
        cartArrayList.add(cart);

        cart=new Cart("200","Cakes","IMG");
        cartArrayList.add(cart);


    }

    private void init() {
        recyclerCart=findViewById(R.id.recyclerCart);
        btnPlaceOrder=findViewById(R.id.btnPlaceOrder);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();

        if(id==R.id.btnPlaceOrder)
        {
             startActivity(new Intent(CartActivity.this,CheckOutActivity.class));

        }
    }
}
