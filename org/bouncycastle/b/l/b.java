package org.bouncycastle.b.l;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements y {
    private org.bouncycastle.b.k.y a;

    public b(org.bouncycastle.b.k.y yVar) {
        this.a = yVar;
    }

    @Override // org.bouncycastle.b.y
    public final org.bouncycastle.b.k.b a(InputStream inputStream) throws IOException {
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
                bArr = new byte[((this.a.a().a() + 7) / 8) + 1];
                break;
            case 4:
            case 6:
            case 7:
                bArr = new byte[(((this.a.a().a() + 7) / 8) * 2) + 1];
                break;
        }
        bArr[0] = (byte) i;
        org.bouncycastle.f.b.a.a(inputStream, bArr, 1, bArr.length - 1);
        return new ae(this.a.a().a(bArr), this.a);
    }
}
