package gmail820castromarcelo.com.jeraestagio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class CadastrarLivros extends MainActivity implements View.OnClickListener{

    protected TextView nomeLivro;
    protected TextView qtdPaginas;
    protected EditText tituloLivro;
    protected EditText totalPaginas;
    protected Button cadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_livros);

        nomeLivro = (TextView) findViewById(R.id.nomeLivro);
        qtdPaginas = (TextView) findViewById(R.id.qtdPaginas);
        tituloLivro = (EditText) findViewById(R.id.tituloLivro);
        totalPaginas = (EditText) findViewById(R.id.totalPaginas);
        cadastrar = (Button) findViewById(R.id.cadastrar);

        cadastrar.setOnClickListener(this);
        onResume();

    }

    @Override
    public void onClick(View v) {
        if ( v == cadastrar) {
           //Voltar a tela principal e colocar na listView.
        }
    }
}
