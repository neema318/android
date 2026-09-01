package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.registrationform.R;


public class MainActivity extends AppCompatActivity {

    EditText name,password;

    RadioGroup gender;

    Spinner department;

    CheckBox terms;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        gender = findViewById(R.id.gender);
        department = findViewById(R.id.department);
        terms = findViewById(R.id.terms);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty()){
                    name.setError("Enter your name");
                    return;
            }

                if (password.getText().toString().isEmpty()) {
                    password.setError("Enter password");
                    return;
                }
                if (password.length() < 8) {
                    password.setError("Password must contain 8 characters");
                    return;
                }

                if (gender.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this, "Select gender", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (department.getSelectedItemPosition() == 0){
                    Toast.makeText(MainActivity.this,"Please select department",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!terms.isChecked()) {
                    Toast.makeText(MainActivity.this, "Accept terms and conditions", Toast.LENGTH_SHORT).show();
                    return;
                }
                    Toast.makeText(MainActivity.this,"Registration Successful",Toast.LENGTH_SHORT).show();
                        }

                });

                }
        }