package uk.co.appoly.sceneform_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cotton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotton);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}