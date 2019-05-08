package com.ecommerce.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ecommerce.R;
import com.ecommerce.customfonts.MyTextView_Roboto_Regular;
import com.ecommerce.model.Cart;

import java.util.ArrayList;

public class AdapterCart extends RecyclerView.Adapter<AdapterCart.CartHolder> {

    ArrayList<Cart> cartArrayList;

    public AdapterCart(ArrayList<Cart> cartArrayList) {
        this.cartArrayList = cartArrayList;
    }

    @NonNull
    @Override
    public CartHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
      View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.lay_cart,null);
      return new CartHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartHolder holder, int position) {

        Cart cart=cartArrayList.get(position);
        holder.txtName.setText(cart.getCartName());
        holder.txtPrice.setText(cart.getCartPrice());

    }

    @Override
    public int getItemCount() {
        return cartArrayList.size();
    }

    public class CartHolder extends RecyclerView.ViewHolder {

        private MyTextView_Roboto_Regular txtName,txtPrice;
        private ImageView imgProduct;
        public CartHolder(@NonNull View itemView) {
            super(itemView);

            txtName=itemView.findViewById(R.id.my_cart_product_name);
            txtPrice=itemView.findViewById(R.id.my_cart_product_price);
        }
    }
}
