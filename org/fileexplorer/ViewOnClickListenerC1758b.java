package org.fileexplorer;

import android.view.View;

/* JADX INFO: renamed from: org.fileexplorer.b */
/* JADX INFO: compiled from: FileDialog.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1758b implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialog f6577a;

    ViewOnClickListenerC1758b(FileDialog fileDialog) {
        this.f6577a = fileDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f6577a.f6535d.getText().length() > 0) {
            this.f6577a.getIntent().putExtra("RESULT_PATH", String.valueOf(this.f6577a.f6542k) + "/" + ((Object) this.f6577a.f6535d.getText()));
            this.f6577a.getIntent().putExtra("LIST_ITEM", this.f6577a.f6537f);
            this.f6577a.setResult(-1, this.f6577a.getIntent());
            this.f6577a.finish();
        }
    }
}
