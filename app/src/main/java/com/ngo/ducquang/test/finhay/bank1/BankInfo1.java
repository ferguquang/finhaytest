package com.ngo.ducquang.test.finhay.bank1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ngo.ducquang.test.R;

/**
 * Created by ducqu on 5/15/2018.
 */

public class BankInfo1 extends Fragment implements View.OnClickListener
{
    private TextView txtOK;
    private TextView txtCopyContent;
    private TextView txtCopyNumberAccount;
    private TextView txtNumberAccount;
    private TextView txtContent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.bank_one_fragment, container, false);
        txtOK = view.findViewById(R.id.txtOK);
        txtCopyContent = view.findViewById(R.id.txtCopyContent);
        txtCopyNumberAccount = view.findViewById(R.id.txtCopyNumberAccount);
        txtNumberAccount = view.findViewById(R.id.txtNumberAccount);
        txtContent = view.findViewById(R.id.txtContent);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtOK.setOnClickListener(this);
        txtCopyContent.setOnClickListener(this);
        txtCopyNumberAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.txtOK:
            {

                break;
            }
            case R.id.txtCopyNumberAccount:
            {
                ClipboardManager clipboardManager = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Đã sao chép số tài khoản vào bộ nhớ tạm", txtNumberAccount.getText());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getContext(), "Đã sao chép số tài khoản vào bộ nhớ", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.txtCopyContent:
            {
                ClipboardManager clipboardManager = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Đã sao chép nội dung chuyển vào bộ nhớ tạm", txtContent.getText());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getContext(), "Đã sao chép nội dung chuyển vào bộ nhớ", Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}
