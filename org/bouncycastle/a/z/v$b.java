package org.bouncycastle.a.z;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class v$b implements Enumeration {
    final /* synthetic */ v a;

    private v$b(v vVar) {
        this.a = vVar;
    }

    /* synthetic */ v$b(v vVar, byte b) {
        this(vVar);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        throw new NoSuchElementException("Empty Enumeration");
    }
}
