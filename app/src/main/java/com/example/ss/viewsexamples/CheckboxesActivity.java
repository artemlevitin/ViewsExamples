package com.example.ss.viewsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckboxesActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkboxes);

        final CheckBox checkbox = (CheckBox) findViewById(R.id.checkbox);
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox.isChecked()) {
                    checkbox.setText("I'm checked");
                } else {
                    checkbox.setText("I'm not checked");
                }
            }
        });

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox.isShown()) {
                    checkbox.setVisibility(View.INVISIBLE);
                    button.setText("Unhide CheckBox");
                } else {
                    checkbox.setVisibility(View.VISIBLE);
                    button.setText("Hide CheckBox");
                }
            }
        });
    }
}
