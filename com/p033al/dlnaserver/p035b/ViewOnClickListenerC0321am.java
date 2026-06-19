package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: com.al.dlnaserver.b.am */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0321am implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1341a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1342b;

    ViewOnClickListenerC0321am(C0362p c0362p, Context context) {
        this.f1341a = c0362p;
        this.f1342b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0360n.m1049a(this.f1342b, "show_thumbs", ((CheckBox) view).isChecked());
    }
}
