package com.example.youji.sampledialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by YouJi on 2016-07-26.
 */
public class ChatDialog extends DialogFragment {

    ListView messageListView;
    ChatItemAdapter mAdapter;
    EditText inputView;
    Button sendButton;


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Dialog의 크기 등을 미리 선언


    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat_dialog, container);

        // View Initialize
        messageListView = (ListView) view.findViewById(R.id.listView2);
        inputView = (EditText) view.findViewById(R.id.inputView);
        sendButton = (Button) view.findViewById(R.id.sendBtn);
        mAdapter = new ChatItemAdapter();
        messageListView.setAdapter(mAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputView.getText().toString();
                mAdapter.add(input);

                //+@
                messageListView.smoothScrollToPosition(mAdapter.getCount());
                inputView.setText("");
            }
        });


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
