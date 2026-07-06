package a;

/* JADX INFO: compiled from: SmbSession.java */
/* JADX INFO: loaded from: classes.dex */
public interface ac extends AutoCloseable {
    <T extends ac> T a(Class<T> cls);

    @Override // java.lang.AutoCloseable
    void close();
}
