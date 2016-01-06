package com.example.jorge.holamundo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView campo_texto;
    EditText editText;
    Button boton1,boton2,boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        campo_texto = (TextView)findViewById(R.id.texto);
        editText = (EditText)findViewById(R.id.edittext);
        boton1 = (Button)findViewById(R.id.boton1);
        boton2 = (Button)findViewById(R.id.boton2);
        boton3 = (Button)findViewById(R.id.boton3);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton1:
                    String palabras = editText.getText().toString();
                    campo_texto.setText(palabras);
                    Toast.makeText(getApplicationContext(),""+palabras,Toast.LENGTH_SHORT).show();
                break;
            case R.id.boton2:
                    campo_texto.setText("Hola a todos!");
                    Toast.makeText(getApplicationContext(),":p",Toast.LENGTH_LONG).show();

                break;
            case R.id.boton3:
                    //Enviaremos un dato
                    String dato= editText.getText().toString();
                    //Esto es para pasar a una nueva actividad
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    //Esto es para mandar un dato a otra actividad
                    intent.putExtra("DATO",dato);
                    startActivity(intent);
                //wwwww


                break;


        }

    }
}
