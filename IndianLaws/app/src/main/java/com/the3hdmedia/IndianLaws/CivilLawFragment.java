package com.the3hdmedia.IndianLaws;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


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
        final View v = inflater.inflate(R.layout.fragment_civil_law,container,false);
        final ArrayList<String> civilLaws = new ArrayList<>();

        ListView listView = (ListView)v.findViewById(R.id.listview_civilLaw);

        civilLaws.add("");

        return v;

    }
}