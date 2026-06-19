package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class AEADParameterSpec extends IvParameterSpec {

    /* JADX INFO: renamed from: a */
    private final byte[] f6231a;

    /* JADX INFO: renamed from: b */
    private final int f6232b;

    public AEADParameterSpec(byte[] bArr, int i) {
        this(bArr, i, (byte) 0);
    }

    private AEADParameterSpec(byte[] bArr, int i, byte b) {
        super(bArr);
        this.f6232b = i;
        this.f6231a = C1535a.m4086b((byte[]) null);
    }

    /* JADX INFO: renamed from: a */
    public final int m4482a() {
        return this.f6232b;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4483b() {
        return C1535a.m4086b(this.f6231a);
    }
}
