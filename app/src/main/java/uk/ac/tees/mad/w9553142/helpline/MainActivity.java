package uk.ac.tees.mad.w9553142.helpline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToActivity2 (View view) {
        Intent intent = new Intent(this, ActivitySecond.class);
        startActivity(intent);
    }
}