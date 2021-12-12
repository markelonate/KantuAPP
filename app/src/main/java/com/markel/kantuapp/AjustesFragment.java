package com.markel.kantuapp;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AjustesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AjustesFragment extends Fragment {

    public AjustesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AjustesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AjustesFragment newInstance(String param1, String param2) {
        AjustesFragment fragment = new AjustesFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Spinner spinner = null;
        spinner = (Spinner) spinner.findViewById(R.id.ajustes_drop_language);
        Spinner finalSpinner = spinner;
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (finalSpinner.getSelectedItem().toString()) {
                    case "English":
                        Locale locale_en = new Locale("en");
                        Locale.setDefault(locale_en);
                        Configuration config_en = new Configuration();
                        config_en.locale = locale_en;
                        Toast.makeText(getActivity().getApplicationContext(), "Englis",Toast.LENGTH_LONG);
                        break;
                    case "Castellano":
                        Locale locale_es = new Locale("es");
                        Locale.setDefault(locale_es);
                        Configuration config_es = new Configuration();
                        config_es.locale = locale_es;
                        Toast.makeText(getActivity().getApplicationContext(), "Locale in Castellano !", Toast.LENGTH_LONG).show();
                        break;
                    case "Euskara":
                        Locale locale_eu = new Locale("eu");
                        Locale.setDefault(locale_eu);
                        Configuration config_eu = new Configuration();
                        config_eu.locale = locale_eu;
                        Toast.makeText(getActivity().getApplicationContext(), "Locale in Euskara !", Toast.LENGTH_LONG).show();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ajustes, container, false);
    }
}