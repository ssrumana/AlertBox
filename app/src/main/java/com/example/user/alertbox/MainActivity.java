package com.example.user.alertbox;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
        txt=(TextView)findViewById(R.id.textView);

    }
    public void OnClick(View v){
        //now amr Alert dialog builder create korbo

        AlertDialog.Builder alert = new  AlertDialog.Builder(MainActivity.this);

        // AlertDailog class a ekta build iin method ache jar namm bUilder
        // ei class er ekta object nisi tr namm disi alert.. trpr class tak define korsi bujso eituku
        //hm


        alert.setTitle("Rumana's Dialog Box");
//eita holo title ta set korlam
        alert.setMessage("Are you want to hide the text");
        //ei ta holo messag eja user k dite chai

        alert.setCancelable(false);

        //r ei ta holo alert ta Cancel er joggo kina ta nirdharon korlam

        String yesButton = "Yes";
        String  noButton = "No";
        ///ei dui ta string nisi button dewar jnno ei kahne j kono naam  hote pare..

        alert.setPositiveButton(yesButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txt.setVisibility(View.INVISIBLE);
            }
        });


        alert.setNegativeButton(noButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                txt.setVisibility(View.VISIBLE);
            }
        });
        alert.show();
        //run koro :-)


    }
}
