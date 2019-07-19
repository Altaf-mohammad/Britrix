package android.com.britrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class mechActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView mechlistview;
    private WebView mechwebview;

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1GLDL-VQG3R9GemkdMDwDjB8-MOIk4EvP");
        } else if (i == 1) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1EPnUbh5d9nFlZngtjUqLLAbR1LBzKLZQ");
        } else if (i == 2) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1Sf0ATkbqI2wr809qJSoVHqrASrYRqu_s");
        } else if (i == 3) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1cx2gYOBi_POT8ch8sRYcvPSHjL_dMCb9");
        } else if (i == 4) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1HgSnTTk5j_XXc7xlNHw2ZUdMiDMiPs7l");
        } else if (i == 5) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1zKGVHkhWSdUrxOs1mj2it-AnCkhOTksj");
        } else if (i == 6) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1n4JwOiHlVOPArTdC8Ij2P8l1bEah5sgY");
        } else if (i == 7) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1xQ8Jb_xkwRjScDfxT14VyIxZIWw2OOxP");
        } else if (i == 8) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1cqeMZlH_aLQAUnKLb-_dnBwhYAgPZ5TM");
        } else if (i == 9) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1q9DWlhICInzlHSmvZOJUretbdBDVaepX");
        } else if (i == 10) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1HLpZL-ZkrZdw_O0jzTyRD5_t0ZJ5lUCm");
        } else if (i == 11) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1jSS_GYd-9-RZEhQweeT-qgBpFRfTNay9");
        } else if (i == 12) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1GPK8VuOQ-ro-LUOoCyDpHuBf4HW1iPU5");
        } else if (i == 13) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1W-Zyc74OxK9g-lHzIps27VT024qLnujJ");
        } else if (i == 14) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1yObxKZHziYLnIQqgY8pugHVphOXN160Y");
        } else if (i == 15) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1Su2rPesFeaU1yGWfi62vEuGyfbBLqH4R");
        } else if (i == 16) {
            mechwebview.loadUrl("https://drive.google.com/open?id=1eJ-99llRUauxQx-DevehCS8rKZMIAPIu");
        } else {
            mechwebview.loadUrl("https://drive.google.com/open?id=1bvsoUjgpf6mZEKYFr92NoXCbSVMFObqX");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);

        mechlistview = (ListView) findViewById(R.id.mechlist);
        mechwebview = (WebView) findViewById(R.id.webmech);
        mechwebview.clearCache(true);
        mechwebview.clearHistory();
        mechwebview.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.MechSubs));
        mechlistview.setOnItemClickListener(this);
        mechlistview.setAdapter(arrayAdapter);
    }


}
