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

public class PharmActivity extends C0552c {
    /* renamed from: l */
    ListView f8915l;
    /* renamed from: m */
    AdView f8916m;
    /* renamed from: n */
    private Toolbar f8917n;
    /* renamed from: o */
    private WebView f8918o;

    /* renamed from: com.trix.altaf.britrix_trixera.PharmActivity$1 */
    class C15081 implements OnItemClickListener {
        /* renamed from: a */
        final /* synthetic */ PharmActivity f8914a;

        C15081(PharmActivity pharmActivity) {
            this.f8914a = pharmActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1kw51t5J3aGMjU3xqRmbPurcivwIVdn4o");
            } else if (i == 1) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1MvuxEzKNaCumBRwnAU1p3UhYUR5jvOM6");
            } else if (i == 2) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1X_x1Zer1TMxvQ5PtaPpfmPNPwOuNrluj");
            } else if (i == 3) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1gRxy6QJ26LorGWF3pfQk4WHtvnOK-289");
            } else if (i == 4) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1v1IZWjCKAAW9NnG2rW_3NODALp8awLfA");
            } else if (i == 5) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=18yRDEvqTB3p4DsOCBys3iXtit6msRhIL");
            } else if (i == 6) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1meVJOk4tovRu0UA_mXV_-vRhk8PM0UQo");
            } else if (i == 7) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=10Nneq3NxApWCv7stCCnlU5El2WgxTsdz");
            } else if (i == 8) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1S7Z0LGz5BmGisgNd9EVn6yTvLbF1poXx");
            } else if (i == 9) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1IdnLOON4PRVd9ohRKvL41PSD4FA5woaO");
            } else if (i == 10) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1OPk6KLN34m1F1r0MuGHpKhNlq04SzC1f");
            } else if (i == 11) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1PrFb7ZFI9aOpIIWmdmERkNSI2yt9p_BY");
            } else if (i == 12) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1m21td05HEa9HwZaAExRD1_yskQob38-1");
            } else if (i == 13) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1Jlge_oI5PqBoCWInTsuaHnqI6m4KRTgS");
            } else if (i == 14) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1tajsmMzosmKcDR3cwb2UD-QGYHu9ccyD");
            } else if (i == 15) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1QUASkF7e3cNIgS7vzqcw22OkMn18_Cvm");
            } else if (i == 16) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1-pyfjH9QOTORv6h9iXXhmYhVUc5aGxhj");
            } else if (i == 17) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1C6gmIFEDHFRjsmZEHzUf-4tApMciclUl");
            } else if (i == 18) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1W79RlOzlybm7c7SWv_L13xOqSDA3o2kh");
            } else if (i == 19) {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1qeaVsnljJWjD3hqeHqJZFIEh6qmre_u0");
            } else {
                this.f8914a.f8918o.loadUrl("https://drive.google.com/open?id=1chItk9eKGMHoxCg2fc2O7qeq1WPhtAiH");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_pharm);
        C0943h.m5093a(this, "ca-app-pub-4906489236115501~1575465469");
        this.f8916m = (AdView) findViewById(R.id.pharmadView);
        this.f8916m.mo871a(new C0929a().m5056a());
        this.f8917n = (Toolbar) findViewById(R.id.pharm_appBar);
        m2574a(this.f8917n);
        m2580h().mo481a((CharSequence) "Pharmacy");
        m2580h().mo482a(true);
        this.f8915l = (ListView) findViewById(R.id.pharmlist);
        this.f8918o = (WebView) findViewById(R.id.webpharm);
        this.f8918o.clearCache(true);
        this.f8918o.clearHistory();
        this.f8918o.getSettings().setJavaScriptEnabled(true);
        ListAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(R.array.PharmacySubs));
        this.f8915l.setOnItemClickListener(new C15081(this));
        this.f8915l.setAdapter(arrayAdapter);
    }
}
