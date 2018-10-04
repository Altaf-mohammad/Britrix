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

public class civilActivity extends C0552c {
    /* renamed from: l */
    ListView f8922l;
    /* renamed from: m */
    AdView f8923m;
    /* renamed from: n */
    private Toolbar f8924n;
    /* renamed from: o */
    private WebView f8925o;

    /* renamed from: com.trix.altaf.britrix_trixera.civilActivity$1 */
    class C15101 implements OnItemClickListener {
        /* renamed from: a */
        final /* synthetic */ civilActivity f8921a;

        C15101(civilActivity civilactivity) {
            this.f8921a = civilactivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=1YeZayGhLlRjSvKKw0nIRMcHJpGgZh3ke");
            } else if (i == 1) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=1HJyCByZFwFXd9M0oMwvUBjNY-O9z5Fon");
            } else if (i == 2) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=1PZQouLviW6pyFb90cRejvecCMiCbySjH");
            } else if (i == 3) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=1_nT30N8aZwspg2qLRedPZvVUqDBUNTUy");
            } else if (i == 4) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=1lId9iKVia83x9xF-0CQquuUBbT3F8NFO");
            } else if (i == 5) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=16LF3ngeaU98F7mcK2ZDmP-lcRrZXP8Qi");
            } else if (i == 6) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=18uj3CcXVQsLPxLoamdfYqTdAGfK1yfSn");
            } else if (i == 7) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=12lWZzI9tYBAGq9y2grKWKQskSMo_6Vdx");
            } else if (i == 8) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=1rgMvW_WathhT7rSTiQ-yDwj8hTRNEaEg");
            } else if (i == 9) {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=1fQ-SqY-hVqnqNSiFjesabHsc8-uuCH_g");
            } else {
                this.f8921a.f8925o.loadUrl("https://drive.google.com/open?id=15_17easiahiD9vxtPGIR3WnA5WCRBNfe");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_civil);
        this.f8924n = (Toolbar) findViewById(R.id.civil_appBar);
        m2574a(this.f8924n);
        m2580h().mo481a((CharSequence) "Civil");
        m2580h().mo482a(true);
        C0943h.m5093a(this, "ca-app-pub-4906489236115501~1575465469");
        this.f8923m = (AdView) findViewById(R.id.civiladView);
        this.f8923m.mo871a(new C0929a().m5056a());
        this.f8922l = (ListView) findViewById(R.id.civillist);
        this.f8925o = (WebView) findViewById(R.id.civilpharm);
        this.f8925o.clearCache(true);
        this.f8925o.clearHistory();
        this.f8925o.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(R.array.CivilSubs));
        this.f8922l.setOnItemClickListener(new C15101(this));
        this.f8922l.setAdapter(arrayAdapter);
    }
}
