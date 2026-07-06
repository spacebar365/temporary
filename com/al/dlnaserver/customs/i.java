package com.al.dlnaserver.customs;

import android.content.Context;
import android.os.FileObserver;
import android.util.Log;
import java.util.Date;

/* JADX INFO: compiled from: DirectoryObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends FileObserver {
    private Context a;
    private long b;
    private Thread c;
    private String d;
    private boolean e;

    static /* synthetic */ Context b(i iVar) {
        return iVar.a;
    }

    static /* synthetic */ long a(i iVar) {
        return iVar.b;
    }

    static /* synthetic */ void c(i iVar) {
        iVar.c = null;
    }

    public i(String str, Context context) {
        super(str, 1792);
        this.a = context;
        this.d = str;
        this.e = false;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        switch (i & 4095) {
            case 256:
                a(str);
                break;
            case 512:
                a(str);
                break;
            case 1024:
                a(str);
                break;
        }
    }

    public final String a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    private void a(String str) {
        this.b = new Date().getTime();
        Log.i("DirectoryObserver", "Updated for ".concat(String.valueOf(str)));
        c();
    }

    private void c() {
        if (this.c == null) {
            this.c = new j(this);
            this.c.start();
        }
    }
}
