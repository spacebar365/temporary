package p000a.p029g;

import java.util.Comparator;
import p000a.InterfaceC0000a;

/* JADX INFO: renamed from: a.g.av */
/* JADX INFO: compiled from: SmbTransportPoolImpl.java */
/* JADX INFO: loaded from: classes.dex */
final class C0232av implements Comparator<InterfaceC0000a> {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0231au f1085a;

    C0232av(C0231au c0231au) {
        this.f1085a = c0231au;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(InterfaceC0000a interfaceC0000a, InterfaceC0000a interfaceC0000a2) {
        Integer num = this.f1085a.f1081a.get(interfaceC0000a.mo3b());
        Integer num2 = this.f1085a.f1081a.get(interfaceC0000a2.mo3b());
        if (num == null) {
            num = 0;
        }
        if (num2 == null) {
            num2 = 0;
        }
        return Integer.compare(num.intValue(), num2.intValue());
    }
}
