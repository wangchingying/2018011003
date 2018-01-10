package com.cyw.a2018011003;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Log.d("MSG","取得一個message");
            Bundle b=msg.getData();
            String str=b.getString("data");
            Log.d("MSG","data:"+str);
        }
    };
    public void click1(View v)
    {
        Message msg=new Message();
        Bundle b=new Bundle();
        b.putString("data","Mydata");
        msg.setData(b);
        handler.sendMessageDelayed(msg,3000);
        //handler.sendMessage(msg);
    }

}
