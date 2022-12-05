package uk.ac.tees.mad.w9553142.helpline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;

public class RegisterActivity extends AppCompatActivity
{
    ActivityRegisterBinding binding;
    String[] typeArray = { "User","Doctor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_register);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, typeArray);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerType.setAdapter(aa);

        binding.logInAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValidation())
                {
                    RegisterRequestModel registerObj = new RegisterRequestModel(binding.etName.getText().toString(), binding.etEmail.getText().toString(), binding.etPassView.getText().toString(), binding.spinnerType.getSelectedItem().toString(), binding.etDoctorId.getText().toString());
                    registerApi(registerObj);
                }
            }
        });
    }

    boolean checkValidation()
    {
        if (TextUtils.isEmpty(binding.etName.getText()))
        {
            binding.tilName.setError("Name cannot be empty.");
            binding.tilName  .requestFocus();
            return false;
        }
        else if (TextUtils.isEmpty(binding.etEmail.getText()))
        {
            binding.tilEmail.setError("Email cannot be empty.");
            binding.tilEmail.requestFocus();
            return false;
        }
        else if (TextUtils.isEmpty(binding.etPassView.getText())) {
            binding.tilPassword.setError("Password cannot be empty.");
            binding.tilPassword.requestFocus();
            return false;
        }
        else if (binding.spinnerType.getSelectedItem().equals("Doctor")) {
            if (TextUtils.isEmpty(binding.etPassView.getText())) {
                binding.tilDoctorId.setError("Doctor Id cannot be empty.");
                binding.tilDoctorId.requestFocus();
                return false;
            }
        }
        return true;
    }

    void registerApi(RegisterRequestModel registerObj)
    {
        Intent i=new Intent(RegisterActivity.this, DashboardActivity.class);
        startActivity(i);
        finish();
    }
}