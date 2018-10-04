package com.trix.altaf.britrix_trixera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.C0552c;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends C0552c {
    /* renamed from: l */
    private FirebaseAuth f8905l;
    /* renamed from: m */
    private Toolbar f8906m;
    /* renamed from: n */
    private CardView f8907n;
    /* renamed from: o */
    private CardView f8908o;
    /* renamed from: p */
    private CardView f8909p;
    /* renamed from: q */
    private CardView f8910q;
    /* renamed from: r */
    private CardView f8911r;
    /* renamed from: s */
    private CardView f8912s;
    /* renamed from: t */
    private CardView f8913t;

    /* renamed from: com.trix.altaf.britrix_trixera.MainActivity$1 */
    class C15011 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MainActivity f8898a;

        C15011(MainActivity mainActivity) {
            this.f8898a = mainActivity;
        }

        public void onClick(View view) {
            this.f8898a.startActivity(new Intent(this.f8898a, BegActivity.class));
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.MainActivity$2 */
    class C15022 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MainActivity f8899a;

        C15022(MainActivity mainActivity) {
            this.f8899a = mainActivity;
        }

        public void onClick(View view) {
            this.f8899a.startActivity(new Intent(this.f8899a, PharmActivity.class));
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.MainActivity$3 */
    class C15033 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MainActivity f8900a;

        C15033(MainActivity mainActivity) {
            this.f8900a = mainActivity;
        }

        public void onClick(View view) {
            this.f8900a.startActivity(new Intent(this.f8900a, cseActivity.class));
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.MainActivity$4 */
    class C15044 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MainActivity f8901a;

        C15044(MainActivity mainActivity) {
            this.f8901a = mainActivity;
        }

        public void onClick(View view) {
            this.f8901a.startActivity(new Intent(this.f8901a, eceActivity.class));
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.MainActivity$5 */
    class C15055 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MainActivity f8902a;

        C15055(MainActivity mainActivity) {
            this.f8902a = mainActivity;
        }

        public void onClick(View view) {
            this.f8902a.startActivity(new Intent(this.f8902a, eeeActivity.class));
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.MainActivity$6 */
    class C15066 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MainActivity f8903a;

        C15066(MainActivity mainActivity) {
            this.f8903a = mainActivity;
        }

        public void onClick(View view) {
            this.f8903a.startActivity(new Intent(this.f8903a, mechActivity.class));
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.MainActivity$7 */
    class C15077 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MainActivity f8904a;

        C15077(MainActivity mainActivity) {
            this.f8904a = mainActivity;
        }

        public void onClick(View view) {
            this.f8904a.startActivity(new Intent(this.f8904a, civilActivity.class));
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        this.f8905l = FirebaseAuth.getInstance();
        this.f8906m = (Toolbar) findViewById(R.id.main_appBar);
        m2574a(this.f8906m);
        m2580h().mo481a((CharSequence) "Britrix");
        this.f8907n = (CardView) findViewById(R.id.beg);
        this.f8908o = (CardView) findViewById(R.id.pharm);
        this.f8909p = (CardView) findViewById(R.id.cse);
        this.f8910q = (CardView) findViewById(R.id.ece);
        this.f8911r = (CardView) findViewById(R.id.eee);
        this.f8912s = (CardView) findViewById(R.id.mech);
        this.f8913t = (CardView) findViewById(R.id.civil);
        this.f8907n.setOnClickListener(new C15011(this));
        this.f8908o.setOnClickListener(new C15022(this));
        this.f8909p.setOnClickListener(new C15033(this));
        this.f8910q.setOnClickListener(new C15044(this));
        this.f8911r.setOnClickListener(new C15055(this));
        this.f8912s.setOnClickListener(new C15066(this));
        this.f8913t.setOnClickListener(new C15077(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_rate) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.trix.altaf.britrix_trixera&hl=enhttps://play.google.com/store/apps/details?id=com.trix.altaf.britrix_trixera&hl=en")));
        }
        if (menuItem.getItemId() == R.id.action_about) {
            startActivity(new Intent(this, Help.class));
        }
        if (menuItem.getItemId() == R.id.action_info) {
            startActivity(new Intent(this, AboutUs.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
