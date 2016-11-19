package com.makify.makify;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import static com.makify.makify.R.layout.fragment_templates;


/**
 * A simple {@link Fragment} subclass.
 */
public class TemplatesFragment extends Fragment {

    // ListView listView;

    public TemplatesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Defined Array values to show in ListView
        String[] fileTemplates = getResources().getStringArray(R.array.examples);
        //ListAdapter fileAdapter = new ArrayAdapter<String>(this, R.layout.fragment_templates, fileTemplates);
        return inflater.inflate(fragment_templates, container, false);
    }

}
