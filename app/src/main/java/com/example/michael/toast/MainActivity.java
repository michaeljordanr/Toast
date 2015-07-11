package com.example.michael.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notify(View view){
        Toast.makeText(this, "Aviso!", Toast.LENGTH_SHORT).show();
    }

    public void notify2(View view){
        Toast t = Toast.makeText(this, "Aviso!", Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    public void notify3(View v){
        Toast t = new Toast(this);
        t.setGravity(Gravity.CENTER, 0, 0);

        View view = getLayoutInflater().inflate(R.layout.toast, null);
        TextView textView = (TextView) view.findViewById(R.id.txt_toast);
        textView.setText("Aviso!");

        t.setView(view);
        t.show();
    }
}
