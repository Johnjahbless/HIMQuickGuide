package com.junit.himquickguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main0Activity extends AppCompatActivity {
LinearLayout definitions;
    LinearLayout types;
    LinearLayout menus;
    LinearLayout examples;
    TextView textview;
    ImageView close;
    ImageView open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        getSupportActionBar().hide();
        definitions = (LinearLayout) findViewById(R.id.definitions);
        types = (LinearLayout) findViewById(R.id.types);
        examples = (LinearLayout) findViewById(R.id.examples);
        textview = (TextView) findViewById(R.id.textview);
        close = (ImageView) findViewById(R.id.close);
        open = (ImageView) findViewById(R.id.open);
        menus = (LinearLayout) findViewById(R.id.menus);
    }
    public void close (View view) {
        menus.setVisibility(View.GONE);
        close.setVisibility(View.GONE);
        open.setVisibility(View.VISIBLE);
    }
    public void open (View view) {
        menus.setVisibility(View.VISIBLE);
        close.setVisibility(View.VISIBLE);
        open.setVisibility(View.GONE);
    }
    public void definitions (View view) {
        definitions.setVisibility(View.VISIBLE);
        types.setVisibility(View.GONE);
        examples.setVisibility(View.GONE);
        textview.setText("Definitions");
    }
    public void types (View view) {
        definitions.setVisibility(View.GONE);
        types.setVisibility(View.VISIBLE);
        examples.setVisibility(View.GONE);
        textview.setText("Types");
    }
    public void examples (View view) {
        definitions.setVisibility(View.GONE);
        types.setVisibility(View.GONE);
        examples.setVisibility(View.VISIBLE);
        textview.setText("Examples");
    }

}
