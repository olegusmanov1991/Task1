package com.olegusmanov.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity2 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener
{


	@Override

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);


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

		for (ScaleType scaleType : ScaleType.values())
		{
			RadioButton rb = new RadioButton(this);
			rb.setText(scaleType.toString());
			rb.setTag(scaleType);
			radioGroup.addView(rb);
		}

		radioGroup.setOnCheckedChangeListener(this);


	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId)
	{
		RadioButton buttonchecked = (RadioButton) group.findViewById(checkedId);
		ImageView imageView = (ImageView) findViewById(R.id.activity_2_image_view_lexus);
		imageView.setScaleType((ScaleType) buttonchecked.getTag());
	}
}
