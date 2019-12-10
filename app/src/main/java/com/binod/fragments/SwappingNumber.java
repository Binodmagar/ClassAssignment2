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

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwappingNumber extends Fragment implements  View.OnClickListener{

    EditText etFirst, etSecond;
    Button btnSwap;
    TextView tvMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping_number, container, false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnSwap = view.findViewById(R.id.btnSwap);
        tvMessage = view.findViewById(R.id.tvMessage);

        btnSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int firstnum = Integer.parseInt(etFirst.getText().toString());
        int secondnum = Integer.parseInt(etSecond.getText().toString());

        firstnum = firstnum + secondnum;
        secondnum = firstnum - secondnum;
        firstnum = firstnum - secondnum;

        tvMessage.setText("After swapping value of first number is " + firstnum + " and value of second number is " + secondnum);

    }
}
