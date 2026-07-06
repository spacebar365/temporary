package com.al.dlnaserver.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import java.util.Locale;

/* JADX INFO: compiled from: LangUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static void a(Context context) {
        Configuration configuration;
        String language;
        SharedPreferences sharedPreferences = context.getSharedPreferences(String.valueOf(context.getPackageName()) + "_preferences", 0);
        String string = sharedPreferences.getString("lang", "");
        String string2 = sharedPreferences.getString("native_lang", "");
        if (!sharedPreferences.getBoolean("first_run", true)) {
            configuration = null;
        } else {
            configuration = context.getResources().getConfiguration();
            if (Build$VERSION.SDK_INT > 23) {
                language = configuration.getLocales().get(0).getLanguage();
            } else {
                language = configuration.locale.getLanguage();
            }
            SharedPreferences$Editor sharedPreferences$EditorEdit = sharedPreferences.edit();
            sharedPreferences$EditorEdit.putBoolean("first_run", false);
            sharedPreferences$EditorEdit.putString("native_lang", language);
            sharedPreferences$EditorEdit.commit();
            string2 = language;
        }
        if (!string.isEmpty()) {
            string2 = string;
        }
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        if (!string2.isEmpty()) {
            if (Build$VERSION.SDK_INT > 16) {
                configuration.setLocale(new Locale(string2));
            } else {
                configuration.locale = new Locale(string2);
            }
        } else if (Build$VERSION.SDK_INT > 16) {
            configuration.setLocale(Locale.getDefault());
        } else {
            configuration.locale = Locale.getDefault();
        }
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        context.getApplicationContext().getResources().updateConfiguration(configuration, context.getApplicationContext().getResources().getDisplayMetrics());
    }
}
