package com.trix.altaf.britrix_trixera;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C0552c;

public class SplashActivity extends C0552c {
    /* renamed from: l */
    private static int f8920l = 1000;

    /* renamed from: com.trix.altaf.britrix_trixera.SplashActivity$1 */
    class C15091 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ SplashActivity f8919a;

        C15091(SplashActivity splashActivity) {
            this.f8919a = splashActivity;
        }

        public void run() {
            this.f8919a.startActivity(new Intent(this.f8919a, MainActivity.class));
            this.f8919a.finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splash);
        new Handler().postDelayed(new C15091(this), (long) f8920l);
    }
}
