package org.altervista.ultimaprovaprimadi.ciromelody.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;

    TextView textView1;
    LinearLayout rlmain;
    LinearLayout ll1;
    LinearLayout.LayoutParams llp;
    Button bn_sceglifile,bn_creafile,bn_salvafile,bn_leggifile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView=new  TextView(this);
        textView.setText("Questa è la sola finestra che appare");
        setContentView(textView);
        aggiungiView();
    }

    private void aggiungiView() {
        rlmain = new LinearLayout(this);
        llp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.VERTICAL);
        textView = new TextView(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        textView.setLayoutParams(lp);
        ll1.addView(textView);
        textView1 = new TextView(this);
        // LinearLayout .LayoutParams lp1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        textView1.setLayoutParams(lp);
        ll1.addView(textView1);


        bn_creafile=new Button(this);
        // LinearLayout .LayoutParams lp2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        bn_creafile.setLayoutParams(lp);
        bn_creafile.setText("crea file");
        bn_creafile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //createFile("text/plain","Test.txt");
            }
        });
        ll1.addView(bn_creafile);
        bn_leggifile=new Button(this);
        // LinearLayout .LayoutParams lp2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        bn_leggifile.setLayoutParams(lp);
        bn_leggifile.setText("leggi file");
        bn_leggifile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //chooseFile();
            }
        });
        ll1.addView(bn_leggifile);

        bn_salvafile=new Button(this);
        bn_salvafile.setLayoutParams(lp);
        bn_salvafile.setText("Condividi file");
        bn_salvafile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //shareFile(Uri.parse(textView.getText().toString()),"scrittura file");
            }
        });
        ll1.addView(bn_salvafile);
        rlmain.addView(ll1);
        setContentView(rlmain, llp);
    }
}