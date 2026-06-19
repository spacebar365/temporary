package org.bouncycastle.p083b.p098l;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1182y;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1108k;
import org.bouncycastle.p142f.p144b.C1545a;

/* JADX INFO: renamed from: org.bouncycastle.b.l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1125a implements InterfaceC1182y {

    /* JADX INFO: renamed from: a */
    private C1106i f4526a;

    public C1125a(C1106i c1106i) {
        this.f4526a = c1106i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1182y
    /* JADX INFO: renamed from: a */
    public final C1075b mo2714a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[(this.f4526a.m2664a().bitLength() + 7) / 8];
        C1545a.m4122a(inputStream, bArr, 0, bArr.length);
        return new C1108k(new BigInteger(1, bArr), this.f4526a);
    }
}
