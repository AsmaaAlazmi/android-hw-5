package com.example.nasascvs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_main3);

        final TextView one1 =findViewById(R.id.one1);
        final TextView two2 =findViewById(R.id.two2);
        final TextView three3 =findViewById(R.id.three3);
        final TextView four4 =findViewById(R.id.four4);
        final TextView five5 =findViewById(R.id.five5);
        final TextView six6 =findViewById(R.id.six6);

        final Button back =findViewById(R.id.back);
        final Button confirm =findViewById(R.id.confirm);

        //---------------------------------------------------

        Bundle b = getIntent().getExtras();

        assert b != null;
        String name = b.getString("data1");
        String age = b.getString("data2");
        String job = b.getString("data3");
        String phone = b.getString("data4");
        String email = b.getString("data5");
        String man = b.getString("data6");
        String woman = b.getString("data7");

        one1.setText (name);
        two2.setText (age);
        three3.setText (job);
        four4.setText (phone);
        five5.setText (email);
        six6.setText (man+woman);


        back.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity3.this, MainActivity2.class);
                startActivity(i);
            }
        });

        confirm.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this,"CV confirmed.",Toast.LENGTH_LONG).show();
            }
        });




    }
}