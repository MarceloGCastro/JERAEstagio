package gmail820castromarcelo.com.jeraestagio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button adicionar;
    protected TextView livrosC;
    protected ListView lista;
    ArrayAdapter<String> adapter;
    protected Button lembrete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adicionar = (Button) findViewById(R.id.adicionar);
        lembrete = (Button) findViewById(R.id.lembrete);
        livrosC = (TextView) findViewById(R.id.livrosC);
        lista = (ListView) findViewById(R.id.lista);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lista.setAdapter(adapter);

        adicionar.setOnClickListener(this);

        // Rodar após o fim do cadastro
    }

    @Override
    public void onClick(View v) {
        if (v == adicionar) {
            Intent intent = new Intent(this, CadastrarLivros.class);
            startActivity(intent);
        }
        if (v == lembrete) {
            Intent intent = new Intent(this, CriarLembrete.class);
            startActivity(intent);
        }
    }
}
