package edu.cs.birzeit.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtData = findViewById(R.id.edtData);
    }

    public void btnSend_onClick(View view) {
        Intent intent = new Intent(packageContext: this, MainActivity2.class);
        String data = edtData.getText().toString();
        intent.putExtra(name:"Data",data);

        startActivity(intent);



    }
}


