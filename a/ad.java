package a;

/* JADX INFO: compiled from: SmbTransport.java */
/* JADX INFO: loaded from: classes.dex */
public interface ad extends AutoCloseable {
    <T extends ad> T a(Class<T> cls);

    String a();

    @Override // java.lang.AutoCloseable
    void close();
}
