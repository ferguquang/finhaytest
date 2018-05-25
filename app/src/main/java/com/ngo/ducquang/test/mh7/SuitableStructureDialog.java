package com.ngo.ducquang.test.mh7;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ngo.ducquang.test.R;

/**
 * Created by ducqu on 5/24/2018.
 */

public class SuitableStructureDialog extends DialogFragment implements View.OnClickListener
{
    private TextView nameAnimal;
    private ImageView imgAnimal;
    private LinearLayout llInvest;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.dialog_structrure, null);

        nameAnimal = view.findViewById(R.id.nameAnimal);
        imgAnimal = view.findViewById(R.id.imgAnimal);
        llInvest = view.findViewById(R.id.llInvest);

        llInvest.setOnClickListener(this);

        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.llInvest:
            {

                break;
            }
        }
    }
}
