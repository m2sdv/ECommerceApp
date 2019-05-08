package com.ecommerce.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecommerce.R;
import com.ecommerce.model.Address;

import java.util.ArrayList;

public class AdapterAddress extends RecyclerView.Adapter<AdapterAddress.AddressHolder> {
    private ArrayList<Address> addressArrayList;

    public AdapterAddress(ArrayList<Address> addressArrayList) {
        this.addressArrayList = addressArrayList;
    }

    @NonNull
    @Override
    public AddressHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.lay_address,null);
       return new AddressHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddressHolder addressHolder, int position) {
        Address address=addressArrayList.get(position);

    }

    @Override
    public int getItemCount() {
        return addressArrayList.size();
    }

    public class AddressHolder extends RecyclerView.ViewHolder {
        public AddressHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
