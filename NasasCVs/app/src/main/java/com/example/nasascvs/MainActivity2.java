package com.example.nasascvs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        final EditText one = findViewById (R.id.one);
        final EditText two = findViewById (R.id.two);
        final EditText three = findViewById (R.id.three);
        final EditText four = findViewById (R.id.four);
        final EditText five = findViewById (R.id.five);

        final RadioButton male = findViewById (R.id.male);
        final RadioButton female = findViewById (R.id.female);

        final Button next = findViewById (R.id.next);
        //------------------------------------------------------------

        next.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String name = one.getText ().toString ();
                String age = two.getText ().toString ();
                String job = three.getText ().toString ();
                String phone = four.getText ().toString ();
                String email = five.getText ().toString ();
                String man = male.getText ().toString ();
                String woman = female.getText ().toString ();

                Intent i = new Intent (MainActivity2.this, MainActivity3.class);

                i.putExtra ("data1",name);
                i.putExtra ("data2",age);
                i.putExtra ("data3",job);
                i.putExtra ("data4",phone);
                i.putExtra ("data5",email);
                i.putExtra ("data6",man);
                i.putExtra ("data7",woman);

                startActivity(i);

            }
        });




    }
}