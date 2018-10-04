package com.trix.altaf.britrix_trixera;

import android.os.Bundle;
import android.support.v7.app.C0552c;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0936c.C0929a;
import com.google.android.gms.ads.C0943h;

public class mechActivity extends C0552c {
    /* renamed from: l */
    ListView f8942l;
    /* renamed from: m */
    AdView f8943m;
    /* renamed from: n */
    private Toolbar f8944n;
    /* renamed from: o */
    private WebView f8945o;

    /* renamed from: com.trix.altaf.britrix_trixera.mechActivity$1 */
    class C15141 implements OnItemClickListener {
        /* renamed from: a */
        final /* synthetic */ mechActivity f8941a;

        C15141(mechActivity mechactivity) {
            this.f8941a = mechactivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1GLDL-VQG3R9GemkdMDwDjB8-MOIk4EvP");
            } else if (i == 1) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1EPnUbh5d9nFlZngtjUqLLAbR1LBzKLZQ");
            } else if (i == 2) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1Sf0ATkbqI2wr809qJSoVHqrASrYRqu_s");
            } else if (i == 3) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1cx2gYOBi_POT8ch8sRYcvPSHjL_dMCb9");
            } else if (i == 4) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1HgSnTTk5j_XXc7xlNHw2ZUdMiDMiPs7l");
            } else if (i == 5) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1zKGVHkhWSdUrxOs1mj2it-AnCkhOTksj");
            } else if (i == 6) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1n4JwOiHlVOPArTdC8Ij2P8l1bEah5sgY");
            } else if (i == 7) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1xQ8Jb_xkwRjScDfxT14VyIxZIWw2OOxP");
            } else if (i == 8) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1cqeMZlH_aLQAUnKLb-_dnBwhYAgPZ5TM");
            } else if (i == 9) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1q9DWlhICInzlHSmvZOJUretbdBDVaepX");
            } else if (i == 10) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1HLpZL-ZkrZdw_O0jzTyRD5_t0ZJ5lUCm");
            } else if (i == 11) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1jSS_GYd-9-RZEhQweeT-qgBpFRfTNay9");
            } else if (i == 12) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1GPK8VuOQ-ro-LUOoCyDpHuBf4HW1iPU5");
            } else if (i == 13) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1W-Zyc74OxK9g-lHzIps27VT024qLnujJ");
            } else if (i == 14) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1yObxKZHziYLnIQqgY8pugHVphOXN160Y");
            } else if (i == 15) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1Su2rPesFeaU1yGWfi62vEuGyfbBLqH4R");
            } else if (i == 16) {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1eJ-99llRUauxQx-DevehCS8rKZMIAPIu");
            } else {
                this.f8941a.f8945o.loadUrl("https://drive.google.com/open?id=1bvsoUjgpf6mZEKYFr92NoXCbSVMFObqX");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_mech);
        this.f8944n = (Toolbar) findViewById(R.id.mech_appBar);
        m2574a(this.f8944n);
        m2580h().mo481a((CharSequence) "Mechanical");
        m2580h().mo482a(true);
        C0943h.m5093a(this, "ca-app-pub-4906489236115501~1575465469");
        this.f8943m = (AdView) findViewById(R.id.mechadView);
        this.f8943m.mo871a(new C0929a().m5056a());
        this.f8942l = (ListView) findViewById(R.id.mechlist);
        this.f8945o = (WebView) findViewById(R.id.webmech);
        this.f8945o.clearCache(true);
        this.f8945o.clearHistory();
        this.f8945o.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(R.array.MechSubs));
        this.f8942l.setOnItemClickListener(new C15141(this));
        this.f8942l.setAdapter(arrayAdapter);
    }
}
