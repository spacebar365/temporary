package org.b.a.a.e;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DefaultTempFileManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    private final File a = new File(System.getProperty("java.io.tmpdir"));
    private final List<Object> b;

    public a() {
        if (!this.a.exists()) {
            this.a.mkdirs();
        }
        this.b = new ArrayList();
    }

    @Override // org.b.a.a.e.c
    public final void a() {
        Iterator<Object> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.b.clear();
    }
}
