package com.example.gjbsilva.projetofinalaplicativosmobile;

/**
 * Created by GABRIEL on 17/04/2016.
 */
public class EntidadeContatos {
    private String ID;
    private String Nome;
    private String Email;
    public String getID() {
        return ID;
    }
    public void setID(String string) {
        ID = string;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    //Metodo sobreescrito para que não aparece o nome do componente
    // na listView

    @Override
    public String toString() {

        return Nome;
    }
}
