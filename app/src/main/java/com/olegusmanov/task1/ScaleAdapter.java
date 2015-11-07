package com.olegusmanov.task1;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import static android.widget.ImageView.*;

/**
 * Created by Олег on 07.11.2015.
 */
public class ScaleAdapter extends BaseAdapter
{

	Holder holder;

	public ScaleAdapter(LayoutInflater layoutInflater)
	{
		mLayoutInflater = layoutInflater;
	}

	LayoutInflater mLayoutInflater;


	@Override
	public int getCount()
	{
		return ScaleType.values().length;
	}

	@Override
	public ScaleType getItem(int position)
	{
		return ScaleType.values()[position];
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{

		if (convertView == null)
		{
			convertView = mLayoutInflater.inflate(R.layout.scale, null, false);

			holder = new Holder();
			holder.mTextView = (TextView) convertView.findViewById(R.id.scale_text_view_main);
			convertView.setTag(holder);

		}else
		{
			holder=(Holder)convertView.getTag();
		}

		holder.mTextView.setText(ScaleType.values()[position].toString());

		return convertView;
	}
}
