package com.p033al.dlnaserver.customs;

import android.content.Context;
import android.os.FileObserver;
import android.util.Log;
import java.util.Date;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.i */
/* JADX INFO: compiled from: DirectoryObserver.java */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC0386i extends FileObserver {

    /* JADX INFO: renamed from: a */
    private Context f1462a;

    /* JADX INFO: renamed from: b */
    private long f1463b;

    /* JADX INFO: renamed from: c */
    private Thread f1464c;

    /* JADX INFO: renamed from: d */
    private String f1465d;

    /* JADX INFO: renamed from: e */
    private boolean f1466e;

    public FileObserverC0386i(String str, Context context) {
        super(str, 1792);
        this.f1462a = context;
        this.f1465d = str;
        this.f1466e = false;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        switch (i & 4095) {
            case 256:
                m1085a(str);
                break;
            case 512:
                m1085a(str);
                break;
            case 1024:
                m1085a(str);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m1089a() {
        return this.f1465d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1091b() {
        return this.f1466e;
    }

    /* JADX INFO: renamed from: a */
    public final void m1090a(boolean z) {
        this.f1466e = z;
    }

    /* JADX INFO: renamed from: a */
    private void m1085a(String str) {
        this.f1463b = new Date().getTime();
        Log.i("DirectoryObserver", "Updated for ".concat(String.valueOf(str)));
        m1087c();
    }

    /* JADX INFO: renamed from: c */
    private void m1087c() {
        if (this.f1464c == null) {
            this.f1464c = new C0387j(this);
            this.f1464c.start();
        }
    }
}
