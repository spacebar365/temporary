package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0686u extends AbstractC0650o {
    AbstractC0686u() {
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0686u m1692b(byte[] bArr) throws IOException {
        C0638l c0638l = new C0638l(bArr);
        try {
            AbstractC0686u abstractC0686uM1560b = c0638l.m1560b();
            if (c0638l.available() != 0) {
                throw new IOException("Extra data detected in stream");
            }
            return abstractC0686uM1560b;
        } catch (ClassCastException e) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* JADX INFO: renamed from: a */
    abstract void mo1335a(C0660s c0660s);

    /* JADX INFO: renamed from: a */
    abstract boolean mo1336a();

    /* JADX INFO: renamed from: a */
    abstract boolean mo1337a(AbstractC0686u abstractC0686u);

    /* JADX INFO: renamed from: e */
    abstract int mo1341e();

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0618f) && mo1337a(((InterfaceC0618f) obj).mo1358i());
    }

    /* JADX INFO: renamed from: g */
    AbstractC0686u mo1400g() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    AbstractC0686u mo1401h() {
        return this;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public abstract int hashCode();

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this;
    }
}
