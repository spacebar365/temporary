package com.p033al.dlnaserver;

import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.f */
/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0392f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivityTV f1475a;

    ViewOnClickListenerC0392f(MainActivityTV mainActivityTV) {
        this.f1475a = mainActivityTV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!App.f1269a) {
            MainActivityTV.m983a(this.f1475a);
        } else if (App.f1270b) {
            App.f1269a = false;
        } else {
            MainActivityTV.m986b(this.f1475a);
        }
    }
}
