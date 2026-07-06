package com.al.dlnaserver.customs;

import android.view.View;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.al.dlnaserver.b.n;
import java.util.ArrayList;

/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class f implements View$OnClickListener {
    final /* synthetic */ c a;

    f(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        int iMin = Math.min(Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString()), c.a(this.a).size() - 1);
        if (iMin >= 0) {
            c.a(this.a).remove(iMin);
        }
        this.a.notifyDataSetChanged();
        n.a(c.b(this.a), "pathsList", (ArrayList<String>) c.a(this.a));
    }
}
