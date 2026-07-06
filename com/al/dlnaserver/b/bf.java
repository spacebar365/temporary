package com.al.dlnaserver.b;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class bf implements AdapterView$OnItemSelectedListener {
    final /* synthetic */ p a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Context c;

    bf(p pVar, String str, Context context) {
        this.a = pVar;
        this.b = str;
        this.c = context;
    }

    @Override // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (!this.b.isEmpty() && !this.b.equals(p.a()[i])) {
            p.b(this.c);
        }
        n.a(this.c, "thumbs_quality", p.a()[i]);
    }

    @Override // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
