package enfermaria.projeto.com.enfermaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DadosPaciente extends AppCompatActivity {
    private TextView textoNome;
    private TextView textoLeit;
    private TextView textoPressao;
    private TextView textoCardiaco;
    private TextView textoTemCorporal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_paciente);
        textoNome = findViewById(R.id.textNome_Id);
        textoLeit = findViewById(R.id.textLeito_Id);
        textoPressao= findViewById(R.id.textPressao_Id);
        textoCardiaco =findViewById(R.id.textCardiaco_Id);
        textoTemCorporal = findViewById(R.id.textCorporal_Id);

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
           textoCardiaco.setText(String.valueOf(cardiaco+"(/m)" ));

           int corporal = params.getInt("corporal");
           textoTemCorporal.setText(String.valueOf(corporal+"(ºC)"));



        }

    }
}
