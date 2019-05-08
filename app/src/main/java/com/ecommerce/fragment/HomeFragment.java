package com.ecommerce.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ecommerce.R;
import com.ecommerce.adapter.AdapterCategory;
import com.ecommerce.adapter.ItemClickListener;
import com.ecommerce.model.Categories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Belal on 18/09/16.
 */


public class HomeFragment extends Fragment implements ItemClickListener {

    List<Categories> categoriesList;
    RecyclerView recyclerView;
    AdapterCategory categotyAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        categoriesList = new ArrayList<>();


        categotyAdapter = new AdapterCategory(categoriesList);
        recyclerView.setAdapter(categotyAdapter);
        categotyAdapter.setClickListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        prepareCategory();
        return view;


    }

    private void prepareCategory() {
        Categories categories=new Categories("Bakery and Bread");
        categoriesList.add(categories);

        categories=new Categories("Pasta and Rice");
        categoriesList.add(categories);

        categories=new Categories("Oils, Sauces, Salad Dressings, and Condiments");
        categoriesList.add(categories);

        categories=new Categories("Soups and Canned Goods");
        categoriesList.add(categories);

        categories=new Categories("Frozen Foods");
        categoriesList.add(categories);

        categories=new Categories("Dairy, Cheese");
        categoriesList.add(categories);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Home");
    }

    @Override
    public void onClick(View view, int position) {

            ProductFragment productFragment = new ProductFragment();
            getFragmentManager().beginTransaction().add(R.id.content_frame, productFragment, null)
                    .addToBackStack("Fragment1").commit();

    }
}