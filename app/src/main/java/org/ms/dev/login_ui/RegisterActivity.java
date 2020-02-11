package org.ms.dev.login_ui;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.ms.module.base.view.BaseActivity;


public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonRegister;


    @Override
    protected int getLayout() {
        return R.layout.activity_register;
    }


    @Override
    protected void initView() {


        editTextPassword = findViewById(R.id.editTextPassword);
        editTextUsername = findViewById(R.id.editTextUsername);
        buttonRegister = findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.buttonRegister:


                break;

        }
    }
}
