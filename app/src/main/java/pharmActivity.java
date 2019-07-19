package android.com.britrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class pharmActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView pharmlistview;
    private WebView pharmwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharm);

        pharmlistview = (ListView) findViewById(R.id.pharmlist);
        pharmwebview = (WebView) findViewById(R.id.webpharm);
        pharmwebview.clearCache(true);
        pharmwebview.clearHistory();
        pharmwebview.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.PharmacySubs));
        pharmlistview.setOnItemClickListener(this);
        pharmlistview.setAdapter(arrayAdapter);

    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1kw51t5J3aGMjU3xqRmbPurcivwIVdn4o");
        } else if (i == 1) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1MvuxEzKNaCumBRwnAU1p3UhYUR5jvOM6");
        } else if (i == 2) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1X_x1Zer1TMxvQ5PtaPpfmPNPwOuNrluj");
        } else if (i == 3) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1gRxy6QJ26LorGWF3pfQk4WHtvnOK-289");
        } else if (i == 4) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1v1IZWjCKAAW9NnG2rW_3NODALp8awLfA");
        } else if (i == 5) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=18yRDEvqTB3p4DsOCBys3iXtit6msRhIL");
        } else if (i == 6) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1meVJOk4tovRu0UA_mXV_-vRhk8PM0UQo");
        } else if (i == 7) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=10Nneq3NxApWCv7stCCnlU5El2WgxTsdz");
        } else if (i == 8) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1S7Z0LGz5BmGisgNd9EVn6yTvLbF1poXx");
        } else if (i == 9) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1IdnLOON4PRVd9ohRKvL41PSD4FA5woaO");
        } else if (i == 10) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1OPk6KLN34m1F1r0MuGHpKhNlq04SzC1f");
        } else if (i == 11) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1PrFb7ZFI9aOpIIWmdmERkNSI2yt9p_BY");
        } else if (i == 12) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1m21td05HEa9HwZaAExRD1_yskQob38-1");
        } else if (i == 13) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1Jlge_oI5PqBoCWInTsuaHnqI6m4KRTgS");
        } else if (i == 14) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1tajsmMzosmKcDR3cwb2UD-QGYHu9ccyD");
        } else if (i == 15) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1QUASkF7e3cNIgS7vzqcw22OkMn18_Cvm");
        } else if (i == 16) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1-pyfjH9QOTORv6h9iXXhmYhVUc5aGxhj");
        } else if (i == 17) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1C6gmIFEDHFRjsmZEHzUf-4tApMciclUl");
        } else if (i == 18) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1W79RlOzlybm7c7SWv_L13xOqSDA3o2kh");
        } else if (i == 19) {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1qeaVsnljJWjD3hqeHqJZFIEh6qmre_u0");
        } else {
            pharmwebview.loadUrl("https://drive.google.com/open?id=1chItk9eKGMHoxCg2fc2O7qeq1WPhtAiH");
        }
    }
}
