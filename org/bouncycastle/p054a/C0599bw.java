package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.bw */
/* JADX INFO: loaded from: classes.dex */
public final class C0599bw extends AbstractC0723v {

    /* JADX INFO: renamed from: b */
    private int f2128b;

    public C0599bw() {
        this.f2128b = -1;
    }

    public C0599bw(InterfaceC0618f interfaceC0618f) {
        super(interfaceC0618f);
        this.f2128b = -1;
    }

    public C0599bw(C0625g c0625g) {
        super(c0625g);
        this.f2128b = -1;
    }

    /* JADX INFO: renamed from: f */
    private int m1465f() {
        int i;
        if (this.f2128b < 0) {
            int iMo1341e = 0;
            Enumeration enumerationC = mo1483c();
            while (true) {
                i = iMo1341e;
                if (!enumerationC.hasMoreElements()) {
                    break;
                }
                iMo1341e = ((InterfaceC0618f) enumerationC.nextElement()).mo1358i().mo1401h().mo1341e() + i;
            }
            this.f2128b = i;
        }
        return this.f2128b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        C0660s c0660sMo1461c = c0660s.mo1461c();
        int iM1465f = m1465f();
        c0660s.mo1608b(48);
        c0660s.m1602a(iM1465f);
        Enumeration enumerationC = mo1483c();
        while (enumerationC.hasMoreElements()) {
            c0660sMo1461c.mo1459a((InterfaceC0618f) enumerationC.nextElement());
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int iM1465f = m1465f();
        return iM1465f + C0612ch.m1488a(iM1465f) + 1;
    }
}
