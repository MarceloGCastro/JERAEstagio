package gmail820castromarcelo.com.jeraestagio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button adicionar;
    protected TextView livrosC;
    protected ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adicionar = (Button) findViewById(R.id.adicionar);
        livrosC = (TextView) findViewById(R.id.livrosC);
        lista = (ListView) findViewById(R.id.lista);

        adicionar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, CadastrarLivros.class);
        startActivity(intent);
    }
}
