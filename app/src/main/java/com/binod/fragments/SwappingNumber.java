package com.binod.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.binod.classassignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwappingNumber extends Fragment {


    public SwappingNumber() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_swapping_number, container, false);
    }

}
