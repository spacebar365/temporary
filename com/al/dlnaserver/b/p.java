package com.al.dlnaserver.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build$VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.al.dlnaserver.MainActivity;
import com.al.dlnaserver.MainActivityTV;
import com.al.dlnaserver.R$id;
import com.al.dlnaserver.R$layout;
import com.al.dlnaserver.R$string;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static final String[] a = {"ru"};
    private static final String[] b = {"Small", "Normal", "Large", "XLarge"};

    static /* synthetic */ String[] a() {
        return b;
    }

    @SuppressLint({"InflateParams"})
    public final void a(Context context) {
        int rotation;
        Activity activity = (Activity) context;
        switch (activity.getResources().getConfiguration().orientation) {
            case 1:
                if (Build$VERSION.SDK_INT < 8) {
                    activity.setRequestedOrientation(1);
                } else {
                    int rotation2 = activity.getWindowManager().getDefaultDisplay().getRotation();
                    if (rotation2 == 1 || rotation2 == 2) {
                        activity.setRequestedOrientation(9);
                    } else {
                        activity.setRequestedOrientation(1);
                    }
                }
                break;
            case 2:
                if (Build$VERSION.SDK_INT < 8 || (rotation = activity.getWindowManager().getDefaultDisplay().getRotation()) == 0 || rotation == 1) {
                    activity.setRequestedOrientation(0);
                } else {
                    activity.setRequestedOrientation(8);
                }
                break;
        }
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.settings_dialog, (ViewGroup) null, false);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R$id.action_run_on_boot_tv);
        checkBox.setChecked(n.a(context, "run_on_boot"));
        checkBox.setOnClickListener(new q(this, context));
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R$id.action_auto_update_tv);
        checkBox2.setChecked(n.a(context, "auto_update"));
        checkBox2.setOnClickListener(new ab(this, context));
        CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(R$id.action_show_thumbs_tv);
        checkBox3.setChecked(n.a(context, "show_thumbs"));
        checkBox3.setOnClickListener(new am(this, context));
        CheckBox checkBox4 = (CheckBox) viewInflate.findViewById(R$id.action_show_thumbs_audio_tv);
        checkBox4.setChecked(n.a(context, "show_thumbs_audio"));
        checkBox4.setOnClickListener(new ax(this, context));
        CheckBox checkBox5 = (CheckBox) viewInflate.findViewById(R$id.action_show_thumbs_image_tv);
        checkBox5.setChecked(n.a(context, "show_thumbs_image"));
        checkBox5.setOnClickListener(new be(this, context));
        String strB = n.b(context, "thumbs_quality");
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R$layout.simple_spinner_item, b);
        arrayAdapter.setDropDownViewResource(android.R$layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) viewInflate.findViewById(R$id.quality);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new bf(this, strB, context));
        spinner.setSelection(0);
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals(strB)) {
                spinner.setSelection(i);
            }
        }
        CheckBox checkBox6 = (CheckBox) viewInflate.findViewById(R$id.action_no_all_media_tv);
        checkBox6.setChecked(n.a(context, "no_all_media"));
        checkBox6.setOnClickListener(new bg(this, context));
        CheckBox checkBox7 = (CheckBox) viewInflate.findViewById(R$id.action_flat_tv);
        checkBox7.setChecked(n.a(context, "flat_style"));
        checkBox7.setOnClickListener(new bh(this, context));
        CheckBox checkBox8 = (CheckBox) viewInflate.findViewById(R$id.action_file_names_tv);
        checkBox8.setChecked(n.a(context, "display_file_name"));
        checkBox8.setOnClickListener(new bi(this, context));
        CheckBox checkBox9 = (CheckBox) viewInflate.findViewById(R$id.action_proxy_stream_tv);
        checkBox9.setChecked(n.a(context, "proxy_stream"));
        checkBox9.setOnClickListener(new r(this, context));
        CheckBox checkBox10 = (CheckBox) viewInflate.findViewById(R$id.action_debug_tv);
        checkBox10.setChecked(n.a(context, "debug"));
        checkBox10.setOnClickListener(new s(this, context));
        CheckBox checkBox11 = (CheckBox) viewInflate.findViewById(R$id.action_path_sotr_tv);
        checkBox11.setChecked(n.a(context, "sort_title"));
        checkBox11.setOnClickListener(new t(this, context));
        CheckBox checkBox12 = (CheckBox) viewInflate.findViewById(R$id.action_saf_tv);
        checkBox12.setChecked(n.a(context, "use_saf"));
        checkBox12.setOnClickListener(new u(this, context));
        if (Build$VERSION.SDK_INT < 19) {
            checkBox12.setVisibility(8);
        }
        CheckBox checkBox13 = (CheckBox) viewInflate.findViewById(R$id.action_auto_wifi_tv);
        checkBox13.setChecked(n.a(context, "auto_wifi"));
        checkBox13.setOnClickListener(new v(this, context));
        CheckBox checkBox14 = (CheckBox) viewInflate.findViewById(R$id.action_auto_charge_tv);
        checkBox14.setChecked(n.a(context, "auto_charge"));
        checkBox14.setOnClickListener(new w(this, context));
        if (Build$VERSION.SDK_INT > 24) {
            checkBox14.setVisibility(8);
        }
        CheckBox checkBox15 = (CheckBox) viewInflate.findViewById(R$id.action_add_artist_album_tv);
        checkBox15.setChecked(n.a(context, "add_artist_album"));
        checkBox15.setOnClickListener(new x(this, context));
        Button button = (Button) viewInflate.findViewById(R$id.action_wifi_names);
        button.setOnClickListener(new y(this, context));
        button.setVisibility(8);
        ((Button) viewInflate.findViewById(R$id.action_custom_dlna_name)).setOnClickListener(new z(this, context));
        ((Button) viewInflate.findViewById(R$id.action_custom_dlna_port)).setOnClickListener(new aa(this, context));
        ((Button) viewInflate.findViewById(R$id.action_custom_fileserver_port)).setOnClickListener(new ac(this, context));
        ((Button) viewInflate.findViewById(R$id.action_custom_list_ip)).setOnClickListener(new ad(this, context));
        Button button2 = (Button) viewInflate.findViewById(R$id.action_use_en_tv);
        button2.setOnClickListener(new ae(this, context));
        if (Arrays.asList(a).contains(n.b(context, "native_lang")) ? false : true) {
            button2.setVisibility(8);
        }
        ((Button) viewInflate.findViewById(R$id.action_get_log_tv)).setOnClickListener(new af(this, context));
        ((Button) viewInflate.findViewById(R$id.action_restart_tv)).setOnClickListener(new ag(this));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.setTitle(R$string.action_settings);
        alertDialog$Builder.setView(viewInflate);
        alertDialog$Builder.setNegativeButton(context.getString(R$string.positive_button), new ah(this, context));
        alertDialog$Builder.create().show();
    }

    static /* synthetic */ void b(Context context) {
        File[] fileArrListFiles = context.getCacheDir().listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile() && file.getName().contains("thumb")) {
                file.delete();
            }
        }
    }

    static /* synthetic */ void a(p pVar, Context context) {
        Activity activity = (Activity) context;
        if (activity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            if (activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                Toast.makeText(activity, activity.getString(R$string.permission_fine_location_denined), 0).show();
                Log.e("PermissionUtils", "Permission deny to access WiFi names");
            } else {
                activity.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(R$id.custom_input_EditText);
        editText.setText(n.b(context, "wifi_names"));
        editText.setHint(R$string.wifis_names_hint);
        ((TextView) viewInflate.findViewById(R$id.custom_input_TextView)).setText(context.getString(R$string.wifi_names));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.setTitle(R$string.title_wifi_names);
        alertDialog$Builder.setView(viewInflate);
        alertDialog$Builder.setNegativeButton(context.getString(R$string.negative_button), new ai(pVar));
        alertDialog$Builder.setPositiveButton(context.getString(R$string.positive_button), new aj(pVar, editText, context));
        AlertDialog alertDialogCreate = alertDialog$Builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ak(pVar, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(R$id.btton_clear)).setOnClickListener(new al(pVar, editText));
    }

    static /* synthetic */ void b(p pVar, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(R$id.custom_input_EditText);
        editText.setText(n.b(context, "custom_dlna_name"));
        editText.setHint(Build.MODEL);
        ((TextView) viewInflate.findViewById(R$id.custom_input_TextView)).setText(context.getString(R$string.custom_dlna_name));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.setTitle(R$string.title_custom_dlna_name);
        alertDialog$Builder.setView(viewInflate);
        alertDialog$Builder.setNegativeButton(context.getString(R$string.negative_button), new an(pVar));
        alertDialog$Builder.setPositiveButton(context.getString(R$string.positive_button), new ao(pVar, editText, context));
        AlertDialog alertDialogCreate = alertDialog$Builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ap(pVar, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(R$id.btton_clear)).setOnClickListener(new aq(pVar, editText));
    }

    static /* synthetic */ void c(p pVar, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(R$id.custom_input_EditText);
        editText.setText(n.b(context, "custom_dlna_port"));
        editText.setHint(R$string.custom_dlna_port_hint);
        ((TextView) viewInflate.findViewById(R$id.custom_input_TextView)).setText(context.getString(R$string.custom_dlna_port));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.setTitle(R$string.title_custom_dlna_port);
        alertDialog$Builder.setView(viewInflate);
        alertDialog$Builder.setNegativeButton(context.getString(R$string.negative_button), new ar(pVar));
        alertDialog$Builder.setPositiveButton(context.getString(R$string.positive_button), new as(pVar, editText, context));
        AlertDialog alertDialogCreate = alertDialog$Builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new at(pVar, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(R$id.btton_clear)).setOnClickListener(new au(pVar, editText));
    }

    static /* synthetic */ void d(p pVar, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(R$id.custom_input_EditText);
        editText.setText(n.b(context, "custom_fileserver_port"));
        editText.setHint(R$string.custom_fileserver_port_hint);
        ((TextView) viewInflate.findViewById(R$id.custom_input_TextView)).setText(context.getString(R$string.custom_fileserver_port));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.setTitle(R$string.title_custom_fileserver_port);
        alertDialog$Builder.setView(viewInflate);
        alertDialog$Builder.setNegativeButton(context.getString(R$string.negative_button), new av(pVar));
        alertDialog$Builder.setPositiveButton(context.getString(R$string.positive_button), new aw(pVar, editText, context));
        AlertDialog alertDialogCreate = alertDialog$Builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ay(pVar, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(R$id.btton_clear)).setOnClickListener(new az(pVar, editText));
    }

    static /* synthetic */ void e(p pVar, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(R$id.custom_input_EditText);
        editText.setText(n.b(context, "ip_white_list"));
        ((TextView) viewInflate.findViewById(R$id.custom_input_TextView)).setText(context.getString(R$string.custom_list_ip));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.setTitle(R$string.title_custom_list_ip);
        alertDialog$Builder.setView(viewInflate);
        alertDialog$Builder.setNegativeButton(context.getString(R$string.negative_button), new ba(pVar));
        alertDialog$Builder.setPositiveButton(context.getString(R$string.positive_button), new bb(pVar, editText, context));
        AlertDialog alertDialogCreate = alertDialog$Builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new bc(pVar, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(R$id.btton_clear)).setOnClickListener(new bd(pVar, editText));
    }

    static /* synthetic */ void c(Context context) {
        Intent intent;
        if (n.b(context, "lang").equals("en")) {
            n.a(context, "lang", "");
        } else {
            n.a(context, "lang", "en");
        }
        if (bl.a(context)) {
            intent = new Intent(context, (Class<?>) MainActivityTV.class);
        } else {
            intent = new Intent(context, (Class<?>) MainActivity.class);
        }
        intent.setFlags(67108864);
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.MAIN");
        context.startActivity(intent);
        System.exit(1);
    }

    static /* synthetic */ void d(Context context) {
        new e().a(context);
    }
}
