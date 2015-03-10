//File Name: Calculator.Java
//Author: Lisa Harriott
//Date Modified: 12/13/2014
//Purpose:   Provides the calculations to go along with the calculator_content.xml file

package com.example.crochetguideforbeginers;

import android.app.Activity;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends Activity {
	int multiple;
	int increment;
	
	@Override
	public void onCreate (Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.calculator_content);
			final EditText multiplier = (EditText) findViewById(R.id.fldMultiplier);
			final EditText incrementor = (EditText) findViewById(R.id.fldIncrementor);
			final TextView results = (TextView) findViewById(R.id.txtResult);
			
			Button calculate = (Button) findViewById(R.id.btnCalculate);
			//calculate.getBackground().setColorFilter(new LightingColorFilter(0xFFFFF0, 0xFFFFF0));
			
			calculate.setOnClickListener (new OnClickListener() {
				@Override
				public void onClick(View v){					
					String strMultiple = multiplier.getText().toString();
					String strIncrement = incrementor.getText().toString();
					String resultsText = "";					
					if(strMultiple.matches("")){					//empty test for multiple
						Toast.makeText(Calculator.this, "You must enter a multiple.", Toast.LENGTH_LONG).show();
					} else { 						
						if(strIncrement.matches("")){				//empty test for increment
							//converts multiplier to an integer format
							multiple = Integer.parseInt(strMultiple);
							increment = 0;									
							if(multiple<=0){						//multiple cannot be zero
								Toast.makeText(Calculator.this, "Multiple must be greater than zero", Toast.LENGTH_LONG).show();
							}else {
								if(increment<0){					//increment cannot be less than zero
									Toast.makeText(Calculator.this, "Increment must not be less than zero", Toast.LENGTH_LONG).show();
								}else{
									for(int inc=1;inc<16;inc++){ 	//calculates beginning chains
										resultsText = resultsText + (multiple * inc + increment) + " beginning chains for " + inc + " repetitions\n";
									};				
								}
							}
							} else {
								//converts multiplier to an integer format
								multiple = Integer.parseInt(strMultiple);
								//converts incrementor to an integer format
								increment = Integer.parseInt(strIncrement);
								if(multiple<=0){						//multiple cannot be zero
									Toast.makeText(Calculator.this, "Multiple must be greater than zero", Toast.LENGTH_LONG).show();
								}else {
									if(increment<0){					//increment cannot be less than zero
										Toast.makeText(Calculator.this, "Increment must not be less than zero", Toast.LENGTH_LONG).show();
									}else{
										for(int inc=1;inc<16;inc++){ 	//calculates beginning chains
											resultsText = resultsText + (multiple * inc + increment) + " beginning chains for " + inc + " repetitions\n";
									};				
								}
							}
						}
					}
					results.setText(resultsText); 					//puts the resulting text in the result textView 
				}
			});
	}
}
