package com.binod.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.binod.classassignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromeNumber extends Fragment implements View.OnClickListener{

    EditText etPalindrome;
    Button btnPalindromeC;
    TextView tvMessage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome_number, container, false);

        etPalindrome = view.findViewById(R.id.etPalindrome);
        tvMessage = view.findViewById(R.id.tvMessage);
        btnPalindromeC = view.findViewById(R.id.btnPalindromeC);

        btnPalindromeC.setOnClickListener(this);

        return  view;
    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etPalindrome.getText().toString());
        int reInt = 0, rem, originalInt;
        originalInt = num;
        // reversed integer is stored in variable
        while( num != 0 )
        {
            rem = num % 10;
            reInt = reInt * 10 + rem;
            num  /= 10;
        }
        if (originalInt == reInt){
            tvMessage.setText(originalInt + " is Palindrome number");
        }else {
            tvMessage.setText(originalInt + " is not a Palindrome number");
        }
    }
}
