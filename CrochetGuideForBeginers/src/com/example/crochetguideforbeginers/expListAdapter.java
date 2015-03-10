//File Name: expListAdapter.Java
//Author: Lisa Harriott
//Date Modified: 12/13/2014
//Purpose: This is the adapter that sets the content for the Expandable List 
//		View in the Introduction.Java file and viewed on the introduction_content.xml file

package com.example.crochetguideforbeginers;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

public class expListAdapter extends BaseExpandableListAdapter implements
		ListAdapter {
	private Context context;
	//array for Parent items
	String[] parentList = {"What does this app do?", "What should I do first?", "Learn the basic stitches"
			, "Practice?", "Choosing a pattern", "The importance of a gauge", "What is the \"Calculator\" for?"
			, "In need of ideas?"  }; 
	//array for child items
	int[][] childList = {{R.string.txtPurpose}, {R.string.txtFirst}, {R.string.txtBasic}
			,{R.string.txtPractice}, {R.string.txtPattern}, {R.string.txtGauge}, {R.string.txtCalculator}
			,{R.string.txtIdeas}
	};  

	public expListAdapter(Context context) {
		// TODO Auto-generated constructor stub
		this.context=context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemViewType(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getChild(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean arg2, View arg3,
			ViewGroup arg4) {
		// sets the elements of childList in a textview to be displayed
		TextView child = new TextView(context);
		child.setText(childList[groupPosition][childPosition]);
		child.setPadding(40, 10, 10, 10);
		child.setTextSize(18);
		child.setTextColor(Color.parseColor("#F08080"));
		return child;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// returns the number of children for a specified group
		return childList[groupPosition].length;
	}

	@Override
	public Object getGroup(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getGroupCount() {
		// returns the number of parnt elements
		return parentList.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View arg2, ViewGroup arg3) {
		// sets the elements of parent in textviews to be viewed
		TextView parent = new TextView(context);
		parent.setText(parentList[groupPosition]);
		parent.setPadding(65, 20, 5, 20);
		parent.setTextSize(22);
		parent.setTextColor(Color.parseColor("#2E78E6"));
		return parent;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		//children are not selectable
		return false;
	}

	@Override
	public boolean isEnabled(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
