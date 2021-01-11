package edu.upc.dsa.dsaexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class LogInActivity extends AppCompatActivity {
    EditText user;
    String useName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        user = findViewById((R.id.userText));
        loadSharedPreference();
    }

    protected void loadSharedPreference() {
        SharedPreferences preferences = getSharedPreferences("Usuario", Context.MODE_PRIVATE);
        useName = preferences.getString("userName", "error");
        Intent intent = new Intent(this, UserActivity.class);
    }

    public void searchClick(android.view.View v) {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
}