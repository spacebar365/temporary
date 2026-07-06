package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends o {
    u() {
    }

    public static u b(byte[] bArr) {
        l lVar = new l(bArr);
        try {
            u uVarB = lVar.b();
            if (lVar.available() != 0) {
                throw new IOException("Extra data detected in stream");
            }
            return uVarB;
        } catch (ClassCastException e) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    abstract void a(s sVar);

    abstract boolean a();

    abstract boolean a(u uVar);

    abstract int e();

    @Override // org.bouncycastle.a.o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && a(((f) obj).i());
    }

    u g() {
        return this;
    }

    u h() {
        return this;
    }

    @Override // org.bouncycastle.a.o
    public abstract int hashCode();

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        return this;
    }
}
