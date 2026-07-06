package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.f.a;

/* JADX INFO: loaded from: classes.dex */
public class AEADParameterSpec extends IvParameterSpec {
    private final byte[] a;
    private final int b;

    public AEADParameterSpec(byte[] bArr, int i) {
        this(bArr, i, (byte) 0);
    }

    private AEADParameterSpec(byte[] bArr, int i, byte b) {
        super(bArr);
        this.b = i;
        this.a = a.b((byte[]) null);
    }

    public final int a() {
        return this.b;
    }

    public final byte[] b() {
        return a.b(this.a);
    }
}
