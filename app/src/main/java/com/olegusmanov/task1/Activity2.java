package com.olegusmanov.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity2 extends AppCompatActivity
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
		setContentView(R.layout.activity_2);

		final ImageView imageView = (ImageView) findViewById(R.id.activity_2_image_view_lexus);
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.activity_2_radioGroup);


		Button button = (Button) findViewById(R.id.activity_2_button_main);
		button.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(Activity2.this, MainActivity.class);
				startActivity(intent);
			}
		});

		Button button1 = (Button) findViewById(R.id.activity_2_button_spinner);
		button1.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				Intent inent = new Intent(Activity2.this, Activity3.class);
				startActivity(inent);
			}
		});

		for (int i = 0; i < mScales.length; i++)
		{
			RadioButton rb = new RadioButton(this);
			rb.setText(mScales[i].toString());
			rb.setId(i);
			radioGroup.addView(rb);
		}


		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
		{
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId)
			{
				switch (checkedId)
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
		});


	}
}
