package omy.boston.warningdialogsimple.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import omy.boston.warningdialogsimple.R;

/**
 * Created by LosFrancisco on 11-Jan-17.
 */

public class WarningDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder dBilder = new AlertDialog.Builder(getActivity());
        dBilder.setTitle(android.R.string.dialog_alert_title);
        dBilder.setMessage(R.string.odaberi_godinu_rodenja);
        dBilder.setIcon(android.R.drawable.stat_sys_warning);
        dBilder.setNeutralButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dismiss();
            }
        });


        AlertDialog upozDialog = dBilder.create();
        return upozDialog;
    }
}
