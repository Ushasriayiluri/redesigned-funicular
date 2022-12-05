package uk.ac.tees.mad.w9553142.helpline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity
{
    ActivitySplashBinding binding;
    public static int SPLASH_SCREEN_TIME_OUT = 2000;
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedpreferences = getSharedPreferences( "medicare", Context.MODE_PRIVATE);
        editor = sharedpreferences.edit();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(sharedpreferences.getBoolean("login", false))
                {
                    Intent i = new Intent(SplashActivity.this, DashboardActivity.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}