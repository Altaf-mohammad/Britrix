package android.com.britrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class civilActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {


    ListView civillistview;
    private WebView civilwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        civillistview = (ListView) findViewById(R.id.civillist);
        civilwebview = (WebView) findViewById(R.id.webcivil);
        civilwebview.clearCache(true);
        civilwebview.clearHistory();
        civilwebview.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.CivilSubs));
        civillistview.setOnItemClickListener(this);
        civillistview.setAdapter(arrayAdapter);

    }


    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            civilwebview.loadUrl("https://drive.google.com/open?id=1YeZayGhLlRjSvKKw0nIRMcHJpGgZh3ke");
        } else if (i == 1) {
            civilwebview.loadUrl("https://drive.google.com/open?id=1HJyCByZFwFXd9M0oMwvUBjNY-O9z5Fon");
        } else if (i == 2) {
            civilwebview.loadUrl("https://drive.google.com/open?id=1PZQouLviW6pyFb90cRejvecCMiCbySjH");
        } else if (i == 3) {
            civilwebview.loadUrl("https://drive.google.com/open?id=1_nT30N8aZwspg2qLRedPZvVUqDBUNTUy");
        } else if (i == 4) {
            civilwebview.loadUrl("https://drive.google.com/open?id=1lId9iKVia83x9xF-0CQquuUBbT3F8NFO");
        } else if (i == 5) {
            civilwebview.loadUrl("https://drive.google.com/open?id=16LF3ngeaU98F7mcK2ZDmP-lcRrZXP8Qi");
        } else if (i == 6) {
            civilwebview.loadUrl("https://drive.google.com/open?id=18uj3CcXVQsLPxLoamdfYqTdAGfK1yfSn");
        } else if (i == 7) {
            civilwebview.loadUrl("https://drive.google.com/open?id=12lWZzI9tYBAGq9y2grKWKQskSMo_6Vdx");
        } else if (i == 8) {
            civilwebview.loadUrl("https://drive.google.com/open?id=1rgMvW_WathhT7rSTiQ-yDwj8hTRNEaEg");
        } else if (i == 9) {
            civilwebview.loadUrl("https://drive.google.com/open?id=1fQ-SqY-hVqnqNSiFjesabHsc8-uuCH_g");
        } else {
            civilwebview.loadUrl("https://drive.google.com/open?id=15_17easiahiD9vxtPGIR3WnA5WCRBNfe");
        }
    }
}
