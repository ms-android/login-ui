package org.ms.dev.login_ui;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONObject;
import org.ms.module.base.view.BaseActivity;
import org.ms.module.supper.client.Modules;


public class LoginActivity extends BaseActivity implements View.OnClickListener {


    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    private TextView textViewRegister;


    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
        textViewRegister = findViewById(R.id.textViewRegister);
        textViewRegister.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin:
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                JSONObject jsonObject = new JSONObject();
                try {
                    jsonObject.put("username", username);
                    jsonObject.put("password", password);
                    Modules.getUtilsModule().getToastUtils().show(jsonObject.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.textViewRegister:
                baseStart(RegisterActivity.class);
                break;
        }
    }
}
