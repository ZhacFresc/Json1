package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    TextView name, salary;

    String JSON_STRING = "{\"employee\":{\"name\":\"Просто Жан\",\"salary\":(0_0))}}";

    String Bname, Bsalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.textView2);
        salary = findViewById(R.id.textView);

        try {
            JSONObject obj = new JSONObject(JSON_STRING);

            JSONObject employee = obj.getJSONObject("employee");

            Bname = employee.getString("name");
            Bsalary = employee.getString("salary");

            name.setText("Имя:" +Bname);
            salary.setText("Зарплата:" +Bsalary);
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
    }
}