package com.example.ss.viewsexamples;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarActivity extends Activity {

    ProgressBar myProgressBar, myProgressBar2;
    TextView textView;
    int myProgress = 0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        textView = (TextView)findViewById(R.id.textView);
        myProgressBar = (ProgressBar) findViewById(R.id.progressBarHorizontal);
        myProgressBar2 = (ProgressBar) findViewById(R.id.progressBar1);

        new Thread(myThread).start();
    }

    private Runnable myThread = new Runnable() {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (myProgress < 100) {
                try {
                    myHandle.sendMessage(myHandle.obtainMessage());
                    Thread.sleep(100);
                }
                catch (Throwable t) {
                }
            }
        }

        Handler myHandle = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                // TODO Auto-generated method stub
                myProgress++;
                myProgressBar.setProgress(myProgress);
                textView.setText(String.valueOf(myProgress)+"%");
                if(myProgress > 99) {
                    myProgressBar2.setVisibility(View.GONE);
                }
            }
        };
    };
}
