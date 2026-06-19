package org.bouncycastle.jcajce;

import java.io.OutputStream;
import java.security.KeyStore;
import org.bouncycastle.p083b.p102o.AbstractC1168e;

/* JADX INFO: loaded from: classes.dex */
public class BCFKSStoreParameter implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a */
    private final KeyStore.ProtectionParameter f5544a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1168e f5545b;

    /* JADX INFO: renamed from: c */
    private OutputStream f5546c;

    /* JADX INFO: renamed from: a */
    public final OutputStream m4177a() {
        return this.f5546c;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1168e m4178b() {
        return this.f5545b;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f5544a;
    }
}
