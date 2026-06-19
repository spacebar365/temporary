package com.p033al.dlnaserver.customs;

import android.view.View;
import android.widget.LinearLayout;
import com.p033al.dlnaserver.p035b.C0360n;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.g */
/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0384g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0380c f1460a;

    ViewOnClickListenerC0384g(C0380c c0380c) {
        this.f1460a = c0380c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iMin = Math.min(Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString()), this.f1460a.f1453a.size() - 1);
        if (iMin >= 0) {
            this.f1460a.f1453a.set(iMin, "");
        }
        this.f1460a.notifyDataSetChanged();
        C0360n.m1048a(this.f1460a.f1455c, "pathsList", (ArrayList<String>) this.f1460a.f1453a);
    }
}
