package org.fileexplorer;

/* JADX INFO: compiled from: FileDialog.java */
/* JADX INFO: loaded from: classes.dex */
final class c implements Runnable {
    final /* synthetic */ FileDialog a;

    c(FileDialog fileDialog) {
        this.a = fileDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getListView().setSelectionFromTop(FileDialog.d(this.a), FileDialog.e(this.a));
    }
}
