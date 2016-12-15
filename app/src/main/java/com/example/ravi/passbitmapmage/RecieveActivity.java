package com.example.ravi.passbitmapmage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class RecieveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bitmap bitmap=(Bitmap)this.getIntent().getParcelableExtra("Bitmap");
        setContentView(R.layout.activity_recieve);
        ImageView imageView= (ImageView) findViewById(R.id.image);
          imageView.setImageBitmap(bitmap);


    }
}
