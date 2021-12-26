package com.example.newcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Spinner spinner3,spinner4,spinner5,spinner6;
    EditText et_shuru1,et_shuchu1,et_shuru2,et_shuchu2;
    Button btn_CE1,btn_js1,btn_CE2,btn_js2;
    String  temp=null;
    int k1,k2;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main3,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.change5:
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.change6:
                Intent intent2 = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent2);
                break;
            case R.id.help:
                Toast.makeText(this,"This is help",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn_CE1=findViewById(R.id.btn_CE1);
        btn_js1=findViewById( R.id.btn_js1);
        btn_CE2=findViewById(R.id.btn_CE2);
        btn_js2=findViewById( R.id.btn_js2);


        btn_CE1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                et_shuru1.setText("");
                et_shuchu1.setText("");
            }
        });
        btn_CE2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                et_shuru2.setText("");
                et_shuchu2.setText("");
            }
        });

        et_shuru1=findViewById(R.id.et_shuru1);
        et_shuchu1=findViewById(R.id.et_shuchu1);
        spinner3=(Spinner)findViewById(R.id.spinner3);
        spinner4=(Spinner)findViewById(R.id.spinner4);

        et_shuru2=findViewById(R.id.et_shuru2);
        et_shuchu2=findViewById(R.id.et_shuchu2);
        spinner5=(Spinner)findViewById(R.id.spinner5);
        spinner6=(Spinner)findViewById(R.id.spinner6);


        String[] mltems1 = getResources().getStringArray(R.array.length);
        String[] mltems2 = getResources().getStringArray(R.array.volume);

        ArrayAdapter<String> adapter1= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mltems1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter2= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mltems2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adapter1);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                switch (pos){
                    case 0: k1=0;break;
                    case 1: k1=10;break;
                    case 2: k1=100;break;
                    case 3: k1=1000;break;
                    case 4: k1=10000;break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner4.setAdapter(adapter1);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,final int pos, long id) {
                switch (pos){
                    case 0:btn_js1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru1.getText().toString();
                            if(k1 == 0){
                                double num = Double.parseDouble(temp);
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10){
                                double num = Double.parseDouble(temp)*10;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 100){
                                double num = Double.parseDouble(temp)*100;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 1000){
                                double num = Double.parseDouble(temp)*1000;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10000){
                                double num = Double.parseDouble(temp)*1000000;
                                et_shuchu1.setText(String.valueOf(num));
                            }
                        }
                    });break;
                    case 1:btn_js1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru1.getText().toString();
                            if(k1 == 0){
                                double num = Double.parseDouble(temp)/10;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10){
                                double num = Double.parseDouble(temp);
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 100){
                                double num = Double.parseDouble(temp)*10;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 1000){
                                double num = Double.parseDouble(temp)*100;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10000){
                                double num = Double.parseDouble(temp)*100000;
                                et_shuchu1.setText(String.valueOf(num));
                            }
                        }
                    });break;
                    case 2:btn_js1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru1.getText().toString();
                            if(k1 == 0){
                                double num = Double.parseDouble(temp)/100;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10){
                                double num = Double.parseDouble(temp)/10;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 100){
                                double num = Double.parseDouble(temp);
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 1000){
                                double num = Double.parseDouble(temp)*10;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10000){
                                double num = Double.parseDouble(temp)*10000;
                                et_shuchu1.setText(String.valueOf(num));
                            }
                        }
                    });break;
                    case 3:btn_js1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru1.getText().toString();
                            if(k1 == 0){
                                double num = Double.parseDouble(temp)/1000;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10){
                                double num = Double.parseDouble(temp)/100;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 100){
                                double num = Double.parseDouble(temp)/10;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 1000){
                                double num = Double.parseDouble(temp);
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10000){
                                double num = Double.parseDouble(temp)*1000;
                                et_shuchu1.setText(String.valueOf(num));
                            }
                        }
                    });break;
                    case 4:btn_js1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru1.getText().toString();
                            if(k1 == 0){
                                double num = Double.parseDouble(temp)/1000000;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10){
                                double num = Double.parseDouble(temp)/100000;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 100){
                                double num = Double.parseDouble(temp)/10000;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 1000){
                                double num = Double.parseDouble(temp)/1000;
                                et_shuchu1.setText(String.valueOf(num));
                            }else if(k1 == 10000){
                                double num = Double.parseDouble(temp);
                                et_shuchu1.setText(String.valueOf(num));
                            }
                        }
                    });break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner5.setAdapter(adapter2);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                switch (pos){
                    case 0: k2=0;break;
                    case 1: k2=10;break;
                    case 2: k2=100;break;
                    case 3: k2=1000;break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner6.setAdapter(adapter2);
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,final int pos, long id) {
                switch (pos){
                    case 0:btn_js2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru2.getText().toString();
                            if(k2 == 0){
                                double num = Double.parseDouble(temp);
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 10){
                                double num = Double.parseDouble(temp)*1000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 100){
                                double num = Double.parseDouble(temp)*1000000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 1000){
                                double num = Double.parseDouble(temp)*1000000000;
                                et_shuchu2.setText(String.valueOf(num));
                            }
                        }
                    });break;
                    case 1:btn_js2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru2.getText().toString();
                            if(k2 == 0){
                                double num = Double.parseDouble(temp)/1000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 10){
                                double num = Double.parseDouble(temp);
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 100){
                                double num = Double.parseDouble(temp)*1000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 1000){
                                double num = Double.parseDouble(temp)*1000000;
                                et_shuchu2.setText(String.valueOf(num));
                            }
                        }
                    });break;
                    case 2:btn_js2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru2.getText().toString();
                            if(k2 == 0){
                                double num = Double.parseDouble(temp)/1000000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 10){
                                double num = Double.parseDouble(temp)/1000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 100){
                                double num = Double.parseDouble(temp);
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 1000){
                                double num = Double.parseDouble(temp)*1000;
                                et_shuchu2.setText(String.valueOf(num));
                            }
                        }
                    });break;
                    case 3:btn_js2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            temp = et_shuru2.getText().toString();
                            if(k2 == 0){
                                double num = Double.parseDouble(temp)/1000000000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 10){
                                double num = Double.parseDouble(temp)/1000000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 100){
                                double num = Double.parseDouble(temp)/1000;
                                et_shuchu2.setText(String.valueOf(num));
                            }else if(k2 == 1000){
                                double num = Double.parseDouble(temp);
                                et_shuchu2.setText(String.valueOf(num));
                            }
                        }
                    });break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}