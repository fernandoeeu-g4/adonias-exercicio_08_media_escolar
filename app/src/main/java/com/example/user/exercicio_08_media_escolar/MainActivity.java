package com.example.user.exercicio_08_media_escolar;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText input_nome;
    private TextInputEditText input_av1;
    private TextInputEditText input_av2;
    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_nome = findViewById(R.id.input_nome);
        input_av1 = findViewById(R.id.input_av1);
        input_av2 = findViewById(R.id.input_av2);
        resultado = findViewById(R.id.resultado);
}
    public void calculaMedia(View view) {
        double av1 = Double.parseDouble(input_av1.getText().toString());
        double av2 = Double.parseDouble(input_av2.getText().toString());
        String nome = input_nome.getText().toString();
        double media = (av1 + av2) / 2;
        String status;
        if (media >= 7) {
            status = nome + " foi aprovado";
        } else if (media >= 4) {
            status = nome + " está na prova final";
        } else {
            status = nome + " foi reprovado";
        }
        resultado.setText(status);
    }
}
