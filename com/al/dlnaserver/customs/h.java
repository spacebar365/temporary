package com.al.dlnaserver.customs;

import android.os.Build$VERSION;
import android.view.View;
import android.view.View$OnClickListener;
import com.al.dlnaserver.b.n;

/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class h implements View$OnClickListener {
    final /* synthetic */ c a;

    h(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        if (Build$VERSION.SDK_INT >= 19 && n.a(c.b(this.a), "use_saf")) {
            c.a(this.a, view, 12346);
        } else {
            c.a(this.a, view, 12345);
        }
    }
}
