package com.example.burger;

import com.example.burger.CarouselAdapter.OnItemClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Carousel carousel = (Carousel)findViewById(R.id.carousel);
        carousel.setOnItemClickListener(new OnItemClickListener(){

            public void onItemClick(CarouselAdapter<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(MainActivity.this,
                        String.format("%s has been clicked",
                                ((CarouselItem)parent.getChildAt(position)).getName()),
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}

