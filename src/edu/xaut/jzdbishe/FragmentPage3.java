package edu.xaut.jzdbishe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FragmentPage3 extends Fragment{

	private View view = null;
	private Spinner spinner = null;
	private String[] algorithms = {"0.2", "0.4", "0.5"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		
		view = inflater.inflate(R.layout.fragment_3, null);
		spinner = (Spinner)view.findViewById(R.id.spinner);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), 
				android.R.layout.simple_spinner_dropdown_item, algorithms);
		spinner.setAdapter(adapter);
		
		return view;		
	}	
}