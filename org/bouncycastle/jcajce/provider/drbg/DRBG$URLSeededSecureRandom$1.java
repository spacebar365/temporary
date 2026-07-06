package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
class DRBG$URLSeededSecureRandom$1 implements PrivilegedAction<InputStream> {
    final /* synthetic */ URL a;
    final /* synthetic */ DRBG$URLSeededSecureRandom b;

    DRBG$URLSeededSecureRandom$1(DRBG$URLSeededSecureRandom dRBG$URLSeededSecureRandom, URL url) {
        this.b = dRBG$URLSeededSecureRandom;
        this.a = url;
    }

    private InputStream a() {
        try {
            return this.a.openStream();
        } catch (IOException e) {
            throw new InternalError("unable to open random source");
        }
    }

    @Override // java.security.PrivilegedAction
    public /* synthetic */ InputStream run() {
        return a();
    }
}
