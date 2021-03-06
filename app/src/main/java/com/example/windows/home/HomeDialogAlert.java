package com.example.windows.home;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;

import com.example.windows.home.R;

/**
 * Created by windows on 22/03/2018.
 */

public class HomeDialogAlert extends DialogFragment{

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Dialog onCreateDialog(Bundle savedInstanceState){
       AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

       builder
               .setMessage(R.string.dialog_complete)
               .setView(R.layout.dialog_lay)
               .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {

                   }
               }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {

           }
       });
        return builder.create();
    }

}
