package com.trix.altaf.britrix_trixera;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.p011a.C0207j;
import android.support.v7.app.C0552c;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.gms.auth.api.C1077a;
import com.google.android.gms.auth.api.signin.C1093b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C1090a;
import com.google.android.gms.common.C1151a;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.C1168f;
import com.google.android.gms.common.api.C1168f.C1165a;
import com.google.android.gms.common.api.C1168f.C1167c;
import com.google.android.gms.p032b.C1127a;
import com.google.android.gms.p032b.C1131e;
import com.google.firebase.auth.C1450q;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.C1411a;

public class AuthActivity extends C0552c {
    /* renamed from: l */
    SignInButton f8887l;
    /* renamed from: m */
    FirebaseAuth f8888m;
    /* renamed from: n */
    C1168f f8889n;
    /* renamed from: o */
    C1411a f8890o;
    /* renamed from: p */
    private ProgressDialog f8891p;

    /* renamed from: com.trix.altaf.britrix_trixera.AuthActivity$1 */
    class C14961 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AuthActivity f8883a;

        C14961(AuthActivity authActivity) {
            this.f8883a = authActivity;
        }

        public void onClick(View view) {
            this.f8883a.f8891p = new ProgressDialog(this.f8883a);
            this.f8883a.f8891p.setTitle("Authenticating User");
            this.f8883a.f8891p.setMessage("Please wait while we set the credentials");
            this.f8883a.f8891p.show();
            this.f8883a.m13120l();
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.AuthActivity$2 */
    class C14972 implements C1411a {
        /* renamed from: a */
        final /* synthetic */ AuthActivity f8884a;

        C14972(AuthActivity authActivity) {
            this.f8884a = authActivity;
        }

        /* renamed from: a */
        public void mo2019a(FirebaseAuth firebaseAuth) {
            if (firebaseAuth.m12890a() != null) {
                this.f8884a.startActivity(new Intent(this.f8884a, MainActivity.class));
            }
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.AuthActivity$3 */
    class C14983 implements C1167c {
        /* renamed from: a */
        final /* synthetic */ AuthActivity f8885a;

        C14983(AuthActivity authActivity) {
            this.f8885a = authActivity;
        }

        /* renamed from: a */
        public void mo1123a(C1151a c1151a) {
            Toast.makeText(this.f8885a, "Some Thing went Wrong!", 0).show();
        }
    }

    /* renamed from: com.trix.altaf.britrix_trixera.AuthActivity$4 */
    class C14994 implements C1127a<Object> {
        /* renamed from: a */
        final /* synthetic */ AuthActivity f8886a;

        C14994(AuthActivity authActivity) {
            this.f8886a = authActivity;
        }

        /* renamed from: a */
        public void mo1162a(C1131e<Object> c1131e) {
            if (c1131e.mo1095b()) {
                Log.d("TAG", "signInWithCredential:success");
                this.f8886a.f8888m.m12890a();
                this.f8886a.f8891p.dismiss();
                return;
            }
            Log.w("TAG", "signInWithCredential:failure", c1131e.mo1097d());
            Toast.makeText(this.f8886a, "Authentication failed.", 0).show();
        }
    }

    /* renamed from: a */
    private void m13118a(GoogleSignInAccount googleSignInAccount) {
        this.f8888m.m12887a(C1450q.m12970a(googleSignInAccount.m5829b(), null)).mo1088a((Activity) this, new C14994(this));
    }

    /* renamed from: l */
    private void m13120l() {
        startActivityForResult(C1077a.f3629h.mo1058a(this.f8889n), 2);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            C1093b a = C1077a.f3629h.mo1059a(intent);
            if (a.m5868c()) {
                m13118a(a.m5866a());
            } else {
                Toast.makeText(this, "Authentication went wrong", 0).show();
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_auth);
        this.f8887l = (SignInButton) findViewById(R.id.googleBtn);
        this.f8888m = FirebaseAuth.getInstance();
        this.f8887l.setOnClickListener(new C14961(this));
        this.f8890o = new C14972(this);
        this.f8889n = new C1165a(this).m6149a((C0207j) this, new C14983(this)).m6151a(C1077a.f3626e, new C1090a(GoogleSignInOptions.f3680f).m5843a(getString(R.string.default_web_client_id)).m5844b().m5846d()).m6155b();
    }

    protected void onStart() {
        super.onStart();
        this.f8888m.m12891a(this.f8890o);
    }
}
