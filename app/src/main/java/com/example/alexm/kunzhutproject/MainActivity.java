package com.example.alexm.kunzhutproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private VisaType selectedVisaType;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        showFragment(new HelloFragment(), false);
    }

    public void showFragment(Fragment fragment, boolean addToBackStack) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);

        if (addToBackStack) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
    }

    public void goToPreviousFragment() {
        getSupportFragmentManager().popBackStack();
    }

    public void goBackToMenu() {
        FragmentManager fragmentManager = getSupportFragmentManager();

        while (true) {
            Fragment currentFragment = fragmentManager.findFragmentById(R.id.container);
            if (currentFragment instanceof SelectionFragment) {
                break;
            }
            fragmentManager.popBackStackImmediate();
        }
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment currentFragment = fragmentManager.findFragmentById(R.id.container);

        if (currentFragment instanceof ReportFragment) {
            goBackToMenu();
        } else {
            super.onBackPressed();
        }
    }

    public VisaType getSelectedVisaType() {
        return selectedVisaType;
    }

    public void setSelectedVisaType(VisaType selectedVisaType) {
        this.selectedVisaType = selectedVisaType;
    }
}