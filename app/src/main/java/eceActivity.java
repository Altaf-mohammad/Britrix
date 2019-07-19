package android.com.britrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class eceActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView ecelistview;
    private WebView ecewebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);

        ecelistview = (ListView) findViewById(R.id.ecelist);
        ecewebview = (WebView) findViewById(R.id.webece);
        ecewebview.clearCache(true);
        ecewebview.clearHistory();
        ecewebview.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.EceSubs));
        ecelistview.setOnItemClickListener(this);
        ecelistview.setAdapter(arrayAdapter);

    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1lV7Xjy4UeX-jJGLYPo12SCLwO6jzdH-5");
        } else if (i == 1) {
            ecewebview.loadUrl("https://drive.google.com/open?id=19EjRV8fhBgfwQvnzLJZGws3houazOB4m");
        } else if (i == 2) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1nCBWlNul9HJoSBtUY2kDZyfhJ8S9O8aU");
        } else if (i == 3) {
            ecewebview.loadUrl("https://drive.google.com/open?id=136-zNLEIr4jWjXCm7hygy3Gg5guT0Te-");
        } else if (i == 4) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1qW-JnyGUyLlTeCF1vqPm4BuIiEYZ9b4O");
        } else if (i == 5) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1O6nUTzPvHWwRvG0-3i3h8QjAUBk1Pd0P");
        } else if (i == 6) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1lMaAnKVVdN9g82Mcm7tNQmpJcVl4tfgt");
        } else if (i == 7) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1wdsxFjJwq6naYKvABRBjvBU0arTAUoA3");
        } else if (i == 8) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1i_bYd4JsYzfYPOzx3y-8ftwyJ6gg14zg");
        } else if (i == 9) {
            ecewebview.loadUrl("https://drive.google.com/open?id=121O05-OJeILL0RNOToQZFkfemv33GKWX");
        } else if (i == 10) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1gyB70OSaQJV-XWl2TXRVn3S0hB9dyjOy");
        } else if (i == 11) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1DY9gSiV8YMC0HydRfre23Lhw8v3VSjsp");
        } else if (i == 12) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1Ags6ZYZ1aMp8qFfnHr9vFtQfrwFGM2Lk");
        } else if (i == 13) {
            ecewebview.loadUrl("https://drive.google.com/open?id=171_5v_WTz6dmnxiYhZIRSjBPaAln7nPA");
        } else if (i == 14) {
            ecewebview.loadUrl("https://drive.google.com/open?id=14-waGlTSEsGfpleFUCYSI_9BGSmVMcpr");
        } else if (i == 15) {
            ecewebview.loadUrl("https://drive.google.com/open?id=12edGmobhA2IzignZ1qbtlgOabJmjCuA4");
        } else if (i == 16) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1F9Z0tVtTjKksa8vQ1fpAI9DW4NMiiQzr");
        } else if (i == 17) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1zNFftNKkw70nrfBaiy8rQzdlSCuvPxO9");
        } else if (i == 18) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1_gVGs6hbRSB78achsQLwVD5gUAdCSOn4");
        } else if (i == 19) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1hQxX5CTAIklwN88j-Sd8WilUDen8mG1T");
        } else if (i == 20) {
            ecewebview.loadUrl("https://drive.google.com/open?id=10ca6Dz3UNkFZnianXIufoFV-xwr8Bcug");
        } else if (i == 21) {
            ecewebview.loadUrl("https://drive.google.com/open?id=13sHapdXwIHl85Gj6ei_19kfd_NSd5g-V");
        } else if (i == 22) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1hzu1D4lyYTTh3KB8T8Od3kFeTcThy7HF");
        } else if (i == 23) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1Ve7pJJK6GQFPEk2ttwMTZkfuahCghvtf");
        } else if (i == 24) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1WIONQaCordcuBiqryKRahvGLqb31RTTW");
        } else if (i == 25) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1EthKyYarrM8dctKsXG5V9sLnsTVzMJ7J");
        } else if (i == 26) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1wnEoWjd_oO4Psd2zhK2HuA0KLEQw2LLZ");
        } else if (i == 27) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1NKmaMJQC6Wb7uxO48SRELgtS5tXs_bAf");
        } else if (i == 28) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1gStZb11n8RJPfbJm7SF9qOwxiLHYs0e4");
        } else if (i == 29) {
            ecewebview.loadUrl("https://drive.google.com/open?id=18NDnLxWgdbqaiHnplwLFva6nBV45M02j");
        } else if (i == 30) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1ojHmOLG0EyeQ2ie9rc4m1AoSB5U8yLwn");
        } else if (i == 31) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1vwMsU-wjaeGj84QfI11Vqcis7CwqLXfY");
        } else if (i == 32) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1DH85Bsf82Q6udk_Ml0K_5i-FAls65ueS");
        } else if (i == 33) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1TY4gpcCmPeRvNYHrCrRB2N9czGBkZV4p");
        } else if (i == 34) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1DvSj6RvTj3qETXXapJRKkQsEVJn-Qxoi");
        } else if (i == 35) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1YG9hOfTZz-gO-Edu8AnvV4mclFpyJ8nG");
        } else if (i == 36) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1OSi2NmiK0qn3xrIkoRQKjA7H4CZKYoWP");
        } else if (i == 37) {
            ecewebview.loadUrl("https://drive.google.com/open?id=1ZcywNwqJS0l4qsfaoBVlVyV-Dxpv7RtK");
        } else {
            ecewebview.loadUrl("https://drive.google.com/open?id=1KiZEMLUIWy4qmf8uFuj7k8HfODkq5DLA");
        }
    }
}
