package com.example.app_proyectos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class TaskAssignmentActivity extends AppCompatActivity {

    private EditText etTaskName, etAssignedTo;
    private Button btnAssignTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asignar_tareas);

        etTaskName = findViewById(R.id.etTaskName);
        etAssignedTo = findViewById(R.id.etAssignedTo);
        btnAssignTask = findViewById(R.id.btnAssignTask);

        btnAssignTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskName = etTaskName.getText().toString().trim();
                String assignedTo = etAssignedTo.getText().toString().trim();

                if (taskName.isEmpty() || assignedTo.isEmpty()) {
                    Toast.makeText(TaskAssignmentActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {

                    String message = "Task '" + taskName + "' assigned to " + assignedTo;
                    Toast.makeText(TaskAssignmentActivity.this, message, Toast.LENGTH_SHORT).show();


                    etTaskName.setText("");
                    etAssignedTo.setText("");
                }
            }
        });
    }
}
