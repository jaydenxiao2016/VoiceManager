package com.jaydenxiao.voicemanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * 作者：xsf
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 语音列表
     */
    private ListView listView;
    /**
     * 开始录音
     */
    private VoiceAdapter adapter;
    private RecordVoiceButton mBtRec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtRec = (RecordVoiceButton) findViewById(R.id.button_rec);
        listView = (ListView) findViewById(R.id.lv);
        adapter=new VoiceAdapter(this);
        listView.setAdapter(adapter);
        mBtRec.setEnrecordVoiceListener(new RecordVoiceButton.EnRecordVoiceListener() {
            @Override
            public void onFinishRecord(long length, String strLength, String filePath) {
                adapter.add(new Voice(length, strLength, filePath) )                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ;
            }
        });
    }

}
