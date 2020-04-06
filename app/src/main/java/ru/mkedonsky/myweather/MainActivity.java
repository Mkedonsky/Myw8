package ru.mkedonsky.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
        private TextInputEditText editText;
//        private Button startSecondActivityBtn;
        private FloatingActionButton fab;
        static final String DATA_KEY = "data_key";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initViews();
//            setOnStartSecondActivityBtnClick();
            showSnackBar();

        }

        private void initViews() {
            editText = findViewById(R.id.textInputEditText);
//            startSecondActivityBtn = findViewById(R.id.button);
            fab = findViewById(R.id.fab);
        }

//        private void setOnStartSecondActivityBtnClick() {
//            startSecondActivityBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                    intent.putExtra(DATA_KEY, editText.getText().toString());
//                    startActivity(intent);
//                }
//            });
//        }
        private void showSnackBar(){
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Выбрать Город?", Snackbar.LENGTH_LONG)
                            .setAction("Уверен", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                    intent.putExtra(DATA_KEY, editText.getText().toString());
                                    startActivity(intent);

                                }
                            }).show();
                }
            });

        }
    }
