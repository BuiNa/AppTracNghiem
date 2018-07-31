package com.example.buina.apptracnghiem.monhoc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.buina.apptracnghiem.MainActivity;
import com.example.buina.apptracnghiem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TiengAnhFragment extends Fragment {


    public TiengAnhFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ( (MainActivity)getActivity() ).getSupportActionBar().setTitle("Môn Anh");
        return inflater.inflate(R.layout.fragment_tieng_anh2, container, false);
    }

}
