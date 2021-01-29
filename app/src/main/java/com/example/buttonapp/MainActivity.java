package com.example.buttonapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    /**
     *                  Variables
     * default access modifier = Default
     * Declare - [Access Modifier] [Type] [Name];
     * Example - private String address;
     * Example - int age;
     * ---------------------------------------------------------------
     * Initialize - Create a new instance of the DECLARED type
     * Example - private String address = "123 Seasame Street";
     * Example - int age = 55;
     * ----------------------------------------------------------------
     * Primitive Types - int, float, long, short, double, byte, char, boolean
     * Other Types - String, Integer, Long, etc
     * You can also create your own custom types
     */

    /**
     * METHODS
     * <p>
     * PARAMS format - [Type] [name]
     * Method format - [Access Modifier] [Type] [Name(PARAMS)]
     * Example - this method takes no params and returns a Type String
     * public String getName() { return ""; }
     * <p>
     * Example - this method takes 1 param and returns a Void(which means it returns nothing)
     * public void saveName(String name) {  }
     * <p>
     * Example - this method takes 2 params and returns a int
     * public int add(int num1, int num2) { return num1 + num2;  }
     */

    /**
     *          STEPS TO REFERENCING XML VIEWS IN LAYOUT
     *  Declare the view: private MaterialTextView tvDisplay;
     *  Initialize the view: tvDisplay = findViewById(R.id.tv_display);
     *  Use the view - tvDisplay.setText("Hello World!")
     */

    private MaterialTextView tvDisplay;
    private MaterialButton btnClick;
    // TODO: 1/29/2021 Variable to keep track of the count

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.tv_display);

        btnClick = findViewById(R.id.btn_click);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 1/29/2021 update the count and display in view
                tvDisplay.setText("Yaba daba doooo");
            }
        });
    }

}