package com.example.gjbsilva.projetofinalaplicativosmobile;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GABRIEL on 17/04/2016.
 */
public class Contatos {
    private Context ctx;

    public Contatos(Context contexto) {
        this.ctx = contexto;
    }

    public List<EntidadeContatos> getContatos() {
        Cursor C_Contatos = this.ctx.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, ContactsContract.Contacts.DISPLAY_NAME);
        //pega os index das colunnas
        int IndexID = C_Contatos.getColumnIndex(ContactsContract.Contacts._ID);
        int IndexName = C_Contatos.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
        List<EntidadeContatos> Contatos = new ArrayList<EntidadeContatos>();
        EntidadeContatos Contato;
        while (C_Contatos.moveToNext()) {
            Contato = new EntidadeContatos();
            Contato.setID(C_Contatos.getString(IndexID));
            Contato.setNome(C_Contatos.getString(IndexName));

            Contatos.add(Contato);
        }
        C_Contatos.close();
        return Contatos;
    }
}
