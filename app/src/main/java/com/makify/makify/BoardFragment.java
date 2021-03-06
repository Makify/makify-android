package com.makify.makify;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class BoardFragment extends Fragment {
    Button bt1;
    RadioGroup cPalate;
    RadioButton colorRed;
    RadioButton colorPink;
    RadioButton colorGreen;
    RadioButton colorBlue;
    RadioButton colorYellow;
    RadioButton colorPurple;
    RadioButton colorOrange;
    RadioButton colorBrown;
    RadioButton colorBlack;
    RadioButton colorWhite;

    int selectedColor = R.color.white;


    public BoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        bt1 = (Button) getView().findViewById(R.id.butt);
        cPalate = (RadioGroup) getView().findViewById(R.id.cPicker);
        colorRed = (RadioButton) getView().findViewById(R.id.cRed);
        colorPink = (RadioButton) getView().findViewById(R.id.cPink);
        colorGreen = (RadioButton) getView().findViewById(R.id.cGreen);
        colorBlue = (RadioButton) getView().findViewById(R.id.cBlue);
        colorYellow = (RadioButton) getView().findViewById(R.id.cYellow);
        colorPurple = (RadioButton) getView().findViewById(R.id.cPurple);
        colorOrange = (RadioButton) getView().findViewById(R.id.cOrange);
        colorBrown = (RadioButton) getView().findViewById(R.id.cBrown);
        colorBlack = (RadioButton) getView().findViewById(R.id.cBlack);
        colorWhite = (RadioButton) getView().findViewById(R.id.cWhite);

        cPalate.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(checkedId);
                // This puts the value (true/false) into the variable
                boolean isChecked = checkedRadioButton.isChecked();
                // If the radiobutton that has changed in check state is now checked...
                if (isChecked)
                {
                    // Changes the textview's text to "Checked: example radiobutton text"
                }

                int radioButtonID = cPalate.getCheckedRadioButtonId();


                if(radioButtonID == colorRed.getId())
                {
                    selectedColor = R.color.red;
                }
                else if(radioButtonID == colorPink.getId())
                {
                    selectedColor = R.color.pink;
                }
                else if(radioButtonID == colorBlue.getId())
                {
                    selectedColor = R.color.blue;
                }
                else if(radioButtonID == colorGreen.getId())
                {
                    selectedColor = R.color.green;
                }
                else if(radioButtonID == colorYellow.getId())
                {
                    selectedColor = R.color.yellow;
                }
                else if(radioButtonID == colorPurple.getId())
                {
                    selectedColor = R.color.purple;
                }
                else if(radioButtonID == colorOrange.getId())
                {
                    selectedColor = R.color.orange;
                }
                else if(radioButtonID == colorBrown.getId())
                {
                    selectedColor = R.color.brown;
                }
                else if(radioButtonID == colorWhite.getId())
                {
                    selectedColor = R.color.white;
                }
                else
                {
                    selectedColor = R.color.black;
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1.setBackgroundColor(getResources().getColor(selectedColor));
            }
        });
        return inflater.inflate(R.layout.fragment_board, container, false);
    }

}
