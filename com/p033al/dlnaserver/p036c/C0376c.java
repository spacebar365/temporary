package com.p033al.dlnaserver.p036c;

import android.util.Log;
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.p035b.C0349c;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.al.dlnaserver.c.c */
/* JADX INFO: compiled from: FileTreeWalker.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0376c {

    /* JADX INFO: renamed from: a */
    private List<File> f1448a;

    protected C0376c() {
    }

    public C0376c(List<File> list) {
        this.f1448a = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m1071a(File file) {
        if (this.f1448a != null && file.isFile() && (C0349c.m1021b(file) || C0349c.m1023c(file))) {
            this.f1448a.add(file);
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!App.f1269a) {
                        Log.w("FileTreeWalker", "FileTreeWalker().walk::isStop");
                        return;
                    }
                    m1071a(file2);
                }
                return;
            }
            return;
        }
        Log.w("FileTreeWalker", "File='" + file.getAbsolutePath() + "' is not a media file");
    }
}
