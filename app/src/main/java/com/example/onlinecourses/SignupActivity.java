package com.example.onlinecourses;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText etName = findViewById(R.id.etName);
        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnSignup = findViewById(R.id.btnSignup);

        // Signup button functionality
        btnSignup.setOnClickListener(view -> {
            String name = etName.getText().toString();
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();

            if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(SignupActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(SignupActivity.this, "Signup Successful!", Toast.LENGTH_SHORT).show();
                // Navigate to Basic Info Page
                Intent intent = new Intent(SignupActivity.this, BasicInfoActivity.class);
                startActivity(intent);
                finish(); // Close SignupActivity
            }
        });
    }
}
