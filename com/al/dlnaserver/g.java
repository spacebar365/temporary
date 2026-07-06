package com.al.dlnaserver;

import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import com.al.dlnaserver.b.n;
import java.util.ArrayList;

/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class g implements View$OnClickListener {
    final /* synthetic */ MainActivityTV a;
    private final /* synthetic */ Context b;

    g(MainActivityTV mainActivityTV, Context context) {
        this.a = mainActivityTV;
        this.b = context;
    }

    static /* synthetic */ MainActivityTV a(g gVar) {
        return gVar.a;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        MainActivityTV.c(this.a).add("");
        MainActivityTV.d(this.a);
        MainActivityTV.e(this.a).notifyDataSetChanged();
        MainActivityTV.f(this.a).post(new h(this));
        n.a(this.b, "pathsList", (ArrayList<String>) MainActivityTV.c(this.a));
    }
}
