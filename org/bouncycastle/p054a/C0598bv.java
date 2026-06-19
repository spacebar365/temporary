package org.bouncycastle.p054a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.bv */
/* JADX INFO: loaded from: classes.dex */
public final class C0598bv extends C0660s {
    public C0598bv(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.p054a.C0660s
    /* JADX INFO: renamed from: a */
    public final void mo1459a(InterfaceC0618f interfaceC0618f) {
        if (interfaceC0618f == null) {
            throw new IOException("null object detected");
        }
        interfaceC0618f.mo1358i().mo1401h().mo1335a(this);
    }
}
