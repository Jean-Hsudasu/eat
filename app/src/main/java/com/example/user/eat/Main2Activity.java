package com.example.user.eat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView img = findViewById(R.id.imageView);

        Intent intent = getIntent();
        int position = intent.getIntExtra("n", 1);
        Log.i("show food", Integer.toString(position));


        switch (position) {
            case 0:
                img.setImageResource(R.drawable.m1);
                break;
            case 1:
                img.setImageResource(R.drawable.m2);
                break;
            case 2:
                img.setImageResource(R.drawable.m3);
                break;
            case 3:
                img.setImageResource(R.drawable.m4);
                break;
            case 4:
                img.setImageResource(R.drawable.m5);
                break;
            case 5:
                img.setImageResource(R.drawable.m6);
                break;
            case 6:
                img.setImageResource(R.drawable.m7);
                break;
            case 7:
                img.setImageResource(R.drawable.m8);
                break;
            case 8:
                img.setImageResource(R.drawable.m9);
                break;
            case 9:
                img.setImageResource(R.drawable.m10);
                break;
            case 10:
                img.setImageResource(R.drawable.m11);
                break;
            case 11:
                img.setImageResource(R.drawable.m12);
                break;
            case 12:
                img.setImageResource(R.drawable.m13);
                break;
            case 13:
                img.setImageResource(R.drawable.m14);
                break;
            case 14:
                img.setImageResource(R.drawable.m15);
                break;
        }
    }

    public void fn_like(View view) {
        Intent i = new Intent();
        i.putExtra("Like", 1);
        setResult(RESULT_OK, i);
        finish();
    }

    public void fn_dislike(View view) {
        Intent i = new Intent();
        i.putExtra("Like", 0);
        setResult(RESULT_OK, i);
        finish();
    }


}

