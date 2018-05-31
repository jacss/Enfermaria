package enfermaria.projeto.com.enfermaria;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadatroPaciente extends AppCompatActivity {
    private Button botaoVoltar;
    private Button botaoSalvar;
    private EditText textoNome;
    private EditText textoLeito;
    private EditText textoPressaoArterial;
    private EditText textoBatiCardiaco;
    private EditText textoTempCorporal;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadatro_paciente);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.saude);

        botaoVoltar = findViewById(R.id.botaoVoltar_Id);
        botaoSalvar = findViewById(R.id.botaoSalvar_Id);
        textoNome = findViewById(R.id.editNome_Id);
        textoLeito = findViewById(R.id.editLeito_Id);
        textoPressaoArterial = findViewById(R.id.editPressao_Id);
        textoBatiCardiaco = findViewById(R.id.editBatimCardiado_Id);
        textoTempCorporal = findViewById(R.id.editTempCorporal_Id);


        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CadatroPaciente.this, MainActivity.class));
            }
        });
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadatroPaciente.this, DadosPaciente.class);

                Bundle bundle = new Bundle();

                    bundle.putString("nome", textoNome.getText().toString());
                    bundle.putInt("leito", Integer.parseInt(textoLeito.getText().toString()));
                    bundle.putString("pressao", textoPressaoArterial.getText().toString());
                    bundle.putInt("cardiaco", Integer.parseInt(textoBatiCardiaco.getText().toString()));
                    bundle.putInt("corporal", Integer.parseInt(textoTempCorporal.getText().toString()));

                    intent.putExtras(bundle);
                    startActivity(intent);

            }
        });
    }



}


