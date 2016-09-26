package com.example.morgan.contadorbasico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
    }


    public void suma (View vista)
    {
        contador++;

        mostrarResultado();

    }


    public void resta (View vista)
    {
        contador--;

        mostrarResultado();
    }


    public void reset (View vista)
    {
        contador = 0;

        mostrarResultado();
    }


    public void mostrarResultado ()
    {
        //Creo una instancia de TextView y con el findViewById para encontrar
        // una vista a partir de su id. Entre parentesis
        // ponemos la id del elemento creado en el content_main
        TextView textoResultado = (TextView)findViewById(R.id.textViewNumero);

        //usamos el metodo setText para asignar el texto a la variable
        //Si no ponemos la "" + Nos dara un error, porque esta funcion espera
        // un string, y si solo le pasas un int falla
        textoResultado.setText("" + contador);
    }


}
