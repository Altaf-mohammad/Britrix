package android.com.britrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class cseActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView cselistview;
    private WebView csewebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        cselistview = (ListView) findViewById(R.id.cselist);
        csewebview = (WebView) findViewById(R.id.webcse);
        csewebview.clearCache(true);
        csewebview.clearHistory();
        csewebview.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.CseSubs));
        cselistview.setOnItemClickListener(this);
        cselistview.setAdapter(arrayAdapter);

    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            csewebview.loadUrl("https://drive.google.com/open?id=1VyVZA3u8hkcObvEpYwVv-pr1hMyvwxPS");
        } else if (i == 1) {
            csewebview.loadUrl("https://drive.google.com/open?id=1OOhDaLmyGKxy1ImQraLjDJQjCWSlmc8K");
        } else if (i == 2) {
            csewebview.loadUrl("https://drive.google.com/open?id=1gmwdAHxi24Sh1e91A7fCoDc9N7g43w_X");
        } else if (i == 3) {
            csewebview.loadUrl("https://drive.google.com/open?id=1WhNM4eMZhXaRs4uqRllxcGYlG6XckTxa");
        } else if (i == 4) {
            csewebview.loadUrl("https://drive.google.com/open?id=1D2GSYoUWrrnw4vNEWmM1XlIsXj3kTIfC");
        } else if (i == 5) {
            csewebview.loadUrl("https://drive.google.com/open?id=1JBrYaISIIiWJNz89q5YUdL6J6i7SlLqQ");
        } else if (i == 6) {
            csewebview.loadUrl("https://drive.google.com/open?id=1-pRhZoNoii-NBaFbpZUmwvyPtfBPwgTt");
        } else if (i == 7) {
            csewebview.loadUrl("https://drive.google.com/open?id=1OhdIo_ywBeb7K36d0Ty2_p8ecrteSSku");
        } else if (i == 8) {
            csewebview.loadUrl("https://drive.google.com/open?id=1e5gxcVKyP7JjwdI750hC6q3AsHLlmg-9");
        } else if (i == 9) {
            csewebview.loadUrl("https://drive.google.com/open?id=171bQLY47qXrU3dsbNaD-uJy9QJeFRif8");
        } else if (i == 10) {
            csewebview.loadUrl("https://drive.google.com/open?id=1EY0ZDhSiXDLE2ws12z-2BPMI59X6ySJP");
        } else if (i == 11) {
            csewebview.loadUrl("https://drive.google.com/open?id=14D9UlrOeCJRIzZLl4uRQaNWPICsAHkFP");
        } else if (i == 12) {
            csewebview.loadUrl("https://drive.google.com/open?id=1-bOafA4VHm0QXJMbTz7i-FGgzsQLWos4");
        } else if (i == 13) {
            csewebview.loadUrl("https://drive.google.com/open?id=1uxgJ5082TBbOXNEQghfZJR8rcC3k39kS");
        } else if (i == 14) {
            csewebview.loadUrl("https://drive.google.com/open?id=10cQKYmiQYdQ4DppMFZGTKdcylENoQ2WS");
        } else if (i == 15) {
            csewebview.loadUrl("https://drive.google.com/open?id=1tdPHHcT0nb6h1ss78madJUT540taZa79");
        } else if (i == 16) {
            csewebview.loadUrl("https://drive.google.com/open?id=1T0aaW4OkA6zc1WHN6oTiiC1pVTqmStD8");
        } else if (i == 17) {
            csewebview.loadUrl("https://drive.google.com/open?id=1yLvQr_zwjpAspy8Xq9ruHLAimC9yAI72");
        } else if (i == 18) {
            csewebview.loadUrl("https://drive.google.com/open?id=1Q_x4wpchHX3KRhbvZ9HoDeumndz0d1N6");
        } else if (i == 19) {
            csewebview.loadUrl("https://drive.google.com/open?id=18Py6hRoGuwoIlJDusx3WTfPSWQcS65XJ");
        } else if (i == 20) {
            csewebview.loadUrl("https://drive.google.com/open?id=1tKYd4PoHVP6zGi9Dj-Nn-FOwsViEj_Fe");
        } else if (i == 21) {
            csewebview.loadUrl("https://drive.google.com/open?id=1vkwQ1oZIRde3x9DeOLJKsgwl_psvF2np");
        } else if (i == 22) {
            csewebview.loadUrl("https://drive.google.com/open?id=1RnDLvHHFDIBs-mJTPwzbeu7kx7nQhHg7");
        } else if (i == 23) {
            csewebview.loadUrl("https://drive.google.com/open?id=1rtCVegCjMCovPdTqTJ0H05OYl9S-yOw-");
        } else if (i == 24) {
            csewebview.loadUrl("https://drive.google.com/open?id=1EvNBNHPZFjLP4q_OMIYdxYbqVwRDQESa");
        } else if (i == 25) {
            csewebview.loadUrl("https://drive.google.com/open?id=14i9z_o5eLiO5L7kYAj_xcpgyqIcQ6O4W");
        } else if (i == 26) {
            csewebview.loadUrl("https://drive.google.com/open?id=1zlLn901bg5jzmllzUcWfAAvqroy9qafV");
        } else if (i == 27) {
            csewebview.loadUrl("https://drive.google.com/open?id=1UkY4ze-t_uJFg6rawLlBcdYxJKQggQm2");
        } else if (i == 28) {
            csewebview.loadUrl("https://drive.google.com/open?id=1wZ6X1KpRtK2BrspyMaKNAsKRMpv_fuYc");
        } else if (i == 29) {
            csewebview.loadUrl("https://drive.google.com/open?id=1jpYEoNVzD-hMYPEzBiyEOMoFqHrJiGCl");
        } else if (i == 30) {
            csewebview.loadUrl("https://drive.google.com/open?id=1NPvBBbFjyQmv0xhOFfkx42OGLwWI2DgJ");
        } else {
            csewebview.loadUrl("https://drive.google.com/open?id=1uzL3Lpz1daSLTFAGt49T-FSsoMDY5YzC");
        }
    }
}
