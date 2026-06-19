package org.fileexplorer;

/* JADX INFO: renamed from: org.fileexplorer.c */
/* JADX INFO: compiled from: FileDialog.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1759c implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialog f6578a;

    RunnableC1759c(FileDialog fileDialog) {
        this.f6578a = fileDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6578a.getListView().setSelectionFromTop(this.f6578a.f6552u, this.f6578a.f6553v);
    }
}
