package org.bouncycastle.p054a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.bf */
/* JADX INFO: loaded from: classes.dex */
public final class C0582bf implements InterfaceC0657r {

    /* JADX INFO: renamed from: a */
    private C0605ca f2115a;

    C0582bf(C0605ca c0605ca) {
        this.f2115a = c0605ca;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0657r
    /* JADX INFO: renamed from: b */
    public final InputStream mo1412b() {
        return this.f2115a;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return new C0581be(this.f2115a.m1477b());
    }

    @Override // org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        try {
            return mo1398d();
        } catch (IOException e) {
            throw new C0684t("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
