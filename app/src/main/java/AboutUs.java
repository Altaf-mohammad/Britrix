package com.trix.altaf.britrix_trixera;

import android.os.Bundle;
import android.support.v7.app.C0552c;
import android.support.v7.widget.Toolbar;

public class AboutUs extends C0552c {
    /* renamed from: l */
    private Toolbar f8882l;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_about_us);
        this.f8882l = (Toolbar) findViewById(R.id.us_appBar);
        m2574a(this.f8882l);
        m2580h().mo481a((CharSequence) "Creator's Information");
        m2580h().mo482a(true);
    }
}
