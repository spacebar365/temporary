package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.a;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF2KeySpec extends PBEKeySpec {
    private static final a a = new a(n.K, bc.a);
    private a b;

    public PBKDF2KeySpec(char[] cArr, byte[] bArr, int i, int i2, a aVar) {
        super(cArr, bArr, i, i2);
        this.b = aVar;
    }

    public final a a() {
        return this.b;
    }
}
