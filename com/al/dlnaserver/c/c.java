package com.al.dlnaserver.c;

import android.util.Log;
import com.al.dlnaserver.App;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: FileTreeWalker.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private List<File> a;

    protected c() {
    }

    public c(List<File> list) {
        this.a = list;
    }

    public final void a(File file) {
        if (this.a != null && file.isFile() && (com.al.dlnaserver.b.c.b(file) || com.al.dlnaserver.b.c.c(file))) {
            this.a.add(file);
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!App.a) {
                        Log.w("FileTreeWalker", "FileTreeWalker().walk::isStop");
                        return;
                    }
                    a(file2);
                }
                return;
            }
            return;
        }
        Log.w("FileTreeWalker", "File='" + file.getAbsolutePath() + "' is not a media file");
    }
}
