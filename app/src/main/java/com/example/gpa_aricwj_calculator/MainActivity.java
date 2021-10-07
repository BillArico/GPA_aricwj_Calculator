package com.example.gpa_aricwj_calculator;

import static android.widget.TextView.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private EditText mNumEnterCourseGrade1;
    private EditText mNumEnterCourseGrade2;
    private EditText mNumEnterCourseGrade3;
    private EditText mNumEnterCourseGrade4;
    private EditText mNumEnterCourseGrade5;
    private TextView textView;
    private Button computeGPA;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        computeGPA=findViewById(R.id.computeGPA);
        textView=findViewById(R.id.textView);
        //EditText=findViewById(R.id.mNumEnterCourseGrade1);

        computeGPA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // click handling code


                String numEnterCourseGrade1Str = mNumEnterCourseGrade1.getText().toString();
                int numEnterCourseGrade1 = Integer.parseInt(numEnterCourseGrade1Str);
                String numEnterCourseGrade2Str = mNumEnterCourseGrade2.getText().toString();
                int numEnterCourseGrade2 = Integer.parseInt(numEnterCourseGrade2Str);
                String numEnterCourseGrade3Str = mNumEnterCourseGrade3.getText().toString();
                int numEnterCourseGrade3 = Integer.parseInt(numEnterCourseGrade3Str);
                String numEnterCourseGrade4Str = mNumEnterCourseGrade4.getText().toString();
                int numEnterCourseGrade4 = Integer.parseInt(numEnterCourseGrade4Str);
                String numEnterCourseGrade5Str = mNumEnterCourseGrade5.getText().toString();
                int numEnterCourseGrade5 = Integer.parseInt(numEnterCourseGrade5Str);

                int totalCourses = 5;
                int calculate = 5 + 5;//(int) ((int) Math.ceil(Double.parseDouble(numEnterCourseGrade1Str + numEnterCourseGrade2Str + numEnterCourseGrade3Str + numEnterCourseGrade4Str + numEnterCourseGrade5Str)) / (double) totalCourses);
                computeGPA.setText("GPA" + calculate);



            }


    });
        Button computeGPA= (Button)findViewById(R.id.computeGPA);
        computeGPA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        final EditText editTextNum1 = (EditText) findViewById(R.id.enter_course_grade_1);
        final EditText editTextNum2 = (EditText) findViewById(R.id.enter_course_grade_2);
        final EditText editTextNum3 = (EditText) findViewById(R.id.enter_course_grade_3);
        final EditText editTextNum4 = (EditText) findViewById(R.id.enter_course_grade_4);
        final EditText editTextNum5 = (EditText) findViewById(R.id.enter_course_grade_5);
        //Button buttonAdd = (Button)findViewById(R.id.buttonAdd);

        final TextView textView = (TextView) findViewById(R.id.textView);

        mNumEnterCourseGrade1 = findViewById(R.id.enter_course_grade_1);
        mNumEnterCourseGrade2 = findViewById(R.id.enter_course_grade_2);
        mNumEnterCourseGrade3 = findViewById(R.id.enter_course_grade_3);
        mNumEnterCourseGrade4 = findViewById(R.id.enter_course_grade_4);
        mNumEnterCourseGrade5 = findViewById(R.id.enter_course_grade_5);
        //mNumCalculateTextView = findViewById(R.id.calculate_text_view);
    }








    public void onClick(View view) {
        String numEnterCourseGrade1Str = mNumEnterCourseGrade1.getText().toString();
        int numEnterCourseGrade1 = Integer.parseInt(numEnterCourseGrade1Str);
        String numEnterCourseGrade2Str = mNumEnterCourseGrade2.getText().toString();
        int numEnterCourseGrade2 = Integer.parseInt(numEnterCourseGrade2Str);
        String numEnterCourseGrade3Str = mNumEnterCourseGrade3.getText().toString();
        int numEnterCourseGrade3 = Integer.parseInt(numEnterCourseGrade3Str);
        String numEnterCourseGrade4Str = mNumEnterCourseGrade4.getText().toString();
        int numEnterCourseGrade4 = Integer.parseInt(numEnterCourseGrade4Str);
        String numEnterCourseGrade5Str = mNumEnterCourseGrade5.getText().toString();
        int numEnterCourseGrade5 = Integer.parseInt(numEnterCourseGrade5Str);

        int totalCourses = 5;
        int calculate = (int) ((int) Math.ceil(Double.parseDouble(numEnterCourseGrade1Str + numEnterCourseGrade2Str + numEnterCourseGrade3Str + numEnterCourseGrade4Str + numEnterCourseGrade5Str)) / (double) totalCourses);
        textView.setText(calculate);
    }





    public void computeGPA(View view) {
    }
}


