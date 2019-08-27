package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtTempoGasto;
    EditText txtVlMedia;
    EditText txtRdVeiculo;
    TextView lblResultado1;
    TextView lblResultado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTempoGasto = findViewById(R.id.txtTempoGasto);
        txtRdVeiculo= findViewById(R.id.txtRdVeiculo);
        txtVlMedia =findViewById(R.id.txtVlMedia);
        lblResultado1=findViewById(R.id.lblResultado1);
        lblResultado2=findViewById(R.id.lblResultado2);
    }
    public void onCalcular (View v){
        double tGasto =Double.parseDouble(txtTempoGasto.getText().toString());
        int vMedia = Integer.parseInt(txtVlMedia.getText().toString());
        int rdVeiculo = Integer.parseInt(txtRdVeiculo.getText().toString());
        int distacia = Integer.parseInt(lblResultado1.getText().toString());
        int consumo = Integer.parseInt(lblResultado2.getText().toString());

        double resDisdtancia = tGasto* vMedia;
        double resConsumo = distacia / rdVeiculo;

        lblResultado1.setText(String.valueOf(distacia));
        lblResultado2.setText(String.valueOf(consumo));



    }


}






