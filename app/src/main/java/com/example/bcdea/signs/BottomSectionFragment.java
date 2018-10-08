package com.example.bcdea.signs;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
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


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BottomSectionFragment extends Fragment {
    private ImageView witchView;
    private AssetManager ass;
    private List<String> images = new ArrayList<String>();
    private int counter = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        setupImageView(view);
        return view;
    }

    private void setupImageView(View view){
        setupLists();
        witchView = (ImageView) view.findViewById(R.id.witchImageView);
        witchView.setOnClickListener(imageListen);
        ass = getActivity().getAssets();
        try {
            witchView.setImageDrawable(Drawable.createFromStream(ass.open(images.get(counter)), "Witch"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupLists(){
        images.add("witchshouse.jpg");
        images.add("louvre2.jpg");
    }



    private OnClickListener imageListen = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if(counter == images.size() - 1){
                counter = 0;
                drawPicture();
            } else {
                counter++;
                drawPicture();
            }
        }
    };

    private void drawPicture(){
        try {
            witchView.setImageDrawable(Drawable.createFromStream(ass.open(images.get(counter)), "Witch"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}