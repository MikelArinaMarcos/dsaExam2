package edu.upc.dsa.dsaexam2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.List;


public class UserActivity extends AppCompatActivity {

    ImageView fotoPerfil;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        fotoPerfil = findViewById(R.id.fotoPerfilUser);
    }

    public void getItems() {
        progressBar.setVisibility(View.VISIBLE);
    }
}