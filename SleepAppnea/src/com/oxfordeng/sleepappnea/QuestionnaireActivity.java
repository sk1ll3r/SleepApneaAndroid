package com.oxfordeng.sleepappnea;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class QuestionnaireActivity extends Activity {
	public static final String PREFS_NAME = "QuestionnaireResults";
	RadioGroup radioOne, radioTwo, radioThree, radioFour, radioFive, radioSix,
			radioSeven, radioEight;
	Button btnSubmit;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_questionnaire);

		radioOne = (RadioGroup) findViewById(R.id.radioSnore);
		radioTwo = (RadioGroup) findViewById(R.id.radioTired);
		radioThree = (RadioGroup) findViewById(R.id.radioObserved);
		radioFour = (RadioGroup) findViewById(R.id.radioPressure);
		radioFive = (RadioGroup) findViewById(R.id.radioBMI);
		radioSix = (RadioGroup) findViewById(R.id.radioAge);
		radioSeven = (RadioGroup) findViewById(R.id.radioNeck);
		radioEight = (RadioGroup) findViewById(R.id.radioGender);

		btnSubmit = (Button) findViewById(R.id.btnSubmit);
		btnSubmit.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				submit();
			}
		});
	}

	protected void submit() {
		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
		SharedPreferences.Editor editor = settings.edit();
		editor.putInt("stopbang", count());
		editor.commit();
		finish();
	}

	private int count() {
		int result = 0;
		if (radioOne.getCheckedRadioButtonId() == R.id.radioY1)
			result++;
		if (radioTwo.getCheckedRadioButtonId() == R.id.radioY2)
			result++;
		if (radioThree.getCheckedRadioButtonId() == R.id.radioY3)
			result++;
		if (radioFour.getCheckedRadioButtonId() == R.id.radioY4)
			result++;
		if (radioFive.getCheckedRadioButtonId() == R.id.radioY5)
			result++;
		if (radioSix.getCheckedRadioButtonId() == R.id.radioY6)
			result++;
		if (radioSeven.getCheckedRadioButtonId() == R.id.radioY7)
			result++;
		if (radioEight.getCheckedRadioButtonId() == R.id.radioY8)
			result++;

		return result;
	}
}
