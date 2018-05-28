package enfermaria.projeto.com.enfermaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DadosPaciente extends AppCompatActivity {
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_paciente);
        texto = findViewById(R.id.textNome_Id);
        Bundle extra = getIntent().getExtras();

        if(extra !=null){
            String textoPassado = extra.getString("nome");
            texto.setText(textoPassado);
        }
    }
}
