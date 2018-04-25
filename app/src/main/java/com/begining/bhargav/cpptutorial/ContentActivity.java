package com.begining.bhargav.cpptutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    public WebView titleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_content);
        titleView = (WebView) findViewById(R.id.webviewCotent);
        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        if(title.equalsIgnoreCase("introduction")&&bundle.getString("topic").equalsIgnoreCase("basic")){
            titleView.loadUrl("file:///android_asset/cpp_introduction.html");
        } else if(title.equalsIgnoreCase("introduction")&&bundle.getString("topic").equalsIgnoreCase("stl")){
            titleView.loadUrl("file:///android_asset/cpp_STL_introduction.html");
        } else if(title.equalsIgnoreCase("containers")&&bundle.getString("topic").equalsIgnoreCase("stl")){
            titleView.loadUrl("file:///android_asset/cpp_STL_containers.html");
        } else if(title.equalsIgnoreCase("Algorithms")&&bundle.getString("topic").equalsIgnoreCase("stl")){
            titleView.loadUrl("file:///android_asset/cpp_STL_algorithms.html");
        } else if(title.equalsIgnoreCase("Iterators")&&bundle.getString("topic").equalsIgnoreCase("stl")){
            titleView.loadUrl("file:///android_asset/cpp_STL_iterators.html");
        }
    }
}
