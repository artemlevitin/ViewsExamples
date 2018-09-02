package com.example.ss.viewsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioGroupActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        final TextView tv = (TextView) findViewById(R.id.textView);

        final View.OnClickListener radioListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb = (RadioButton) v;
                tv.setText(rb.getText() + " chosen");
            }
        };

        final RadioButton choice1 = (RadioButton) findViewById(R.id.choice1);
        choice1.setOnClickListener(radioListener);

        final RadioButton choice2 = (RadioButton) findViewById(R.id.choice2);
        choice2.setOnClickListener(radioListener);

        final RadioButton choice3 = (RadioButton) findViewById(R.id.choice3);
        choice3.setOnClickListener(radioListener);
    }
}
