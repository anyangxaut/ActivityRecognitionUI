package edu.xaut.jzdbishe;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FragmentPage1 extends Fragment{

	private View view = null;
	private Spinner spinner = null;
	private String[] algorithms = {"SVM", "NBC", "ID3"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.fragment_1, null);
		
		spinner = (Spinner)view.findViewById(R.id.spinner);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), 
				android.R.layout.simple_spinner_dropdown_item, algorithms);
		spinner.setAdapter(adapter);
		
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i("TAG", "---onActivityCreated");
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.i("TAG", "---onAttach");
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i("TAG", "---onCreate");
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.i("TAG", "---onDestroy");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onPause() {
		Log.i("TAG", "---onPause");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.i("TAG", "---onResume");
		// TODO Auto-generated method stub
		super.onResume();
	}
}
