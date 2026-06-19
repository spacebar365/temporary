package org.bouncycastle.p103c.p105b;

import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: renamed from: org.bouncycastle.c.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1203d implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a */
    private OutputStream f4701a;

    /* JADX INFO: renamed from: b */
    private KeyStore.ProtectionParameter f4702b;

    /* JADX INFO: renamed from: c */
    private boolean f4703c;

    /* JADX INFO: renamed from: a */
    public final OutputStream m2863a() {
        return this.f4701a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2864b() {
        return this.f4703c;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public final KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f4702b;
    }
}
