package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  TextView textView,seekTextView;
    private RatingBar ratingBar;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar= findViewById(R.id.ratingId);
        textView=findViewById(R.id.textViewId);
        seekTextView=findViewById(R.id.seekTExtViewId);
        seekBar=findViewById(R.id.seekbarId);

        seekTextView.setText("Volumre : "+seekBar.getProgress()+"/"+ seekBar.getMax());
        
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekTextView.setText("Volume : "+progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"onStartTrackingTouch is clicked",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            Toast.makeText(MainActivity.this,"onStopTrackingTouch is clicked",Toast.LENGTH_SHORT).show();
            }
        });





        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText("Rating : "+rating);
            }
        });
    }
}