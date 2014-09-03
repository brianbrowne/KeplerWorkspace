package com.example.ca1acronymtester;

import com.example.ca1anagramtester.R;

import android.content.Intent;					import android.database.Cursor;							import android.os.Bundle;
import android.support.v4.app.Fragment;			import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;				import android.view.Menu;								import android.view.MenuItem;
import android.view.View;						import android.view.View.OnClickListener;				import android.view.ViewGroup;
import android.widget.Button;					import android.widget.TextView;
import android.widget.Toast;


public class MainActivityCA1acronymTester extends ActionBarActivity {	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_ca1_anagram_tester);
		
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		
	}
	
	public void onClickTestTitle(View view) 
	{
		
	    Intent intent = new Intent(MainActivityCA1acronymTester.this, TestTitle.class);
	    startActivity(intent);
	}
	
	public void onClickTestAnagram(View view) 
	{
		
	    Intent intent = new Intent(MainActivityCA1acronymTester.this, TestAnagram.class);
	    startActivity(intent);
	}
	
	public void onClickCAX10(View view) 
	{
		
	    Intent intent = new Intent(MainActivityCA1acronymTester.this, CAX10.class);
	    startActivity(intent);
	}
	
	public void onClickCAX1(View view) 
	{
		
	    Intent intent = new Intent(MainActivityCA1acronymTester.this, CAX1.class);
	    startActivity(intent);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()
				.inflate(R.menu.main_activity_ca1_anagram_tester, menu);
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
			View rootView = inflater.inflate(
					R.layout.fragment_main_activity_ca1_anagram_tester,
					container, false);
			return rootView;
		}
	}

}
