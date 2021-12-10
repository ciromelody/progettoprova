package org.altervista.ultimaprovaprimadi.ciromelody.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView=new  TextView(this);
        textView.setText("Questa è la sola finestra che appare");
        setContentView(textView);
    }
}