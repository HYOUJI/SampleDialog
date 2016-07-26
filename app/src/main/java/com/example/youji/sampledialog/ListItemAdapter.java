package com.example.youji.sampledialog;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YouJi on 2016-07-26.
 */
public class ListItemAdapter extends BaseAdapter {

    List<ListItem> items = new ArrayList<>();

    public void add(int profileImage, String name, String message) {
        ListItem item = new ListItem(profileImage, name, message);
        items.add(item);
        notifyDataSetChanged();     // 화면 갱신
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItemView view;

        if(convertView != null) {       // 받던 뷰 일 경우
            view = (ListItemView) convertView;  // new로 객체를 생성하지 않고 봤던 뷰를 변수에 대응
        }
        else {
            view = new ListItemView(parent.getContext());
        }

        view.setListItem(items.get(position));

        return view;
    }
}
