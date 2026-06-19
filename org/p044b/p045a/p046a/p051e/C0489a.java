package org.p044b.p045a.p046a.p051e;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: org.b.a.a.e.a */
/* JADX INFO: compiled from: DefaultTempFileManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0489a implements InterfaceC0491c {

    /* JADX INFO: renamed from: a */
    private final File f1861a = new File(System.getProperty("java.io.tmpdir"));

    /* JADX INFO: renamed from: b */
    private final List<Object> f1862b;

    public C0489a() {
        if (!this.f1861a.exists()) {
            this.f1861a.mkdirs();
        }
        this.f1862b = new ArrayList();
    }

    @Override // org.p044b.p045a.p046a.p051e.InterfaceC0491c
    /* JADX INFO: renamed from: a */
    public final void mo1328a() {
        Iterator<Object> it = this.f1862b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f1862b.clear();
    }
}
