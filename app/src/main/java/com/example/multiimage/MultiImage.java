package com.example.multiimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MultiImage extends AppCompatActivity {

    Button btn;
    ImageView img1, img2, img3, img4;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_image);

        btn = findViewById(R.id.btn);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;

                if(i == 1){
                    img1.setImageResource(R.drawable.a);
                    img4.setImageResource(R.drawable.ic_launcher_background);
                }else if(i == 2){
                    img2.setImageResource(R.drawable.d);
                    img1.setImageResource(R.drawable.ic_launcher_background);
                }else if(i == 3){
                    img3.setImageResource(R.drawable.h);
                    img2.setImageResource(R.drawable.ic_launcher_background);
                }else if(i == 4){
                    img4.setImageResource(R.drawable.index);
                    img3.setImageResource(R.drawable.ic_launcher_background);
                    i = 0;
                }
            }
        });
    }
}