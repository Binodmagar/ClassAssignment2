package com.binod.classassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.binod.fragments.AreaOfCircle;
import com.binod.fragments.ArmstrongNumber;
import com.binod.fragments.AutomorphicNumber;
import com.binod.fragments.PalindromeNumber;
import com.binod.fragments.SimpleInterest;
import com.binod.fragments.SwappingNumber;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnArea, btnArmstrong, btnAutomorphic, btnPalindrome, btnSimpleInterest, btnSwapping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btnArea = findViewById(R.id.btnArea);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnArea.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);;
        btnAutomorphic.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.btnArea :
                AreaOfCircle areaOfCircle = new AreaOfCircle();
                fragmentTransaction.replace(R.id.FragmentContainer,areaOfCircle);
                fragmentTransaction.commit();
                break;


            case  R.id.btnArmstrong :
                ArmstrongNumber armstrongNumber = new ArmstrongNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, armstrongNumber);
                fragmentTransaction.commit();
                break;


            case R.id.btnAutomorphic :
                AutomorphicNumber automorphicNumber = new AutomorphicNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, automorphicNumber);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome :
                PalindromeNumber palindromeNumber = new PalindromeNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, palindromeNumber);
                fragmentTransaction.commit();
                break;

            case R.id.btnSimpleInterest :
                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.FragmentContainer, simpleInterest);
                fragmentTransaction.commit();
                break;

            case  R.id.btnSwapping :
                SwappingNumber swappingNumber = new SwappingNumber();
                fragmentTransaction.replace(R.id.FragmentContainer, swappingNumber);
                fragmentTransaction.commit();
                break;
        }
    }
}
