package com.example.mvvmtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;

import com.example.mvvmtutorial.R;
import com.example.mvvmtutorial.PrintRandom;
import com.example.mvvmtutorial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    PrintRandom printRandom;
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        context=getApplicationContext();
        printRandom = ViewModelProviders.of(this).get(PrintRandom.class);
        activityMainBinding.setPrintViewModel(printRandom);

    }
}
