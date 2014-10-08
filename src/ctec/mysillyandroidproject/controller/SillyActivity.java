package ctec.mysillyandroidproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends Activity
{
	private Button appFirstButton;
	private Button appSarcasmButton;
	private TextView appSillyTextView;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorList;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		//Gives you access to a button or any View object.
		appFirstButton = (Button) findViewById(R.id.firstButton);
		appSarcasmButton = (Button) findViewById(R.id.sarcasmButton);
		appSillyTextView = (TextView) findViewById(R.id.sillyTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		colorList = new ArrayList<Integer>();
		
		setupListeners();
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.magentaRed);
	}
	
	private void setupListeners()
	{
		appFirstButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.magentaRed);
			}
		});
		
		appSarcasmButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.white);
			}
		});
	}
}
