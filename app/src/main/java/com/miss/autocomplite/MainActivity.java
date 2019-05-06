package com.miss.autocomplite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
MultiAutoCompleteTextView multiAutoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String [] bahasapemrograman = {"Java","C","PHP","Python","Visual Basic"
                ,"Java script","Action Script"};
        //membuat data text yang berupa daftar bahasa pemrograman


        multiAutoCompleteTextView = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
        //inisialisasi object dari MultiAutoCompleteTextView

         ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,bahasapemrograman);
        //membuat adapter untuk menghubungkan data atau nilai dari object bahasapemrograman
        multiAutoCompleteTextView.setAdapter(adapter);
        //menset nilai adapter di object multiAutoCompleteTextView

        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        //method untuk membatasi tiap text dengan comma (,)
    }
}
