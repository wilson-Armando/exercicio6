package com.example.exerccio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_Aumentar15,btn_Aumentar20;
    EditText txt_Peso;
    TextView txt_Resultado15,txt_Resultado20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Aumentar15.findViewById(R.id.btn_aumento15);
        btn_Aumentar20.findViewById(R.id.btn_aumento20);
        txt_Resultado15.findViewById(R.id.txt_resultado15);
        txt_Resultado20.findViewById(R.id.txt_resultado20);
        txt_Peso.findViewById(R.id.txt_peso);

        btn_Aumentar15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n,aumento,P;
                n=Float.parseFloat(txt_Peso.getText().toString());
                aumento=n*(15/100);
                P=n+aumento;
                txt_Resultado15.setText(String.valueOf(P));

            }
        });

        btn_Aumentar20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n,aumento,P;
                n=Float.parseFloat(txt_Peso.getText().toString());
                aumento=n*(20/100);
                    P=n+aumento;
                    txt_Resultado20.setText(String.valueOf(P));



            }
        });
    }
}