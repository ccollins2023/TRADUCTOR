package com.misoft.traductor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.misoft.traductor.databinding.ActivityMainEspaniolBinding;

public class MainActivity_espaniol extends AppCompatActivity {

    private ActivityMainEspaniolBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configuración de View Binding
        binding = ActivityMainEspaniolBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configurar botón Traducir
        binding.btnTraducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String palabraEspaniol = binding.etPalabraEspaniol.getText().toString().trim();

                // Iniciar la segunda Activity y enviar la palabra
                Intent intent = new Intent(MainActivity_espaniol.this, MainActivity2_ingles.class);
                intent.putExtra("palabraEspaniol", palabraEspaniol);
                startActivity(intent);
            }
        });
    }
}
