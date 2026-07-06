package org.fileexplorer;

/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ FileDialogTV a;

    g(FileDialogTV fileDialogTV) {
        this.a = fileDialogTV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getListView().setSelectionFromTop(FileDialogTV.d(this.a), FileDialogTV.e(this.a));
    }
}
