package com.home.vlas.fragmentsexample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    private static final String TAG=MainActivity.class.getSimpleName();
    private int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"sum: "+sum);
                Toast.makeText(MainActivity.this, "sum: "+sum, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
}
