package org.bouncycastle.p054a;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p142f.p144b.C1545a;

/* JADX INFO: renamed from: org.bouncycastle.a.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C0547aj implements InterfaceC0657r {

    /* JADX INFO: renamed from: a */
    private C0758z f2009a;

    C0547aj(C0758z c0758z) {
        this.f2009a = c0758z;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0657r
    /* JADX INFO: renamed from: b */
    public final InputStream mo1412b() {
        return new C0555ar(this.f2009a);
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return new C0545ah(C1545a.m4124a(mo1412b()));
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
