package enfermaria.projeto.com.enfermaria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadatroPaciente extends AppCompatActivity {
    private Button botaoVoltar;
    private  Button botaoSalvar;
    private EditText textoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadatro_paciente);

        botaoVoltar = findViewById(R.id.botaoVoltar_Id);
        botaoSalvar = findViewById(R.id.botaoSalvar_Id);
        textoNome = findViewById(R.id.editNome_Id);

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

                intent.putExtra("nome","Nome do Paciente: " +textoNome.getText().toString() );
                startActivity(intent);
            }
        });
    }
}
