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
	private Button appMagentaRedButton;
	private Button appWhiteButton;
	private Button appBlackButton;
	private Button appUglyGreenButton;
	private Button appPrettyPurpleButton;
	private Button appBubblyBlueButton;
	private Button appAppealingOrangeButton;
	private Button appLemonYellowButton;
	private Button appSeaFoamGreenButton;
	private Button appBloodRedButton;
	private Button appPastelPinkButton;
	private Button appIndigoBlueButton;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorList;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		//Gives you access to a button or any View object.
		appMagentaRedButton = (Button) findViewById(R.id.magentaRedButton);
		appWhiteButton = (Button) findViewById(R.id.whiteButton);
		appBlackButton = (Button) findViewById(R.id.blackButton);
		appUglyGreenButton = (Button) findViewById(R.id.uglyGreenButton);
		appPrettyPurpleButton = (Button) findViewById(R.id.prettyPurpleButton);
		appBubblyBlueButton = (Button) findViewById(R.id.bubblyBlueButton);
		appAppealingOrangeButton = (Button) findViewById(R.id.appealingOrangeButton);
		appLemonYellowButton = (Button) findViewById(R.id.lemonYellowButton);
		appSeaFoamGreenButton = (Button) findViewById(R.id.seaFoamGreenButton);
		appBloodRedButton = (Button) findViewById(R.id.bloodRedButton);
		appPastelPinkButton = (Button) findViewById(R.id.pastelPinkButton);
		appIndigoBlueButton = (Button) findViewById(R.id.indigoBlueButton);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		colorList = new ArrayList<Integer>();
		
		setupListeners();
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.magentaRed);
		colorList.add(R.color.white);
		colorList.add(R.color.black);
		colorList.add(R.color.uglyGreen);
		colorList.add(R.color.prettyPurple);
		colorList.add(R.color.bubblyBlue);
		colorList.add(R.color.appealingOrange);
		colorList.add(R.color.lemonYellow);
		colorList.add(R.color.seaFoamGreen);
		colorList.add(R.color.bloodRed);
		colorList.add(R.color.pastelPink);
		colorList.add(R.color.indigoBlue);
	}
	
	private void setupListeners()
	{
		appMagentaRedButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.magentaRed);
			}
		});
		
		appWhiteButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.white);
			}
		});
		
		appBlackButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.black);
			}
		});
		
		appUglyGreenButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.uglyGreen);
			}
		});
		
		appPrettyPurpleButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.prettyPurple);
			}
		});
		
		appBubblyBlueButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.bubblyBlue);
			}
		});
		
		appAppealingOrangeButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.appealingOrange);
			}
		});
		
		appLemonYellowButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.lemonYellow);
			}
		});
		
		appSeaFoamGreenButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.seaFoamGreen);
			}
		});
		
		appBloodRedButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.bloodRed);
			}
		});
		
		appPastelPinkButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.pastelPink);
			}
		});
		
		appIndigoBlueButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				appLayout.setBackgroundResource(R.color.indigoBlue);
			}
		});
	}
}
