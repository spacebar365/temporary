package p000a.p026e;

/* JADX INFO: renamed from: a.e.m */
/* JADX INFO: compiled from: SessionServicePacket.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0195m {

    /* JADX INFO: renamed from: a */
    int f915a;

    /* JADX INFO: renamed from: b */
    int f916b;

    /* JADX INFO: renamed from: a */
    abstract int mo571a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    public final int m572b(byte[] bArr) {
        this.f916b = mo571a(bArr);
        bArr[0] = (byte) this.f915a;
        if (this.f916b > 65535) {
            bArr[1] = 1;
        }
        int i = this.f916b;
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        return this.f916b + 4;
    }
}
