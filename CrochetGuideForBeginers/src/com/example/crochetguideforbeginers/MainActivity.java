//File Name: MainActivity.Java
//Author: Lisa Harriott
//Date Modified: 12/13/2014
//Purpose: Set up the tabs displayed on all pages of the application.

package com.example.crochetguideforbeginers;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
	private TabHost mTabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		android.content.res.Resources res = getResources();
		mTabHost= getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		
		//Intro Tab
		
		intent = new Intent(this, Introduction.class);
		spec = mTabHost.newTabSpec("Q and A")
				.setIndicator("Q and A")
				.setContent(intent);
		
		mTabHost.addTab(spec);
		
		//Resc Tab
		intent = new Intent(this, Resources.class);
		spec = mTabHost.newTabSpec("Resources")
				.setIndicator("Resources")
				.setContent(intent);
		
		mTabHost.addTab(spec);
		
		//Calculator
		intent = new Intent(this, Calculator.class);
		spec = mTabHost.newTabSpec("Calculator")
				.setIndicator("Calculator")
				.setContent(intent);
		
		mTabHost.addTab(spec);
	}
}

