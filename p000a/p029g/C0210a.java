package p000a.p029g;

import java.util.Arrays;
import p000a.InterfaceC0010b;
import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.g.a */
/* JADX INFO: compiled from: BufferCacheImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0210a implements InterfaceC0010b {

    /* JADX INFO: renamed from: a */
    private final Object[] f943a;

    /* JADX INFO: renamed from: b */
    private final int f944b;

    /* JADX INFO: renamed from: c */
    private int f945c;

    public C0210a(InterfaceC0267h interfaceC0267h) {
        this(interfaceC0267h.mo42ag(), interfaceC0267h.mo40ae());
    }

    private C0210a(int i, int i2) {
        this.f945c = 0;
        this.f943a = new Object[i];
        this.f944b = i2;
    }

    @Override // p000a.InterfaceC0010b
    /* JADX INFO: renamed from: a */
    public final byte[] mo106a() {
        byte[] bArr;
        synchronized (this.f943a) {
            if (this.f945c > 0) {
                for (int i = 0; i < this.f943a.length; i++) {
                    if (this.f943a[i] != null) {
                        bArr = (byte[]) this.f943a[i];
                        this.f943a[i] = null;
                        this.f945c--;
                        break;
                    }
                }
                bArr = new byte[this.f944b];
            } else {
                bArr = new byte[this.f944b];
            }
        }
        return bArr;
    }

    @Override // p000a.InterfaceC0010b
    /* JADX INFO: renamed from: a */
    public final void mo105a(byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        synchronized (this.f943a) {
            if (this.f945c < this.f943a.length) {
                for (int i = 0; i < this.f943a.length; i++) {
                    if (this.f943a[i] == null) {
                        this.f943a[i] = bArr;
                        this.f945c++;
                        return;
                    }
                }
            }
        }
    }
}
