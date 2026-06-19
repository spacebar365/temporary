package org.bouncycastle.p054a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.bg */
/* JADX INFO: loaded from: classes.dex */
public class C0583bg extends C0660s {
    public C0583bg(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.p054a.C0660s
    /* JADX INFO: renamed from: a */
    public final void mo1459a(InterfaceC0618f interfaceC0618f) throws IOException {
        if (interfaceC0618f == null) {
            throw new IOException("null object detected");
        }
        interfaceC0618f.mo1358i().mo1400g().mo1335a(this);
    }

    @Override // org.bouncycastle.p054a.C0660s
    /* JADX INFO: renamed from: b */
    final C0660s mo1460b() {
        return this;
    }

    @Override // org.bouncycastle.p054a.C0660s
    /* JADX INFO: renamed from: c */
    final C0660s mo1461c() {
        return this;
    }
}
