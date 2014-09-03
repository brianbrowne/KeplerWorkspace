package com.example.ca1acronymtester;

import java.util.Random;

import com.example.ca1anagramtester.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
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
import android.os.Build;

public class CA1X2 extends ActionBarActivity {

	EditText EditTextTestCAX2;			TextView TextViewTitleAnswerCAX2;			TextView textViewCAX2;
	String useranswerCAX2;

	EditText EditTextCAX2Answer1;		EditText EditTextCAX2Answer2;		EditText EditTextCAX2Answer3;
	EditText EditTextCAX2Answer4;		EditText EditTextCAX2Answer5;		EditText EditTextCAX2Answer6;
	EditText EditTextCAX2Answer7;		EditText EditTextCAX2Answer8;		EditText EditTextCAX2Answer9;
	EditText EditTextCAX2Answer10;		EditText EditTextCAX2Answer11;		EditText EditTextCAX2Answer12;
	EditText EditTextCAX2Answer13;		EditText EditTextCAX2Answer14;		EditText EditTextCAX2Answer15;		EditText EditTextCAX2Answer16;
	EditText EditTextCAX2Answer17;		EditText EditTextCAX2Answer18;

	TextView CAX2Answer1Letter1;		TextView CAX2Answer1Letter2;		TextView CAX2Answer1Letter3;
	TextView CAX2Answer1Letter4;		TextView CAX2Answer1Letter5;		TextView CAX2Answer1Letter6;
	TextView CAX2Answer1Letter7;		TextView CAX2Answer1Letter8;		TextView CAX2Answer1Letter9;
	TextView CAX2Answer1Letter10;		TextView CAX2Answer1Letter11;		TextView CAX2Answer1Letter12;
	TextView CAX2Answer1Letter13;		TextView CAX2Answer1Letter14;		TextView CAX2Answer1Letter15;		TextView CAX2Answer1Letter16;
	TextView CAX2Answer1Letter17;		TextView CAX2Answer1Letter18;


	TextView textViewAnswer1CAX2;		TextView textViewAnswer2CAX2;		TextView textViewAnswer3CAX2;		TextView textViewAnswer4CAX2;
	TextView textViewAnswer5CAX2;		TextView textViewAnswer6CAX2;		TextView textViewAnswer7CAX2;		TextView textViewAnswer8CAX2;
	TextView textViewAnswer9CAX2;		TextView textViewAnswer10CAX2;		TextView textViewAnswer11CAX2;		TextView textViewAnswer12CAX2;
	TextView textViewAnswer13CAX2;		TextView textViewAnswer14CAX2;		TextView textViewAnswer15CAX2;		TextView textViewAnswer16CAX2;
	TextView textViewAnswer17CAX2;		TextView textViewAnswer18CAX2;

	int randomInt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ca1_x2);

		EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
		textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);
		TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);


		CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
		CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
		CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
		CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);
		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);		CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);
		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);		CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);
		CAX2Answer1Letter15 = (TextView) findViewById(R.id.CAX2Answer1Letter15);		CAX2Answer1Letter16 = (TextView) findViewById(R.id.CAX2Answer1Letter16);
		CAX2Answer1Letter17 = (TextView) findViewById(R.id.CAX2Answer1Letter17);		CAX2Answer1Letter18 = (TextView) findViewById(R.id.CAX2Answer1Letter18);


		EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
		EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
		EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);		EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
		EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);		EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
		EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);		EditTextCAX2Answer10 = (EditText)findViewById(R.id.EditTextCAX2Answer10);
		EditTextCAX2Answer11 = (EditText)findViewById(R.id.EditTextCAX2Answer11);		EditTextCAX2Answer12 = (EditText)findViewById(R.id.EditTextCAX2Answer12);
		EditTextCAX2Answer13 = (EditText)findViewById(R.id.EditTextCAX2Answer13);		EditTextCAX2Answer14 = (EditText)findViewById(R.id.EditTextCAX2Answer14);
		EditTextCAX2Answer15 = (EditText)findViewById(R.id.EditTextCAX2Answer15);		EditTextCAX2Answer16 = (EditText)findViewById(R.id.EditTextCAX2Answer16);
		EditTextCAX2Answer17 = (EditText)findViewById(R.id.EditTextCAX2Answer17);		EditTextCAX2Answer18 = (EditText)findViewById(R.id.EditTextCAX2Answer18);


		textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
		textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
		textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
		textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
		textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		textViewAnswer10CAX2 = (TextView) findViewById(R.id.textViewAnswer10CAX2);
		textViewAnswer11CAX2 = (TextView) findViewById(R.id.textViewAnswer11CAX2);		textViewAnswer12CAX2 = (TextView) findViewById(R.id.textViewAnswer12CAX2);
		textViewAnswer13CAX2 = (TextView) findViewById(R.id.textViewAnswer13CAX2);		textViewAnswer14CAX2 = (TextView) findViewById(R.id.textViewAnswer14CAX2);
		textViewAnswer15CAX2 = (TextView) findViewById(R.id.textViewAnswer15CAX2);		textViewAnswer16CAX2 = (TextView) findViewById(R.id.textViewAnswer16CAX2);
		textViewAnswer17CAX2 = (TextView) findViewById(R.id.textViewAnswer17CAX2);		textViewAnswer18CAX2 = (TextView) findViewById(R.id.textViewAnswer18CAX2);


		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
			.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	public void onClickCAX2TestAnswers(View v)
	{
		if (randomInt==1)
		{

			String anagram1Answer1="Reinsurance contracts";
			String anagram1Answer2="Insurance contracts";
			String anagram1Answer3="Pension schemes";
			String anagram1Answer4="Investment schemes";
			String anagram1Answer5="Derivatives"; 


			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);


			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);

			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();

			if(anagram1Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX2.setText("You have guessed the right answer. Acronym = "+ anagram1Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX21+" correct answer = "+anagram1Answer1);
			}

			if(anagram1Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX2.setText("You have guessed the right answer. Acronym = "+ anagram1Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX22+" correct answer = "+anagram1Answer2);
			}

			if(anagram1Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX2.setText("You have guessed the right answer. Acronym = "+ anagram1Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX23+" correct answer = "+anagram1Answer3);
			}

			if(anagram1Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX2.setText("You have guessed the right answer. Acronym = "+ anagram1Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX24+" correct answer = "+anagram1Answer4);
			}

			if(anagram1Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX2.setText("You have guessed the right answer. Acronym = "+ anagram1Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX25+" correct answer = "+anagram1Answer5);
			}
		}
		if(randomInt==2){


			String anagram2Answer1="Financial institutions";
			String anagram2Answer2="Individuals";
			String anagram2Answer3="Other corporations";
			String anagram2Answer4="Employers";
			String anagram2Answer5="The State";
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);	


			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);	

			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();

			if(anagram2Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX2.setText("You have guessed the right answer. Acronym = "+ anagram2Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX21+" correct answer = "+anagram2Answer1);
			}

			if(anagram2Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX2.setText("You have guessed the right answer. Acronym = "+ anagram2Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX22+" correct answer = "+anagram2Answer2);
			}

			if(anagram2Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX2.setText("You have guessed the right answer. Acronym = "+ anagram2Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX23+" correct answer = "+anagram2Answer3);
			}

			if(anagram2Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX2.setText("You have guessed the right answer. Acronym = "+ anagram2Answer1);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX24+" correct answer = "+anagram2Answer4);
			}

			if(anagram2Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX2.setText("You have guessed the right answer. Acronym = "+ anagram2Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX25+" correct answer = "+anagram2Answer5);
			}

			

		}
		if(randomInt==3){


			String anagram3Answer1="Claim, frequency, amount, volatility and delays";
			String anagram3Answer2="Accumulations of risk (geographical and by class of business) and catastrophes";
			String anagram3Answer3="Poor persistency ie high laspses and low renewals";
			String anagram3Answer4="Expenses being higher than expected";
			String anagram3Answer5="Investment risks eg poor or volatile returns, falls in asset values, default risk";
			String anagram3Answer6="Credit risk ie failure of a counterparty such as a reinsurer or a broker";
			String anagram3Answer7="Operational risks eg fraud, systems failure, regulatory charges";
			String anagram3Answer8="New business volumes too high and hence new business strain, or too low and not enough business over which to spread overheads";
			
			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);		EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);		EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
			

			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
			
			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();		String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();		String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();		String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();		String checkuseranswerCAX28=EditTextCAX2Answer8.getText().toString();
			
			if(anagram3Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX21+" correct answer = "+anagram3Answer1);
			}

			if(anagram3Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX22+" correct answer = "+anagram3Answer2);
			}

			if(anagram3Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX23+" correct answer = "+anagram3Answer3);
			}

			if(anagram3Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX24+" correct answer = "+anagram3Answer4);
			}

			if(anagram3Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX25+" correct answer = "+anagram3Answer5);
			}

			if(anagram3Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX26+" correct answer = "+anagram3Answer6);
			}

			if(anagram3Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX27+" correct answer = "+anagram3Answer7);
			}

			if(anagram3Answer8.equals(checkuseranswerCAX28)){
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX2.setText("You have guessed the right answer. Acronym = "+ anagram3Answer8);
			}else{
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX28+" correct answer = "+anagram3Answer8);
			}

			

		}
		if(randomInt==4){

			//conti nue from here 
			
			String anagram4Answer1="Being reliable (detail, quality, timeliness)";
			String anagram4Answer2="Acting with integrity and detachment from personal circumstances";
			String anagram4Answer3="Skilled communication";
			String anagram4Answer4="Taking responsibility for decisions";
			String anagram4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String anagram4Answer6="Recognising that others have valid views";
			String anagram4Answer7="Developing a direct and trusting relationship with the client";
			//String anagram4Answer8=
			//String anagram4Answer9=

			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);
			EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);


			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);
			textViewAnswer6CAX2 = (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);

			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();
			String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();

			if(anagram4Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX2.setText("You have guessed the right answer. Acronym = "+ anagram4Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX21+" correct answer = "+anagram4Answer1);
			}

			if(anagram4Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX2.setText("You have guessed the right answer. Acronym = "+ anagram4Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX22+" correct answer = "+anagram4Answer2);
			}

			if(anagram4Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX2.setText("You have guessed the right answer. Acronym = "+ anagram4Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX23+" correct answer = "+anagram4Answer3);
			}

			if(anagram4Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX2.setText("You have guessed the right answer. Acronym = "+ anagram4Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX24+" correct answer = "+anagram4Answer4);
			}

			if(anagram4Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX2.setText("You have guessed the right answer. Acronym = "+ anagram4Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX25+" correct answer = "+anagram4Answer5);
			}

			if(anagram4Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX2.setText("You have guessed the right answer. Acronym = "+ anagram4Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX26+" correct answer = "+anagram4Answer6);
			}

			if(anagram4Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX2.setText("You have guessed the right answer. Acronym = "+ anagram4Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX27+" correct answer = "+anagram4Answer7);
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

			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);
			EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);
			EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
			EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);
			EditTextCAX2Answer10 = (EditText)findViewById(R.id.EditTextCAX2Answer10);
			EditTextCAX2Answer11 = (EditText)findViewById(R.id.EditTextCAX2Answer11);

			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2= (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
			textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		textViewAnswer10CAX2= (TextView) findViewById(R.id.textViewAnswer10CAX2);
			textViewAnswer11CAX2 = (TextView) findViewById(R.id.textViewAnswer11CAX2);		


			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();	String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();	String checkuseranswerCAX28=EditTextCAX2Answer8.getText().toString();
			String checkuseranswerCAX29=EditTextCAX2Answer9.getText().toString();	String checkuseranswerCAX210=EditTextCAX2Answer10.getText().toString();
			String checkuseranswerCAX211=EditTextCAX2Answer11.getText().toString();

			if(anagram5Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX21+" correct answer = "+anagram5Answer1);
			}

			if(anagram5Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX22+" correct answer = "+anagram5Answer2);
			}

			if(anagram5Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX23+" correct answer = "+anagram5Answer3);
			}

			if(anagram5Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX24+" correct answer = "+anagram5Answer4);
			}

			if(anagram5Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX25+" correct answer = "+anagram5Answer5);
			}

			if(anagram5Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX26+" correct answer = "+anagram5Answer6);
			}

			if(anagram5Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX27+" correct answer = "+anagram5Answer7);
			}

			if(anagram5Answer8.equals(checkuseranswerCAX28)){
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer8);
			}else{
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX28+" correct answer = "+anagram5Answer8);
			}

			if(anagram5Answer9.equals(checkuseranswerCAX29)){
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer9);
			}else{
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX29+" correct answer = "+anagram5Answer9);
			}

			if(anagram5Answer10.equals(checkuseranswerCAX210)){
				textViewAnswer10CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer10);
			}else{
				textViewAnswer10CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX28+" correct answer = "+anagram5Answer10);
			}

			if(anagram5Answer11.equals(checkuseranswerCAX211)){
				textViewAnswer11CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer11CAX2.setText("You have guessed the right answer. Acronym = "+ anagram5Answer11);
			}else{
				textViewAnswer11CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX211+" correct answer = "+anagram5Answer11);
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


			EditTextCAX2Answer1 = (EditText)findViewById(R.id.EditTextCAX2Answer1);		EditTextCAX2Answer2 = (EditText)findViewById(R.id.EditTextCAX2Answer2);
			EditTextCAX2Answer3 = (EditText)findViewById(R.id.EditTextCAX2Answer3);		EditTextCAX2Answer4 = (EditText)findViewById(R.id.EditTextCAX2Answer4);
			EditTextCAX2Answer5 = (EditText)findViewById(R.id.EditTextCAX2Answer5);
			EditTextCAX2Answer6 = (EditText)findViewById(R.id.EditTextCAX2Answer6);
			EditTextCAX2Answer7 = (EditText)findViewById(R.id.EditTextCAX2Answer7);
			EditTextCAX2Answer8 = (EditText)findViewById(R.id.EditTextCAX2Answer8);
			EditTextCAX2Answer9 = (EditText)findViewById(R.id.EditTextCAX2Answer9);
			EditTextCAX2Answer10 = (EditText)findViewById(R.id.EditTextCAX2Answer10);
			EditTextCAX2Answer11 = (EditText)findViewById(R.id.EditTextCAX2Answer11);

			textViewAnswer1CAX2 = (TextView) findViewById(R.id.textViewAnswer1CAX2);		textViewAnswer2CAX2= (TextView) findViewById(R.id.textViewAnswer2CAX2);
			textViewAnswer3CAX2 = (TextView) findViewById(R.id.textViewAnswer3CAX2);		textViewAnswer4CAX2 = (TextView) findViewById(R.id.textViewAnswer4CAX2);
			textViewAnswer5CAX2 = (TextView) findViewById(R.id.textViewAnswer5CAX2);		textViewAnswer6CAX2= (TextView) findViewById(R.id.textViewAnswer6CAX2);
			textViewAnswer7CAX2 = (TextView) findViewById(R.id.textViewAnswer7CAX2);		textViewAnswer8CAX2 = (TextView) findViewById(R.id.textViewAnswer8CAX2);
			textViewAnswer9CAX2 = (TextView) findViewById(R.id.textViewAnswer9CAX2);		textViewAnswer10CAX2= (TextView) findViewById(R.id.textViewAnswer10CAX2);
			textViewAnswer11CAX2 = (TextView) findViewById(R.id.textViewAnswer11CAX2);		


			String checkuseranswerCAX21=EditTextCAX2Answer1.getText().toString();	String checkuseranswerCAX22=EditTextCAX2Answer2.getText().toString();
			String checkuseranswerCAX23=EditTextCAX2Answer3.getText().toString();	String checkuseranswerCAX24=EditTextCAX2Answer4.getText().toString();
			String checkuseranswerCAX25=EditTextCAX2Answer5.getText().toString();	String checkuseranswerCAX26=EditTextCAX2Answer6.getText().toString();
			String checkuseranswerCAX27=EditTextCAX2Answer7.getText().toString();	String checkuseranswerCAX28=EditTextCAX2Answer8.getText().toString();
			String checkuseranswerCAX29=EditTextCAX2Answer9.getText().toString();	String checkuseranswerCAX210=EditTextCAX2Answer10.getText().toString();
			String checkuseranswerCAX211=EditTextCAX2Answer11.getText().toString();

			if(anagram6Answer1.equals(checkuseranswerCAX21)){
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer1CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer1);
			}else{
				textViewAnswer1CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer1CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX21+" correct answer = "+anagram6Answer1);
			}

			if(anagram6Answer2.equals(checkuseranswerCAX22)){
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer2CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer2);
			}else{
				textViewAnswer2CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer2CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX22+" correct answer = "+anagram6Answer2);
			}

			if(anagram6Answer3.equals(checkuseranswerCAX23)){
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer3CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer3);
			}else{
				textViewAnswer3CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer3CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX23+" correct answer = "+anagram6Answer3);
			}

			if(anagram6Answer4.equals(checkuseranswerCAX24)){
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer4CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer4);
			}else{
				textViewAnswer4CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer4CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX24+" correct answer = "+anagram6Answer4);
			}

			if(anagram6Answer5.equals(checkuseranswerCAX25)){
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer5CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer5);
			}else{
				textViewAnswer5CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer5CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX25+" correct answer = "+anagram6Answer5);
			}

			if(anagram6Answer6.equals(checkuseranswerCAX26)){
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer6CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer6);
			}else{
				textViewAnswer6CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer6CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX26+" correct answer = "+anagram6Answer6);
			}

			if(anagram6Answer7.equals(checkuseranswerCAX27)){
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer7CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer7);
			}else{
				textViewAnswer7CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer7CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX27+" correct answer = "+anagram6Answer7);
			}

			if(anagram6Answer8.equals(checkuseranswerCAX28)){
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer8CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer8);
			}else{
				textViewAnswer8CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer8CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX28+" correct answer = "+anagram6Answer8);
			}

			if(anagram6Answer9.equals(checkuseranswerCAX29)){
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer9CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer9);
			}else{
				textViewAnswer9CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer9CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX29+" correct answer = "+anagram6Answer9);
			}

			if(anagram6Answer10.equals(checkuseranswerCAX210)){
				textViewAnswer10CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer10CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer10);
			}else{
				textViewAnswer10CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer10CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX28+" correct answer = "+anagram6Answer10);
			}

			if(anagram6Answer11.equals(checkuseranswerCAX211)){
				textViewAnswer11CAX2.setTextColor(Color.parseColor("#00FF00"));
				textViewAnswer11CAX2.setText("You have guessed the right answer. Acronym = "+ anagram6Answer11);
			}else{
				textViewAnswer11CAX2.setTextColor(Color.parseColor("#FF0000"));
				textViewAnswer11CAX2.setText("You have guessed incorrectly. Your guess = "+checkuseranswerCAX211+" correct answer = "+anagram6Answer11);
			}




		}


	}



	public void onClickGetTitleCAX2(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(6)+1;//when you click "Display Database"
		if(randomInt == 1){

			String anagram1Title = "The Actuarial Control Cycle (ACC)";
			String anagram1Answer1="The general economic and commercial environment";
			String anagram1Answer2="Specifying the problem";
			String anagram1Answer3="Developing the solution";
			String anagram1Answer4="Monitoring the experience";
			String anagram1Answer5="Professionalism";

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram1Title);

			String anagram1Answer1SubString = anagram1Answer1.substring(0, 1); 
			String anagram1Answer2SubString = anagram1Answer2.substring(0, 1);
			String anagram1Answer3SubString = anagram1Answer3.substring(0, 1);
			String anagram1Answer4SubString = anagram1Answer4.substring(0, 1);
			String anagram1Answer5SubString = anagram1Answer5.substring(0, 1);

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);

			CAX2Answer1Letter1.setText(anagram1Answer1SubString);
			CAX2Answer1Letter2.setText(anagram1Answer2SubString);
			CAX2Answer1Letter3.setText(anagram1Answer3SubString);
			CAX2Answer1Letter4.setText(anagram1Answer4SubString);
			CAX2Answer1Letter5.setText(anagram1Answer5SubString);

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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram2Title);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
			CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);

			CAX2Answer1Letter1.setText(anagram2Answer1SubString);
			CAX2Answer1Letter2.setText(anagram2Answer2SubString);
			CAX2Answer1Letter3.setText(anagram2Answer3SubString);
			CAX2Answer1Letter4.setText(anagram2Answer4SubString);
			CAX2Answer1Letter5.setText(anagram2Answer5SubString);
			CAX2Answer1Letter6.setText(anagram2Answer6SubString);
			CAX2Answer1Letter7.setText(anagram2Answer7SubString);
			CAX2Answer1Letter8.setText(anagram2Answer8SubString);
			CAX2Answer1Letter9.setText(anagram2Answer9SubString);
			CAX2Answer1Letter10.setText(anagram2Answer10SubString);

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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram3Title);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);
			CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);
			CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);

			CAX2Answer1Letter1.setText(anagram3Answer1SubString);
			CAX2Answer1Letter2.setText(anagram3Answer2SubString);
			CAX2Answer1Letter3.setText(anagram3Answer3SubString);
			CAX2Answer1Letter4.setText(anagram3Answer4SubString);
			CAX2Answer1Letter5.setText(anagram3Answer5SubString);
			CAX2Answer1Letter6.setText(anagram3Answer6SubString);
			CAX2Answer1Letter7.setText(anagram3Answer7SubString);
			CAX2Answer1Letter8.setText(anagram3Answer8SubString);
			CAX2Answer1Letter9.setText(anagram3Answer9SubString);
			CAX2Answer1Letter10.setText(anagram3Answer10SubString);
			CAX2Answer1Letter11.setText(anagram3Answer11SubString);
			CAX2Answer1Letter12.setText(anagram3Answer12SubString);
			CAX2Answer1Letter13.setText(anagram3Answer13SubString);
			CAX2Answer1Letter14.setText(anagram3Answer14SubString);

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


			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram4Title);

			String anagram4Answer1SubString = anagram4Answer1.substring(0, 1); 
			String anagram4Answer2SubString = anagram4Answer2.substring(0, 1);
			String anagram4Answer3SubString = anagram4Answer3.substring(0, 1);
			String anagram4Answer4SubString = anagram4Answer4.substring(0, 1);
			String anagram4Answer5SubString = anagram4Answer5.substring(0, 1);
			String anagram4Answer6SubString = anagram4Answer6.substring(0, 1);
			String anagram4Answer7SubString = anagram4Answer7.substring(0, 1);

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);
			CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);

			CAX2Answer1Letter1.setText(anagram4Answer1SubString);
			CAX2Answer1Letter2.setText(anagram4Answer2SubString);
			CAX2Answer1Letter3.setText(anagram4Answer3SubString);
			CAX2Answer1Letter4.setText(anagram4Answer4SubString);
			CAX2Answer1Letter5.setText(anagram4Answer5SubString);
			CAX2Answer1Letter6.setText(anagram4Answer6SubString);
			CAX2Answer1Letter7.setText(anagram4Answer7SubString);
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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram5Title);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);

			CAX2Answer1Letter1.setText(anagram3Answer1SubString);
			CAX2Answer1Letter2.setText(anagram3Answer2SubString);
			CAX2Answer1Letter3.setText(anagram3Answer3SubString);
			CAX2Answer1Letter4.setText(anagram3Answer4SubString);
			CAX2Answer1Letter5.setText(anagram3Answer5SubString);
			CAX2Answer1Letter6.setText(anagram3Answer6SubString);
			CAX2Answer1Letter7.setText(anagram3Answer7SubString);
			CAX2Answer1Letter8.setText(anagram3Answer8SubString);
			CAX2Answer1Letter9.setText(anagram3Answer9SubString);
			CAX2Answer1Letter10.setText(anagram3Answer10SubString);
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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram6Title);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
			CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);
			CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);

			CAX2Answer1Letter1.setText(anagram6Answer1SubString);
			CAX2Answer1Letter2.setText(anagram6Answer2SubString);
			CAX2Answer1Letter3.setText(anagram6Answer3SubString);
			CAX2Answer1Letter4.setText(anagram6Answer4SubString);
			CAX2Answer1Letter5.setText(anagram6Answer5SubString);
			CAX2Answer1Letter6.setText(anagram6Answer6SubString);
			CAX2Answer1Letter7.setText(anagram6Answer7SubString);
			CAX2Answer1Letter8.setText(anagram6Answer8SubString);
			CAX2Answer1Letter9.setText(anagram6Answer9SubString);
			CAX2Answer1Letter10.setText(anagram6Answer10SubString);
			CAX2Answer1Letter11.setText(anagram6Answer11SubString);
		}
	}

	public void onClickGetAnagramCAX2(View v)
	{
		Random randomNum = new Random();
		randomInt = randomNum.nextInt(6)+1;//when you click "Display Database"
		if(randomInt == 1){

			String anagram1Anagram ="TSDMP";
			String anagram1Answer1="The general economic and commercial environment";
			String anagram1Answer2="Specifying the problem";
			String anagram1Answer3="Developing the solution";
			String anagram1Answer4="Monitoring the experience";
			String anagram1Answer5="Professionalism";

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram1Anagram);

			String anagram1Answer1SubString = anagram1Answer1.substring(0, 1); 
			String anagram1Answer2SubString = anagram1Answer2.substring(0, 1);
			String anagram1Answer3SubString = anagram1Answer3.substring(0, 1);
			String anagram1Answer4SubString = anagram1Answer4.substring(0, 1);
			String anagram1Answer5SubString = anagram1Answer5.substring(0, 1);

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);

			CAX2Answer1Letter1.setText(anagram1Answer1SubString);
			CAX2Answer1Letter2.setText(anagram1Answer2SubString);
			CAX2Answer1Letter3.setText(anagram1Answer3SubString);
			CAX2Answer1Letter4.setText(anagram1Answer4SubString);
			CAX2Answer1Letter5.setText(anagram1Answer5SubString);

		}

		if(randomInt == 2){

			String anagram2Anagram ="FIST AID MMM";

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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram2Anagram);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
			CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);

			CAX2Answer1Letter1.setText(anagram2Answer1SubString);
			CAX2Answer1Letter2.setText(anagram2Answer2SubString);
			CAX2Answer1Letter3.setText(anagram2Answer3SubString);
			CAX2Answer1Letter4.setText(anagram2Answer4SubString);
			CAX2Answer1Letter5.setText(anagram2Answer5SubString);
			CAX2Answer1Letter6.setText(anagram2Answer6SubString);
			CAX2Answer1Letter7.setText(anagram2Answer7SubString);
			CAX2Answer1Letter8.setText(anagram2Answer8SubString);
			CAX2Answer1Letter9.setText(anagram2Answer9SubString);
			CAX2Answer1Letter10.setText(anagram2Answer10SubString);

		}

		if(randomInt == 3){

			String anagram3Anagram ="JAMMED CAR CAVIL";

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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram3Anagram);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);		CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);
			CAX2Answer1Letter12 = (TextView) findViewById(R.id.CAX2Answer1Letter12);		CAX2Answer1Letter13 = (TextView) findViewById(R.id.CAX2Answer1Letter13);
			CAX2Answer1Letter14 = (TextView) findViewById(R.id.CAX2Answer1Letter14);

			CAX2Answer1Letter1.setText(anagram3Answer1SubString);
			CAX2Answer1Letter2.setText(anagram3Answer2SubString);
			CAX2Answer1Letter3.setText(anagram3Answer3SubString);
			CAX2Answer1Letter4.setText(anagram3Answer4SubString);
			CAX2Answer1Letter5.setText(anagram3Answer5SubString);
			CAX2Answer1Letter6.setText(anagram3Answer6SubString);
			CAX2Answer1Letter7.setText(anagram3Answer7SubString);
			CAX2Answer1Letter8.setText(anagram3Answer8SubString);
			CAX2Answer1Letter9.setText(anagram3Answer9SubString);
			CAX2Answer1Letter10.setText(anagram3Answer10SubString);
			CAX2Answer1Letter11.setText(anagram3Answer11SubString);
			CAX2Answer1Letter12.setText(anagram3Answer12SubString);
			CAX2Answer1Letter13.setText(anagram3Answer13SubString);
			CAX2Answer1Letter14.setText(anagram3Answer14SubString);

		}

		if(randomInt == 4){

			String anagram4Anagram ="BASTARD";

			String anagram4Answer1="Being reliable (detail, quality, timeliness)";
			String anagram4Answer2="Acting with integrity and detachment from personal circumstances";
			String anagram4Answer3="Skilled communication";
			String anagram4Answer4="Taking responsibility for decisions";
			String anagram4Answer5="Achieving/demonstrating/maintaining/improving competence";
			String anagram4Answer6="Recognising that others have valid views";
			String anagram4Answer7="Developing a direct and trusting relationship with the client";


			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram4Anagram);

			String anagram4Answer1SubString = anagram4Answer1.substring(0, 1); 
			String anagram4Answer2SubString = anagram4Answer2.substring(0, 1);
			String anagram4Answer3SubString = anagram4Answer3.substring(0, 1);
			String anagram4Answer4SubString = anagram4Answer4.substring(0, 1);
			String anagram4Answer5SubString = anagram4Answer5.substring(0, 1);
			String anagram4Answer6SubString = anagram4Answer6.substring(0, 1);
			String anagram4Answer7SubString = anagram4Answer7.substring(0, 1);

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);
			CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);

			CAX2Answer1Letter1.setText(anagram4Answer1SubString);
			CAX2Answer1Letter2.setText(anagram4Answer2SubString);
			CAX2Answer1Letter3.setText(anagram4Answer3SubString);
			CAX2Answer1Letter4.setText(anagram4Answer4SubString);
			CAX2Answer1Letter5.setText(anagram4Answer5SubString);
			CAX2Answer1Letter6.setText(anagram4Answer6SubString);
			CAX2Answer1Letter7.setText(anagram4Answer7SubString);
		}

		if(randomInt == 5){

			String anagram5Anagram ="CERAMIC FAD";

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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram5Anagram);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);
			CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);		CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);
			CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);

			CAX2Answer1Letter1.setText(anagram3Answer1SubString);
			CAX2Answer1Letter2.setText(anagram3Answer2SubString);
			CAX2Answer1Letter3.setText(anagram3Answer3SubString);
			CAX2Answer1Letter4.setText(anagram3Answer4SubString);
			CAX2Answer1Letter5.setText(anagram3Answer5SubString);
			CAX2Answer1Letter6.setText(anagram3Answer6SubString);
			CAX2Answer1Letter7.setText(anagram3Answer7SubString);
			CAX2Answer1Letter8.setText(anagram3Answer8SubString);
			CAX2Answer1Letter9.setText(anagram3Answer9SubString);
			CAX2Answer1Letter10.setText(anagram3Answer10SubString);
		}

		if(randomInt == 6){



			String anagram6Anagram ="BBC TEAM PIESS";

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

			textViewCAX2 = (TextView) findViewById(R.id.PullTestStringCAX2);//take in string
			textViewCAX2.setText(anagram6Anagram);

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

			CAX2Answer1Letter1 = (TextView) findViewById(R.id.CAX2Answer1Letter1);		CAX2Answer1Letter2 = (TextView) findViewById(R.id.CAX2Answer1Letter2);
			CAX2Answer1Letter3 = (TextView) findViewById(R.id.CAX2Answer1Letter3);		CAX2Answer1Letter4 = (TextView) findViewById(R.id.CAX2Answer1Letter4);
			CAX2Answer1Letter5 = (TextView) findViewById(R.id.CAX2Answer1Letter5);		CAX2Answer1Letter6 = (TextView) findViewById(R.id.CAX2Answer1Letter6);
			CAX2Answer1Letter7 = (TextView) findViewById(R.id.CAX2Answer1Letter7);		CAX2Answer1Letter8 = (TextView) findViewById(R.id.CAX2Answer1Letter8);
			CAX2Answer1Letter9 = (TextView) findViewById(R.id.CAX2Answer1Letter9);		CAX2Answer1Letter10 = (TextView) findViewById(R.id.CAX2Answer1Letter10);
			CAX2Answer1Letter11 = (TextView) findViewById(R.id.CAX2Answer1Letter11);

			CAX2Answer1Letter1.setText(anagram6Answer1SubString);
			CAX2Answer1Letter2.setText(anagram6Answer2SubString);
			CAX2Answer1Letter3.setText(anagram6Answer3SubString);
			CAX2Answer1Letter4.setText(anagram6Answer4SubString);
			CAX2Answer1Letter5.setText(anagram6Answer5SubString);
			CAX2Answer1Letter6.setText(anagram6Answer6SubString);
			CAX2Answer1Letter7.setText(anagram6Answer7SubString);
			CAX2Answer1Letter8.setText(anagram6Answer8SubString);
			CAX2Answer1Letter9.setText(anagram6Answer9SubString);
			CAX2Answer1Letter10.setText(anagram6Answer10SubString);
			CAX2Answer1Letter11.setText(anagram6Answer11SubString);
		}

		



	}

	public void onClickTestYourselfAnagramCAX2(View v)
	{
		if (randomInt==1)
		{

			String Acronym="TSDMP";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}

		if (randomInt==2)
		{

			String Acronym="FIST AID MMM";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}

		if (randomInt==3)
		{


			String Acronym="JAMMED CAR CAVIL";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}

		if (randomInt==4)
		{

			String Acronym="BASTARD";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}
		if (randomInt==5)
		{

			String Acronym="CERAMIC FAD";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}

		}

		if (randomInt==6)
		{

			String Acronym="BBC TEAM PIESS";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}

		}
		

		
	}

	public void onClickTestYourselfTitleCAX2(View v)
	{
		if (randomInt==1)
		{

			String Acronym="The Actuarial Control Cycle (ACC)";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}

		if (randomInt==2)
		{

			String Acronym="What makes the ACC actuarial";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}

		if (randomInt==3)
		{


			String Acronym="What actuaries do?";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}

		if (randomInt==4)
		{

			String Acronym="How to be a professional";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}
		}
		if (randomInt==5)
		{

			String Acronym="Carrying out an actuarial task";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}

		}

		if (randomInt==6)
		{

			String Acronym="Possible clients actuaries advise";

			EditTextTestCAX2 = (EditText)findViewById(R.id.EditTextTestCAX2);
			useranswerCAX2=EditTextTestCAX2.getText().toString();
			TextViewTitleAnswerCAX2 = (TextView) findViewById(R.id.TextViewTitleAnswerCAX2);

			if(Acronym.equals(useranswerCAX2)){
				TextViewTitleAnswerCAX2.setText("You have guessed the right answer. Acronym = "+ Acronym);
			}else{
				TextViewTitleAnswerCAX2.setText("You have guessed incorrectly. Your guess = "+useranswerCAX2+" correct answer = "+Acronym);
			}

		}
		
	}




























	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ca1_x2, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_ca1_x2,
					container, false);
			return rootView;
		}
	}

}
