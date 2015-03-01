package edu.xaut.jzdbishe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentPage2 extends Fragment{

	private View view = null;
	private ImageView headshot = null;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		
		view = inflater.inflate(R.layout.fragment_2, null);
		headshot = (ImageView)view.findViewById(R.id.headshot);
		headshot.setImageResource(R.drawable.photo);
		
		return view;		
	}	

}