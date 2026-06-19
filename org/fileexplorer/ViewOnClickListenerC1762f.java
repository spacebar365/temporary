package org.fileexplorer;

import android.view.View;

/* JADX INFO: renamed from: org.fileexplorer.f */
/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC1762f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialogTV f6581a;

    ViewOnClickListenerC1762f(FileDialogTV fileDialogTV) {
        this.f6581a = fileDialogTV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f6581a.f6557d.getText().length() > 0) {
            this.f6581a.getIntent().putExtra("RESULT_PATH", String.valueOf(this.f6581a.f6564k) + "/" + ((Object) this.f6581a.f6557d.getText()));
            this.f6581a.getIntent().putExtra("LIST_ITEM", this.f6581a.f6559f);
            this.f6581a.setResult(-1, this.f6581a.getIntent());
            this.f6581a.finish();
        }
    }
}
