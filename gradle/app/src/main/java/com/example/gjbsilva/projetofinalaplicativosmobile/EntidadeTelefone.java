package com.example.gjbsilva.projetofinalaplicativosmobile;

/**
 * Created by GABRIEL on 17/04/2016.
 */
public class EntidadeTelefone {
    private String Telefone;
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    @Override
    public String toString() {
        return "Telefone: " + Telefone;
    }
}