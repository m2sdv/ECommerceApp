package com.ecommerce.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecommerce.R;
import com.ecommerce.adapter.AdapterCategory;
import com.ecommerce.adapter.AdapterProduct;
import com.ecommerce.model.Categories;
import com.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductFragment extends Fragment {

    List<Product> productList;
    RecyclerView recyclerView;
    AdapterProduct adapterProduct;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_product, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerProduct);
        productList = new ArrayList<>();
        adapterProduct = new AdapterProduct(productList);
        recyclerView.setAdapter(adapterProduct);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

        prepareProduct();
        return view;


    }

    private void prepareProduct() {

        Product product=new Product("Cookies","IMG","100");
        productList.add(product);

        product=new Product("Bread","IMG","200");
        productList.add(product);

        product=new Product("Biscuits","IMG","200");
        productList.add(product);

        product=new Product("Pie","IMG","150");
        productList.add(product);

        product=new Product("FruitCake","IMG","100");
        productList.add(product);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Products");
    }


}
