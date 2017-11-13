package com.example.lint.checks.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String string = "Let's say it: lint";
		TextView view = findViewById(R.id.text);
		view.setText(string);
	}
}
