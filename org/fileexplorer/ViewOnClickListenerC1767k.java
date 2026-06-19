package org.fileexplorer;

import android.view.View;

/* JADX INFO: renamed from: org.fileexplorer.k */
/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1767k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialogTV f6586a;

    ViewOnClickListenerC1767k(FileDialogTV fileDialogTV) {
        this.f6586a = fileDialogTV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FileDialogTV.m5206b(this.f6586a, this.f6586a.f6556c);
        this.f6586a.f6557d.setText("");
        this.f6586a.f6557d.requestFocus();
    }
}
