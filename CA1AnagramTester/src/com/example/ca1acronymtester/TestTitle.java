package com.example.ca1acronymtester;


import java.util.Random;								
import com.example.ca1anagramtester.R;

import android.support.v7.app.ActionBarActivity;		
import android.support.v4.app.Fragment;					import android.os.Bundle;						import android.view.LayoutInflater;				
import android.view.Menu;								import android.view.MenuItem;					import android.view.View;	
import android.view.ViewGroup;							import android.widget.EditText;					import android.widget.TextView;

public class TestTitle extends ActionBarActivity {

	EditText EditTextTest;
	TextView TextViewTitleAnswer;				TextView textView2;	TextView ShowTitle; TextView textView;
	String useranswer;
	
	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_title);


		EditTextTest = (EditText)findViewById(R.id.EditTextTest);
		textView = (TextView) findViewById(R.id.PullTestString);
		TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswer);
		
		



		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container, new PlaceholderFragment()).commit();
		}



	}

	public void onClickGetTitle(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(4)+1;//when you click "Display Database"

		if(randomInt == 1){
			
			String anagram1Title = "The Actuarial Control Cycle (ACC)";
			String anagram1Acronym = "TSDMP";
			String anagram1Answer1="The general economic and commercial environment";
			String anagram1Answer2="Specifying the problem";
			String anagram1Answer3="Developing the solution";
			String anagram1Answer4="Monitoring the experience";
			String anagram1Answer5="Professionalism";
			
			textView = (TextView) findViewById(R.id.PullTestString);//take in string
			textView.setText(anagram1Title);


		}

		if(randomInt == 2){

			String anagram2Title = "What makes the ACC actuarial";
			String anagram2Acronym = "FIST AID MMM";
			String anagran2Answer1="Estimation of the financial impact of uncertain future events";
			String anagran2Answer2="Allow for the impact of legislation, regulation, taxation, competition";
			String anagran2Answer3="Recognition of stakeholders requirements and risk profiles";
			String anagran2Answer4="A long term rather than short term horizon";
			String anagran2Answer5="Use of assumptions based on appropriate historical experience";
			String anagran2Answer6="Interpretation of the results of modelling to enable practical strategies to be developed";
			String anagran2Answer7="Decisions need to be made in the short term in light of likely future outcomes";
			String anagran2Answer8="Use of models to represent future financial outcomes";
			String anagran2Answer9="Monitoring and periodically analysing the emerging experience";
			String anagran2Answer10="Modifying models/strategies in light of this emerging experience";
			
			textView = (TextView) findViewById(R.id.PullTestString);//take in string
			textView.setText(anagram2Title);



		}

		if(randomInt == 3){

			String anagram3Title = "What actuaries do?";
			String anagram3Acronym = "JAMMED CAR CAVIL";
			String anagram3Answer1="J";
			String anagram3Answer2="A";
			String anagram3Answer3="M";
			String anagram3Answer4="M";
			String anagram3Answer5="E";
			String anagram3Answer6="D";
			String anagram3Answer7="C";
			String anagram3Answer8="A";
			String anagram3Answer9="R";
			String anagram3Answer10="C";
			String anagram3Answer11="A";
			String anagram3Answer12="V";
			String anagram3Answer13="I";
			String anagram3Answer14="L";
			
			textView = (TextView) findViewById(R.id.PullTestString);//take in string
			textView.setText(anagram3Title);

		}

		if(randomInt == 4){

			String anagram4Title = "How to be a professional";
			String anagram4Acronym = "BASTARD";
			String anagram4Answer1="Being reliable (detail, quality, timeliness)";
			String anagram4Answer2="Acting with integrity and detachment from personal circumstances";
			String anagram4Answer3;
			String anagram4Answer4="Taking responsibility for decisions";
			String anagram4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String anagram4Answer6="Recognising that others have valid views";
			String anagram4Answer7="Developing a direct and trusting relationship with the client";
			
			textView = (TextView) findViewById(R.id.PullTestString);//take in string
			textView.setText(anagram4Title);
		}

		}
	
	public void onClickTestYourself(View v)
	{
		if (randomInt==1)
		{
			String [] anagram_1 = {"The Actuarial Control Cycle (ACC)","TSDMP","The general economic and commercial environment"
					,"Specifying the problem","Developing the solution","Monitoring the experience","Professionalism"};
			String Acronym=anagram_1[1];
			
			EditTextTest = (EditText)findViewById(R.id.EditTextTest);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswer);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswer.setText("You have guessed incorrectly. Your guess = "+useranswer+" correct answer = "+Acronym);
			}
		}
		
		if (randomInt==2)
		{
			String [] anagram_2 = {"What makes the ACC actuarial","FIST AID MMM","Estimation of the financial impact of uncertain future events"
					,"Allow for the impact of legislation, regulation, taxation, competition","Recognition of stakeholders requirements and risk profiles","A long term rather than short term horizon"
					,"Use of assumptions based on appropriate historical experience","Interpretation of the results of modelling to enable practical strategies to be developed",
					"Decisions need to be made in the short term in light of likely future outcomes","Use of models to represent future financial outcomes",
					"Monitoring and periodically analysing the emerging experience","Modifying models/strategies in light of this emerging experience"};
			String Acronym=anagram_2[1];
			
			EditTextTest = (EditText)findViewById(R.id.EditTextTest);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswer);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswer.setText("You have guessed incorrectly. Your guess = "+useranswer+" correct answer = "+Acronym);
			}
		}
		
		if (randomInt==3)
		{
			String [] anagram_3 = {"What actuaries do?","JAMMED CAR CAVIL","J","A","M","M","E","D","C","A","R","C","A","V","I","L"};

			String Acronym=anagram_3[1];
			
			EditTextTest = (EditText)findViewById(R.id.EditTextTest);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswer);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswer.setText("You have guessed incorrectly. Your guess = "+useranswer+" correct answer = "+Acronym);
			}
		}
		
		if (randomInt==4)
		{
			String [] anagram_4 = {"How to be a professional","BASTARD","Being reliable (detail, quality, timeliness)","Acting with integrity and detachment from personal circumstances","Taking responsibility for decisions","Achieving/demonstrating/maintaining/improving competence"
					,"Recognising that others have valid views","Developing a direct and trusting relationship with the client"};
			String Acronym=anagram_4[1];
			
			EditTextTest = (EditText)findViewById(R.id.EditTextTest);
			useranswer=EditTextTest.getText().toString();
			TextViewTitleAnswer = (TextView) findViewById(R.id.TextViewTitleAnswer);

			if(Acronym.equals(useranswer)){
				TextViewTitleAnswer.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswer.setText("You have guessed incorrectly. Your guess = "+useranswer+" correct answer = "+Acronym);
			}
		}
	}



		

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {

			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.test_title, menu);
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
		 */
		public static class PlaceholderFragment extends Fragment {

			public PlaceholderFragment() {
			}

			@Override
			public View onCreateView(LayoutInflater inflater, ViewGroup container,
					Bundle savedInstanceState) {
				View rootView = inflater.inflate(R.layout.fragment_test_title,
						container, false);
				return rootView;
			}
		}

	}
