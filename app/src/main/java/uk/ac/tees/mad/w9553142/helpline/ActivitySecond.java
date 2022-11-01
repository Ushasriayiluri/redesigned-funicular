package uk.ac.tees.mad.w9553142.helpline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;


public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void goToActivity1 (View view) {
//        Intent intent1 = new Intent(this, MainActivity.class);
//        startActivity(intent1);
        finish();
    }
}

