package com.example.zamovl;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ZakasListFragment extends Fragment {
    String[] tovar = { "1 замовлення", "2 замовлення", "3 замовлення", "4 замовлення", "5 замовлення"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_zakasr_list, container, false);
        ListView tovarList = (ListView) view.findViewById(R.id.zakasList);
        final Intent intent = new Intent(view.getContext(), ZakasDetails.class);

        ArrayAdapter<String> adapter = new ArrayAdapter(view.getContext(),
                android.R.layout.simple_list_item_1, tovar);

        tovarList.setAdapter(adapter);

        tovarList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                startActivity(intent);
            }
        });

        return  view;
    }
}