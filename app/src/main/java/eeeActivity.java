package android.com.britrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class eeeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView eeelistview;
    private WebView eeewebview;

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1g8V-cQOdNjMn05bCBOzjuOm4aI8EmCN_");
        } else if (i == 1) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1PS6L_ZFoyIZdArRqqoLSHSUaTXoKln76");
        } else if (i == 2) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1BiLJ90mjyBu5xPCwNXUg6uQWxF6EsPHB");
        } else if (i == 3) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1fJMmr-w7Ny0tAzy4z7jzWwrvcxI0jGrv");
        } else if (i == 4) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1_O0Eq0cgFOf_SbyjJzu_xWZgAKA3fmdr");
        } else if (i == 5) {
            eeewebview.loadUrl("https://drive.google.com/open?id=19EjRV8fhBgfwQvnzLJZGws3houazOB4m");
        } else if (i == 6) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1DY9gSiV8YMC0HydRfre23Lhw8v3VSjsp");
        } else if (i == 7) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1-pRNpZi1xo2Pg3RLPc47zVyKE7Mk3SU5");
        } else if (i == 8) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1AnxSdxXt0n9DDJxdqVqg2NGPZBljJpa9");
        } else if (i == 9) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1XtZQMnio5VPr3qCGiLwjcUGfD0CrhrVk");
        } else if (i == 10) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1nCBWlNul9HJoSBtUY2kDZyfhJ8S9O8aU");
        } else if (i == 11) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1A2aVyeCw4V5_hpvh7SgX7i_ZQ603lOzc");
        } else if (i == 12) {
            eeewebview.loadUrl("https://drive.google.com/open?id=11_qcFL3BD7yPbPgXkKpRz9g7ad78hwbn");
        } else if (i == 13) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1nsc2TXbYP1suzB9nf_XlsuV9zhJOX9Cx");
        } else if (i == 14) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1UA6d2DRTGX-hEALn7YXA6xF1KTf3Zjbv");
        } else if (i == 15) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1FYo5xLBprxjL6mbSxSR03Q3rGuQChNrT");
        } else if (i == 16) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1uxgJ5082TBbOXNEQghfZJR8rcC3k39kS");
        } else if (i == 17) {
            eeewebview.loadUrl("https://drive.google.com/open?id=13sHapdXwIHl85Gj6ei_19kfd_NSd5g-V");
        } else if (i == 18) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1hQxX5CTAIklwN88j-Sd8WilUDen8mG1T");
        } else if (i == 19) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1Ve7pJJK6GQFPEk2ttwMTZkfuahCghvtf");
        } else if (i == 20) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1LoUyh8A8l72D3YmNADkli57Cs0FwVpt_");
        } else if (i == 21) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1O_2nuAzmFI5ZTdAPX3U426uji4ai6lLq");
        } else if (i == 22) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1PuwHxR0bNnDuhQpdJc3QL5uLARclJ8Ok");
        } else if (i == 23) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1yLhzhvae0mlQK7AzXS5RtxJW-mThqawH");
        } else if (i == 24) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1s7DNh3j192fAMj4CxjIxvkRFlZO0ICWt");
        } else if (i == 25) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1-PBP8dUWXszU8GeU8YC5zCjzdkMTgYu-");
        } else if (i == 26) {
            eeewebview.loadUrl("https://drive.google.com/open?id=1QqeQMqENXVOgY9eCDjCAn0hyllGx0Uc3");
        } else if (i == 27) {
            eeewebview.loadUrl("https://drive.google.com/open?id=19-faLlpbVSV6pr0JJnhVjZO4OOVrYjUi");
        } else {
            eeewebview.loadUrl("https://drive.google.com/open?id=1hvzo5RwOwnbSt4LUgmWQZoGk587xb6TV");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);

        eeelistview = (ListView) findViewById(R.id.eeelist);
        eeewebview = (WebView) findViewById(R.id.webeee);
        eeewebview.clearCache(true);
        eeewebview.clearHistory();
        eeewebview.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.EeeSubs));
        eeelistview.setOnItemClickListener(this);
        eeelistview.setAdapter(arrayAdapter);

    }
}
