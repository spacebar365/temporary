package a;

/* JADX INFO: compiled from: SmbPipeHandle.java */
/* JADX INFO: loaded from: classes.dex */
public interface y extends AutoCloseable {
    <T extends y> T a(Class<T> cls);

    boolean a();

    @Override // java.lang.AutoCloseable
    void close();
}
