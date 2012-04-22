package myapp.timer3;

//import example.android.tabsample.R;
//import android.R;
import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Timer3Activity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // get a TabHost
        TabHost tabHost = getTabHost();
        
        // layout xml data
        LayoutInflater.from(this).inflate(R.layout.timer3, tabHost.getTabContentView(), true);
        
        // �^�u1�̐ݒ�
        TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setIndicator("Timer1");
        tab1.setContent(R.id.tab1);
        
        // �^�u2�̐ݒ�
        TabSpec tab2 = tabHost.newTabSpec("tab2");
        tab2.setIndicator("Timer2",getResources().getDrawable(android.R.drawable.ic_menu_edit));
        tab2.setContent(R.id.tab2);

        // �^�u3�̐ݒ�
        TabSpec tab3 = tabHost.newTabSpec("tab3");
        tab3.setIndicator("Timer3",getResources().getDrawable(android.R.drawable.ic_menu_search));
        tab3.setContent(R.id.tab3);

        // �e�^�u��TabHost�ɐݒ�
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

        // �����\���̃^�u�ݒ�
        tabHost.setCurrentTab(1);

        
//        setContentView(R.layout.tabsample);
    }
}