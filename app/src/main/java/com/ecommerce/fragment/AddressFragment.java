package com.ecommerce.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecommerce.R;
import com.ecommerce.adapter.AdapterAddress;
import com.ecommerce.model.Address;

import java.util.ArrayList;

public class AddressFragment extends Fragment {
    FloatingActionButton FAB;

    private ArrayList<Address> addressArrayList;
    private AdapterAddress adapterAddress;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_address, container, false);
        return view;
    }
}
