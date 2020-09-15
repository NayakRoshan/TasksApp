package com.example.mytaskapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MessageDialog extends DialogFragment {

    private Context context;
    private String message;
    private String DIALOG_TITLE = "Alert Message";

    public MessageDialog(Context context, String message) {
        this.context = context;
        this.message = message;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder messageDialog = new AlertDialog.Builder(context);
        messageDialog.setMessage(message)
                .setTitle(DIALOG_TITLE)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        return messageDialog.create();
    }

}
