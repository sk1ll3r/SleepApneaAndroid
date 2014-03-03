package com.oxfordeng.sleepappnea;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btnQuestionnaire, btnAnalyse, btnResults;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnQuestionnaire = (Button) findViewById(R.id.btn_questionnaire);
		btnAnalyse = (Button) findViewById(R.id.btn_analyse);
		btnResults = (Button) findViewById(R.id.btn_results);

		btnQuestionnaire.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startQuestionnaireActivity();
			}
		});
		
		btnAnalyse.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startAnalyseActivity();
			}
		});
		
		btnResults.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startResultsActivity();
			}
		});
	}

	protected void startResultsActivity() {
		// TODO Auto-generated method stub
		
	}

	protected void startAnalyseActivity() {
		// TODO Auto-generated method stub
		
	}

	protected void startQuestionnaireActivity() {
		Intent intent = new Intent(this, QuestionnaireActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
