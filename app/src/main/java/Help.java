package com.trix.altaf.britrix_trixera;

import android.os.Bundle;
import android.support.v7.app.C0552c;
import android.support.v7.widget.Toolbar;

public class Help extends C0552c {
    /* renamed from: l */
    private Toolbar f8897l;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_help);
        this.f8897l = (Toolbar) findViewById(R.id.help_appBar);
        m2574a(this.f8897l);
        m2580h().mo481a((CharSequence) "About us");
        m2580h().mo482a(true);
    }
}
