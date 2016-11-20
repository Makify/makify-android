package com.makify.makify;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsActivityFragment extends Fragment {


    public SettingsActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /*
        Spinner spinner = (Spinner) getView().findViewById(R.id.dimensions_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter.createFromResource(getActivity(), R.array.dimensions_array, R.layout.fragment_settings_activity);
        adapter.setDropDownViewResource(R.layout.simple_dimension_item);
        spinner.setAdapter(adapter);
        */
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings_activity, container, false);
    }

}
