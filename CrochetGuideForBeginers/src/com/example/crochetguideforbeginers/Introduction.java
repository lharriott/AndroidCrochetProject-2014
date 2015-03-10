//File Name: Introduction.Java
//Author: Lisa Harriott
//Date Modified: 12/13/2014
//Purpose: Links the exp list adapter to the view on the introdiction_content.xml file
package com.example.crochetguideforbeginers;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class Introduction extends Activity{
	@Override
	public void onCreate (Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.introduction_content);
			ExpandableListView expList=(ExpandableListView)findViewById(R.id.expandableListView1);
			expList.setAdapter((ExpandableListAdapter)new expListAdapter(this));
	}

}
