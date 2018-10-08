package com.example.bcdea.signs;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Button;
import android.view.View.OnClickListener;

public class TopSectionFragment extends Fragment {
    private AssetManager ass;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        Button b = (Button) view.findViewById(R.id.buttonFrag);
        b.setOnClickListener(practiceListener);

        return view;
    }

    public void toast(){
        Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_LONG).show();
    }

    private OnClickListener practiceListener = new OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    };
}
