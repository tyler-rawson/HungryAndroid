package com.example.android.HungryAndroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageView cookieImageView;
    TextView cookieTextView;
    Button buttonEatCookie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieTextView = (TextView) findViewById(R.id.status_text_view);
        buttonEatCookie = (Button) findViewById(R.id.buttonEatCookie);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        String status = cookieTextView.getText().toString();

        switch (status) {
            case ("Yum!"): // IF COOKIE HAS BEEN EATEN
                cookieImageView.setImageResource(R.drawable.before_cookie);
                cookieTextView.setText("I'm so hungry...");
                buttonEatCookie.setText("Eat Cookie");
                break;

            case ("I'm so hungry..."): // IF COOKIE HAS NOT BEEN EATEN
                cookieImageView.setImageResource(R.drawable.after_cookie);
                cookieTextView.setText("Yum!");
                buttonEatCookie.setText("Reset");
                break;
        }
    }
}


