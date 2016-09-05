package com.home.vlas.fragmentsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ButtonFragment extends Fragment {
    private static final String TAG = ButtonFragment.class.getSimpleName();
    private int n = 0;
    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.buttons_fragment, container, false);
        Button button = (Button) view.findViewById(R.id.button);
        Button button2 = (Button) view.findViewById(R.id.button2);

        mainActivity = (MainActivity) getActivity();

        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, " +1");
                Toast.makeText(getContext(), " +1", Toast.LENGTH_SHORT).show();
                n++;
                mainActivity.setSum(n);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "sum: " + mainActivity.getSum(), Toast.LENGTH_SHORT).show();
                Log.i(TAG, "sum: " + mainActivity.getSum());
            }
        });
        return view;
    }

}
