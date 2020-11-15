package com.example.mvvmtutorial;


import androidx.lifecycle.ViewModel;

import java.util.Random;

public class PrintRandom extends ViewModel {

    String number;


    public String print() {

        if (number == null) {

            Random random = new Random();

            number = String.valueOf(random.nextInt(20 - 4 + 10));

        }
        return number;
    }
}

