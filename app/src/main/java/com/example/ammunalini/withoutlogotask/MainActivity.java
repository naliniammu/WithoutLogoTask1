package com.example.ammunalini.withoutlogotask;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    public ImageView imageView;
    public Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.image);
        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    Drawable icon = getPackageManager().getApplicationIcon("com.example.ammunalini.withoutlogotask");
                    imageView.setImageDrawable(icon);

                }
                catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
    }

}

