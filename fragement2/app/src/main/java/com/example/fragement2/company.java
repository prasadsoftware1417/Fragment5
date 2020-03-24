package com.example.fragement2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class company extends Fragment {
    Button b;
    private EditText c,j,s;
    String c1,j1,s15;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view= inflater.inflate(R.layout.fragment_company, container, false);
        b=(Button)view.findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=view.findViewById(R.id.comname);
                j= view.findViewById(R.id.jobp);
                s= view.findViewById(R.id.salary);
                String c1=c.getText().toString();
                String j1=j.getText().toString();
                String s15=s.getText().toString();

                AllFragment allFragment=getArguments().getParcelable(Constant.KEY_ALL_FRAG_DATA);
                allFragment.setCompanyname(c1);
                allFragment.setJobprofile(j1);
                allFragment.setSalary(s15);
                Bundle b=new Bundle();
                b.putParcelable("ALLfragments",allFragment);
                Displayfragment displayfragment=new Displayfragment();
                displayfragment.setArguments(b);
                MainActivity.fragementManager.beginTransaction().replace(R.id.f1,displayfragment,"4").addToBackStack("3").commit();


            }
        });
        return view;

    }













}
