package org.bouncycastle.p054a;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: renamed from: org.bouncycastle.a.bi */
/* JADX INFO: loaded from: classes.dex */
public final class C0585bi extends AbstractC0723v {

    /* JADX INFO: renamed from: b */
    private int f2117b;

    public C0585bi() {
        this.f2117b = -1;
    }

    public C0585bi(C0625g c0625g) {
        super(c0625g);
        this.f2117b = -1;
    }

    public C0585bi(InterfaceC0618f[] interfaceC0618fArr) {
        super(interfaceC0618fArr);
        this.f2117b = -1;
    }

    /* JADX INFO: renamed from: f */
    private int m1462f() {
        int i;
        if (this.f2117b < 0) {
            int iMo1341e = 0;
            Enumeration enumerationC = mo1483c();
            while (true) {
                i = iMo1341e;
                if (!enumerationC.hasMoreElements()) {
                    break;
                }
                iMo1341e = ((InterfaceC0618f) enumerationC.nextElement()).mo1358i().mo1400g().mo1341e() + i;
            }
            this.f2117b = i;
        }
        return this.f2117b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0723v, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) throws IOException {
        C0660s c0660sMo1460b = c0660s.mo1460b();
        int iM1462f = m1462f();
        c0660s.mo1608b(48);
        c0660s.m1602a(iM1462f);
        Enumeration enumerationC = mo1483c();
        while (enumerationC.hasMoreElements()) {
            c0660sMo1460b.mo1459a((InterfaceC0618f) enumerationC.nextElement());
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int iM1462f = m1462f();
        return iM1462f + C0612ch.m1488a(iM1462f) + 1;
    }
}
