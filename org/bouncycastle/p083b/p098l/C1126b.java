package org.bouncycastle.p083b.p098l;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p083b.InterfaceC1182y;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p142f.p144b.C1545a;

/* JADX INFO: renamed from: org.bouncycastle.b.l.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1126b implements InterfaceC1182y {

    /* JADX INFO: renamed from: a */
    private C1122y f4527a;

    public C1126b(C1122y c1122y) {
        this.f4527a = c1122y;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1182y
    /* JADX INFO: renamed from: a */
    public final C1075b mo2714a(InputStream inputStream) throws IOException {
        byte[] bArr;
        int i = inputStream.read();
        switch (i) {
            case 0:
                throw new IOException("Sender's public key invalid.");
            case 1:
            case 5:
            default:
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(i, 16));
            case 2:
            case 3:
                bArr = new byte[((this.f4527a.m2699a().mo2905a() + 7) / 8) + 1];
                break;
            case 4:
            case 6:
            case 7:
                bArr = new byte[(((this.f4527a.m2699a().mo2905a() + 7) / 8) * 2) + 1];
                break;
        }
        bArr[0] = (byte) i;
        C1545a.m4122a(inputStream, bArr, 1, bArr.length - 1);
        return new C1053ae(this.f4527a.m2699a().m3357a(bArr), this.f4527a);
    }
}
