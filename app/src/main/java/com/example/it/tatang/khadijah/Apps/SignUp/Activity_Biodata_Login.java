package com.example.it.tatang.khadijah.Apps.SignUp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.it.tatang.khadijah.Apps.Hellper.Api_Client;
import com.example.it.tatang.khadijah.Apps.Hellper.Api_Service;
import com.example.it.tatang.khadijah.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 9/12/2018.
 */

public class Activity_Biodata_Login extends Fragment {

    @BindView(R.id.id_username)
    EditText id_username;

    @BindView(R.id.edt_password)
    EditText edt_password;

    Api_Service api_service;

    public Activity_Biodata_Login() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_biodata_login, container, false);
        ButterKnife.bind(this, root);
        api_service = Api_Client.getClient().create(Api_Service.class);

        return root;
    }


    @OnClick(R.id.id_ly_login)
    public void goLogin() {
        api_service.loginRequest(id_username.getText().toString(), edt_password.getText().toString()).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()){
                    Toast.makeText(getContext(), "isSuccessful", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(), "Error Code", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
