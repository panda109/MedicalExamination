package com.medical.medicalexamination;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;

public class SensorActivity extends Activity implements SensorEventListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.activity_sensor);
		getWindow().setLayout(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
	}

	@Override
	protected void onResume()
	{
		super.onResume();
	}

	@Override
	protected void onPause()
	{
		super.onPause();
	}

	@Override
	public void onSensorChanged(SensorEvent event)
	{
		
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy)
	{
		
	}

}
