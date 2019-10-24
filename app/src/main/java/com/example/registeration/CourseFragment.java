package com.example.registeration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CourseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CourseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CourseFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CourseFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CourseFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CourseFragment newInstance(String param1, String param2) {
        CourseFragment fragment = new CourseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private ArrayAdapter yearAdapter;
    private Spinner yearSpinner;
    private  ArrayAdapter termAdapter;
    private Spinner termSpinner;
    private  ArrayAdapter areaAdapter;
    private Spinner areaSpinner;

    private String courseUniversity = "";
    private String courseYear ="";
    private String courseTerm ="";
    private String courseArea ="";



    @Override
    public void onActivityCreated(Bundle b){
        super.onActivityCreated(b);

        final RadioGroup courseUniversityGroup = (RadioGroup)getView().findViewById(R.id.courseUniversityGroup);
        yearSpinner = (Spinner)getView().findViewById(R.id.yearSpinner);
        termSpinner = (Spinner)getView().findViewById(R.id.termSpinner);
        areaSpinner = (Spinner)getView().findViewById(R.id.areaSpinner);

        courseUniversityGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton courseButton = (RadioButton) getView().findViewById(checkedId);
                courseUniversity = courseButton.getText().toString();

                yearAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.year,android.R.layout.simple_spinner_dropdown_item);
                yearSpinner.setAdapter(yearAdapter);

                termAdapter  = ArrayAdapter.createFromResource(getActivity(),R.array.term,android.R.layout.simple_spinner_dropdown_item);
                termSpinner.setAdapter(termAdapter);

                if(courseUniversity.equals("학부")) {
                    areaAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.universityArea, android.R.layout.simple_spinner_dropdown_item);
                    areaSpinner.setAdapter(areaAdapter);
                }else if(courseUniversity.equals("대학원")) {
                    areaAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.graduateArea, android.R.layout.simple_spinner_dropdown_item);
                    areaSpinner.setAdapter(areaAdapter);
}

                }

        });
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_course, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
