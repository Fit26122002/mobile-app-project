package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {


    Button assignTaskButton;
    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin);


        assignTaskButton = findViewById(R.id.assigntask_button);
        textView = findViewById(R.id.textView);




       /* TextView adminTextView = findViewById(R.id.adminTextView);
        adminTextView.setText("Welcome, Admin! This is the admin-only page.");*/

        // Get the user name from the intent
        String userName = getIntent().getStringExtra("userName");

        // Display the welcome message with the user's name
        textView.setText(userName);



        assignTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminActivity.this, AssignTask.class);
                startActivity(intent);

            }
        });
    }

}
