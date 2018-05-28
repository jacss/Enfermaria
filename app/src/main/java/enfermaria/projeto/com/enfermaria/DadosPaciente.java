package enfermaria.projeto.com.enfermaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DadosPaciente extends AppCompatActivity {
    private TextView textoNome;
    private TextView textoLeit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_paciente);
        textoNome = findViewById(R.id.textNome_Id);
        textoLeit = findViewById(R.id.textLeito_Id);

        Intent intent = getIntent();

        Bundle params = intent.getExtras();


        if(params!=null){
           String texto = params.getString("nome");
           textoNome.setText(texto);
           int leito = params.getInt("leito");
           textoLeit.setText(String.valueOf(leito));


        }

    }
}
