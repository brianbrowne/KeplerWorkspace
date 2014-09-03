package com.example.ca1acronymtester;
/*package com.example.ca1anagramtester;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class CAX1 extends ActionBarActivity {
	
	EditText EditTextTestCAX1;			TextView TextViewTitleAnswerCAX1;			TextView textViewCAX1;
	String useranswerCAX1;
	
	EditText EditTextCAX1Answer1;		EditText EditTextCAX1Answer2;		EditText EditTextCAX1Answer3;
	EditText EditTextCAX1Answer4;		EditText EditTextCAX1Answer5;		EditText EditTextCAX1Answer6;
	EditText EditTextCAX1Answer7;		EditText EditTextCAX1Answer8;		EditText EditTextCAX1Answer9;
	EditText EditTextCAX1Answer10;		EditText EditTextCAX1Answer11;		EditText EditTextCAX1Answer12;
	EditText EditTextCAX1Answer13;		EditText EditTextCAX1Answer14;		EditText EditTextCAX1Answer15;		EditText EditTextCAX1Answer16;
    
	
	TextView CAX1Answer1Letter1;		TextView CAX1Answer1Letter2;		TextView CAX1Answer1Letter3;
	TextView CAX1Answer1Letter4;		TextView CAX1Answer1Letter5;		TextView CAX1Answer1Letter6;
	TextView CAX1Answer1Letter7;		TextView CAX1Answer1Letter8;		TextView CAX1Answer1Letter9;
	TextView CAX1Answer1Letter10;		TextView CAX1Answer1Letter11;		TextView CAX1Answer1Letter12;
	TextView CAX1Answer1Letter13;		TextView CAX1Answer1Letter14;		TextView CAX1Answer1Letter15;		TextView CAX1Answer1Letter16;
    
	
	TextView textViewAnswer1CAX1;		TextView textViewAnswer2CAX1;		TextView textViewAnswer3CAX1;		TextView textViewAnswer4CAX1;
	TextView textViewAnswer5CAX1;		TextView textViewAnswer6CAX1;		TextView textViewAnswer7CAX1;		TextView textViewAnswer8CAX1;
	TextView textViewAnswer9CAX1;		TextView textViewAnswer10CAX1;		TextView textViewAnswer11CAX1;		TextView textViewAnswer12CAX1;
	TextView textViewAnswer13CAX1;		TextView textViewAnswer14CAX1;		TextView textViewAnswer15CAX1;		TextView textViewAnswer16CAX1;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cax1);
		
		EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
		textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);
		TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);
		
		
		CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
		CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
		CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
		CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);		CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);		CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
		CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);		CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);
		
		
		EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
		EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
		EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
		EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
		EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
		EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
		EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
		EditTextCAX1Answer15 = (EditText)findViewById(R.id.EditTextCAX1Answer15);		EditTextCAX1Answer16 = (EditText)findViewById(R.id.EditTextCAX1Answer16);
		
		
		textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
		textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
		textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
		textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
		textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
		textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
		textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
		textViewAnswer15CAX1 = (TextView) findViewById(R.id.textViewAnswer15CAX1);		textViewAnswer16CAX1 = (TextView) findViewById(R.id.textViewAnswer16CAX1);
		
		
		
		

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	public void onClickCAX1TestAnswers(View v)
	{
		if (randomInt==1)
		{
			
			
			
			
			String anagram1Answer1="The general economic and commercial environment";
			String anagram1Answer2="Specifying the problem";
			String anagram1Answer3="Developing the solution";
			String anagram1Answer4="Monitoring the experience";
			String anagram1Answer5="Professionalism"; 
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();

			if(anagram1Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram1Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram1Answer1);
			}
			
			if(anagram1Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram1Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram1Answer2);
			}
			
			if(anagram1Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram1Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram1Answer3);
			}
			
			if(anagram1Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram1Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram1Answer4);
			}
			
			if(anagram1Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram1Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(anagram1Answer5);
			}
		}
		if(randomInt==2){
			
			
			String anagram2Answer1="Estimation of the financial impact of uncertain future events";
			String anagram2Answer2="Allow for the impact of legislation, regulation, taxation, competition";
			String anagram2Answer3="Recognition of stakeholders requirements and risk profiles";
			String anagram2Answer4="A long term rather than short term horizon";
			String anagram2Answer5="Use of assumptions based on appropriate historical experience";
			String anagram2Answer6="Interpretation of the results of modelling to enable practical strategies to be developed";
			String anagram2Answer7="Decisions need to be made in the short term in light of likely future outcomes";
			String anagram2Answer8="Use of models to represent future financial outcomes";
			String anagram2Answer9="Monitoring and periodically analysing the emerging experience";
			String anagram2Answer10="Modifying models/strategies in light of this emerging experience";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
					
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();	String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			
			if(anagram2Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram2Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram2Answer1);
			}
			
			if(anagram2Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram2Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram2Answer2);
			}
			
			if(anagram2Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram2Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram2Answer3);
			}
			
			if(anagram2Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram2Answer1);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram2Answer4);
			}
			
			if(anagram2Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram2Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(anagram2Answer5);
			}
			
			if(anagram2Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram2Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram2Answer6);
			}
			
			if(anagram2Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram2Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram2Answer7);
			}
			
			if(anagram2Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX1.setText(anagram2Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(anagram2Answer8);
			}
			
			if(anagram2Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX1.setText(anagram2Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(anagram2Answer9);
			}
			
			if(anagram2Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10CAX1.setText(anagram2Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(anagram2Answer10);
			}
			
		}
		if(randomInt==3){
			
			
			String anagram3Answer1="Form judgements about future inflation and interest rates";
			String anagram3Answer2="Handle assumption in a critical manner";
			String anagram3Answer3="Models - build, parameterise, test and implement them";
			String anagram3Answer4="Margins - build them into assumptions and appreciate their impact";
			String anagram3Answer5="Estimate payments that need to be met using data on future liabilities";
			String anagram3Answer6="Handle data in a critical manner";
			String anagram3Answer7="Project and discount future cashflows using assumptions";
			String anagram3Answer8="Monitor the progress of the accumulation of a fund";
			String anagram3Answer9="Advise on reinsurance and other risk transfer mechanisms";
			String anagram3Answer10="Calculate contributions needed over time to meet future liabilities";
			String anagram3Answer11="Manage the build up of assets to meet future liabilities";
			String anagram3Answer12="Analyse variation between actual and expected experience";
			String anagram3Answer13="Contribute to decisions on investment policies to meet future liabilities";
			String anagram3Answer14="Manage variation of a fund to ensure that future liabilities are met";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
			EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);
			EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
			textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();		String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();		String checkuseranswerCAX112=EditTextCAX1Answer12.getText().toString();
			String checkuseranswerCAX113=EditTextCAX1Answer13.getText().toString();		String checkuseranswerCAX114=EditTextCAX1Answer14.getText().toString();
			
			if(anagram3Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram3Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram3Answer1);
			}
			
			if(anagram3Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram3Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram3Answer2);
			}
			
			if(anagram3Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram3Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram3Answer3);
			}
			
			if(anagram3Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram3Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram3Answer4);
			}
			
			if(anagram3Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram3Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(anagram3Answer5);
			}
			
			if(anagram3Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram3Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram3Answer6);
			}
			
			if(anagram3Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram3Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram3Answer7);
			}
			
			if(anagram3Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX1.setText(anagram3Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(anagram3Answer8);
			}
			
			if(anagram3Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX1.setText(anagram3Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(anagram3Answer9);
			}
			
			if(anagram3Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10CAX1.setText(anagram3Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(anagram3Answer10);
			}
			
			if(anagram3Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer11CAX1.setText(anagram3Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX111+" correct answer = "+anagram3Answer11);
			}
			
			if(anagram3Answer12.equals(checkuseranswerCAX112)){
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer12CAX1.setText(anagram3Answer12);
			}else{
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX112+" correct answer = "+anagram3Answer12);
			}
			
			if(anagram3Answer13.equals(checkuseranswerCAX113)){
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer13CAX1.setText(anagram3Answer13);
			}else{
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX113+" correct answer = "+anagram3Answer13);
			}
			
			if(anagram3Answer14.equals(checkuseranswerCAX114)){
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer14CAX1.setText(anagram3Answer14);
			}else{
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX114+" correct answer = "+anagram3Answer14);
			}
			
		}
		if(randomInt==4){
			
			
			
			
			
			
			
			
			
			String anagram4Answer1="Being reliable (detail, quality, timeliness)";
			String anagram4Answer2="Acting with integrity and detachment from personal circumstances";
			String anagram4Answer3="Skilled communication";
			String anagram4Answer4="Taking responsibility for decisions";
			String anagram4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String anagram4Answer6="Recognising that others have valid views";
			String anagram4Answer7="Developing a direct and trusting relationship with the client";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();
			String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();
			
			if(anagram4Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram4Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram4Answer1);
			}
			
			if(anagram4Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram4Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram4Answer2);
			}
			
			if(anagram4Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram4Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram4Answer3);
			}
			
			if(anagram4Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram4Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram4Answer4);
			}
			
			if(anagram4Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram4Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(anagram4Answer5);
			}
			
			if(anagram4Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram4Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram4Answer6);
			}
			
			if(anagram4Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram4Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram4Answer7);
			}
			
			
		}
		if(randomInt==5){
			
			
			String anagram5Answer1="Communicate the answer in a way that is understoodby the client";
			String anagram5Answer2="Establish what are the questions that need answering";
			String anagram5Answer3="Consider resources and timescales";
			String anagram5Answer4="Set assumptions";
			String anagram5Answer5="Decide on a method";
			String anagram5Answer6="Consider the professional implications of the work being done";
			String anagram5Answer7="Check the solution and get somebody else to check it";
			String anagram5Answer8="Ensure he/she is familiar with the context in which he/she is going to operate and the implications of the results";
			String anagram5Answer9="Arrive at the solution";
			String anagram5Answer10="Define the task with the client and consider conflicts of interests";
			String anagram5Answer11="Gather and assess the available information";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);
			EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1= (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1= (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		
			
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();	String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();
			
			if(anagram5Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram5Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram5Answer1);
			}
			
			if(anagram5Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram5Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram5Answer2);
			}
			
			if(anagram5Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram5Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram5Answer3);
			}
			
			if(anagram5Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram5Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram5Answer4);
			}
			
			if(anagram5Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram5Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(anagram5Answer5);
			}
			
			if(anagram5Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram5Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram5Answer6);
			}
			
			if(anagram5Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram5Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram5Answer7);
			}
			
			if(anagram5Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX1.setText(anagram5Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(anagram5Answer8);
			}
			
			if(anagram5Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX1.setText(anagram5Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(anagram5Answer9);
			}
			
			if(anagram5Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10CAX1.setText(anagram5Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(anagram5Answer10);
			}
			
			if(anagram5Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer11CAX1.setText(anagram5Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX111+" correct answer = "+anagram5Answer11);
			}
			

			
		}
		if(randomInt==6){
			
			
			
			
			
			
			
			
			
			
			
			
			
			String anagram6Answer1="Banks";
			String anagram6Answer2="Creditors of insurance companies";
			String anagram6Answer3="Trustees of benefit schemes";
			String anagram6Answer4="Employers";
			String anagram6Answer5="Auditiors of insurance companies";
			String anagram6Answer6="Members of benefit/investment schemes and their dependents";
			String anagram6Answer7="Policyholders/prospective policyholders";
			String anagram6Answer8="Investment fund managers";
			String anagram6Answer9="Employees";
			String anagram6Answer10="Shareholders";
			String anagram6Answer11="Sponsors of benefit schemes/capital projects";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);
			EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1= (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1= (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		
			
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();	String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();
			
			if(anagram6Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram6Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram6Answer1);
			}
			
			if(anagram6Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram6Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram6Answer2);
			}
			
			if(anagram6Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram6Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram6Answer3);
			}
			
			if(anagram6Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram6Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram6Answer4);
			}
			
			if(anagram6Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram6Answer5);
			}else{
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX1.setText(anagram6Answer5);
			}
			
			if(anagram6Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram6Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram6Answer6);
			}
			
			if(anagram6Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram6Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram6Answer7);
			}
			
			if(anagram6Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX1.setText(anagram6Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(anagram6Answer8);
			}
			
			if(anagram6Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX1.setText(anagram6Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(anagram6Answer9);
			}
			
			if(anagram6Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10CAX1.setText(anagram6Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(anagram6Answer10);
			}
			
			if(anagram6Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer11CAX1.setText(anagram6Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX111+" correct answer = "+anagram6Answer11);
			}
			
			

			
		}
		if(randomInt==7){
			
			
			
			
			
			String anagram7Answer1="Factual advise - based on research of facts - eg legislation";
			String anagram7Answer2="Indicative advice - giving an opinion without fully investigating the issues - eg in response to a direct oral question";
			String anagram7Answer3="Recommendations - researched and modelled forecasts, alternatives weighted, recommendations made consistent with requirements";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);	
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1 = (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();
			
			if(anagram7Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram7Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram7Answer1);
			}
			
			if(anagram7Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram7Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram7Answer2);
			}
			
			if(anagram7Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram7Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram7Answer3);
			}
			
			

			
		}
		if(randomInt==8){
			
			String anagram8Answer1="Commercial requirements";
			String anagram8Answer2="Regulation and legislation";
			String anagram8Answer3="Environmental issues";
			String anagram8Answer4="Accounting standards";
			String anagram8Answer5="Tax";
			String anagram8Answer6="Economic outlook";
			String anagram8Answer7="Governance - corporate";
			String anagram8Answer8="Risk managment requirements";
			String anagram8Answer9="Experience from overseas";
			String anagram8Answer10="Adequacy of capital";
			String anagram8Answer11="Trends - demographic";
			String anagram8Answer12="Lifestyle considerations";
			String anagram8Answer13="Institutional structure";
			String anagram8Answer14="Social and cultural trends";
			String anagram8Answer15="Technology";
			String anagram8Answer16="State benefits";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
			EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
			EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
			EditTextCAX1Answer15 = (EditText)findViewById(R.id.EditTextCAX1Answer15);		EditTextCAX1Answer16 = (EditText)findViewById(R.id.EditTextCAX1Answer16);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
			textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
			textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();		String checkuseranswerCAX110=EditTextCAX1Answer10.getText().toString();
			String checkuseranswerCAX111=EditTextCAX1Answer11.getText().toString();		String checkuseranswerCAX112=EditTextCAX1Answer12.getText().toString();
			String checkuseranswerCAX113=EditTextCAX1Answer13.getText().toString();		String checkuseranswerCAX114=EditTextCAX1Answer14.getText().toString();
			String checkuseranswerCAX115=EditTextCAX1Answer15.getText().toString();		String checkuseranswerCAX116=EditTextCAX1Answer16.getText().toString();
			
			if(anagram8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}
			
			if(anagram8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}
			
			if(anagram8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}
			
			if(anagram8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}
			
			if(anagram8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram8Answer5);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer5);
			}
			
			if(anagram8Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram8Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram8Answer6);
			}
			
			if(anagram8Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram8Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram8Answer7);
			}
			
			if(anagram8Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX1.setText(anagram8Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(anagram8Answer8);
			}
			
			if(anagram8Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX1.setText(anagram8Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(anagram8Answer9);
			}
			
			if(anagram8Answer10.equals(checkuseranswerCAX110)){
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10CAX1.setText(anagram8Answer10);
			}else{
				textViewAnswer10CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX1.setText(anagram8Answer10);
			}
			
			if(anagram8Answer11.equals(checkuseranswerCAX111)){
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer11CAX1.setText(anagram8Answer11);
			}else{
				textViewAnswer11CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX111+" correct answer = "+anagram8Answer11);
			}
			
			if(anagram8Answer12.equals(checkuseranswerCAX112)){
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer12CAX1.setText(anagram8Answer12);
			}else{
				textViewAnswer12CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer12CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX112+" correct answer = "+anagram8Answer12);
			}
			
			if(anagram8Answer13.equals(checkuseranswerCAX113)){
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer13CAX1.setText(anagram8Answer13);
			}else{
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX113+" correct answer = "+anagram8Answer13);
			}
			
			if(anagram8Answer14.equals(checkuseranswerCAX114)){
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer14CAX1.setText(anagram8Answer14);
			}else{
				textViewAnswer14CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer14CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX114+" correct answer = "+anagram8Answer14);
			}
			
			if(anagram8Answer15.equals(checkuseranswerCAX115)){
				textViewAnswer15CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer15CAX1.setText(anagram8Answer15);
			}else{
				textViewAnswer13CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer13CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX115+" correct answer = "+anagram8Answer15);
			}
			
			if(anagram8Answer16.equals(checkuseranswerCAX116)){
				textViewAnswer16CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer16CAX1.setText(anagram8Answer16);
			}else{
				textViewAnswer16CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer16CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX116+" correct answer = "+anagram8Answer16);
			}
			

			
		}
		if(randomInt==9){
			
			
			
			
			
			
			
			String anagram9Answer1="Give confidence in the financial system";
			String anagram9Answer2="Reduce financial crime";
			String anagram9Answer3="Correct inefficiencies in the market and promote efficient and orderly markets";
			String anagram9Answer4="Protect consumers of financial products";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			
			
			if(anagram9Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram9Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram9Answer1);
			}
			
			if(anagram9Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram9Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram9Answer2);
			}
			
			if(anagram9Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram9Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram9Answer3);
			}
			
			if(anagram9Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram9Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram9Answer4);
			}
			
			
			
			
		}
		if(randomInt==10){
			
			
			String anagram8Answer1="Direct costs";
			String anagram8Answer2="Admin costs";
			String anagram8Answer3="Complicance costs";
			String anagram8Answer4="Indirect costs";
			String anagram8Answer5="Behaviour change in consumers, false sense of security, reduced sense of responsibility for own actions";
			String anagram8Answer6="Undermining the sense of responsibility amongst advisors and intermediaries";
			String anagram8Answer7="Reduction in consumer protection mechanisms";
			String anagram8Answer8="Reduced product innovation";
			String anagram8Answer9="Reduced competition";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
			EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
			textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
			String checkuseranswerCAX19=EditTextCAX1Answer9.getText().toString();
			
			if(anagram8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}
			
			if(anagram8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}
			
			if(anagram8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}
			
			if(anagram8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}
			
			if(anagram8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram8Answer5);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer5);
			}
			
			if(anagram8Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram8Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram8Answer6);
			}
			
			if(anagram8Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram8Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram8Answer7);
			}
			
			if(anagram8Answer8.equals(checkuseranswerCAX18)){
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX1.setText(anagram8Answer8);
			}else{
				textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX1.setText(anagram8Answer8);
			}
			
			if(anagram8Answer9.equals(checkuseranswerCAX19)){
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX1.setText(anagram8Answer9);
			}else{
				textViewAnswer9CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX1.setText(anagram8Answer9);
			}

			
		}
		if(randomInt==11){
			
			String anagram8Answer1="Setting sanctions";
			String anagram8Answer2="Enforcing regulations";
			String anagram8Answer3="Reviewing and influencing government policy";
			String anagram8Answer4="Vetting and registering firms and individuals";
			String anagram8Answer5="Investigating breaches";
			String anagram8Answer6="Checking management and conduct of providers";
			String anagram8Answer7="Educating consumers and the public";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
			EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
			textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
			String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();	
			
			if(anagram8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}
			
			if(anagram8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}
			
			if(anagram8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}
			
			if(anagram8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}
			
			if(anagram8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram8Answer5);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer5);
			}
			
			if(anagram8Answer6.equals(checkuseranswerCAX16)){
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX1.setText(anagram8Answer6);
			}else{
				textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX1.setText(anagram8Answer6);
			}
			
			if(anagram8Answer7.equals(checkuseranswerCAX17)){
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX1.setText(anagram8Answer7);
			}else{
				textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX1.setText(anagram8Answer7);
			}

			
		}
		if(randomInt==12){
			
			
			String anagram8Answer1="Capital adequacy of provider";
			String anagram8Answer2="Integrity, competence of practitioners";
			String anagram8Answer3="Stock exchange requirements";
			String anagram8Answer4="Compensation schemes";
			String anagram8Answer5="Orderly and transparent markets";
			
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);	
			
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();	
			
			if(anagram8Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer1);
			}
			
			if(anagram8Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram8Answer2);
			}
			
			if(anagram8Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram8Answer3);
			}
			
			if(anagram8Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram8Answer4);
			}
			
			if(anagram8Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram8Answer5);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram8Answer5);
			}

			
		}
		if(randomInt==13){
			
			
			
			
			
			String anagram13Answer1="Freedom of action";
			String anagram13Answer2="Outcome based";
			String anagram13Answer3="Prescriptive";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();
			
			if(anagram13Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram13Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram13Answer1);
			}
			
			if(anagram13Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram13Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram13Answer2);
			}
			
			if(anagram13Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram13Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram13Answer3);
			}
			

			
		}
		if(randomInt==14){
			
			
			
			
			
			
			
			String anagram14Answer1="Mixed regime";
			String anagram14Answer2="Unregulated markets";
			String anagram14Answer3="Statutory";
			String anagram14Answer4="Self-regulation";
			String anagram14Answer5="Voluntary codes of conduct";
			
			EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
			EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
			EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);
			
			textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
			textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
			textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);
			
			String checkuseranswerCAX11=EditTextCAX1Answer1.getText().toString();	String checkuseranswerCAX12=EditTextCAX1Answer2.getText().toString();
			String checkuseranswerCAX13=EditTextCAX1Answer3.getText().toString();	String checkuseranswerCAX14=EditTextCAX1Answer4.getText().toString();
			String checkuseranswerCAX15=EditTextCAX1Answer5.getText().toString();
			
			if(anagram14Answer1.equals(checkuseranswerCAX11)){
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX1.setText(anagram14Answer1);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram14Answer1);
			}
			
			if(anagram14Answer2.equals(checkuseranswerCAX12)){
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX1.setText(anagram14Answer2);
			}else{
				textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX1.setText(anagram14Answer2);
			}
			
			if(anagram14Answer3.equals(checkuseranswerCAX13)){
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX1.setText(anagram14Answer3);
			}else{
				textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX1.setText(anagram14Answer3);
			}
			
			if(anagram14Answer4.equals(checkuseranswerCAX14)){
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX1.setText(anagram14Answer4);
			}else{
				textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX1.setText(anagram14Answer4);
			}
			
			if(anagram14Answer5.equals(checkuseranswerCAX15)){
				textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX1.setText(anagram14Answer5);
			}else{
				textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX1.setText(anagram14Answer5);
			}
			
			if(randomInt==15){
				
				
				
				
				
				
				
				
				
				
				String anagram8Answer1="Cooling-off period";
				String anagram8Answer2="Regulation of selling practices - eg commission";
				String anagram8Answer3="Impose price controls";
				String anagram8Answer4="Educate consumers";
				String anagram8Answer5="Disclosure";
				String anagram8Answer6="Public available restriction of knowledge";
				String anagram8Answer7="Insider-trading regulation";
				String anagram8Answer8="Chinese walls";
				
				
				EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
				EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
				EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
				EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
				
				textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
				textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
				textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
				textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
				
				String checkuseranswerCAX111=EditTextCAX1Answer1.getText().toString();		String checkuseranswerCAX121=EditTextCAX1Answer2.getText().toString();
				String checkuseranswerCAX131=EditTextCAX1Answer3.getText().toString();		String checkuseranswerCAX141=EditTextCAX1Answer4.getText().toString();
				String checkuseranswerCAX151=EditTextCAX1Answer5.getText().toString();		String checkuseranswerCAX16=EditTextCAX1Answer6.getText().toString();
				String checkuseranswerCAX17=EditTextCAX1Answer7.getText().toString();		String checkuseranswerCAX18=EditTextCAX1Answer8.getText().toString();
				
				if(anagram8Answer1.equals(checkuseranswerCAX111)){
					textViewAnswer1CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer1CAX1.setText(anagram8Answer1);
				}else{
					textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer1CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX111+" correct answer = "+anagram8Answer1);
				}
				
				if(anagram8Answer2.equals(checkuseranswerCAX121)){
					textViewAnswer2CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer2CAX1.setText(anagram8Answer2);
				}else{
					textViewAnswer2CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer2CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX121+" correct answer = "+anagram8Answer2);
				}
				
				if(anagram8Answer3.equals(checkuseranswerCAX131)){
					textViewAnswer3CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer3CAX1.setText(anagram8Answer3);
				}else{
					textViewAnswer3CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer3CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX131+" correct answer = "+anagram8Answer3);
				}
				
				if(anagram8Answer4.equals(checkuseranswerCAX141)){
					textViewAnswer4CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer4CAX1.setText(anagram8Answer4);
				}else{
					textViewAnswer4CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer4CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX141+" correct answer = "+anagram8Answer4);
				}
				
				if(anagram8Answer5.equals(checkuseranswerCAX151)){
					textViewAnswer5CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer5CAX1.setText(anagram8Answer5);
				}else{
					textViewAnswer1CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer1CAX1.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX151+" correct answer = "+anagram8Answer5);
				}
				
				if(anagram8Answer6.equals(checkuseranswerCAX16)){
					textViewAnswer6CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer6CAX1.setText(anagram8Answer6);
				}else{
					textViewAnswer6CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer6CAX1.setText(anagram8Answer6);
				}
				
				if(anagram8Answer7.equals(checkuseranswerCAX17)){
					textViewAnswer7CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer7CAX1.setText(anagram8Answer7);
				}else{
					textViewAnswer7CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer7CAX1.setText(anagram8Answer7);
				}
				
				if(anagram8Answer8.equals(checkuseranswerCAX18)){
					textViewAnswer8CAX1.setTextColor(Color.parseColor("#00FF00"));
					textViewAnswer8CAX1.setText(anagram8Answer8);
				}else{
					textViewAnswer8CAX1.setTextColor(Color.parseColor("#FF0000"));
					textViewAnswer8CAX1.setText(anagram8Answer8);
				}
				
			}

			
		}

		
	}

	public void onClickGetTitleCAX1(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(15)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);
		TextViewTitleAnswerCAX1.setText("");
		
		EditTextTestCAX1 = (EditText) findViewById(R.id.EditTextTestCAX1);
		EditTextTestCAX1.setText("");
		
		CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
		CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
		CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
		CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);		CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);		CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
		CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);		CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);
		
		CAX1Answer1Letter1.setText("");
		CAX1Answer1Letter2.setText("");
		CAX1Answer1Letter3.setText("");
		CAX1Answer1Letter4.setText("");
		CAX1Answer1Letter5.setText("");
		CAX1Answer1Letter6.setText("");
		CAX1Answer1Letter7.setText("");
		CAX1Answer1Letter8.setText("");
		CAX1Answer1Letter9.setText("");
		CAX1Answer1Letter10.setText("");
		CAX1Answer1Letter11.setText("");
		CAX1Answer1Letter12.setText("");
		CAX1Answer1Letter13.setText("");
		CAX1Answer1Letter13.setText("");
		CAX1Answer1Letter14.setText("");
		CAX1Answer1Letter15.setText("");
		CAX1Answer1Letter16.setText("");
		
		
		
		EditTextCAX1Answer1 = (EditText)findViewById(R.id.EditTextCAX1Answer1);		EditTextCAX1Answer2 = (EditText)findViewById(R.id.EditTextCAX1Answer2);
		EditTextCAX1Answer3 = (EditText)findViewById(R.id.EditTextCAX1Answer3);		EditTextCAX1Answer4 = (EditText)findViewById(R.id.EditTextCAX1Answer4);
		EditTextCAX1Answer5 = (EditText)findViewById(R.id.EditTextCAX1Answer5);		EditTextCAX1Answer6 = (EditText)findViewById(R.id.EditTextCAX1Answer6);
		EditTextCAX1Answer7 = (EditText)findViewById(R.id.EditTextCAX1Answer7);		EditTextCAX1Answer8 = (EditText)findViewById(R.id.EditTextCAX1Answer8);
		EditTextCAX1Answer9 = (EditText)findViewById(R.id.EditTextCAX1Answer9);		EditTextCAX1Answer10 = (EditText)findViewById(R.id.EditTextCAX1Answer10);
		EditTextCAX1Answer11 = (EditText)findViewById(R.id.EditTextCAX1Answer11);		EditTextCAX1Answer12 = (EditText)findViewById(R.id.EditTextCAX1Answer12);
		EditTextCAX1Answer13 = (EditText)findViewById(R.id.EditTextCAX1Answer13);		EditTextCAX1Answer14 = (EditText)findViewById(R.id.EditTextCAX1Answer14);
		EditTextCAX1Answer15 = (EditText)findViewById(R.id.EditTextCAX1Answer15);		EditTextCAX1Answer16 = (EditText)findViewById(R.id.EditTextCAX1Answer16);
		
		EditTextCAX1Answer1.setText("");
		EditTextCAX1Answer2.setText("");
		EditTextCAX1Answer3.setText("");
		EditTextCAX1Answer4.setText("");
		EditTextCAX1Answer5.setText("");
		EditTextCAX1Answer6.setText("");
		EditTextCAX1Answer7.setText("");
		EditTextCAX1Answer8.setText("");
		EditTextCAX1Answer9.setText("");
		EditTextCAX1Answer10.setText("");
		EditTextCAX1Answer11.setText("");
		EditTextCAX1Answer12.setText("");
		EditTextCAX1Answer13.setText("");
		EditTextCAX1Answer14.setText("");
		EditTextCAX1Answer15.setText("");
		EditTextCAX1Answer16.setText("");
		
		textViewAnswer1CAX1 = (TextView) findViewById(R.id.textViewAnswer1CAX1);		textViewAnswer2CAX1= (TextView) findViewById(R.id.textViewAnswer2CAX1);
		textViewAnswer3CAX1 = (TextView) findViewById(R.id.textViewAnswer3CAX1);		textViewAnswer4CAX1 = (TextView) findViewById(R.id.textViewAnswer4CAX1);
		textViewAnswer5CAX1 = (TextView) findViewById(R.id.textViewAnswer5CAX1);		textViewAnswer6CAX1 = (TextView) findViewById(R.id.textViewAnswer6CAX1);
		textViewAnswer7CAX1 = (TextView) findViewById(R.id.textViewAnswer7CAX1);		textViewAnswer8CAX1 = (TextView) findViewById(R.id.textViewAnswer8CAX1);
		textViewAnswer9CAX1 = (TextView) findViewById(R.id.textViewAnswer9CAX1);		textViewAnswer10CAX1 = (TextView) findViewById(R.id.textViewAnswer10CAX1);
		textViewAnswer11CAX1 = (TextView) findViewById(R.id.textViewAnswer11CAX1);		textViewAnswer12CAX1 = (TextView) findViewById(R.id.textViewAnswer12CAX1);
		textViewAnswer13CAX1 = (TextView) findViewById(R.id.textViewAnswer13CAX1);		textViewAnswer14CAX1 = (TextView) findViewById(R.id.textViewAnswer14CAX1);
		textViewAnswer15CAX1 = (TextView) findViewById(R.id.textViewAnswer15CAX1);		textViewAnswer16CAX1 = (TextView) findViewById(R.id.textViewAnswer16CAX1);
		
		textViewAnswer1CAX1.setText("");
		textViewAnswer2CAX1.setText("");
		textViewAnswer3CAX1.setText("");
		textViewAnswer4CAX1.setText("");
		textViewAnswer5CAX1.setText("");
		textViewAnswer6CAX1.setText("");
		textViewAnswer7CAX1.setText("");
		textViewAnswer8CAX1.setText("");
		textViewAnswer9CAX1.setText("");
		textViewAnswer10CAX1.setText("");
		textViewAnswer11CAX1.setText("");
		textViewAnswer12CAX1.setText("");
		textViewAnswer13CAX1.setText("");
		textViewAnswer14CAX1.setText("");
		textViewAnswer15CAX1.setText("");
		textViewAnswer16CAX1.setText("");
		
		
		if(randomInt == 1){

			String anagram1Title = "The Actuarial Control Cycle (ACC)";
			String anagram1Answer1="The general economic and commercial environment";
			String anagram1Answer2="Specifying the problem";
			String anagram1Answer3="Developing the solution";
			String anagram1Answer4="Monitoring the experience";
			String anagram1Answer5="Professionalism";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram1Title);
			
			String anagram1Answer1SubString = anagram1Answer1.substring(0, 1); 
			String anagram1Answer2SubString = anagram1Answer2.substring(0, 1);
			String anagram1Answer3SubString = anagram1Answer3.substring(0, 1);
			String anagram1Answer4SubString = anagram1Answer4.substring(0, 1);
			String anagram1Answer5SubString = anagram1Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(anagram1Answer1SubString);
			CAX1Answer1Letter2.setText(anagram1Answer2SubString);
			CAX1Answer1Letter3.setText(anagram1Answer3SubString);
			CAX1Answer1Letter4.setText(anagram1Answer4SubString);
			CAX1Answer1Letter5.setText(anagram1Answer5SubString);

		}

		if(randomInt == 2){
			
			String anagram2Title = "What makes the ACC actuarial";
			
			String anagram2Answer1="Estimation of the financial impact of uncertain future events";
			String anagram2Answer2="Allow for the impact of legislation, regulation, taxation, competition";
			String anagram2Answer3="Recognition of stakeholders requirements and risk profiles";
			String anagram2Answer4="A long term rather than short term horizon";
			String anagram2Answer5="Use of assumptions based on appropriate historical experience";
			String anagram2Answer6="Interpretation of the results of modelling to enable practical strategies to be developed";
			String anagram2Answer7="Decisions need to be made in the short term in light of likely future outcomes";
			String anagram2Answer8="Use of models to represent future financial outcomes";
			String anagram2Answer9="Monitoring and periodically analysing the emerging experience";
			String anagram2Answer10="Modifying models/strategies in light of this emerging experience";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram2Title);
			
			String anagram2Answer1SubString = anagram2Answer1.substring(0, 1); 
			String anagram2Answer2SubString = anagram2Answer2.substring(0, 1);
			String anagram2Answer3SubString = anagram2Answer3.substring(0, 1);
			String anagram2Answer4SubString = anagram2Answer4.substring(0, 1);
			String anagram2Answer5SubString = anagram2Answer5.substring(0, 1);
			String anagram2Answer6SubString = anagram2Answer6.substring(0, 1);
			String anagram2Answer7SubString = anagram2Answer7.substring(0, 1);
			String anagram2Answer8SubString = anagram2Answer8.substring(0, 1);
			String anagram2Answer9SubString = anagram2Answer9.substring(0, 1);
			String anagram2Answer10SubString = anagram2Answer10.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText(anagram2Answer1SubString);
			CAX1Answer1Letter2.setText(anagram2Answer2SubString);
			CAX1Answer1Letter3.setText(anagram2Answer3SubString);
			CAX1Answer1Letter4.setText(anagram2Answer4SubString);
			CAX1Answer1Letter5.setText(anagram2Answer5SubString);
			CAX1Answer1Letter6.setText(anagram2Answer6SubString);
			CAX1Answer1Letter7.setText(anagram2Answer7SubString);
			CAX1Answer1Letter8.setText(anagram2Answer8SubString);
			CAX1Answer1Letter9.setText(anagram2Answer9SubString);
			CAX1Answer1Letter10.setText(anagram2Answer10SubString);

		}

		if(randomInt == 3){

			String anagram3Title = "What actuaries do?";
			
			String anagram3Answer1="Form judgements about future inflation and interest rates";
			String anagram3Answer2="Handle assumption in a critical manner";
			String anagram3Answer3="Models - build, parameterise, test and implement them";
			String anagram3Answer4="Margins - build them into assumptions and appreciate their impact";
			String anagram3Answer5="Estimate payments that need to be met using data on future liabilities";
			String anagram3Answer6="Handle data in a critical manner";
			String anagram3Answer7="Project and discount future cashflows using assumptions";
			String anagram3Answer8="Monitor the progress of the accumulation of a fund";
			String anagram3Answer9="Advise on reinsurance and other risk transfer mechanisms";
			String anagram3Answer10="Calculate contributions needed over time to meet future liabilities";
			String anagram3Answer11="Manage the build up of assets to meet future liabilities";
			String anagram3Answer12="Analyse variation between actual and expected experience";
			String anagram3Answer13="Contribute to decisions on investment policies to meet future liabilities";
			String anagram3Answer14="Manage variation of a fund to ensure that future liabilities are met";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram3Title);
			
			String anagram3Answer1SubString = anagram3Answer1.substring(0, 1); 
			String anagram3Answer2SubString = anagram3Answer2.substring(0, 1);
			String anagram3Answer3SubString = anagram3Answer3.substring(0, 1);
			String anagram3Answer4SubString = anagram3Answer4.substring(0, 1);
			String anagram3Answer5SubString = anagram3Answer5.substring(0, 1);
			String anagram3Answer6SubString = anagram3Answer6.substring(0, 1);
			String anagram3Answer7SubString = anagram3Answer7.substring(0, 1);
			String anagram3Answer8SubString = anagram3Answer8.substring(0, 1);
			String anagram3Answer9SubString = anagram3Answer9.substring(0, 1);
			String anagram3Answer10SubString = anagram3Answer10.substring(0, 1);
			String anagram3Answer11SubString = anagram3Answer11.substring(0, 1);
			String anagram3Answer12SubString = anagram3Answer12.substring(0, 1);
			String anagram3Answer13SubString = anagram3Answer13.substring(0, 1);
			String anagram3Answer14SubString = anagram3Answer14.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);

			CAX1Answer1Letter1.setText(anagram3Answer1SubString);
			CAX1Answer1Letter2.setText(anagram3Answer2SubString);
			CAX1Answer1Letter3.setText(anagram3Answer3SubString);
			CAX1Answer1Letter4.setText(anagram3Answer4SubString);
			CAX1Answer1Letter5.setText(anagram3Answer5SubString);
			CAX1Answer1Letter6.setText(anagram3Answer6SubString);
			CAX1Answer1Letter7.setText(anagram3Answer7SubString);
			CAX1Answer1Letter8.setText(anagram3Answer8SubString);
			CAX1Answer1Letter9.setText(anagram3Answer9SubString);
			CAX1Answer1Letter10.setText(anagram3Answer10SubString);
			CAX1Answer1Letter11.setText(anagram3Answer11SubString);
			CAX1Answer1Letter12.setText(anagram3Answer12SubString);
			CAX1Answer1Letter13.setText(anagram3Answer13SubString);
			CAX1Answer1Letter14.setText(anagram3Answer14SubString);

		}

		if(randomInt == 4){

			String anagram4Title = "How to be a professional";
			
			String anagram4Answer1="Being reliable (detail, quality, timeliness)";
			String anagram4Answer2="Acting with integrity and detachment from personal circumstances";
			String anagram4Answer3="Skilled communication";
			String anagram4Answer4="Taking responsibility for decisions";
			String anagram4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String anagram4Answer6="Recognising that others have valid views";
			String anagram4Answer7="Developing a direct and trusting relationship with the client";


			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram4Title);
			
			String anagram4Answer1SubString = anagram4Answer1.substring(0, 1); 
			String anagram4Answer2SubString = anagram4Answer2.substring(0, 1);
			String anagram4Answer3SubString = anagram4Answer3.substring(0, 1);
			String anagram4Answer4SubString = anagram4Answer4.substring(0, 1);
			String anagram4Answer5SubString = anagram4Answer5.substring(0, 1);
			String anagram4Answer6SubString = anagram4Answer6.substring(0, 1);
			String anagram4Answer7SubString = anagram4Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(anagram4Answer1SubString);
			CAX1Answer1Letter2.setText(anagram4Answer2SubString);
			CAX1Answer1Letter3.setText(anagram4Answer3SubString);
			CAX1Answer1Letter4.setText(anagram4Answer4SubString);
			CAX1Answer1Letter5.setText(anagram4Answer5SubString);
			CAX1Answer1Letter6.setText(anagram4Answer6SubString);
			CAX1Answer1Letter7.setText(anagram4Answer7SubString);
		}

		if(randomInt == 5){

			String anagram5Title = "Carrying out an actuarial task";
			
			String anagram5Answer1="Communicate the answer in a way that is understoodby the client";
			String anagram5Answer2="Establish what are the questions that need answering";
			String anagram5Answer3="Consider resources and timescales";
			String anagram5Answer4="Set assumptions";
			String anagram5Answer5="Decide on a method";
			String anagram5Answer6="Consider the professional implications of the work being done";
			String anagram5Answer7="Check the solution and get somebody else to check it";
			String anagram5Answer8="Ensure he/she is familiar with the context in which he/she is going to operate and the implications of the results";
			String anagram5Answer9="Arrive at the solution";
			String anagram5Answer10="Define the task with the client and consider conflicts of interests";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram5Title);
			
			String anagram3Answer1SubString = anagram5Answer1.substring(0, 1); 
			String anagram3Answer2SubString = anagram5Answer2.substring(0, 1);
			String anagram3Answer3SubString = anagram5Answer3.substring(0, 1);
			String anagram3Answer4SubString = anagram5Answer4.substring(0, 1);
			String anagram3Answer5SubString = anagram5Answer5.substring(0, 1);
			String anagram3Answer6SubString = anagram5Answer6.substring(0, 1);
			String anagram3Answer7SubString = anagram5Answer7.substring(0, 1);
			String anagram3Answer8SubString = anagram5Answer8.substring(0, 1);
			String anagram3Answer9SubString = anagram5Answer9.substring(0, 1);
			String anagram3Answer10SubString = anagram5Answer10.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText(anagram3Answer1SubString);
			CAX1Answer1Letter2.setText(anagram3Answer2SubString);
			CAX1Answer1Letter3.setText(anagram3Answer3SubString);
			CAX1Answer1Letter4.setText(anagram3Answer4SubString);
			CAX1Answer1Letter5.setText(anagram3Answer5SubString);
			CAX1Answer1Letter6.setText(anagram3Answer6SubString);
			CAX1Answer1Letter7.setText(anagram3Answer7SubString);
			CAX1Answer1Letter8.setText(anagram3Answer8SubString);
			CAX1Answer1Letter9.setText(anagram3Answer9SubString);
			CAX1Answer1Letter10.setText(anagram3Answer10SubString);
		}

		if(randomInt == 6){
			
			

			String anagram6Title = "Possible clients actuaries advise";
			
			String anagram6Answer1="Banks";
			String anagram6Answer2="Creditors of insurance companies";
			String anagram6Answer3="Trustees of benefit schemes";
			String anagram6Answer4="Employers";
			String anagram6Answer5="Auditiors of insurance companies";
			String anagram6Answer6="Members of benefit/investment schemes and their dependents";
			String anagram6Answer7="Policyholders/prospective policyholders";
			String anagram6Answer8="Investment fund managers";
			String anagram6Answer9="Employees";
			String anagram6Answer10="Shareholders";
			String anagram6Answer11="Sponsors of benefit schemes/capital projects";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram6Title);
			
			String anagram6Answer1SubString = anagram6Answer1.substring(0, 1); 
			String anagram6Answer2SubString = anagram6Answer2.substring(0, 1);
			String anagram6Answer3SubString = anagram6Answer3.substring(0, 1);
			String anagram6Answer4SubString = anagram6Answer4.substring(0, 1);
			String anagram6Answer5SubString = anagram6Answer5.substring(0, 1); 
			String anagram6Answer6SubString = anagram6Answer6.substring(0, 1);
			String anagram6Answer7SubString = anagram6Answer7.substring(0, 1);
			String anagram6Answer8SubString = anagram6Answer8.substring(0, 1);
			String anagram6Answer9SubString = anagram6Answer9.substring(0, 1); 
			String anagram6Answer10SubString = anagram6Answer10.substring(0, 1);
			String anagram6Answer11SubString = anagram6Answer11.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			
			CAX1Answer1Letter1.setText(anagram6Answer1SubString);
			CAX1Answer1Letter2.setText(anagram6Answer2SubString);
			CAX1Answer1Letter3.setText(anagram6Answer3SubString);
			CAX1Answer1Letter4.setText(anagram6Answer4SubString);
			CAX1Answer1Letter5.setText(anagram6Answer5SubString);
			CAX1Answer1Letter6.setText(anagram6Answer6SubString);
			CAX1Answer1Letter7.setText(anagram6Answer7SubString);
			CAX1Answer1Letter8.setText(anagram6Answer8SubString);
			CAX1Answer1Letter9.setText(anagram6Answer9SubString);
			CAX1Answer1Letter10.setText(anagram6Answer10SubString);
			CAX1Answer1Letter11.setText(anagram6Answer11SubString);
		}

		if(randomInt == 7){
			
			

			String anagram7Title = "Types of advice";
			
			String anagram7Answer1="Factual advise - based on research of facts - eg legislation";
			String anagram7Answer2="Indicative advice - giving an opinion without fully investigating the issues - eg in response to a direct oral question";
			String anagram7Answer3="Recommendations - researched and modelled forecasts, alternatives weighted, recommendations made consistent with requirements";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram7Title);
			
			String anagram7Answer1SubString = anagram7Answer1.substring(0, 1); 
			String anagram7Answer2SubString = anagram7Answer2.substring(0, 1);
			String anagram7Answer3SubString = anagram7Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);	

			CAX1Answer1Letter1.setText(anagram7Answer1SubString);
			CAX1Answer1Letter2.setText(anagram7Answer2SubString);
			CAX1Answer1Letter3.setText(anagram7Answer3SubString);
		}

		if(randomInt == 8){

			String anagram8Title = "The External Environment";
			
			String anagram8Answer1="Commercial requirements";
			String anagram8Answer2="Regulation and legislation";
			String anagram8Answer3="Environmental issues";
			String anagram8Answer4="Accounting standards";
			String anagram8Answer5="Tax";
			String anagram8Answer6="Economic outlook";
			String anagram8Answer7="Governance - corporate";
			String anagram8Answer8="Risk managment requirements";
			String anagram8Answer9="Experience from overseas";
			String anagram8Answer10="Adequacy of capital";
			String anagram8Answer11="Trends - demographic";
			String anagram8Answer12="Lifestyle considerations";
			String anagram8Answer13="Institutional structure";
			String anagram8Answer14="Social and cultural trends";
			String anagram8Answer15="Technology";
			String anagram8Answer16="State benefits";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram8Title);
			
			String anagram9Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram9Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram9Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram9Answer7SubString = anagram8Answer7.substring(0, 1);
			String anagram9Answer8SubString = anagram8Answer8.substring(0, 1);
			String anagram9Answer9SubString = anagram8Answer9.substring(0, 1);
			String anagram9Answer10SubString = anagram8Answer10.substring(0, 1);
			String anagram9Answer11SubString = anagram8Answer11.substring(0, 1);
			String anagram9Answer12SubString = anagram8Answer12.substring(0, 1);
			String anagram9Answer13SubString = anagram8Answer13.substring(0, 1);
			String anagram9Answer14SubString = anagram8Answer14.substring(0, 1);
			String anagram9Answer15SubString = anagram8Answer15.substring(0, 1);
			String anagram9Answer16SubString = anagram8Answer16.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
			CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
			CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);
			CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);
			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);
			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			CAX1Answer1Letter5.setText(anagram9Answer5SubString);
			CAX1Answer1Letter6.setText(anagram9Answer6SubString);
			CAX1Answer1Letter7.setText(anagram9Answer7SubString);
			CAX1Answer1Letter8.setText(anagram9Answer8SubString);
			CAX1Answer1Letter9.setText(anagram9Answer9SubString);
			CAX1Answer1Letter10.setText(anagram9Answer10SubString);
			CAX1Answer1Letter11.setText(anagram9Answer11SubString);
			CAX1Answer1Letter12.setText(anagram9Answer12SubString);
			CAX1Answer1Letter13.setText(anagram9Answer13SubString);
			CAX1Answer1Letter14.setText(anagram9Answer14SubString);
			CAX1Answer1Letter15.setText(anagram9Answer15SubString);
			CAX1Answer1Letter16.setText(anagram9Answer16SubString);
		}

		if(randomInt == 9){

			String anagram9Title = "The aims of regulation";
			
			String anagram9Answer1="Give confidence in the financial system";
			String anagram9Answer2="Reduce financial crime";
			String anagram9Answer3="Correct inefficiencies in the market and promote efficient and orderly markets";
			String anagram9Answer4="Protect consumers of financial products";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram9Title);
			
			String anagram9Answer1SubString = anagram9Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram9Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram9Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram9Answer4.substring(0, 1);
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);
			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);
			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			
		}

		if(randomInt == 10){

			String anagram10Title = "Cost of regulation";
			
			String anagram8Answer1="Direct costs";
			String anagram8Answer2="Admin costs";
			String anagram8Answer3="Complicance costs";
			String anagram8Answer4="Indirect costs";
			String anagram8Answer5="Behaviour change in consumers, false sense of security, reduced sense of responsibility for own actions";
			String anagram8Answer6="Undermining the sense of responsibility amongst advisors and intermediaries";
			String anagram8Answer7="Reduction in consumer protection mechanisms";
			String anagram8Answer8="Reduced product innovation";
			String anagram8Answer9="Reduced competition";


			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram10Title);
			
			String anagram9Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram9Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram9Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram9Answer7SubString = anagram8Answer7.substring(0, 1);
			String anagram9Answer8SubString = anagram8Answer8.substring(0, 1);
			String anagram9Answer9SubString = anagram8Answer9.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			CAX1Answer1Letter5.setText(anagram9Answer5SubString);			CAX1Answer1Letter6.setText(anagram9Answer6SubString);
			CAX1Answer1Letter7.setText(anagram9Answer7SubString);			CAX1Answer1Letter8.setText(anagram9Answer8SubString);
			CAX1Answer1Letter9.setText(anagram9Answer9SubString);
		}

		if(randomInt == 11){

			String anagram11Title = "Fuctions of a regulator";
			
			String anagram8Answer1="Setting sanctions";
			String anagram8Answer2="Enforcing regulations";
			String anagram8Answer3="Reviewing and influencing government policy";
			String anagram8Answer4="Vetting and registering firms and individuals";
			String anagram8Answer5="Investigating breaches";
			String anagram8Answer6="Checking management and conduct of providers";
			String anagram8Answer7="Educating consumers and the public";


			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram11Title);
			
			String anagram9Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram9Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram9Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram9Answer7SubString = anagram8Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			CAX1Answer1Letter5.setText(anagram9Answer5SubString);			CAX1Answer1Letter6.setText(anagram9Answer6SubString);
			CAX1Answer1Letter7.setText(anagram9Answer7SubString);
		}

		if(randomInt == 12){

			String anagram12Title = "Regulation - Maintaing confidence";
			
			String anagram8Answer1="Capital adequacy of provider";
			String anagram8Answer2="Integrity, competence of practitioners";
			String anagram8Answer3="Stock exchange requirements";
			String anagram8Answer4="Compensation schemes";
			String anagram8Answer5="Orderly and transparent markets";


			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram12Title);
			
			String anagram12Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram12Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram12Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram12Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram12Answer5SubString = anagram8Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);

			CAX1Answer1Letter1.setText(anagram12Answer1SubString);
			CAX1Answer1Letter2.setText(anagram12Answer2SubString);
			CAX1Answer1Letter3.setText(anagram12Answer3SubString);
			CAX1Answer1Letter4.setText(anagram12Answer4SubString);
			CAX1Answer1Letter5.setText(anagram12Answer5SubString);
		}

		if(randomInt == 13){

			String anagram13Title = "Forms of regulation";
			
			String anagram13Answer1="Freedom of action";
			String anagram13Answer2="Outcome based";
			String anagram13Answer3="Prescriptive";


			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram13Title);
			
			String anagram13Answer1SubString = anagram13Answer1.substring(0, 1); 
			String anagram13Answer2SubString = anagram13Answer2.substring(0, 1);
			String anagram13Answer3SubString = anagram13Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);

			CAX1Answer1Letter1.setText(anagram13Answer1SubString);
			CAX1Answer1Letter2.setText(anagram13Answer2SubString);
			CAX1Answer1Letter3.setText(anagram13Answer3SubString);
		}

		if(randomInt == 14){

			String anagram14Title = "Types of regulatory regime";
			
			String anagram14Answer1="Mixed regime";
			String anagram14Answer2="Unregulated markets";
			String anagram14Answer3="Statutory";
			String anagram14Answer4="Self-regulation";
			String anagram14Answer5="Voluntary codes of conduct";


			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram14Title);
			
			String anagram14Answer1SubString = anagram14Answer1.substring(0, 1); 
			String anagram14Answer2SubString = anagram14Answer2.substring(0, 1);
			String anagram14Answer3SubString = anagram14Answer3.substring(0, 1);
			String anagram14Answer4SubString = anagram14Answer4.substring(0, 1);
			String anagram14Answer5SubString = anagram14Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(anagram14Answer1SubString);
			CAX1Answer1Letter2.setText(anagram14Answer2SubString);
			CAX1Answer1Letter3.setText(anagram14Answer3SubString);
			CAX1Answer1Letter4.setText(anagram14Answer4SubString);
			CAX1Answer1Letter5.setText(anagram14Answer5SubString);
		}
		
		if (randomInt==15){
			
			String anagram14Title = "Methods of reducing asymmetric information";
			
			String anagram8Answer1="Cooling-off period";
			String anagram8Answer2="Regulation of selling practices - eg commission";
			String anagram8Answer3="Impose price controls";
			String anagram8Answer4="Educate consumers";
			String anagram8Answer5="Disclosure";
			String anagram8Answer6="Public available restriction of knowledge";
			String anagram8Answer7="Insider-trading regulation";
			String anagram8Answer8="Chinese walls";


			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram14Title);
			
			String anagram14Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram14Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram14Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram14Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram14Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram14Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram14Answer7SubString = anagram8Answer7.substring(0, 1);
			String anagram14Answer8SubString = anagram8Answer8.substring(0, 1);
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			
			CAX1Answer1Letter1.setText(anagram14Answer1SubString);
			CAX1Answer1Letter2.setText(anagram14Answer2SubString);
			CAX1Answer1Letter3.setText(anagram14Answer3SubString);
			CAX1Answer1Letter4.setText(anagram14Answer4SubString);
			CAX1Answer1Letter5.setText(anagram14Answer5SubString);
			CAX1Answer1Letter6.setText(anagram14Answer6SubString);
			CAX1Answer1Letter7.setText(anagram14Answer7SubString);
			CAX1Answer1Letter8.setText(anagram14Answer8SubString);
		}


	}

	public void onClickGetAnagramCAX1(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(15)+1;//when you click "Display Database"
		
		TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);
		TextViewTitleAnswerCAX1.setText("");
		
		EditTextTestCAX1 = (EditText) findViewById(R.id.EditTextTestCAX1);
		EditTextTestCAX1.setText("");
		
		if(randomInt == 1){

			String anagram1Anagram ="TSDMP";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram1Anagram);

		}

		if(randomInt == 2){
			
			String anagram2Anagram ="FIST AID MMM";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram2Anagram);
			
			

		}

		if(randomInt == 3){

			String anagram3Anagram ="JAMMED CAR CAVIL";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram3Anagram);
			
			String anagram3Answer1="Form judgements about future inflation and interest rates";
			String anagram3Answer2="Handle assumption in a critical manner";
			String anagram3Answer3="Models - build, parameterise, test and implement them";
			String anagram3Answer4="Margins - build them into assumptions and appreciate their impact";
			String anagram3Answer5="Estimate payments that need to be met using data on future liabilities";
			String anagram3Answer6="Handle data in a critical manner";
			String anagram3Answer7="Project and discount future cashflows using assumptions";
			String anagram3Answer8="Monitor the progress of the accumulation of a fund";
			String anagram3Answer9="Advise on reinsurance and other risk transfer mechanisms";
			String anagram3Answer10="Calculate contributions needed over time to meet future liabilities";
			String anagram3Answer11="Manage the build up of assets to meet future liabilities";
			String anagram3Answer12="Analyse variation between actual and expected experience";
			String anagram3Answer13="Contribute to decisions on investment policies to meet future liabilities";
			String anagram3Answer14="Manage variation of a fund to ensure that future liabilities are met";

			
			
			String anagram3Answer1SubString = anagram3Answer1.substring(0, 1); 
			String anagram3Answer2SubString = anagram3Answer2.substring(0, 1);
			String anagram3Answer3SubString = anagram3Answer3.substring(0, 1);
			String anagram3Answer4SubString = anagram3Answer4.substring(0, 1);
			String anagram3Answer5SubString = anagram3Answer5.substring(0, 1);
			String anagram3Answer6SubString = anagram3Answer6.substring(0, 1);
			String anagram3Answer7SubString = anagram3Answer7.substring(0, 1);
			String anagram3Answer8SubString = anagram3Answer8.substring(0, 1);
			String anagram3Answer9SubString = anagram3Answer9.substring(0, 1);
			String anagram3Answer10SubString = anagram3Answer10.substring(0, 1);
			String anagram3Answer11SubString = anagram3Answer11.substring(0, 1);
			String anagram3Answer12SubString = anagram3Answer12.substring(0, 1);
			String anagram3Answer13SubString = anagram3Answer13.substring(0, 1);
			String anagram3Answer14SubString = anagram3Answer14.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);		CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);		CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);

			CAX1Answer1Letter1.setText(anagram3Answer1SubString);
			CAX1Answer1Letter2.setText(anagram3Answer2SubString);
			CAX1Answer1Letter3.setText(anagram3Answer3SubString);
			CAX1Answer1Letter4.setText(anagram3Answer4SubString);
			CAX1Answer1Letter5.setText(anagram3Answer5SubString);
			CAX1Answer1Letter6.setText(anagram3Answer6SubString);
			CAX1Answer1Letter7.setText(anagram3Answer7SubString);
			CAX1Answer1Letter8.setText(anagram3Answer8SubString);
			CAX1Answer1Letter9.setText(anagram3Answer9SubString);
			CAX1Answer1Letter10.setText(anagram3Answer10SubString);
			CAX1Answer1Letter11.setText(anagram3Answer11SubString);
			CAX1Answer1Letter12.setText(anagram3Answer12SubString);
			CAX1Answer1Letter13.setText(anagram3Answer13SubString);
			CAX1Answer1Letter14.setText(anagram3Answer14SubString);

		}

		if(randomInt == 4){

			String anagram4Anagram ="BASTARD";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram4Anagram);
			
			String anagram4Answer1="Being reliable (detail, quality, timeliness)";
			String anagram4Answer2="Acting with integrity and detachment from personal circumstances";
			String anagram4Answer3="Skilled communication";
			String anagram4Answer4="Taking responsibility for decisions";
			String anagram4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String anagram4Answer6="Recognising that others have valid views";
			String anagram4Answer7="Developing a direct and trusting relationship with the client";


			
			
			String anagram4Answer1SubString = anagram4Answer1.substring(0, 1); 
			String anagram4Answer2SubString = anagram4Answer2.substring(0, 1);
			String anagram4Answer3SubString = anagram4Answer3.substring(0, 1);
			String anagram4Answer4SubString = anagram4Answer4.substring(0, 1);
			String anagram4Answer5SubString = anagram4Answer5.substring(0, 1);
			String anagram4Answer6SubString = anagram4Answer6.substring(0, 1);
			String anagram4Answer7SubString = anagram4Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(anagram4Answer1SubString);
			CAX1Answer1Letter2.setText(anagram4Answer2SubString);
			CAX1Answer1Letter3.setText(anagram4Answer3SubString);
			CAX1Answer1Letter4.setText(anagram4Answer4SubString);
			CAX1Answer1Letter5.setText(anagram4Answer5SubString);
			CAX1Answer1Letter6.setText(anagram4Answer6SubString);
			CAX1Answer1Letter7.setText(anagram4Answer7SubString);
		}

		if(randomInt == 5){

			String anagram5Anagram ="CERAMIC FAD";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram5Anagram);
			
			String anagram5Answer1="Communicate the answer in a way that is understoodby the client";
			String anagram5Answer2="Establish what are the questions that need answering";
			String anagram5Answer3="Consider resources and timescales";
			String anagram5Answer4="Set assumptions";
			String anagram5Answer5="Decide on a method";
			String anagram5Answer6="Consider the professional implications of the work being done";
			String anagram5Answer7="Check the solution and get somebody else to check it";
			String anagram5Answer8="Ensure he/she is familiar with the context in which he/she is going to operate and the implications of the results";
			String anagram5Answer9="Arrive at the solution";
			String anagram5Answer10="Define the task with the client and consider conflicts of interests";

			
			
			String anagram3Answer1SubString = anagram5Answer1.substring(0, 1); 
			String anagram3Answer2SubString = anagram5Answer2.substring(0, 1);
			String anagram3Answer3SubString = anagram5Answer3.substring(0, 1);
			String anagram3Answer4SubString = anagram5Answer4.substring(0, 1);
			String anagram3Answer5SubString = anagram5Answer5.substring(0, 1);
			String anagram3Answer6SubString = anagram5Answer6.substring(0, 1);
			String anagram3Answer7SubString = anagram5Answer7.substring(0, 1);
			String anagram3Answer8SubString = anagram5Answer8.substring(0, 1);
			String anagram3Answer9SubString = anagram5Answer9.substring(0, 1);
			String anagram3Answer10SubString = anagram5Answer10.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText(anagram3Answer1SubString);
			CAX1Answer1Letter2.setText(anagram3Answer2SubString);
			CAX1Answer1Letter3.setText(anagram3Answer3SubString);
			CAX1Answer1Letter4.setText(anagram3Answer4SubString);
			CAX1Answer1Letter5.setText(anagram3Answer5SubString);
			CAX1Answer1Letter6.setText(anagram3Answer6SubString);
			CAX1Answer1Letter7.setText(anagram3Answer7SubString);
			CAX1Answer1Letter8.setText(anagram3Answer8SubString);
			CAX1Answer1Letter9.setText(anagram3Answer9SubString);
			CAX1Answer1Letter10.setText(anagram3Answer10SubString);
		}

		if(randomInt == 6){
			
			

			String anagram6Anagram ="BBC TEAM PIESS";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram6Anagram);
			
			String anagram6Answer1="Banks";
			String anagram6Answer2="Creditors of insurance companies";
			String anagram6Answer3="Trustees of benefit schemes";
			String anagram6Answer4="Employers";
			String anagram6Answer5="Auditiors of insurance companies";
			String anagram6Answer6="Members of benefit/investment schemes and their dependents";
			String anagram6Answer7="Policyholders/prospective policyholders";
			String anagram6Answer8="Investment fund managers";
			String anagram6Answer9="Employees";
			String anagram6Answer10="Shareholders";
			String anagram6Answer11="Sponsors of benefit schemes/capital projects";

			
			
			String anagram6Answer1SubString = anagram6Answer1.substring(0, 1); 
			String anagram6Answer2SubString = anagram6Answer2.substring(0, 1);
			String anagram6Answer3SubString = anagram6Answer3.substring(0, 1);
			String anagram6Answer4SubString = anagram6Answer4.substring(0, 1);
			String anagram6Answer5SubString = anagram6Answer5.substring(0, 1); 
			String anagram6Answer6SubString = anagram6Answer6.substring(0, 1);
			String anagram6Answer7SubString = anagram6Answer7.substring(0, 1);
			String anagram6Answer8SubString = anagram6Answer8.substring(0, 1);
			String anagram6Answer9SubString = anagram6Answer9.substring(0, 1); 
			String anagram6Answer10SubString = anagram6Answer10.substring(0, 1);
			String anagram6Answer11SubString = anagram6Answer11.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			
			CAX1Answer1Letter1.setText(anagram6Answer1SubString);
			CAX1Answer1Letter2.setText(anagram6Answer2SubString);
			CAX1Answer1Letter3.setText(anagram6Answer3SubString);
			CAX1Answer1Letter4.setText(anagram6Answer4SubString);
			CAX1Answer1Letter5.setText(anagram6Answer5SubString);
			CAX1Answer1Letter6.setText(anagram6Answer6SubString);
			CAX1Answer1Letter7.setText(anagram6Answer7SubString);
			CAX1Answer1Letter8.setText(anagram6Answer8SubString);
			CAX1Answer1Letter9.setText(anagram6Answer9SubString);
			CAX1Answer1Letter10.setText(anagram6Answer10SubString);
			CAX1Answer1Letter11.setText(anagram6Answer11SubString);
		}

		if(randomInt == 7){
			
			

			String anagram7Anagram ="FIR" ;
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram7Anagram);
			
			String anagram7Answer1="Factual advise - based on research of facts - eg legislation";
			String anagram7Answer2="Indicative advice - giving an opinion without fully investigating the issues - eg in response to a direct oral question";
			String anagram7Answer3="Recommendations - researched and modelled forecasts, alternatives weighted, recommendations made consistent with requirements";

			
			
			String anagram7Answer1SubString = anagram7Answer1.substring(0, 1); 
			String anagram7Answer2SubString = anagram7Answer2.substring(0, 1);
			String anagram7Answer3SubString = anagram7Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);	

			CAX1Answer1Letter1.setText(anagram7Answer1SubString);
			CAX1Answer1Letter2.setText(anagram7Answer2SubString);
			CAX1Answer1Letter3.setText(anagram7Answer3SubString);
		}

		if(randomInt == 8){

			String anagram8Anagram="CREATE GREAT LISTS";
			
			String anagram8Answer1="Commercial requirements";
			String anagram8Answer2="Regulation and legislation";
			String anagram8Answer3="Environmental issues";
			String anagram8Answer4="Accounting standards";
			String anagram8Answer5="Tax";
			String anagram8Answer6="Economic outlook";
			String anagram8Answer7="Governance - corporate";
			String anagram8Answer8="Risk managment requirements";
			String anagram8Answer9="Experience from overseas";
			String anagram8Answer10="Adequacy of capital";
			String anagram8Answer11="Trends - demographic";
			String anagram8Answer12="Lifestyle considerations";
			String anagram8Answer13="Institutional structure";
			String anagram8Answer14="Social and cultural trends";
			String anagram8Answer15="Technology";
			String anagram8Answer16="State benefits";

			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram8Anagram);
			
			String anagram9Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram9Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram9Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram9Answer7SubString = anagram8Answer7.substring(0, 1);
			String anagram9Answer8SubString = anagram8Answer8.substring(0, 1);
			String anagram9Answer9SubString = anagram8Answer9.substring(0, 1);
			String anagram9Answer10SubString = anagram8Answer10.substring(0, 1);
			String anagram9Answer11SubString = anagram8Answer11.substring(0, 1);
			String anagram9Answer12SubString = anagram8Answer12.substring(0, 1);
			String anagram9Answer13SubString = anagram8Answer13.substring(0, 1);
			String anagram9Answer14SubString = anagram8Answer14.substring(0, 1);
			String anagram9Answer15SubString = anagram8Answer15.substring(0, 1);
			String anagram9Answer16SubString = anagram8Answer16.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);
			CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);
			CAX1Answer1Letter11 = (TextView) findViewById(R.id.CAX1Answer1Letter11);
			CAX1Answer1Letter12 = (TextView) findViewById(R.id.CAX1Answer1Letter12);
			CAX1Answer1Letter13 = (TextView) findViewById(R.id.CAX1Answer1Letter13);
			CAX1Answer1Letter14 = (TextView) findViewById(R.id.CAX1Answer1Letter14);
			CAX1Answer1Letter15 = (TextView) findViewById(R.id.CAX1Answer1Letter15);
			CAX1Answer1Letter16 = (TextView) findViewById(R.id.CAX1Answer1Letter16);

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);
			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);
			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			CAX1Answer1Letter5.setText(anagram9Answer5SubString);
			CAX1Answer1Letter6.setText(anagram9Answer6SubString);
			CAX1Answer1Letter7.setText(anagram9Answer7SubString);
			CAX1Answer1Letter8.setText(anagram9Answer8SubString);
			CAX1Answer1Letter9.setText(anagram9Answer9SubString);
			CAX1Answer1Letter10.setText(anagram9Answer10SubString);
			CAX1Answer1Letter11.setText(anagram9Answer11SubString);
			CAX1Answer1Letter12.setText(anagram9Answer12SubString);
			CAX1Answer1Letter13.setText(anagram9Answer13SubString);
			CAX1Answer1Letter14.setText(anagram9Answer14SubString);
			CAX1Answer1Letter15.setText(anagram9Answer15SubString);
			CAX1Answer1Letter16.setText(anagram9Answer16SubString);
		}

		if(randomInt == 9){

			String anagram9Anagram ="GRIP" ;
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram9Anagram);
			
			String anagram9Answer1="Give confidence in the financial system";
			String anagram9Answer2="Reduce financial crime";
			String anagram9Answer3="Correct inefficiencies in the market and promote efficient and orderly markets";
			String anagram9Answer4="Protect consumers of financial products";

			
			
			String anagram9Answer1SubString = anagram9Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram9Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram9Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram9Answer4.substring(0, 1);
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);
			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);
			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			
		}

		if(randomInt == 10){

			String anagram10Anagram ="DAC IBURRR";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram10Anagram);
			
			String anagram8Answer1="Direct costs";
			String anagram8Answer2="Admin costs";
			String anagram8Answer3="Complicance costs";
			String anagram8Answer4="Indirect costs";
			String anagram8Answer5="Behaviour change in consumers, false sense of security, reduced sense of responsibility for own actions";
			String anagram8Answer6="Undermining the sense of responsibility amongst advisors and intermediaries";
			String anagram8Answer7="Reduction in consumer protection mechanisms";
			String anagram8Answer8="Reduced product innovation";
			String anagram8Answer9="Reduced competition";


			
			
			String anagram9Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram9Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram9Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram9Answer7SubString = anagram8Answer7.substring(0, 1);
			String anagram9Answer8SubString = anagram8Answer8.substring(0, 1);
			String anagram9Answer9SubString = anagram8Answer9.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);		CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			CAX1Answer1Letter5.setText(anagram9Answer5SubString);			CAX1Answer1Letter6.setText(anagram9Answer6SubString);
			CAX1Answer1Letter7.setText(anagram9Answer7SubString);			CAX1Answer1Letter8.setText(anagram9Answer8SubString);
			CAX1Answer1Letter9.setText(anagram9Answer9SubString);
		}

		if(randomInt == 11){

			String anagram11Anagram ="SERVICE";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram11Anagram);
			
			String anagram8Answer1="Setting sanctions";
			String anagram8Answer2="Enforcing regulations";
			String anagram8Answer3="Reviewing and influencing government policy";
			String anagram8Answer4="Vetting and registering firms and individuals";
			String anagram8Answer5="Investigating breaches";
			String anagram8Answer6="Checking management and conduct of providers";
			String anagram8Answer7="Educating consumers and the public";


			
			
			String anagram9Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram9Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram9Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram9Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram9Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram9Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram9Answer7SubString = anagram8Answer7.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);

			CAX1Answer1Letter1.setText(anagram9Answer1SubString);			CAX1Answer1Letter2.setText(anagram9Answer2SubString);
			CAX1Answer1Letter3.setText(anagram9Answer3SubString);			CAX1Answer1Letter4.setText(anagram9Answer4SubString);
			CAX1Answer1Letter5.setText(anagram9Answer5SubString);			CAX1Answer1Letter6.setText(anagram9Answer6SubString);
			CAX1Answer1Letter7.setText(anagram9Answer7SubString);
		}

		if(randomInt == 12){

			String anagram12Anagram ="CISCO";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram12Anagram);
			
			String anagram8Answer1="Capital adequacy of provider";
			String anagram8Answer2="Integrity, competence of practitioners";
			String anagram8Answer3="Stock exchange requirements";
			String anagram8Answer4="Compensation schemes";
			String anagram8Answer5="Orderly and transparent markets";


			
			
			String anagram12Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram12Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram12Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram12Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram12Answer5SubString = anagram8Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);

			CAX1Answer1Letter1.setText(anagram12Answer1SubString);
			CAX1Answer1Letter2.setText(anagram12Answer2SubString);
			CAX1Answer1Letter3.setText(anagram12Answer3SubString);
			CAX1Answer1Letter4.setText(anagram12Answer4SubString);
			CAX1Answer1Letter5.setText(anagram12Answer5SubString);
		}

		if(randomInt == 13){

			String anagram13Anagram ="FOP";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram13Anagram);
			
			String anagram13Answer1="Freedom of action";
			String anagram13Answer2="Outcome based";
			String anagram13Answer3="Prescriptive";


			
			
			String anagram13Answer1SubString = anagram13Answer1.substring(0, 1); 
			String anagram13Answer2SubString = anagram13Answer2.substring(0, 1);
			String anagram13Answer3SubString = anagram13Answer3.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);

			CAX1Answer1Letter1.setText(anagram13Answer1SubString);
			CAX1Answer1Letter2.setText(anagram13Answer2SubString);
			CAX1Answer1Letter3.setText(anagram13Answer3SubString);
		}

		if(randomInt == 14){

			String anagram14Anagram = "MUSSV";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram14Anagram);
			
			String anagram14Answer1="Mixed regime";
			String anagram14Answer2="Unregulated markets";
			String anagram14Answer3="Statutory";
			String anagram14Answer4="Self-regulation";
			String anagram14Answer5="Voluntary codes of conduct";


			
			
			String anagram14Answer1SubString = anagram14Answer1.substring(0, 1); 
			String anagram14Answer2SubString = anagram14Answer2.substring(0, 1);
			String anagram14Answer3SubString = anagram14Answer3.substring(0, 1);
			String anagram14Answer4SubString = anagram14Answer4.substring(0, 1);
			String anagram14Answer5SubString = anagram14Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(anagram14Answer1SubString);
			CAX1Answer1Letter2.setText(anagram14Answer2SubString);
			CAX1Answer1Letter3.setText(anagram14Answer3SubString);
			CAX1Answer1Letter4.setText(anagram14Answer4SubString);
			CAX1Answer1Letter5.setText(anagram14Answer5SubString);
		}
		
		if (randomInt==15){
			
			String anagram14Anagram ="CRIED PIC";
			
			textViewCAX1 = (TextView) findViewById(R.id.PullTestStringCAX1);//take in string
			textViewCAX1.setText(anagram14Anagram);
			
			String anagram8Answer1="Cooling-off period";
			String anagram8Answer2="Regulation of selling practices - eg commission";
			String anagram8Answer3="Impose price controls";
			String anagram8Answer4="Educate consumers";
			String anagram8Answer5="Disclosure";
			String anagram8Answer6="Public available restriction of knowledge";
			String anagram8Answer7="Insider-trading regulation";
			String anagram8Answer8="Chinese walls";


			
			
			String anagram14Answer1SubString = anagram8Answer1.substring(0, 1); 
			String anagram14Answer2SubString = anagram8Answer2.substring(0, 1);
			String anagram14Answer3SubString = anagram8Answer3.substring(0, 1);
			String anagram14Answer4SubString = anagram8Answer4.substring(0, 1);
			String anagram14Answer5SubString = anagram8Answer5.substring(0, 1);
			String anagram14Answer6SubString = anagram8Answer6.substring(0, 1);
			String anagram14Answer7SubString = anagram8Answer7.substring(0, 1);
			String anagram14Answer8SubString = anagram8Answer8.substring(0, 1);
			
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);
			CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			
			CAX1Answer1Letter1.setText(anagram14Answer1SubString);
			CAX1Answer1Letter2.setText(anagram14Answer2SubString);
			CAX1Answer1Letter3.setText(anagram14Answer3SubString);
			CAX1Answer1Letter4.setText(anagram14Answer4SubString);
			CAX1Answer1Letter5.setText(anagram14Answer5SubString);
			CAX1Answer1Letter6.setText(anagram14Answer6SubString);
			CAX1Answer1Letter7.setText(anagram14Answer7SubString);
			CAX1Answer1Letter8.setText(anagram14Answer8SubString);
		}



	}

	public void onClickTestYourselfAnagramCAX1(View v)
	{
		
		if (randomInt==1)
		{
			
			String anagram1Answer1="The general economic and commercial environment";
			String anagram1Answer2="Specifying the problem";
			String anagram1Answer3="Developing the solution";
			String anagram1Answer4="Monitoring the experience";
			String anagram1Answer5="Professionalism";
			
			
			
			String anagram1Answer1SubString = anagram1Answer1.substring(0, 1); 
			String anagram1Answer2SubString = anagram1Answer2.substring(0, 1);
			String anagram1Answer3SubString = anagram1Answer3.substring(0, 1);
			String anagram1Answer4SubString = anagram1Answer4.substring(0, 1);
			String anagram1Answer5SubString = anagram1Answer5.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);
			
			CAX1Answer1Letter1.setText(anagram1Answer1SubString);
			CAX1Answer1Letter2.setText(anagram1Answer2SubString);
			CAX1Answer1Letter3.setText(anagram1Answer3SubString);
			CAX1Answer1Letter4.setText(anagram1Answer4SubString);
			CAX1Answer1Letter5.setText(anagram1Answer5SubString);
			
			String Acronym="TSDMP";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==2)
		{
			
			String anagram2Answer1="Estimation of the financial impact of uncertain future events";
			String anagram2Answer2="Allow for the impact of legislation, regulation, taxation, competition";
			String anagram2Answer3="Recognition of stakeholders requirements and risk profiles";
			String anagram2Answer4="A long term rather than short term horizon";
			String anagram2Answer5="Use of assumptions based on appropriate historical experience";
			String anagram2Answer6="Interpretation of the results of modelling to enable practical strategies to be developed";
			String anagram2Answer7="Decisions need to be made in the short term in light of likely future outcomes";
			String anagram2Answer8="Use of models to represent future financial outcomes";
			String anagram2Answer9="Monitoring and periodically analysing the emerging experience";
			String anagram2Answer10="Modifying models/strategies in light of this emerging experience";

			
			
			String anagram2Answer1SubString = anagram2Answer1.substring(0, 1); 
			String anagram2Answer2SubString = anagram2Answer2.substring(0, 1);
			String anagram2Answer3SubString = anagram2Answer3.substring(0, 1);
			String anagram2Answer4SubString = anagram2Answer4.substring(0, 1);
			String anagram2Answer5SubString = anagram2Answer5.substring(0, 1);
			String anagram2Answer6SubString = anagram2Answer6.substring(0, 1);
			String anagram2Answer7SubString = anagram2Answer7.substring(0, 1);
			String anagram2Answer8SubString = anagram2Answer8.substring(0, 1);
			String anagram2Answer9SubString = anagram2Answer9.substring(0, 1);
			String anagram2Answer10SubString = anagram2Answer10.substring(0, 1);
			
			CAX1Answer1Letter1 = (TextView) findViewById(R.id.CAX1Answer1Letter1);		CAX1Answer1Letter2 = (TextView) findViewById(R.id.CAX1Answer1Letter2);
			CAX1Answer1Letter3 = (TextView) findViewById(R.id.CAX1Answer1Letter3);		CAX1Answer1Letter4 = (TextView) findViewById(R.id.CAX1Answer1Letter4);
			CAX1Answer1Letter5 = (TextView) findViewById(R.id.CAX1Answer1Letter5);		CAX1Answer1Letter6 = (TextView) findViewById(R.id.CAX1Answer1Letter6);
			CAX1Answer1Letter7 = (TextView) findViewById(R.id.CAX1Answer1Letter7);		CAX1Answer1Letter8 = (TextView) findViewById(R.id.CAX1Answer1Letter8);
			CAX1Answer1Letter9 = (TextView) findViewById(R.id.CAX1Answer1Letter9);		CAX1Answer1Letter10 = (TextView) findViewById(R.id.CAX1Answer1Letter10);

			CAX1Answer1Letter1.setText(anagram2Answer1SubString);
			CAX1Answer1Letter2.setText(anagram2Answer2SubString);
			CAX1Answer1Letter3.setText(anagram2Answer3SubString);
			CAX1Answer1Letter4.setText(anagram2Answer4SubString);
			CAX1Answer1Letter5.setText(anagram2Answer5SubString);
			CAX1Answer1Letter6.setText(anagram2Answer6SubString);
			CAX1Answer1Letter7.setText(anagram2Answer7SubString);
			CAX1Answer1Letter8.setText(anagram2Answer8SubString);
			CAX1Answer1Letter9.setText(anagram2Answer9SubString);
			CAX1Answer1Letter10.setText(anagram2Answer10SubString);
			
			String Acronym="FIST AID MMM";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			

			String Acronym="JAMMED CAR CAVIL";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			String Acronym="BASTARD";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			String Acronym="CERAMIC FAD";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
			String Acronym="BBC TEAM PIESS";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			String Acronym="FIR";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			String Acronym="CREATE GREAT LISTS";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			String Acronym="GRIP";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			String Acronym="DAC IBURRR";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			String Acronym="SERVICE";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==12){
			
			String Acronym="CISCO";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==13){
			
			String Acronym="FOP";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==14){
			
			String Acronym="MUSSV";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==15){
			
			String Acronym="CRIED PIC";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#006400"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setTextColor(Color.parseColor("#FF0000"));
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
	}
	
	public void onClickTestYourselfTitleCAX1(View v)
	{
		if (randomInt==1)
		{
			
			String Acronym="The Actuarial Control Cycle (ACC)";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
				//colours
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
				//colours
				//input first letters of ACRONYM...
			}
			
		}

		if (randomInt==2)
		{
			
			String Acronym="What makes the ACC actuarial";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==3)
		{
			

			String Acronym="What actuaries do?";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}

		if (randomInt==4)
		{
			
			String Acronym="How to be a professional";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}
		}
		if (randomInt==5)
		{
			
			String Acronym="Carrying out an actuarial task";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		
		if (randomInt==6)
		{
			
			String Acronym="Possible clients actuaries advise";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==7){
			
			String Acronym="Types of advice";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==8){
			
			String Acronym="The External Environment";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==9){
			
			String Acronym="The aims of regulation";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==10){
			
			String Acronym="Cost of regulation";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==11){
			
			String Acronym="Fuctions of a regulator";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==12){
			
			String Acronym="Regulation - Maintaing confidence";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==13){
			
			String Acronym="Forms of regulation";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==14){
			
			String Acronym="Types of regulatory regime";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
		if (randomInt==15){
			
			String Acronym="Methods of reducing asymmetric information";

			EditTextTestCAX1 = (EditText)findViewById(R.id.EditTextTestCAX1);
			useranswerCAX1=EditTextTestCAX1.getText().toString();
			TextViewTitleAnswerCAX1 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX1);

			if(Acronym.equals(useranswerCAX1)){
				TextViewTitleAnswerCAX1.setText(Acronym);
			}else{
				TextViewTitleAnswerCAX1.setText(Acronym);
			}

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cax1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_cax1, container,
					false);
			return rootView;
		}
	}

}
*/