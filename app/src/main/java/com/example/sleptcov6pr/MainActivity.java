package com.example.sleptcov6pr;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.sleptcov6pr.R;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener {
    private Button bgButton;
    public RelativeLayout relativeLayout;
    public ConstraintLayout constraintLayout;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = findViewById(R.id.back_button);
        relativeLayout = findViewById(R.id.relativelayout);
        constraintLayout = findViewById(R.id.constraint);
        context=MainActivity.this;
        bgButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        bgButton.setOnClickListener(this);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        final CharSequence[]items={getText(R.string.red),getText(R.string.yellow),getText(R.string.green)};

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int item) {
                switch (item){
                    case 0:
                        constraintLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        constraintLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context,R.string.yellow, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        constraintLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context,R.string.green, Toast.LENGTH_LONG).show();
                        break;

                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}