package org.bouncycastle.p083b.p089e;

/* JADX INFO: renamed from: org.bouncycastle.b.e.be */
/* JADX INFO: loaded from: classes.dex */
public final class C0923be extends C0922bd {
    @Override // org.bouncycastle.p083b.p089e.C0922bd, org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.p083b.p089e.C0922bd
    /* JADX INFO: renamed from: a */
    protected final void mo2298a(byte[] bArr, byte[] bArr2) {
        this.f3829c = (byte) 0;
        this.f3828b = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f3828b[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            this.f3829c = this.f3828b[(this.f3829c + this.f3828b[i2 & 255] + bArr[i2 % bArr.length]) & 255];
            byte b = this.f3828b[i2 & 255];
            this.f3828b[i2 & 255] = this.f3828b[this.f3829c & 255];
            this.f3828b[this.f3829c & 255] = b;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            this.f3829c = this.f3828b[(this.f3829c + this.f3828b[i3 & 255] + bArr2[i3 % bArr2.length]) & 255];
            byte b2 = this.f3828b[i3 & 255];
            this.f3828b[i3 & 255] = this.f3828b[this.f3829c & 255];
            this.f3828b[this.f3829c & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            this.f3829c = this.f3828b[(this.f3829c + this.f3828b[i4 & 255] + bArr[i4 % bArr.length]) & 255];
            byte b3 = this.f3828b[i4 & 255];
            this.f3828b[i4 & 255] = this.f3828b[this.f3829c & 255];
            this.f3828b[this.f3829c & 255] = b3;
        }
        this.f3827a = (byte) 0;
    }
}
