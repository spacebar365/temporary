package com.p033al.dlnaserver.p035b;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
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
import com.p033al.dlnaserver.C0303R;
import com.p033al.dlnaserver.MainActivity;
import com.p033al.dlnaserver.MainActivityTV;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: renamed from: com.al.dlnaserver.b.p */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0362p {

    /* JADX INFO: renamed from: a */
    private static final String[] f1424a = {"ru"};

    /* JADX INFO: renamed from: b */
    private static final String[] f1425b = {"Small", "Normal", "Large", "XLarge"};

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: a */
    public final void m1068a(Context context) {
        int rotation;
        Activity activity = (Activity) context;
        switch (activity.getResources().getConfiguration().orientation) {
            case 1:
                if (Build.VERSION.SDK_INT < 8) {
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
                if (Build.VERSION.SDK_INT < 8 || (rotation = activity.getWindowManager().getDefaultDisplay().getRotation()) == 0 || rotation == 1) {
                    activity.setRequestedOrientation(0);
                } else {
                    activity.setRequestedOrientation(8);
                }
                break;
        }
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0303R.layout.settings_dialog, (ViewGroup) null, false);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(C0303R.id.action_run_on_boot_tv);
        checkBox.setChecked(C0360n.m1050a(context, "run_on_boot"));
        checkBox.setOnClickListener(new ViewOnClickListenerC0363q(this, context));
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(C0303R.id.action_auto_update_tv);
        checkBox2.setChecked(C0360n.m1050a(context, "auto_update"));
        checkBox2.setOnClickListener(new ViewOnClickListenerC0310ab(this, context));
        CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(C0303R.id.action_show_thumbs_tv);
        checkBox3.setChecked(C0360n.m1050a(context, "show_thumbs"));
        checkBox3.setOnClickListener(new ViewOnClickListenerC0321am(this, context));
        CheckBox checkBox4 = (CheckBox) viewInflate.findViewById(C0303R.id.action_show_thumbs_audio_tv);
        checkBox4.setChecked(C0360n.m1050a(context, "show_thumbs_audio"));
        checkBox4.setOnClickListener(new ViewOnClickListenerC0332ax(this, context));
        CheckBox checkBox5 = (CheckBox) viewInflate.findViewById(C0303R.id.action_show_thumbs_image_tv);
        checkBox5.setChecked(C0360n.m1050a(context, "show_thumbs_image"));
        checkBox5.setOnClickListener(new ViewOnClickListenerC0340be(this, context));
        String strM1051b = C0360n.m1051b(context, "thumbs_quality");
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, f1425b);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) viewInflate.findViewById(C0303R.id.quality);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new C0341bf(this, strM1051b, context));
        spinner.setSelection(0);
        for (int i = 0; i < f1425b.length; i++) {
            if (f1425b[i].equals(strM1051b)) {
                spinner.setSelection(i);
            }
        }
        CheckBox checkBox6 = (CheckBox) viewInflate.findViewById(C0303R.id.action_no_all_media_tv);
        checkBox6.setChecked(C0360n.m1050a(context, "no_all_media"));
        checkBox6.setOnClickListener(new ViewOnClickListenerC0342bg(this, context));
        CheckBox checkBox7 = (CheckBox) viewInflate.findViewById(C0303R.id.action_flat_tv);
        checkBox7.setChecked(C0360n.m1050a(context, "flat_style"));
        checkBox7.setOnClickListener(new ViewOnClickListenerC0343bh(this, context));
        CheckBox checkBox8 = (CheckBox) viewInflate.findViewById(C0303R.id.action_file_names_tv);
        checkBox8.setChecked(C0360n.m1050a(context, "display_file_name"));
        checkBox8.setOnClickListener(new ViewOnClickListenerC0344bi(this, context));
        CheckBox checkBox9 = (CheckBox) viewInflate.findViewById(C0303R.id.action_proxy_stream_tv);
        checkBox9.setChecked(C0360n.m1050a(context, "proxy_stream"));
        checkBox9.setOnClickListener(new ViewOnClickListenerC0364r(this, context));
        CheckBox checkBox10 = (CheckBox) viewInflate.findViewById(C0303R.id.action_debug_tv);
        checkBox10.setChecked(C0360n.m1050a(context, "debug"));
        checkBox10.setOnClickListener(new ViewOnClickListenerC0365s(this, context));
        CheckBox checkBox11 = (CheckBox) viewInflate.findViewById(C0303R.id.action_path_sotr_tv);
        checkBox11.setChecked(C0360n.m1050a(context, "sort_title"));
        checkBox11.setOnClickListener(new ViewOnClickListenerC0366t(this, context));
        CheckBox checkBox12 = (CheckBox) viewInflate.findViewById(C0303R.id.action_saf_tv);
        checkBox12.setChecked(C0360n.m1050a(context, "use_saf"));
        checkBox12.setOnClickListener(new ViewOnClickListenerC0367u(this, context));
        if (Build.VERSION.SDK_INT < 19) {
            checkBox12.setVisibility(8);
        }
        CheckBox checkBox13 = (CheckBox) viewInflate.findViewById(C0303R.id.action_auto_wifi_tv);
        checkBox13.setChecked(C0360n.m1050a(context, "auto_wifi"));
        checkBox13.setOnClickListener(new ViewOnClickListenerC0368v(this, context));
        CheckBox checkBox14 = (CheckBox) viewInflate.findViewById(C0303R.id.action_auto_charge_tv);
        checkBox14.setChecked(C0360n.m1050a(context, "auto_charge"));
        checkBox14.setOnClickListener(new ViewOnClickListenerC0369w(this, context));
        if (Build.VERSION.SDK_INT > 24) {
            checkBox14.setVisibility(8);
        }
        CheckBox checkBox15 = (CheckBox) viewInflate.findViewById(C0303R.id.action_add_artist_album_tv);
        checkBox15.setChecked(C0360n.m1050a(context, "add_artist_album"));
        checkBox15.setOnClickListener(new ViewOnClickListenerC0370x(this, context));
        Button button = (Button) viewInflate.findViewById(C0303R.id.action_wifi_names);
        button.setOnClickListener(new ViewOnClickListenerC0371y(this, context));
        button.setVisibility(8);
        ((Button) viewInflate.findViewById(C0303R.id.action_custom_dlna_name)).setOnClickListener(new ViewOnClickListenerC0372z(this, context));
        ((Button) viewInflate.findViewById(C0303R.id.action_custom_dlna_port)).setOnClickListener(new ViewOnClickListenerC0309aa(this, context));
        ((Button) viewInflate.findViewById(C0303R.id.action_custom_fileserver_port)).setOnClickListener(new ViewOnClickListenerC0311ac(this, context));
        ((Button) viewInflate.findViewById(C0303R.id.action_custom_list_ip)).setOnClickListener(new ViewOnClickListenerC0312ad(this, context));
        Button button2 = (Button) viewInflate.findViewById(C0303R.id.action_use_en_tv);
        button2.setOnClickListener(new ViewOnClickListenerC0313ae(this, context));
        if (Arrays.asList(f1424a).contains(C0360n.m1051b(context, "native_lang")) ? false : true) {
            button2.setVisibility(8);
        }
        ((Button) viewInflate.findViewById(C0303R.id.action_get_log_tv)).setOnClickListener(new ViewOnClickListenerC0314af(this, context));
        ((Button) viewInflate.findViewById(C0303R.id.action_restart_tv)).setOnClickListener(new ViewOnClickListenerC0315ag(this));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C0303R.string.action_settings);
        builder.setView(viewInflate);
        builder.setNegativeButton(context.getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC0316ah(this, context));
        builder.create().show();
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m1061b(Context context) {
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

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m1059a(C0362p c0362p, Context context) {
        Activity activity = (Activity) context;
        if (activity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            if (activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                Toast.makeText(activity, activity.getString(C0303R.string.permission_fine_location_denined), 0).show();
                Log.e("PermissionUtils", "Permission deny to access WiFi names");
            } else {
                activity.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0303R.layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(C0303R.id.custom_input_EditText);
        editText.setText(C0360n.m1051b(context, "wifi_names"));
        editText.setHint(C0303R.string.wifis_names_hint);
        ((TextView) viewInflate.findViewById(C0303R.id.custom_input_TextView)).setText(context.getString(C0303R.string.wifi_names));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C0303R.string.title_wifi_names);
        builder.setView(viewInflate);
        builder.setNegativeButton(context.getString(C0303R.string.negative_button), new DialogInterfaceOnClickListenerC0317ai(c0362p));
        builder.setPositiveButton(context.getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC0318aj(c0362p, editText, context));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ViewOnKeyListenerC0319ak(c0362p, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(C0303R.id.btton_clear)).setOnClickListener(new ViewOnClickListenerC0320al(c0362p, editText));
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m1062b(C0362p c0362p, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0303R.layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(C0303R.id.custom_input_EditText);
        editText.setText(C0360n.m1051b(context, "custom_dlna_name"));
        editText.setHint(Build.MODEL);
        ((TextView) viewInflate.findViewById(C0303R.id.custom_input_TextView)).setText(context.getString(C0303R.string.custom_dlna_name));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C0303R.string.title_custom_dlna_name);
        builder.setView(viewInflate);
        builder.setNegativeButton(context.getString(C0303R.string.negative_button), new DialogInterfaceOnClickListenerC0322an(c0362p));
        builder.setPositiveButton(context.getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC0323ao(c0362p, editText, context));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ViewOnKeyListenerC0324ap(c0362p, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(C0303R.id.btton_clear)).setOnClickListener(new ViewOnClickListenerC0325aq(c0362p, editText));
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m1064c(C0362p c0362p, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0303R.layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(C0303R.id.custom_input_EditText);
        editText.setText(C0360n.m1051b(context, "custom_dlna_port"));
        editText.setHint(C0303R.string.custom_dlna_port_hint);
        ((TextView) viewInflate.findViewById(C0303R.id.custom_input_TextView)).setText(context.getString(C0303R.string.custom_dlna_port));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C0303R.string.title_custom_dlna_port);
        builder.setView(viewInflate);
        builder.setNegativeButton(context.getString(C0303R.string.negative_button), new DialogInterfaceOnClickListenerC0326ar(c0362p));
        builder.setPositiveButton(context.getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC0327as(c0362p, editText, context));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ViewOnKeyListenerC0328at(c0362p, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(C0303R.id.btton_clear)).setOnClickListener(new ViewOnClickListenerC0329au(c0362p, editText));
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m1066d(C0362p c0362p, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0303R.layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(C0303R.id.custom_input_EditText);
        editText.setText(C0360n.m1051b(context, "custom_fileserver_port"));
        editText.setHint(C0303R.string.custom_fileserver_port_hint);
        ((TextView) viewInflate.findViewById(C0303R.id.custom_input_TextView)).setText(context.getString(C0303R.string.custom_fileserver_port));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C0303R.string.title_custom_fileserver_port);
        builder.setView(viewInflate);
        builder.setNegativeButton(context.getString(C0303R.string.negative_button), new DialogInterfaceOnClickListenerC0330av(c0362p));
        builder.setPositiveButton(context.getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC0331aw(c0362p, editText, context));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ViewOnKeyListenerC0333ay(c0362p, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(C0303R.id.btton_clear)).setOnClickListener(new ViewOnClickListenerC0334az(c0362p, editText));
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m1067e(C0362p c0362p, Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0303R.layout.custom_input, (ViewGroup) null, false);
        EditText editText = (EditText) viewInflate.findViewById(C0303R.id.custom_input_EditText);
        editText.setText(C0360n.m1051b(context, "ip_white_list"));
        ((TextView) viewInflate.findViewById(C0303R.id.custom_input_TextView)).setText(context.getString(C0303R.string.custom_list_ip));
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C0303R.string.title_custom_list_ip);
        builder.setView(viewInflate);
        builder.setNegativeButton(context.getString(C0303R.string.negative_button), new DialogInterfaceOnClickListenerC0336ba(c0362p));
        builder.setPositiveButton(context.getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC0337bb(c0362p, editText, context));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        editText.setOnKeyListener(new ViewOnKeyListenerC0338bc(c0362p, editText, context, alertDialogCreate));
        ((ImageButton) viewInflate.findViewById(C0303R.id.btton_clear)).setOnClickListener(new ViewOnClickListenerC0339bd(c0362p, editText));
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m1063c(Context context) {
        Intent intent;
        if (C0360n.m1051b(context, "lang").equals("en")) {
            C0360n.m1047a(context, "lang", "");
        } else {
            C0360n.m1047a(context, "lang", "en");
        }
        if (C0347bl.m1015a(context)) {
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
}
