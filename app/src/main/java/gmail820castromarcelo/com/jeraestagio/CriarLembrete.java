package gmail820castromarcelo.com.jeraestagio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class CriarLembrete extends MainActivity implements View.OnClickListener {

    protected Button lembrete;
    protected TextView horaLembrete;
    protected TextView diaLembrete;
    protected EditText dataLembrete;
    protected EditText horarioLembrete;
    protected EditText livroLembrete;
    protected TextView selecLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_lembrete);

        lembrete = (Button) findViewById(R.id.lembrete);
        horaLembrete = (TextView) findViewById(R.id.horaLembrete);
        horarioLembrete = (EditText) findViewById(R.id.horarioLembrete);
        diaLembrete = (TextView) findViewById(R.id.diaLembrete);
        dataLembrete = (EditText) findViewById(R.id.dataLembrete);
        livroLembrete = (EditText) findViewById(R.id.livroLembrete);
        selecLivro = (TextView) findViewById(R.id.selecLivro);

        lembrete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Retornar para main activ
    }
}
