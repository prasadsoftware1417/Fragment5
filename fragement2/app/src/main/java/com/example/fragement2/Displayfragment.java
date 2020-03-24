package com.example.fragement2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Displayfragment extends Fragment {
   private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_displayfragment, container, false);

        t1= view.findViewById(R.id.fname);
        t2= view.findViewById(R.id.dob);
        t3= view.findViewById(R.id.mobno);
        t4= view.findViewById(R.id.emailid);
        t5= view.findViewById(R.id.shchoolname);
        t6= view.findViewById(R.id.percent);
        t7= view.findViewById(R.id.yop);
        t8= view.findViewById(R.id.dclgname);
        t9= view.findViewById(R.id.dpercent);
        t10= view.findViewById(R.id.dyop);
        t11= view.findViewById(R.id.gclgname);
        t12= view.findViewById(R.id.gpercent);
        t13= view.findViewById(R.id.gyop);
        t14= view.findViewById(R.id.companyname);
        t15= view.findViewById(R.id.jobprofile);
        t16= view.findViewById(R.id.salary);

        if(getArguments().containsKey(Constant.KEY_ALL_FRAG_DATA))
        {
            AllFragment allFragment=getArguments().getParcelable(Constant.KEY_ALL_FRAG_DATA);
            t1.setText(allFragment.getFullname());
            t2.setText(allFragment.getMobile());
            t3.setText(allFragment.getEmail());
            t4.setText(allFragment.getDob());
            t5.setText(allFragment.getSchoolname());
            t6.setText(allFragment.getS2());
            t7.setText(allFragment.getS3());
            t8.setText(allFragment.getD1());
            t9.setText(allFragment.getD2());
            t10.setText(allFragment.getD3());
            t11.setText(allFragment.getB1());
            t12.setText(allFragment.getB2());
            t13.setText(allFragment.getB3());
            t14.setText(allFragment.getCompanyname());
            t15.setText(allFragment.getJobprofile());
            t16.setText(allFragment.getSalary());

        }
        MainActivity.fragementManager.beginTransaction().addToBackStack("3").commit();


        return view;
    }


}
