package com.example.app_proyectos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class TrackingActivity extends AppCompatActivity {

    private EditText etTaskName, etProgress;
    private Button btnUpdateProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seguimiento);

        etTaskName = findViewById(R.id.etTaskName);
        etProgress = findViewById(R.id.etProgress);
        btnUpdateProgress = findViewById(R.id.btnUpdateProgress);

        btnUpdateProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskName = etTaskName.getText().toString().trim();
                String progress = etProgress.getText().toString().trim();

                if (taskName.isEmpty() || progress.isEmpty()) {
                    Toast.makeText(TrackingActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí puedes implementar la lógica de seguimiento de progreso
                    // por ejemplo, puedes guardar el progreso de la tarea en una base de datos

                    // Para este ejemplo, simplemente mostraremos un mensaje de éxito en el seguimiento de progreso
                    String message = "Progress updated for task '" + taskName + "': " + progress;
                    Toast.makeText(TrackingActivity.this, message, Toast.LENGTH_SHORT).show();

                    // Restablecer los campos de entrada
                    etTaskName.setText("");
                    etProgress.setText("");
                }
            }
        });
    }
}
