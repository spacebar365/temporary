package p000a.p006d.p016e.p017a;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0177i;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.e.a.d */
/* JADX INFO: compiled from: Smb2CloseResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C0131d extends AbstractC0146d implements InterfaceC0177i {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f603a = C1620c.m4563a((Class<?>) C0131d.class);

    /* JADX INFO: renamed from: b */
    private final byte[] f604b;

    /* JADX INFO: renamed from: c */
    private final String f605c;

    /* JADX INFO: renamed from: d */
    private int f606d;

    /* JADX INFO: renamed from: e */
    private long f607e;

    /* JADX INFO: renamed from: f */
    private long f608f;

    /* JADX INFO: renamed from: g */
    private long f609g;

    /* JADX INFO: renamed from: h */
    private long f610h;

    /* JADX INFO: renamed from: i */
    private long f611i;

    /* JADX INFO: renamed from: j */
    private long f612j;

    /* JADX INFO: renamed from: k */
    private int f613k;

    public C0131d(InterfaceC0267h interfaceC0267h, byte[] bArr, String str) {
        super(interfaceC0267h);
        this.f604b = bArr;
        this.f605c = str;
    }

    /* JADX INFO: renamed from: g */
    public final int m414g() {
        return this.f606d;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: e */
    public final long mo231e() {
        return this.f608f;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: d */
    public final long mo230d() {
        return this.f609g;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        if (C0173a.m509a(bArr, i) != 60) {
            throw new C0175g("Expected structureSize = 60");
        }
        this.f606d = C0173a.m509a(bArr, i + 2);
        int i2 = i + 4 + 4;
        this.f607e = C0173a.m515d(bArr, i2);
        int i3 = i2 + 8;
        this.f608f = C0173a.m515d(bArr, i3);
        int i4 = i3 + 8;
        this.f609g = C0173a.m515d(bArr, i4);
        int i5 = i4 + 8;
        this.f610h = C0173a.m515d(bArr, i5);
        int i6 = i5 + 8;
        this.f611i = C0173a.m513c(bArr, i6);
        int i7 = i6 + 8;
        this.f612j = C0173a.m513c(bArr, i7);
        int i8 = i7 + 8;
        this.f613k = C0173a.m511b(bArr, i8);
        int i9 = i8 + 4;
        if (f603a.mo4539c()) {
            f603a.mo4534b(String.format("Closed %s (%s)", C0284e.m948a(this.f604b), this.f605c));
        }
        return i9 - i;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b_ */
    public final long mo228b_() {
        return this.f607e;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: c_ */
    public final long mo229c_() {
        return this.f612j;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b */
    public final int mo227b() {
        return this.f613k;
    }
}
