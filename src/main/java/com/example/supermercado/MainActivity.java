package com.example.supermercado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.controle.usuario;
import com.example.controle.usuariocontrole;

public class MainActivity extends AppCompatActivity {
EditText edtLogin, edtSenha;
Button btInsere, btAlterar, btExclui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuariocontrole banco = new usuariocontrole(MainActivity.this);
        btInsere = (Button) findViewById(R.id.btInsere);
        btAlterar = (Button) findViewById(R.id.btAlterar);
        btExclui = (Button) findViewById(R.id.btExclui);
        edtLogin=(EditText) findViewById(R.id.edtLogin);
        edtSenha=(EditText) findViewById(R.id.edtSenha);

        btInsere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           usuario user = new usuario(edtLogin.getText().toString(), edtSenha.getText().toString());
           banco.insere_usuario(user);
            }
        });
    }
}