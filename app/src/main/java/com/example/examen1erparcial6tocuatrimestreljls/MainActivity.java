package com.example.examen1erparcial6tocuatrimestreljls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView ListView;
    Intent Moverte;
    String[] planetas = new String[]{"mercurio","tierra","marte","jupiter","saturno","urano","neptuno"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ListView = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,planetas);
        ListView.setAdapter(adapter);
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "mercurio" , Toast.LENGTH_LONG).show();
                    Intent Moverte = new Intent(this, MainActivity2.class);
                    startActivity(Moverte);
                }
                if (position == 1) {
                    Toast.makeText(getApplicationContext(), "tierra" , Toast.LENGTH_LONG).show();
                }
                if (position == 2) {
                    Toast.makeText(getApplicationContext(), "marte" , Toast.LENGTH_LONG).show();
                }
                if (position == 3) {
                    Toast.makeText(getApplicationContext(), "jupiter" , Toast.LENGTH_LONG).show();
                }
                if (position == 4) {
                    Toast.makeText(getApplicationContext(), "saturno" , Toast.LENGTH_LONG).show();
                }
                if (position == 5) {
                    Toast.makeText(getApplicationContext(), "urano" , Toast.LENGTH_LONG).show();
                }
                if (position == 6) {
                    Toast.makeText(getApplicationContext(), "neptuno" , Toast.LENGTH_LONG).show();
                }



            }
        });

    }

}