package org.bouncycastle.f;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class a$a<T> implements Iterator<T> {
    private final T[] a;
    private int b = 0;

    public a$a(T[] tArr) {
        this.a = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.b == this.a.length) {
            throw new NoSuchElementException("Out of elements: " + this.b);
        }
        T[] tArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return tArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
