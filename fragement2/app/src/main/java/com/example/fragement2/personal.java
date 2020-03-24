package com.example.fragement2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class personal extends Fragment {

   private Button t;
    private EditText name,dateofbirth,mobilno,email;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_personal, container, false);

        t= view.findViewById(R.id.next);
        name = view.findViewById(R.id.fullname);
        dateofbirth= view.findViewById(R.id.dob);
        mobilno= view.findViewById(R.id.mobileno);
        email= view.findViewById(R.id.email);


       t.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              /* FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.f1,new education());
               fragmentTransaction.addToBackStack(null);
               fragmentTransaction.commit();*/
               String name1=name.getText().toString();
               String dob1=dateofbirth.getText().toString();
               String mobileno1=mobilno.getText().toString();
               String email1=email.getText().toString();

               AllFragment allFragment=new AllFragment();

               allFragment.setFullname(name1);
               allFragment.setDob(dob1);
               allFragment.setEmail(email1);
               allFragment.setMobile(mobileno1);

               Bundle b=new Bundle();
               b.putParcelable(Constant.KEY_ALL_FRAG_DATA,allFragment);
               education e =new education();
               e.setArguments(b);
               MainActivity.fragementManager.beginTransaction().replace(R.id.f1,e,"2").addToBackStack("1").commit();
           }
       });
       return view;
    }


}
