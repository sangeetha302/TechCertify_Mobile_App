package com.example.onlinecourses;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BasicInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);

        // Set up the Toolbar as ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the back button (arrow) in the toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button btnExploreMore = findViewById(R.id.btnExploreMore);

        // Navigate to the Select Course Page
        btnExploreMore.setOnClickListener(view -> {
            Intent intent = new Intent(BasicInfoActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });
    }

    // Handle back button press from the toolbar
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // Navigate back to the previous activity
        return true;
    }
}


