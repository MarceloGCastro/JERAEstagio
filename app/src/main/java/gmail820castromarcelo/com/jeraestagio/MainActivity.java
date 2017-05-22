package gmail820castromarcelo.com.jeraestagio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import java.util.*;
import android.app.ListActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button adicionar;
    protected TextView livrosC;
    protected ListView lista;
    protected Button lembrete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adicionar = (Button) findViewById(R.id.adicionar);
        lembrete = (Button) findViewById(R.id.lembrete);
        livrosC = (TextView) findViewById(R.id.livrosC);
        lista = (ListView) findViewById(R.id.lista);

        adicionar.setOnClickListener(this);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra("Título: ");

        livrosC.setText(titulo);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
        lista.setAdapter(adapter);

        lembrete.setOnClickListener(this);
        
        Intent gettingBack = getIntent();
        String livro = gettingBack.getStringExtra("Livro:");
        String dia = gettingBack.getStringExtra("Dia:");
        String hora = gettingBack.getStringExtra("Hora:");

        livrosC.setText(livro);

    }

    @Override
    public void onClick(View v) {
        if (v == adicionar) {
            Intent second= new Intent(this, CadastrarLivros.class);
            startActivity(second);
        }
        if (v == lembrete) {
            Intent third = new Intent(this, CriarLembrete.class);
            startActivity(third);
        }
    }
}
