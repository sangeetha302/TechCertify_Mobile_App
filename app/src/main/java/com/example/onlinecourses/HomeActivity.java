package com.example.onlinecourses;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set up the Toolbar with Back Button
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Select a Course");
        }

        // Back button functionality
        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        // List of courses
        String[] courses = {
                "Web Development",
                "Java Programming",
                "Python Programming",
                "Android Development",
                "DevOps",
                "Cloud Computing",
                "C Programming",
                "C++ Programming",
                "AI & ML",
                "Cyber Security",
                "Marketing",
                "Data Analysis"
        };

        // ListView setup
        ListView lvCourses = findViewById(R.id.lvCourses);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_course, R.id.tvCourseName, courses);
        lvCourses.setAdapter(adapter);

        // Handle item clicks
        lvCourses.setOnItemClickListener((parent, view, position, id) -> {
            String selectedCourse = courses[position];
            Intent intent = new Intent(HomeActivity.this, CourseDetailActivity.class);
            intent.putExtra("courseName", selectedCourse);
            startActivity(intent);
        });
    }
}
