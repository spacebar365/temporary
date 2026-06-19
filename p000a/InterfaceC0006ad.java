package p000a;

/* JADX INFO: renamed from: a.ad */
/* JADX INFO: compiled from: SmbTransport.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0006ad extends AutoCloseable {
    /* JADX INFO: renamed from: a */
    <T extends InterfaceC0006ad> T mo96a(Class<T> cls);

    /* JADX INFO: renamed from: a */
    String mo97a();

    @Override // java.lang.AutoCloseable
    void close();
}
