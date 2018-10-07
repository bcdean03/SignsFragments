package com.example.bcdea.signs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    TopSectionFragment frag;
    BottomSectionFragment frag2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(practiceListener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        frag = (TopSectionFragment) getSupportFragmentManager().findFragmentById(R.id.top_section_fragment);
        frag2 = (BottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.bottom_picture_fragment);

    }

    private OnClickListener practiceListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            //Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
            frag.toast();

        }
    };
}

