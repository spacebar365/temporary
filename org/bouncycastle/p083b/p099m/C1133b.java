package org.bouncycastle.p083b.p099m;

/* JADX INFO: renamed from: org.bouncycastle.b.m.b */
/* JADX INFO: loaded from: classes.dex */
final class C1133b implements InterfaceC1135d {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f4546a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1128a f4547b;

    C1133b(C1128a c1128a, int i) {
        this.f4547b = c1128a;
        this.f4546a = i;
    }

    @Override // org.bouncycastle.p083b.p099m.InterfaceC1135d
    /* JADX INFO: renamed from: a */
    public final byte[] mo2732a() {
        if (!(this.f4547b.f4528a instanceof C1138g) && !(this.f4547b.f4528a instanceof C1141j)) {
            return this.f4547b.f4528a.generateSeed((this.f4546a + 7) / 8);
        }
        byte[] bArr = new byte[(this.f4546a + 7) / 8];
        this.f4547b.f4528a.nextBytes(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.p083b.p099m.InterfaceC1135d
    /* JADX INFO: renamed from: b */
    public final int mo2733b() {
        return this.f4546a;
    }
}
