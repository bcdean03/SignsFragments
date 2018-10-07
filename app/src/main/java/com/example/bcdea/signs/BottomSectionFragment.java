package com.example.bcdea.signs;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class BottomSectionFragment extends Fragment {
    private ImageView witchView;
    private AssetManager ass;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        witchView = (ImageView) view.findViewById(R.id.witchImageView);
        witchView.setOnClickListener(imageListen);

        ass = MainActivity.getAssets();
        return view;
    }



    private OnClickListener imageListen = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getContext(), "Hello", Toast.LENGTH_LONG).show();
        }
    };
}