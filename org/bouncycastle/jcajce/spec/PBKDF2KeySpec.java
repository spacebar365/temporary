package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: loaded from: classes.dex */
public class PBKDF2KeySpec extends PBEKeySpec {

    /* JADX INFO: renamed from: a */
    private static final C0759a f6257a = new C0759a(InterfaceC0674n.f2622K, C0579bc.f2112a);

    /* JADX INFO: renamed from: b */
    private C0759a f6258b;

    public PBKDF2KeySpec(char[] cArr, byte[] bArr, int i, int i2, C0759a c0759a) {
        super(cArr, bArr, i, i2);
        this.f6258b = c0759a;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m4504a() {
        return this.f6258b;
    }
}
