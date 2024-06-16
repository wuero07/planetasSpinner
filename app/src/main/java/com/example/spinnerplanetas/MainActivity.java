package com.example.spinnerplanetas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerPlanets;
    private ImageView imageViewPlanet;
    private TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerPlanets = findViewById(R.id.spinnerPlanets);
        imageViewPlanet = findViewById(R.id.imageViewPlanet);
        textViewDescription = findViewById(R.id.textViewDescription);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPlanets.setAdapter(adapter);

        spinnerPlanets.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        imageViewPlanet.setImageResource(R.drawable.mercurio1);
                        textViewDescription.setText("Mercurio es el planeta más cercano al Sol.");
                        break;
                    case 1:
                        imageViewPlanet.setImageResource(R.drawable.venus1);
                        textViewDescription.setText("Venus es el segundo planeta del sistema solar.");
                        break;
                    case 2:
                        imageViewPlanet.setImageResource(R.drawable.tierra1);
                        textViewDescription.setText("La Tierra es nuestro hogar.");
                        break;
                    case 3:
                        imageViewPlanet.setImageResource(R.drawable.marte1);
                        textViewDescription.setText("Marte es conocido como el planeta rojo.");
                        break;
                    case 4:
                        imageViewPlanet.setImageResource(R.drawable.jupiter1);
                        textViewDescription.setText("Júpiter es el planeta más grande del sistema solar.");
                        break;
                    case 5:
                        imageViewPlanet.setImageResource(R.drawable.saturno1);
                        textViewDescription.setText("Saturno es famoso por sus anillos.");
                        break;
                    case 6:
                        imageViewPlanet.setImageResource(R.drawable.urano1);
                        textViewDescription.setText("Urano tiene un eje de rotación único.");
                        break;
                    case 7:
                        imageViewPlanet.setImageResource(R.drawable.neptuno1);
                        textViewDescription.setText("Neptuno es el planeta más alejado del Sol.");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });
    }
}
