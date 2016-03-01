package com.olegusmanov.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.activity_main_button_activity2);
		button.setOnClickListener(this);

		Button button1 = (Button) findViewById(R.id.activity_main_button_activity3);
		button1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
			case R.id.activity_main_button_activity2:
				Intent intent = new Intent(MainActivity.this, Activity2.class);
				startActivity(intent);
				break;
			case R.id.activity_main_button_activity3:
				Intent intent1 = new Intent(MainActivity.this, Activity3.class);
				startActivity(intent1);
				break;
		}
	}
}
