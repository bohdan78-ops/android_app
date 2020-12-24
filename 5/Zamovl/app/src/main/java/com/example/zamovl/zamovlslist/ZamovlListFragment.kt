package com.example.zamovl.zamovlslist;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.zamovl.R
import com.example.zamovl.zamovldetails.ZamovlDetailsFragment


class ZamovlListFragment : Fragment() {

    private lateinit var viewModel: ZamovlListViewModel
    private  lateinit var viewModelFactory: ZamovlListViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var view : View = inflater?.inflate(R.layout.fragment_zamovl_list, container, false);

        viewModelFactory = ZamovlListViewModelFactory()
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ZamovlListViewModel::class.java)


        var zamovlList:ListView =  view?.findViewById(R.id.zamovlList);

        var adapter = ArrayAdapter<String>(view.getContext(),
                android.R.layout.simple_list_item_1, viewModel.tovar);

        zamovlList.setAdapter(adapter);
        zamovlList.setOnItemClickListener { parent, view, position, id ->
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.activity_main, ZamovlDetailsFragment())?.commit()
            //activity?.supportFragmentManager?.beginTransaction()?.remove(ContactsListFragment())?.commit()
         }

        return  view;
    }
}