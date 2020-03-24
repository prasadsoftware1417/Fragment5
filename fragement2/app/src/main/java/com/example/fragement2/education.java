package com.example.fragement2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class education extends Fragment {

    private Button t1;
    private EditText s1,s2,s3,d1,d2,d3,b1,b2,b3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         final View view= inflater.inflate(R.layout.fragment_education, container, false);
        t1=(Button) view.findViewById(R.id.next);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=(EditText) view.findViewById(R.id.s1);
                s2=(EditText) view.findViewById(R.id.s2);
                s3=(EditText) view.findViewById(R.id.s3);
                d1=(EditText) view.findViewById(R.id.d1);
                d2=(EditText) view.findViewById(R.id.d2);
                d3=(EditText) view.findViewById(R.id.d3);
                b1=(EditText) view.findViewById(R.id.b1);
                b2=(EditText) view.findViewById(R.id.b2);
                b3=(EditText) view.findViewById(R.id.b3);

                String s11=s1.getText().toString();
                String s22=s2.getText().toString();
                String s33=s3.getText().toString();
                String d11=d1.getText().toString();
                String d22=d2.getText().toString();
                String d33=d3.getText().toString();
                String b11=b1.getText().toString();
                String b22=b2.getText().toString();
                String b33=b3.getText().toString();
                /*AllFragment allFragment= null;
                if(getArguments()!= null){
                    allFragment = getArguments().getParcelable(Constant.KEY_ALL_FRAG_DATA);
                }*/
                AllFragment allFragment = getArguments().getParcelable(Constant.KEY_ALL_FRAG_DATA);
                allFragment.setS1(s11);
                allFragment.setS2(s22);
                allFragment.setS3(s33);
                allFragment.setD1(d11);
                allFragment.setD2(d22);
                allFragment.setD3(d33);
                allFragment.setB1(b11);
                allFragment.setB2(b22);
                allFragment.setB3(b33);
                Bundle b=new Bundle();


                b.putParcelable("ALLfragments",allFragment);
                company com=new company();
                com.setArguments(b);
                MainActivity.fragementManager.beginTransaction().replace(R.id.f1,com,"3").addToBackStack("2").commit();
            }
        });
        return view;
    }




}
