package com.android.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	System.out.println("Entered 1");
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(R.id.skipButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	EditText editText = (EditText) findViewById(R.id.editText1);
            	System.out.println(editText.getText().toString());
            }
        });
    }
}