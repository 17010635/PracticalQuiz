package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spnItems;
    WebView wvPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnItems = findViewById(R.id.spinnerWeb);
        wvPage = findViewById(R.id.webViewDisplay);

        spnItems.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int pos = spnItems.getSelectedItemPosition();
                wvPage.setWebViewClient(new WebViewClient());
                if (pos == 0){
                    String url = "https://www.facebook.com/";
                    wvPage.getSettings().setJavaScriptEnabled(true);
                    wvPage.loadUrl(url);
                }else{
                    String url = "https://www.twitter.com/";
                    wvPage.getSettings().setJavaScriptEnabled(true);
                    wvPage.loadUrl(url);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
