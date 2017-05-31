package com.example.diego.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.diego.agenda.modelo.Aluno;

/**
 * Created by projeto on 31/05/2017.
 */

public class FormularioHelper {

    EditText campoNome;
    EditText campoEndereco;
    EditText campoTelefone;
    EditText campoSite;
    RatingBar campoNota;


    FormularioHelper(FormularioActivity activity){
        campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);
    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno ();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return aluno;
    }

}
