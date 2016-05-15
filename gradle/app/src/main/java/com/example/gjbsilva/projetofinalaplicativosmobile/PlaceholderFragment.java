package com.example.gjbsilva.projetofinalaplicativosmobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by GABRIEL on 14/05/2016.
 */
public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            /*final ListView listaPessoas = (ListView)rootView.findViewById(R.id.ListView01);
            List<EntidadeContatos> ListaContatos = new ArrayList<EntidadeContatos>();
            Contatos Contato = new Contatos(MainActivity.this);
            ListaContatos = Contato.getContatos();

            // adapter que sera o source para a listview
            ArrayAdapter<EntidadeContatos> adapter = new ArrayAdapter<EntidadeContatos>(MainActivity.this,android.R.layout.simple_list_item_1, ListaContatos);

            //seta o adapter para o listview
            listaPessoas.setAdapter(adapter);*/

        return rootView;
    }
}
