package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.f.a;

/* JADX INFO: Access modifiers changed from: protected */
/* JADX INFO: loaded from: classes.dex */
public final class BaseWrapCipher$ErasableOutputStream extends ByteArrayOutputStream {
    public final byte[] a() {
        return this.buf;
    }

    public final void b() {
        a.a(this.buf, (byte) 0);
        reset();
    }
}
