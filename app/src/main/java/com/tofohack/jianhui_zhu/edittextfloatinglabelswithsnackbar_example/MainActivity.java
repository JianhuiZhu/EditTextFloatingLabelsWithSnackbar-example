package com.tofohack.jianhui_zhu.edittextfloatinglabelswithsnackbar_example;
/**
 * Created by Jianhui Zhu 3 Sep 2015
 */
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    @Bind(R.id.container)
    CoordinatorLayout container;
    @Bind(R.id.email)
    EditText email1;
    @Bind(R.id.email2)
    EditText email2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * bind and add listener
         *
         */
        ButterKnife.bind(this);
        email1.addTextChangedListener(this);
        email2.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        /**
         * Here just justify after one of two edittexts' text changed,
         *
         * whether the strings are the same.
         */
        if ((!email2.getText().toString().equals("")) && (!email1.getText().toString().equals(""))) {
            if (!email1.getText().toString().equals(email2.getText().toString())) {
                /**
                 * Snack bar
                 * make function parameters
                 *
                 * 1st parameter is the view to attach on(parent view)
                 *               here is the container(root view)
                 *
                 * 2nd parameter is the message to be sent to user
                 *               here simply just a "Email does not match"
                 *
                 * 3rd parameter is the duration for this snackbar
                 *               here is Snackbar.LENGTH_SHORT
                 */
                Snackbar.make(container, "Email does not match", Snackbar.LENGTH_SHORT)
                        .show();
            }
        }
    }
}
