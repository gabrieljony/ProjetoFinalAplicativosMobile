package com.example.gjbsilva.projetofinalaplicativosmobile.fragments;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gjbsilva.projetofinalaplicativosmobile.Contatos;
import com.example.gjbsilva.projetofinalaplicativosmobile.EntidadeContatos;
import com.example.gjbsilva.projetofinalaplicativosmobile.MainActivity;
import com.example.gjbsilva.projetofinalaplicativosmobile.R;
import com.facebook.Profile;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by GABRIEL on 14/05/2016.
 */
//implements AdapterView.OnItemClickListener
public class FragmentContatos extends Fragment {

    private TextView NomeUsuario;
    private ProfilePictureView profilePictureView;

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            final ListView listaPessoas = (ListView)rootView.findViewById(R.id.ListView01);
            List<EntidadeContatos> ListaContatos = new ArrayList<EntidadeContatos>();
            Contatos Contato = new Contatos(this.getActivity());
            ListaContatos = Contato.getContatos();

            // adapter que sera o source para a listview
            ArrayAdapter<EntidadeContatos> adapter = new ArrayAdapter<EntidadeContatos>(this.getActivity(),android.R.layout.simple_list_item_1, ListaContatos);

            //seta o adapter para o listview
            listaPessoas.setAdapter(adapter);

            //listaPessoas.setOnItemClickListener((AdapterView.OnItemClickListener) adapter);

            listaPessoas.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String texto = String.valueOf(parent.getItemAtPosition(position));
                    final AlertDialog.Builder alert;
                    alert = new AlertDialog.Builder(getActivity());
                    alert.setTitle("Solicitar localização");
                    alert.setMessage("Kd Você? " + texto);
                    alert.setIcon(R.drawable.com_facebook_button_icon);
                    alert.setPositiveButton("Notificar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            //code...
                        }
                    });
                    alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            //code...
                        }
                    });
                    alert.create();
                    alert.show();
                }
            });
            return rootView;
        }


    private void displayMessage(Profile profile){
        if(profile != null){
            NomeUsuario.setText(profile.getName());
            profilePictureView.setProfileId(profile.getId());
        }
    }

    @Override
    public void onViewCreated(View view, Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        NomeUsuario = (TextView) view.findViewById(R.id.nomeusuario);
        profilePictureView = (ProfilePictureView) view.findViewById(R.id.profilePicture);
    }
}