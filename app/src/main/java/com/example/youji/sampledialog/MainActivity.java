package com.example.youji.sampledialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        mAdapter = new ListItemAdapter();
        listView.setAdapter(mAdapter);

        mAdapter.add(R.mipmap.ic_launcher, "Youji", "Hello");
        mAdapter.add(R.mipmap.ic_launcher, "aa", "Hello World");
        mAdapter.add(R.mipmap.ic_launcher, "aaa", "hihi");
        mAdapter.add(R.mipmap.ic_launcher, "bb", "asdfasdf");
        mAdapter.add(R.mipmap.ic_launcher, "bbb", "asdfadf");
        mAdapter.add(R.mipmap.ic_launcher, "cc", "dfdfdfasd");
        mAdapter.add(R.mipmap.ic_launcher, "ccc", "adfdfdfsas");
        mAdapter.add(R.mipmap.ic_launcher, "asdf", "akakdjfidjf");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ChatDialog dialog = new ChatDialog();
                dialog.show(getFragmentManager(), "");
                /** Alert Dialog
                ListItem clickedItem = (ListItem) mAdapter.getItem(position);
                String clickedName = clickedItem.name;
                String clickedMessage = clickedItem.message;

                // 1. Alert Dialog
                // 1) Builder라는 객체로 Dialog를 정의
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setIcon(R.mipmap.ic_launcher);
                builder.setTitle("Dialog Test" + clickedName);
                builder.setMessage("Message: " + clickedMessage);

                builder.setPositiveButton("Checked!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Checked!!", Toast.LENGTH_SHORT).show();
                    }
                });

                // 2) AlertDialog 객체를 생성 (builder 객체로)
                AlertDialog dialog = builder.create();

                // 3) Dialog를 화면에 뿌림.
                dialog.show();
                 */
            }
        });
    }

}
