package com.example.dell.chongyou;

import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        List<String> list = new ArrayList<String>();
        list.add("男");
        list.add("女");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> paret, View view, int i, long id) {
                TextView text4 = (TextView) findViewById(R.id.text4);
                ArrayAdapter<String> adapter = (ArrayAdapter<String>) paret.getAdapter();
                text4.setText(adapter.getItem(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Button button2=(Button)findViewById(R.id.text5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("data_return","hello");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}