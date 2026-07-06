package com.al.dlnaserver.b;

import android.content.Context;
import android.content.SharedPreferences$Editor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* JADX INFO: compiled from: PrefUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static void a(Context context, String str, boolean z) {
        SharedPreferences$Editor sharedPreferences$EditorEdit = context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).edit();
        sharedPreferences$EditorEdit.putBoolean(str, z);
        sharedPreferences$EditorEdit.commit();
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences$Editor sharedPreferences$EditorEdit = context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).edit();
        sharedPreferences$EditorEdit.putString(str, str2);
        sharedPreferences$EditorEdit.commit();
    }

    public static void a(Context context, String str, ArrayList<String> arrayList) {
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

    public static boolean a(Context context, String str) {
        return context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).getBoolean(str, false);
    }

    public static String b(Context context, String str) {
        return context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0).getString(str, "");
    }

    public static ArrayList<String> c(Context context, String str) {
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
