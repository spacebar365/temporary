package org.bouncycastle.p118e.p129c.p131b.p133b;

import java.io.IOException;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p118e.p120b.p122b.C1448a;
import org.bouncycastle.p118e.p120b.p127f.C1458a;
import org.bouncycastle.p118e.p120b.p127f.C1459b;
import org.bouncycastle.p118e.p129c.p130a.InterfaceC1491b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1503a implements InterfaceC1491b {

    /* JADX INFO: renamed from: a */
    private transient C1448a f5419a;

    /* JADX INFO: renamed from: b */
    private transient AbstractC0747x f5420b;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1459b.m3817a(this.f5419a, this.f5420b).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return C1535a.m4083b(this.f5419a.m3792b());
    }

    public C1503a(C0676p c0676p) {
        this.f5420b = c0676p.m1657a();
        this.f5419a = (C1448a) C1458a.m3815a(c0676p);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1503a)) {
            return false;
        }
        short[] sArrM3792b = this.f5419a.m3792b();
        short[] sArrM3792b2 = ((C1503a) obj).f5419a.m3792b();
        if (sArrM3792b != sArrM3792b2) {
            if (sArrM3792b == null || sArrM3792b2 == null || sArrM3792b.length != sArrM3792b2.length) {
                return false;
            }
            for (int i = 0; i != sArrM3792b.length; i++) {
                if (sArrM3792b[i] != sArrM3792b2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
