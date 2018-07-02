package com.the3hdmedia.IndianLaws;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class CivilLawFragment extends Fragment {


    public CivilLawFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_civil_law, container, false);

        Spinner spinner = (Spinner)v.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(this.getActivity(),R.array.one,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setPrompt("1. Title and extent of operation of the Code.");
        spinner.setOnItemSelectedListener(null);
        return v;
    }

}
