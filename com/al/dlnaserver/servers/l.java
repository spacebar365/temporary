package com.al.dlnaserver.servers;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: compiled from: HttpFileServer.java */
/* JADX INFO: loaded from: classes.dex */
final class l extends FileInputStream {
    final /* synthetic */ j a;
    private final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(j jVar, FileDescriptor fileDescriptor, long j) {
        super(fileDescriptor);
        this.a = jVar;
        this.b = j;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int available() {
        return (int) this.b;
    }
}
