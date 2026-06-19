package org.fileexplorer;

import android.view.View;

/* JADX INFO: renamed from: org.fileexplorer.i */
/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1765i implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialogTV f6584a;

    ViewOnClickListenerC1765i(FileDialogTV fileDialogTV) {
        this.f6584a = fileDialogTV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f6584a.finish();
    }
}
