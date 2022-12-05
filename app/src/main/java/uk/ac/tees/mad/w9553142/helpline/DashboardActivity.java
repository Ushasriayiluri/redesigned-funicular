package uk.ac.tees.mad.w9553142.helpline;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener
{
    ActivityDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setCurrentFragment(new DoctorUpcommingAppointmentFragment());
        initView();
    }

    void initView()
    {
        binding.ivMenu.setOnClickListener(this);
        setupDrawer();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.ivMenu :
                binding.drawerLayout.openDrawer(Gravity.LEFT);
                break;
        }
    }

    private void setCurrentFragment(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,fragment).commit();
    }

    private void setupDrawer()
    {
        binding.drawerLayout.setScrimColor(Color.TRANSPARENT);

        ActionBarDrawerToggle actionBarDrawerToggle  = new  ActionBarDrawerToggle(this,
                binding.drawerLayout,
                R.string.open,
                R.string.close)
        {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset)
            {
                super.onDrawerSlide(drawerView, slideOffset);
                Float slideX = drawerView.getWidth() * slideOffset;
                binding.content.setTranslationX(slideX);
                binding.content.setScaleX(1 - (slideOffset / 6f));
                binding.content.setScaleY(1 - (slideOffset / 6f));
            }
        };

        binding.drawerLayout.addDrawerListener(actionBarDrawerToggle);

    }
}