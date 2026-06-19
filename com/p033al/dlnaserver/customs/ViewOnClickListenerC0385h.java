package com.p033al.dlnaserver.customs;

import android.os.Build;
import android.view.View;
import com.p033al.dlnaserver.p035b.C0360n;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.h */
/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0385h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0380c f1461a;

    ViewOnClickListenerC0385h(C0380c c0380c) {
        this.f1461a = c0380c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (Build.VERSION.SDK_INT >= 19 && C0360n.m1050a(this.f1461a.f1455c, "use_saf")) {
            C0380c.m1082a(this.f1461a, view, 12346);
        } else {
            C0380c.m1082a(this.f1461a, view, 12345);
        }
    }
}
