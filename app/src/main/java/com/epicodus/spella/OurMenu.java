package com.epicodus.spella;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class OurMenu extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.imageButton) ImageButton mImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_menu);


        ButterKnife.bind(this);

        mImageButton.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(OurMenu.this, GrandChild.class);
        startActivity(intent);
    }


}
