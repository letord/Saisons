package com.appli.saisons.ui.main;

import androidx.fragment.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.appli.saisons.R;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * une instance de NatureFragment contient ici juste un label
 */
public class SaisonFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque NatureFragment instancié
    private String title;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";
    public Context mContext;

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static SaisonFragment newInstance(int position, String title) {
        SaisonFragment fragment = new SaisonFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        title = getArguments().getString(ARG_SECTION_TITLE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ImageView image1 = view.findViewById(R.id.imageView);
        switch (page){
            case 0:
                image1.setImageResource(R.drawable.printemps);
                break;
            case 1:
                image1.setImageResource(R.drawable.ete);
                break;
            case 2:
                image1.setImageResource(R.drawable.a);
                break;
            case 3:
                image1.setImageResource(R.drawable.hiver);
                break;
        }
        return view;
    }

}
