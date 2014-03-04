package com.oxfordeng.sleepappnea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import android.content.Context;

public class QuestionnaireData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String spinner, editText1, editText2, date;

	public QuestionnaireData() {

	}

	public String getSpinner() {
		return spinner;
	}

	public void setSpinner(String spinner) {
		this.spinner = spinner;
	}

	public String getEditText1() {
		return editText1;
	}

	public void setEditText1(String editText1) {
		this.editText1 = editText1;
	}

	public String getEditText2() {
		return editText2;
	}

	public void setEditText2(String editText2) {
		this.editText2 = editText2;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void saveToFile(String FILENAME, Context context) throws IOException {
		FileOutputStream fos = context.openFileOutput(FILENAME,
				Context.MODE_PRIVATE);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(this);
		os.close();
	}

	/*public void loadFromFile(String FILENAME, Context context) {
		FileInputStream fis = context.openFileInput(FILENAME);
		ObjectInputStream is = new ObjectInputStream(fis);
		QuestionnaireData q = (QuestionnaireData) is.readObject();
		is.close();
		return q;
	} */
}
