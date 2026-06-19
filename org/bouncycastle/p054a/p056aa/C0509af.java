package org.bouncycastle.p054a.p056aa;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0509af extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final AbstractC0655q f1894a;

    /* JADX INFO: renamed from: b */
    private AbstractC1381d f1895b;

    /* JADX INFO: renamed from: c */
    private AbstractC1389j f1896c;

    public C0509af(AbstractC1381d abstractC1381d, AbstractC0655q abstractC0655q) {
        this(abstractC1381d, abstractC0655q.mo1410c());
    }

    public C0509af(AbstractC1381d abstractC1381d, byte[] bArr) {
        this.f1895b = abstractC1381d;
        this.f1894a = new C0581be(C1535a.m4086b(bArr));
    }

    public C0509af(AbstractC1389j abstractC1389j) {
        this(abstractC1389j, false);
    }

    public C0509af(AbstractC1389j abstractC1389j, boolean z) {
        this.f1896c = abstractC1389j.m3468o();
        this.f1894a = new C0581be(abstractC1389j.m3452a(z));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized AbstractC1389j m1372a() {
        if (this.f1896c == null) {
            this.f1896c = this.f1895b.m3357a(this.f1894a.mo1410c()).m3468o();
        }
        return this.f1896c;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f1894a;
    }
}
