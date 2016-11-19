package com.makify.makify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void goToBlankActivity(View view) {
        Intent intent = new Intent(this, BlankActivity.class);
        startActivity(intent);
    }

    public void goToImportActivity(View view) {
        Intent intent = new Intent(this, ImportActivity.class);
        startActivity(intent);
    }

    public void goToLoadActivity(View view) {
        Intent intent = new Intent(this, LoadActivity.class);
        startActivity(intent);
    }

    public void goToTemplateActivity(View view) {
        Intent intent = new Intent(this, TemplateActivity.class);
        startActivity(intent);
    }

}
