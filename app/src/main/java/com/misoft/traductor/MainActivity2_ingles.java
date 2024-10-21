package com.misoft.traductor;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.misoft.traductor.databinding.ActivityMainActivity2InglesBinding;

public class MainActivity2_ingles extends AppCompatActivity {

    private ActivityMainActivity2InglesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configuración de View Binding
        binding = ActivityMainActivity2InglesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtener la palabra en español desde el Intent
        String palabraEspaniol = getIntent().getStringExtra("palabraEspaniol");

        // Traducir la palabra (aquí puedes implementar tu lógica de traducción)
        String palabraIngles = traducirPalabra(palabraEspaniol);

        // Mostrar la palabra traducida
        binding.tvPalabraIngles.setText(palabraIngles);

        // Mostrar la imagen correspondiente (esto puede ser personalizado)
        int imagenResId = obtenerImagen(palabraEspaniol);
        binding.imgPalabra.setImageResource(imagenResId);
    }

    private String traducirPalabra(String palabraEspaniol) {
        switch (palabraEspaniol.toLowerCase()) {
            case "casa":
                return "house";
            case "conejito":
                return "bunny";
            case "perro":
                return "dog";
            case "gatito":
                return "kitten";
            case "manzana":
                return "apple";
            case "nada1":
                return "nothing1";
            case "perrito":
                return "puppy";
            default:
                return "default";  // Para palabras no reconocidas
        }
    }

    private int obtenerImagen(String palabraEspaniol) {
        switch (palabraEspaniol.toLowerCase()) {
            case "casa":
                return R.drawable.casa;  // Asegúrate de tener `casa.png` en la carpeta `res/drawable`
            case "conejito":
                return R.drawable.conejito;  // Asegúrate de tener `conejito.png`
            case "perro":
                return R.drawable.perro;  // Asegúrate de tener `dog.png`
            case "gatito":
                return R.drawable.gatito;  // Asegúrate de tener `gatito.png`
            case "manzana":
                return R.drawable.manzana;  // Asegúrate de tener `manzana.png`
            case "nada1":
                return R.drawable.nada1;  // Asegúrate de tener `nada1.png`
            case "perrito":
                return R.drawable.perrito;  // Asegúrate de tener `perrito.png`
            default:
                return R.drawable.defaultt;  // Imagen predeterminada si no se encuentra
        }
    }
}

