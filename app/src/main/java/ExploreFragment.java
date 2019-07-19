package android.com.britrix;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {

    CardView beg,pharm,cse,ece,eee,civil,mech;


    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_explore, container, false);
        beg = (CardView)v.findViewById(R.id.beg);
        pharm = (CardView)v.findViewById(R.id.pharm);
        cse = (CardView)v.findViewById(R.id.cse);
        ece = (CardView)v.findViewById(R.id.ece);
        eee = (CardView)v.findViewById(R.id.eee);
        civil = (CardView)v.findViewById(R.id.civil);
        mech = (CardView)v.findViewById(R.id.mech);

        beg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent begintent = new Intent(getActivity(),BegActivity.class);
                startActivity(begintent);
            }
        });

        pharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pharmintent = new Intent(getActivity(),pharmActivity.class);
                startActivity(pharmintent);
            }
        });

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cseintent = new Intent(getActivity(),cseActivity.class);
                startActivity(cseintent);
            }
        });

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eceintent = new Intent(getActivity(),eceActivity.class);
                startActivity(eceintent);
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eeeintent = new Intent(getActivity(),eeeActivity.class);
                startActivity(eeeintent);
            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent civilintent = new Intent(getActivity(),civilActivity.class);
                startActivity(civilintent);
            }
        });

        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mechintent = new Intent(getActivity(),mechActivity.class);
                startActivity(mechintent);
            }
        });


       return v;
    }

}
