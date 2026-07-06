package a;

import java.util.Iterator;

/* JADX INFO: compiled from: CloseableIterator.java */
/* JADX INFO: loaded from: classes.dex */
public interface f<T> extends AutoCloseable, Iterator<T> {
    @Override // java.lang.AutoCloseable
    void close();
}
