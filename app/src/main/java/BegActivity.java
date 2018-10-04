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

public class BegActivity extends C0552c {
    /* renamed from: l */
    ListView f8893l;
    /* renamed from: m */
    AdView f8894m;
    /* renamed from: n */
    private Toolbar f8895n;
    /* renamed from: o */
    private WebView f8896o;

    /* renamed from: com.trix.altaf.britrix_trixera.BegActivity$1 */
    class C15001 implements OnItemClickListener {
        /* renamed from: a */
        final /* synthetic */ BegActivity f8892a;

        C15001(BegActivity begActivity) {
            this.f8892a = begActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=1YiZPDdhKhDzwUqKyai7lstF8mw69nCOu");
            } else if (i == 1) {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=18nd098QjU0bu6PuJuO8IUO47kTXyTPJX");
            } else if (i == 2) {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=1dmQDJJZ-0lV2W8jE8WrfassfFuxh2bLS");
            } else if (i == 3) {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=19AgpUGbk-b1VzH39tvGJNICMLbo9x4mr");
            } else if (i == 4) {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=1P1weh_4uYg-a4fMpDxuK_RwBahb6SXON");
            } else if (i == 5) {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=17Lq7ztSJrBPd_uPuq9XIeVT4sWDg6STa");
            } else if (i == 6) {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=1AoxJykJVG4j93aA42_0sFIpCFBspDo-I");
            } else {
                this.f8892a.f8896o.loadUrl("https://drive.google.com/open?id=1j3rOh9H52ONzYyR5YI68mcn0qhcNkYfD");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_beg);
        this.f8895n = (Toolbar) findViewById(R.id.beg_appBar);
        m2574a(this.f8895n);
        m2580h().mo481a((CharSequence) "Begineers");
        m2580h().mo482a(true);
        C0943h.m5093a(this, "ca-app-pub-4906489236115501~1575465469");
        this.f8894m = (AdView) findViewById(R.id.adView);
        this.f8894m.mo871a(new C0929a().m5056a());
        this.f8893l = (ListView) findViewById(R.id.beglist);
        this.f8896o = (WebView) findViewById(R.id.webbeg);
        this.f8896o.clearCache(true);
        this.f8896o.clearHistory();
        this.f8896o.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(R.array.BegSubs));
        this.f8893l.setOnItemClickListener(new C15001(this));
        this.f8893l.setAdapter(arrayAdapter);
    }
}
