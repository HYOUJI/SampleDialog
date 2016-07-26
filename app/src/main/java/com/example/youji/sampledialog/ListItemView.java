package com.example.youji.sampledialog;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by YouJi on 2016-07-26.
 */
public class ListItemView extends LinearLayout {

    ImageView profileImageView;
    TextView nameView;
    TextView messageView;

    public ListItemView(Context context) {
        super(context);
        init();
    }

    private void init(){
        inflate(getContext(), R.layout.view_item, this);            // inflate = 객체화

        // View Initialize
        profileImageView = (ImageView) findViewById(R.id.profileImageView);
        nameView = (TextView) findViewById(R.id.nameView);
        messageView = (TextView) findViewById(R.id.messageView);

    }

    public void setListItem(ListItem item){
        profileImageView.setImageResource(item.profileImage);
        nameView.setText(item.name);
        messageView.setText(item.message);
    }
}
