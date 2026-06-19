package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bf */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class C0341bf implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1388a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ String f1389b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1390c;

    C0341bf(C0362p c0362p, String str, Context context) {
        this.f1388a = c0362p;
        this.f1389b = str;
        this.f1390c = context;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (!this.f1389b.isEmpty() && !this.f1389b.equals(C0362p.f1425b[i])) {
            C0362p.m1061b(this.f1390c);
        }
        C0360n.m1047a(this.f1390c, "thumbs_quality", C0362p.f1425b[i]);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
