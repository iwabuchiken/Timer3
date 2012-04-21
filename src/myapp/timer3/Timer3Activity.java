package myapp.timer3;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class Timer3Activity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // get a TabHost
        TabHost tabHost = getTabHost();
        
        // layout xml data
        LayoutInflater.from(this).inflate(R.layout.tabsample, tabHost.getTabContentView(), true);
        
        
        setContentView(R.layout.tabsample);
    }
}