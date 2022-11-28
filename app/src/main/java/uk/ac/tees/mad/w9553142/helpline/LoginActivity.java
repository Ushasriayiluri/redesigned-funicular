package uk.ac.tees.mad.w9553142.helpline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation())
                {
                    LoginRequestModel obj = new LoginRequestModel(binding.etEmail.getText().toString().trim() , binding.etPassword.getText().toString().trim());
                    loginCall(obj);
                }
            }
        });

        binding.tvCraeteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

    }

    boolean checkValidation()
    {
        if (TextUtils.isEmpty(binding.etEmail.getText()))
        {
            binding.tilEmail.setError("Email cannot be empty.");
            binding.tilEmail.requestFocus();
            return false;
        }
        else if (TextUtils.isEmpty(binding.etPassword.getText())) {
            binding.tilPassword.setError("Password cannot be empty.");
            binding.tilPassword.requestFocus();
            return false;
        }
        return true;
    }

    void loginCall(LoginRequestModel obj)
    {
        Intent i=new Intent(LoginActivity.this, DashboardActivity.class);
        startActivity(i);
        finish();
    }
}