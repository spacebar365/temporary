package com.al.dlnaserver.a;

import java.util.List;

/* JADX INFO: compiled from: PLSParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class b$a {
    private final List<b$a$a> a;
    private final int b;

    b$a(List<b$a$a> list, int i) {
        this.a = list;
        this.b = i;
    }

    public final b$a$a a(int i) {
        return this.a.get(i);
    }

    public final int a() {
        return this.a.size();
    }

    public final String toString() {
        return "Playlist{tracks=" + this.a + ", version=" + this.b + '}';
    }
}
