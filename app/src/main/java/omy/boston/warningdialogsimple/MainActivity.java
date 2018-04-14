package omy.boston.warningdialogsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import omy.boston.warningdialogsimple.Dialog.WarningDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                WarningDialog myDialog = new WarningDialog();
                myDialog.show(getFragmentManager(), "Warning dialog");
            }
        });
    }
}
