package android.com.britrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BegActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    ListView beglistview;
    private WebView begwebview;


        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                begwebview.loadUrl("https://drive.google.com/open?id=1YiZPDdhKhDzwUqKyai7lstF8mw69nCOu");
            } else if (i == 1) {
                begwebview.loadUrl("https://drive.google.com/open?id=18nd098QjU0bu6PuJuO8IUO47kTXyTPJX");
            } else if (i == 2) {
                begwebview.loadUrl("https://drive.google.com/open?id=1dmQDJJZ-0lV2W8jE8WrfassfFuxh2bLS");
            } else if (i == 3) {
                begwebview.loadUrl("https://drive.google.com/open?id=19AgpUGbk-b1VzH39tvGJNICMLbo9x4mr");
            } else if (i == 4) {
               begwebview.loadUrl("https://drive.google.com/open?id=1P1weh_4uYg-a4fMpDxuK_RwBahb6SXON");
            } else if (i == 5) {
              begwebview.loadUrl("https://drive.google.com/open?id=17Lq7ztSJrBPd_uPuq9XIeVT4sWDg6STa");
            } else if (i == 6) {
               begwebview.loadUrl("https://drive.google.com/open?id=1AoxJykJVG4j93aA42_0sFIpCFBspDo-I");
            } else {
                begwebview.loadUrl("https://drive.google.com/open?id=1j3rOh9H52ONzYyR5YI68mcn0qhcNkYfD");
            }
        }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg);

        beglistview = (ListView) findViewById(R.id.beglist);
        begwebview = (WebView) findViewById(R.id.webbeg);
        begwebview.clearCache(true);
        begwebview.clearHistory();
        begwebview.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.BegSubs));
        beglistview.setOnItemClickListener(this);
        beglistview.setAdapter(arrayAdapter);

    }
}
