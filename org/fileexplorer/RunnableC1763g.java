package org.fileexplorer;

/* JADX INFO: renamed from: org.fileexplorer.g */
/* JADX INFO: compiled from: FileDialogTV.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1763g implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileDialogTV f6582a;

    RunnableC1763g(FileDialogTV fileDialogTV) {
        this.f6582a = fileDialogTV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6582a.getListView().setSelectionFromTop(this.f6582a.f6574u, this.f6582a.f6575v);
    }
}
