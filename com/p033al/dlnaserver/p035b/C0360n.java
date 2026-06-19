package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* JADX INFO: renamed from: com.al.dlnaserver.b.n */
/* JADX INFO: compiled from: PrefUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0360n {
    /* JADX INFO: renamed from: a */
    public static void m1049a(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m1047a(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m1048a(Context context, String str, ArrayList<String> arrayList) {
        int i = 0;
        try {
            new File(String.valueOf(context.getFilesDir().getAbsolutePath()) + "/paths").mkdirs();
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(String.valueOf(context.getFilesDir().getAbsolutePath()) + "/paths/" + str, false)));
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    printWriter.println(arrayList.get(i2).replaceAll("\n", "&#160;").trim());
                    i = i2 + 1;
                } else {
                    printWriter.close();
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1050a(Context context, String str) {
        return context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).getBoolean(str, false);
    }

    /* JADX INFO: renamed from: b */
    public static String m1051b(Context context, String str) {
        return context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).getString(str, "");
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<String> m1052c(Context context, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(String.valueOf(context.getFilesDir().getAbsolutePath()) + "/paths/" + str);
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String strNextLine = scanner.nextLine();
                    if (!strNextLine.isEmpty()) {
                        arrayList.add(strNextLine.replaceAll("&#160;", "\n"));
                    }
                }
                scanner.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
