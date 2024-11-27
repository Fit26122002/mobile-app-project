package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.DisplayActivity;

public class MainActivity extends AppCompatActivity {

    Button viewTaskButton;

   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       textView = findViewById(R.id.textView);
       viewTaskButton = findViewById(R.id.viewTask_btn);

        // Get the user name from the intent
        String userName = getIntent().getStringExtra("userName");

        // Display the welcome message with the user's name
        textView.setText("Welcome " + userName);

        viewTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                startActivity(intent);
            }
        });


    }
}
