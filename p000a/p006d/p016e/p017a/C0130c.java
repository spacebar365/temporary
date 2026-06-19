package p000a.p006d.p016e.p017a;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.C0154e;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.e.a.c */
/* JADX INFO: compiled from: Smb2CloseRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class C0130c extends AbstractC0141c<C0131d> implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f599a = C1620c.m4563a((Class<?>) C0130c.class);

    /* JADX INFO: renamed from: b */
    private byte[] f600b;

    /* JADX INFO: renamed from: c */
    private final String f601c;

    /* JADX INFO: renamed from: d */
    private int f602d;

    private C0130c(InterfaceC0267h interfaceC0267h, byte[] bArr, String str) {
        super(interfaceC0267h, 6);
        this.f600b = bArr;
        this.f601c = str;
    }

    public C0130c(InterfaceC0267h interfaceC0267h, byte[] bArr) {
        this(interfaceC0267h, bArr, "");
    }

    @Override // p000a.p006d.p016e.InterfaceC0127a
    /* JADX INFO: renamed from: a */
    public final void mo408a(byte[] bArr) {
        this.f600b = bArr;
    }

    public C0130c(InterfaceC0267h interfaceC0267h, String str) {
        this(interfaceC0267h, C0154e.f759a, str);
    }

    /* JADX INFO: renamed from: k */
    public final void m413k() {
        this.f602d = 1;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i(88);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(24L, bArr, i);
        C0173a.m510a(this.f602d, bArr, i + 2);
        int i2 = i + 4 + 4;
        System.arraycopy(this.f600b, 0, bArr, i2, 16);
        int i3 = i2 + 16;
        if (f599a.mo4539c()) {
            f599a.mo4534b(String.format("Closing %s (%s)", C0284e.m948a(this.f600b), this.f601c));
        }
        return i3 - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0131d(interfaceC0016c.mo114a(), this.f600b, this.f601c);
    }
}
