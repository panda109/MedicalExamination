package com.medical.medicalexamination.controller;

import com.medical.medicalexamination.model.ImageViewTouchHandler;

import android.app.Activity;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class TestAreaController
{

	protected Activity					theActivity			= null;
	protected Handler					notifyHandler		= null;
	private TestAreaHeaderController	headerController	= null;
	private ImageViewTouchHandler		imageViewHandler	= null;
	private SparseIntArray				listResId			= null;

	public TestAreaController(Activity activity, Handler handler)
	{
		super();
		theActivity = activity;
		notifyHandler = handler;
		imageViewHandler = new ImageViewTouchHandler();
		listResId = new SparseIntArray();
	}

	@Override
	protected void finalize() throws Throwable
	{
		listResId.clear();
		listResId = null;
		headerController = null;
		imageViewHandler = null;
		super.finalize();
	}

	protected void initHeader(RelativeLayout mainLayout)
	{
		if (null != mainLayout)
		{
			headerController = new TestAreaHeaderController(mainLayout, notifyHandler);
		}
	}

	protected void close()
	{
		headerController.close();
	}

	protected void setTouchEvent(View view, final Handler handler)
	{
		imageViewHandler.setTouchEvent(view, handler);
	}

	protected void addImageViewResId(ViewGroup parent, int[] nResIds, Handler handler)
	{
		ImageView imgView = null;
		for (int i = 0; i < nResIds.length; ++i)
		{
			imgView = (ImageView) parent.findViewById(nResIds[i]);
			setTouchEvent(imgView, handler);
		}
	}
}