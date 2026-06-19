package p000a.p006d.p016e;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0126e;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p031i.p032a.InterfaceC0276c;
import p000a.p031i.p032a.InterfaceC0278e;

/* JADX INFO: renamed from: a.d.e.c */
/* JADX INFO: compiled from: ServerMessageBlock2Request.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0141c<T extends AbstractC0146d> extends AbstractC0134b implements InterfaceC0055c, InterfaceC0126e<T> {

    /* JADX INFO: renamed from: a */
    private T f691a;

    /* JADX INFO: renamed from: b */
    private Integer f692b;

    /* JADX INFO: renamed from: c */
    protected abstract T mo410c(InterfaceC0016c interfaceC0016c);

    public AbstractC0141c(InterfaceC0267h interfaceC0267h, int i) {
        super(interfaceC0267h, i);
    }

    @Override // p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: I */
    public final boolean mo332I() {
        return false;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: a_ */
    public final boolean mo222a_() {
        return m450u() != 0;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: a */
    public final boolean mo220a(InterfaceC0055c interfaceC0055c) {
        return m448q().mo55b(getClass().getSimpleName()) && m448q().mo55b(interfaceC0055c.getClass().getSimpleName());
    }

    @Override // p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: d */
    public final void mo360d(int i) {
        m444g(i);
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: i */
    public final Integer mo224i() {
        return this.f692b;
    }

    @Override // p000a.p006d.InterfaceC0126e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T mo260a(InterfaceC0016c interfaceC0016c) {
        T t = (T) mo410c(interfaceC0016c);
        t.mo211a(m454y());
        mo210a((InterfaceC0067d) t);
        AbstractC0141c abstractC0141c = (AbstractC0141c) super.mo430K();
        if (abstractC0141c instanceof AbstractC0141c) {
            t.m438b(abstractC0141c.mo260a(interfaceC0016c));
        }
        return t;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: a_ */
    public final void mo221a_(int i) {
        m443f(i);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public final int mo213b(byte[] bArr, int i) {
        int iMo213b = super.mo213b(bArr, i);
        int iL_ = mo225l_();
        int iQ = m433Q();
        if (iL_ != iQ) {
            throw new IllegalStateException(String.format("Wrong size calculation have %d expect %d", Integer.valueOf(iL_), Integer.valueOf(iQ)));
        }
        return iMo213b;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: L */
    public final T mo218f_() {
        return this.f691a;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo210a(InterfaceC0067d interfaceC0067d) {
        if (interfaceC0067d != null && !(interfaceC0067d instanceof AbstractC0134b)) {
            throw new IllegalArgumentException("Incompatible response");
        }
        this.f691a = (T) interfaceC0067d;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: n_ */
    public final InterfaceC0055c mo226n_() {
        AbstractC0141c abstractC0141c = (AbstractC0141c) super.mo430K();
        if (abstractC0141c != null) {
            super.m438b((AbstractC0134b) null);
            abstractC0141c.m428H();
        }
        return abstractC0141c;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: K */
    public final /* bridge */ /* synthetic */ AbstractC0134b mo430K() {
        return (AbstractC0141c) super.mo430K();
    }

    @Override // p000a.p006d.p016e.AbstractC0134b, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: f_ */
    public final /* bridge */ /* synthetic */ InterfaceC0067d mo218f_() {
        return this.f691a;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0055c mo251s() {
        return (AbstractC0141c) super.mo430K();
    }

    @Override // p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: V */
    public final /* bridge */ /* synthetic */ InterfaceC0278e mo218f_() {
        return this.f691a;
    }

    @Override // p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0276c mo251s() {
        return (AbstractC0141c) super.mo430K();
    }
}
