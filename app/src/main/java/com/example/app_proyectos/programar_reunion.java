package com.example.app_proyectos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MeetingSchedulerActivity extends AppCompatActivity {

    private EditText etMeetingName, etMeetingDate, etMeetingTime;
    private Button btnScheduleMeeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programar_reunion);

        etMeetingName = findViewById(R.id.etMeetingName);
        etMeetingDate = findViewById(R.id.etMeetingDate);
        etMeetingTime = findViewById(R.id.etMeetingTime);
        btnScheduleMeeting = findViewById(R.id.btnScheduleMeeting);

        btnScheduleMeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meetingName = etMeetingName.getText().toString().trim();
                String meetingDate = etMeetingDate.getText().toString().trim();
                String meetingTime = etMeetingTime.getText().toString().trim();

                if (meetingName.isEmpty() || meetingDate.isEmpty() || meetingTime.isEmpty()) {
                    Toast.makeText(MeetingSchedulerActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {


                    String message = "Meeting '" + meetingName + "' scheduled for " + meetingDate + " at " + meetingTime;
                    Toast.makeText(MeetingSchedulerActivity.this, message, Toast.LENGTH_SHORT).show();

                    etMeetingName.setText("");
                    etMeetingDate.setText("");
                    etMeetingTime.setText("");
                }
            }
        });
    }
}
