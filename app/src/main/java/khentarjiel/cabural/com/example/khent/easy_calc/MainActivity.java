package khentarjiel.cabural.com.example.khent.easy_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText first_number, second_number;
    Button addition, subtraction, multiplication, division, reset, exit;


    Operations results = new Operations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.txtView_Results);

        first_number = (EditText)findViewById(R.id.first_number);
        second_number = (EditText)findViewById(R.id.second_number);

        addition = (Button)findViewById(R.id.addition_btn);
        subtraction = (Button)findViewById(R.id.subtraction_btn);
        multiplication = (Button)findViewById(R.id.multiplication_btn);
        division = (Button)findViewById(R.id.Division_btn);
        reset = (Button)findViewById(R.id.clear_btn);
        exit = (Button)findViewById(R.id.Exit_btn);






        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                {




                    Numbers input = new Numbers(Float.parseFloat(first_number.getText().toString()), Float.parseFloat(second_number.getText().toString()));
                    result.setText(String.valueOf(results.add(input)));
                }
                }

        });


        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Numbers input = new Numbers(Float.parseFloat(first_number.getText().toString()),Float.parseFloat(second_number.getText().toString()));


                result.setText(String.valueOf(results.sub(input) ));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Numbers input = new Numbers(Float.parseFloat(first_number.getText().toString()),Float.parseFloat(second_number.getText().toString()));

                result.setText(String.valueOf(results.mult(input)));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Numbers input = new Numbers(Float.parseFloat(first_number.getText().toString()),Float.parseFloat(second_number.getText().toString()));
                result.setText(String.valueOf(results.div(input)));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_number.setText(null);
                second_number.setText(null);
                result.setText(null);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });
    }
}
