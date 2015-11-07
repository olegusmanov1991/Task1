package com.olegusmanov.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class Activity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{


	private ScaleAdapter mScaleAdapter;

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


		mScaleAdapter = new ScaleAdapter(getLayoutInflater());

		Spinner spinner = (Spinner) findViewById(R.id.activity_3_spinner);
		spinner.setAdapter(mScaleAdapter);

		spinner.setOnItemSelectedListener(this);

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
	{
		ImageView imageView = (ImageView) findViewById(R.id.activity_3_image_view_lexus);
		imageView.setScaleType(mScaleAdapter.getItem(position));
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent)
	{

	}
}
