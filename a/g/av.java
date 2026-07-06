package a.g;

import java.util.Comparator;

/* JADX INFO: compiled from: SmbTransportPoolImpl.java */
/* JADX INFO: loaded from: classes.dex */
final class av implements Comparator<a.a> {
    final /* synthetic */ au a;

    av(au auVar) {
        this.a = auVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a.a aVar, a.a aVar2) {
        Integer num = this.a.a.get(aVar.b());
        Integer num2 = this.a.a.get(aVar2.b());
        if (num == null) {
            num = 0;
        }
        if (num2 == null) {
            num2 = 0;
        }
        return Integer.compare(num.intValue(), num2.intValue());
    }
}
