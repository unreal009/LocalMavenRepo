package com.andev.localmavenrepo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.andev.locallibrary.HelloWord;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView wordTV = (TextView)findViewById(R.id.word);
		wordTV.setText(HelloWord.WELCOME);
	}
}
