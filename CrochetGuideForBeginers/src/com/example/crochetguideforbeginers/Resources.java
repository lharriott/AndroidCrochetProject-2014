//File Name: Resources.Java
//Author: Lisa Harriott
//Date Modified: 12/13/2014
//Purpose: Connects the expandable list and it's adaptor and handles the 
//		click events for the items in the expandable list.

package com.example.crochetguideforbeginers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.TextView;

public class Resources extends Activity{
	@Override
	public void onCreate (Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.resources_content);
			ExpandableListView expListResc=(ExpandableListView)findViewById(R.id.expandableListView1);
			//connects the exp list and it's adaptor class
			expListResc.setAdapter((ExpandableListAdapter)new expListAdapterResc(this));
			//sets up a listener for child clicks
			expListResc.setOnChildClickListener(new OnChildClickListener(){

				@Override
				public boolean onChildClick(ExpandableListView parent, View v,
						int groupPosition, int childPosition, long id) {
					//switch statement checks for the parent position
					switch(groupPosition){
						case 0:						//abbrev
							if(childPosition == 1){
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.craftyarncouncil.com/crochet.html"))); 
							} else {
								break;}
							break;
						case 1:						//basic skills
							switch(childPosition){
							case 0:							//hold 
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/ss/how-to-hold-a-crochet-hook.htm")));
								break;
							case 1:							//casting
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/ss/Crochet_Slip_Knot.htm")));
								break;
							case 2:							//yarn
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dummies.com/how-to/content/how-to-yarn-over-in-crochet.html")));
								break;
							case 3:							//count
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.simplycrochetmag.co.uk/2014/07/10/how-to-count-your-stitches/")));
								break;
							case 4:							//turn
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dummies.com/how-to/content/how-to-turn-crochet-work.html")));
								break;
							}
							break;

						case 2:						//basic stitch
							switch(childPosition){
							case 1:							//chain
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/ss/Chain_Stitch.htm")));
								break;
							case 2:							//single
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/ss/Single_Crochet.htm")));
								break;
							case 3:							//double
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/ss/DoubleCrochet.htm")));
								break;
							case 4:							//half double
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/tp/half-double-crochet-stitch.htm")));
								break;
							case 5:							//triple							
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/tp/how-to-treble-crochet-free-stitch-tutorial-and-instructions.htm")));
								break;
							case 6:							//slip stitch
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/tp/how-to-slip-stitch-in-crochet.htm")));
								break;
							case 7:							//starter video 1
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eqca00LdmAc")));
								break;
							case 8:							//starter video 2
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DlTdOMTDkug")));
								break;
							}
							break;
						case 3:						//adv. tech.
							switch(childPosition){
							case 0:							//magic ring
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.craftsy.com/blog/2013/09/demystifying-the-magic-ring/")));
								break;
							case 1:							//new skien
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dummies.com/how-to/content/how-to-join-yarn-in-crochet.html")));
								break;
							case 2:							//new color
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/skillstechniques/tp/Changing_Colors_SC.htm")));
								break;
							case 3:							//even border
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5OVxqbI62-E")));
								break;
							case 4:							//even border
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/?gws_rd=ssl")));
								break;
							}
							break;					
						case 4:						//hooks and yarn
							switch(childPosition){
							case 0:
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/crochethooks/tp/Crochet-Hooks.htm")));
								break;
							case 1:					
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.craftyarncouncil.com/weight.html")));
								break;
							case 2:
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/od/learntocrochet/a/Beginner-Crochet-Yarn.htm")));
								break;
							case 3:
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.craftyarncouncil.com/top10qa.html")));
								break;		
							}
							break;
						case 5:						//pattern resc.
							switch(childPosition){
							case 1:							//about
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://crochet.about.com/")));
								break;
							case 2:							//redheart
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redheart.com/free-patterns")));
							case 3: 						//lionbrand
								startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://freecrochetpatterns.lionbrand.com/")));
							}
							break;
					}//end check parent position
					
					return false;
				}//end onChildClick
			
			});
	}

}

