package com.oxfordeng.sleepappnea;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.TextView;

public class ResultsActivity extends Activity {
	public static final String PREFS_NAME = "QuestionnaireResults";
	private TextView textViewResults;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
		int stopBang = settings.getInt("stopbang", 0);
		
        textViewResults = (TextView) findViewById(R.id.textViewResults);
        textViewResults.setText("Stop Bang: " + stopBang);
    }
}
