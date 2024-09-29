package com.example.arithduo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText fNum, sNum, operator;
    TextView res;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fNum = findViewById(R.id.Num1);
        sNum = findViewById(R.id.Num2);
        operator = findViewById(R.id.Operator);
        res = findViewById(R.id.Result);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = fNum.getText().toString();
                String s2 = sNum.getText().toString();

                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);

                switch (operator.getText().toString()) {
                    case "+":
                        res.setText(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        res.setText(String.valueOf(num1 - num2));
                        break;
                    case "*":
                        res.setText(String.valueOf(num1 * num2));
                        break;
                    case "/":
                        if (num2 != 0) {
                            res.setText(String.valueOf(num1 / num2));
                        } else {
                            res.setText("Division by zero is not allowed");
                        }
                        break;
                    case "%":
                        if (num2 != 0) {
                            res.setText(String.valueOf(num1 % num2));
                        } else {
                            res.setText("Division by zero is not allowed");
                        }
                        break;
                    default:
                        res.setText("Invalid Operator");
                        break;
                }
            }
        });
    }
}