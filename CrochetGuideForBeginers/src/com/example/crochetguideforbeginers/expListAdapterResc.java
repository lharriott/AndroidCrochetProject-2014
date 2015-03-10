//File Name: expListAdapterResc.Java
//Author: Lisa Harriott
//Date Modified: 12/13/2014
//Purpose: adapter for the expandable list view found in Resources.Java and 
//		displayed on resources_content.xml

package com.example.crochetguideforbeginers;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class expListAdapterResc extends BaseExpandableListAdapter implements
		ExpandableListAdapter {
	
	private Context context;
	ExpandableListView expList;
	//array of parent items
	String[] parentList = {"Abbreviations", "Basic skills", "Basic stitches"
			, "Advanced techniques", "Hooks and yarn", "Pattern resources"};
	//array of child items
	String[][] childList = { 
			//abbrev
			{"To save space, patterns will abbreviate common phrases, including: \n" +
			"ch : Chain \nsc : Single crochet \ndc : Double crochet " +
			"\nhdc: Half double crochet \ntr : triple/treble crochet \nst(s) : stitch(es)" +
			"\nsl st : slip stitch \n[] : repeat instructions within brackets " +
			"\n() : repeat instructions within parenthesis " +
			"\nyo : yarn over", "The Complete List"}, 
			//basic skills
			{"How to hold a crochet hook", "Casting on","How to yarn over","Counting stitches", "Turning at the end of a row" }, 
			//basic stitches
			{"Please note: Since everyone does not learn the same way, the two starter videos reiterate the text and picture tutorials in this section.",
				"Chain stitch", "Single crochet", "Double crochet", "Half double crochet",
				"Triple/treble crochet",  "Slip stitch", "Starter video 1", "Starter video 2"},
			//adv tech
			{"Magic ring", "End and incorporate a new skien of yarn", "Add a new color", "An even border on an uneven side"},
			//hooks and yarn
			{"Hooks", "Yarn weights","Yarn materials", "Yarn questions"},
			//pattern resc
			{"Patterns can be found in more traditional ways, like pattern books or by taking classes.   However, a good way to " +
					"find free patterns is by searching online.   There are many websites that offer beautiful and simple patterns for free, such as: ", 
					"About.com", "Redheart", "Lionbrand"}
	};

	public expListAdapterResc(Context context) {
		// TODO Auto-generated constructor stub
		this.context=context;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		// sets the elements from child list as a textview 
		TextView child = new TextView(context);
		child.setText(childList[groupPosition][childPosition]);
		child.setPadding(40, 10, 10, 10);
		child.setTextSize(18);
		child.setTextColor(Color.parseColor("#F08080"));
		return child;
	}
	


	@Override
	public int getChildrenCount(int groupPosition) {
		// counts the number of children for a given group
		return childList[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getGroupCount() {
		// returns number of parent elements
		return parentList.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		// sets the elements of parentList as textviews
		TextView parentView = new TextView(context);
		parentView.setText(parentList[groupPosition]);
		parentView.setPadding(65, 20, 5, 20);
		parentView.setTextSize(22);
		parentView.setTextColor(Color.parseColor("#2E78E6"));
		return parentView;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// makes children selectable 
		return true;
	}

}

