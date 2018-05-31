package enfermaria.projeto.com.enfermaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DadosPaciente extends AppCompatActivity {
    private TextView textoNome;
    private TextView textoLeit;
    private TextView textoPressao;
    private TextView textoCardiaco;
    private TextView textoTemCorporal;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_paciente);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.saude);

        textoNome = findViewById(R.id.textNome_Id);
        textoLeit = findViewById(R.id.textLeito_Id);
        textoPressao= findViewById(R.id.textPressao_Id);
        textoCardiaco =findViewById(R.id.textCardiaco_Id);
        textoTemCorporal = findViewById(R.id.textCorporal_Id);
        botaoVoltar = findViewById(R.id.botaoVolt_Id);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DadosPaciente.this, CadatroPaciente.class));
            }
        });

        Intent intent = getIntent();

        Bundle params = intent.getExtras();


        if(params!=null){

                String texto = params.getString("nome");
                textoNome.setText(texto);

                int leito = params.getInt("leito");
                textoLeit.setText(String.valueOf(leito));

                String pressao = params.getString("pressao");
                textoPressao.setText(pressao + "(mmHb)");

                int cardiaco = params.getInt("cardiaco");
                textoCardiaco.setText(String.valueOf(cardiaco + "(/m)"));

                int corporal = params.getInt("corporal");
                textoTemCorporal.setText(String.valueOf(corporal + "(ºC)"));



        }

    }


}
