package a.e;

/* JADX INFO: compiled from: SessionServicePacket.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    int a;
    int b;

    abstract int a(byte[] bArr);

    public final int b(byte[] bArr) {
        this.b = a(bArr);
        bArr[0] = (byte) this.a;
        if (this.b > 65535) {
            bArr[1] = 1;
        }
        int i = this.b;
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        return this.b + 4;
    }
}
