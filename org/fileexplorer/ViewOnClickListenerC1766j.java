package org.fileexplorer;

import android.view.View;

/* JADX INFO: renamed from: org.fileexplorer.j */
/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1766j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialogTV f6585a;

    ViewOnClickListenerC1766j(FileDialogTV fileDialogTV) {
        this.f6585a = fileDialogTV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f6585a.f6569p != null) {
            this.f6585a.getIntent().putExtra("RESULT_PATH", this.f6585a.f6569p.getPath());
            this.f6585a.setResult(-1, this.f6585a.getIntent());
            this.f6585a.finish();
        }
    }
}
