package com.ecommerce.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ecommerce.R;
import com.ecommerce.customfonts.MyTextView_Montserrat_Regular;
import com.ecommerce.model.Categories;

import java.util.ArrayList;
import java.util.List;

public class AdapterCategory extends RecyclerView.Adapter<AdapterCategory.CatagoryHolder> {

    ArrayList<Categories> categoriesList;
    private ItemClickListener clickListener;

    public AdapterCategory(List<Categories> listCatagor) {

        categoriesList= (ArrayList<Categories>) listCatagor;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    class CatagoryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        MyTextView_Montserrat_Regular mTxtCatagory;

        public CatagoryHolder(View itemView) {
            super(itemView);

            mTxtCatagory= (MyTextView_Montserrat_Regular) itemView.findViewById(R.id.txtCategoryName);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            if (clickListener != null) clickListener.onClick(v, getAdapterPosition());
        }
    }
    @Override
    public AdapterCategory.CatagoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lay_category,null);
        return new CatagoryHolder(view);

    }

    @Override
    public void onBindViewHolder(AdapterCategory.CatagoryHolder holder, int position) {

        Categories catagory=categoriesList.get(position);
        holder.mTxtCatagory.setText(catagory.getCategoryname());
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }
}
