package com.threes.monitoringsystem.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.threes.monitoringsystem.R;

public class ActivityClockIn extends AppCompatActivity {

    Context context;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clockin);
        context = this;
        initUi();
    }

    private void initUi() {

        initToolBar();
    }

    private void initToolBar() {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("SREDA OFFICE");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_48px);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_meeting_notice:
                      //  startActivity(new Intent(con,MeetingNoticeActivity.class));
                        break;
                    case R.id.action_meeting_room:
                        //startActivity(new Intent(con,MeetingRoomBookingActivity.class));
                        break;
                    case R.id.action_meeting_minute:
                       // startActivity(new Intent(con,MeetingMinutesActivity.class));
                        break;

                    case R.id.action_leave:
                        //startActivity(new Intent(con,LeaveActivity.class));

                        return true;
                }
                return false;
            }
        });


    }
}
