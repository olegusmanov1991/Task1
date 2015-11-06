package com.olegusmanov.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class Activity3 extends AppCompatActivity
{

	private enum Scale
	{
		CENTER, CENTER_CORP, CENTER_INSIDE, FIT_CENTER, FIT_END, FIT_START, FIT_XY, MATRIX
	}

	private Scale[] mScales = Scale.values();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_3);

		Button button = (Button) findViewById(R.id.activity_3_button_main);
		button.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(Activity3.this, MainActivity.class);
				startActivity(intent);
			}
		});

		Button button1 = (Button) findViewById(R.id.activity_3_button_radioButton);
		button1.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(Activity3.this, Activity2.class);
				startActivity(intent);
			}
		});


		final ImageView imageView = (ImageView) findViewById(R.id.activity_3_image_view_lexus);
		ArrayAdapter<Scale> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mScales);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		Spinner spinner = (Spinner) findViewById(R.id.activity_3_spinner);
		spinner.setAdapter(adapter);

		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
		{
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
			{
				switch (position)
				{
					case 0:
						imageView.setScaleType(ImageView.ScaleType.CENTER);
						break;
					case 1:
						imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
						break;
					case 2:
						imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
						break;
					case 3:
						imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
						break;
					case 4:
						imageView.setScaleType(ImageView.ScaleType.FIT_END);
						break;
					case 5:
						imageView.setScaleType(ImageView.ScaleType.FIT_START);
						break;
					case 6:
						imageView.setScaleType(ImageView.ScaleType.FIT_XY);
						break;
					case 7:
						imageView.setScaleType(ImageView.ScaleType.MATRIX);
						break;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent)
			{

			}
		});

	}
}
