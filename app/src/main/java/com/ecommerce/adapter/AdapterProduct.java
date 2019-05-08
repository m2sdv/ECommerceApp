package com.ecommerce.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ecommerce.R;
import com.ecommerce.customfonts.MyTextView_Montserrat_Regular;
import com.ecommerce.customfonts.MyTextView_Roboto_Bold;
import com.ecommerce.customfonts.MyTextView_Roboto_Regular;
import com.ecommerce.model.Categories;
import com.ecommerce.model.Product;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ProductHolder> {

    ArrayList<Product> productList;
    private Context context;
    int count=0;

    public AdapterProduct(List<Product> listCatagor) {
        productList= (ArrayList<Product>) listCatagor;
    }

    class ProductHolder extends RecyclerView.ViewHolder  {

        MyTextView_Roboto_Regular txtName,txtDollar,txtCount;
        MyTextView_Roboto_Bold txtAdd;
        RoundedImageView imgFood;
        ImageView imgAdd,imgMinus;

        public ProductHolder(View itemView) {
            super(itemView);

            itemView.setTag(itemView);

            txtName=itemView.findViewById(R.id.txtName);
            txtDollar=itemView.findViewById(R.id.txtDollar);
            txtCount=itemView.findViewById(R.id.txtCount);
            txtAdd=itemView.findViewById(R.id.txtAdd);

            imgFood=itemView.findViewById(R.id.FoodImage_Id);
            imgAdd=itemView.findViewById(R.id.imgAdd);
            imgMinus=itemView.findViewById(R.id.imgMinus);

            txtAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(v.getContext(),"Product Added to Cart!!!",Toast.LENGTH_LONG).show();
                }
            });

            imgAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count++;
                    txtCount.setText(String.valueOf(count));
                }
            });

            imgMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count--;
                    txtCount.setText(String.valueOf(count));
                }
            });

        }



    }
    @Override
    public AdapterProduct.ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lay_product,null);
        return new ProductHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        Product product=productList.get(position);

        holder.txtName.setText(product.getProductName());
        holder.txtDollar.setText(product.getProductPrice());
        String urlImageProduct = product.getImageUrl();
        if (urlImageProduct != null) {

            try {
                Picasso.with(context)
                        .load(urlImageProduct)
                        .error(android.R.drawable.stat_notify_error)
                        .into(holder.imgFood);

            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }



    @Override
    public int getItemCount() {
        return productList.size();
    }
}
