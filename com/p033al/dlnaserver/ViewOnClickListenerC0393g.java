package com.p033al.dlnaserver;

import android.content.Context;
import android.view.View;
import com.p033al.dlnaserver.p035b.C0360n;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.al.dlnaserver.g */
/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0393g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivityTV f1476a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1477b;

    ViewOnClickListenerC0393g(MainActivityTV mainActivityTV, Context context) {
        this.f1476a = mainActivityTV;
        this.f1477b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1476a.f1298e.add("");
        this.f1476a.m988c();
        this.f1476a.f1297d.notifyDataSetChanged();
        this.f1476a.f1296c.post(new RunnableC0394h(this));
        C0360n.m1048a(this.f1477b, "pathsList", (ArrayList<String>) this.f1476a.f1298e);
    }
}
