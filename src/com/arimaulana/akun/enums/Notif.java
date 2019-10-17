/*
 * Copyright (c) 2017 ARIANSYAH MAULANA
 *
 * Anda diperkenankan mengedit isi dari source code ini
 * asalkan tetap menyertakan copyright ini.
 *
 * File ini dibuat menggunakan :
 * Editor     : NetBeans IDE 8.0.2
 * NoteBook   : ASUS Notebook K42F
 * OS         : Windows 10 Pro 64bit
 * Compiler   : JDK 8 update 18
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 *      http://www.apache.org/licenses/LICENSE-2.0
 */
package com.arimaulana.akun.enums;

/**
 *
 * @author ariansyahPC
 */
public class Notif extends com.arimaulana.crudjson.enums.Notif {

    public static void setNotifDeleteSuccess(String notifDeleteSuccess) {
        Notif.notifDeleteSuccess = notifDeleteSuccess;
    }

    public static void setNotifSaveSuccess(String notifSaveSuccess) {
        Notif.notifSaveSuccess = notifSaveSuccess;
    }

    public static void setNotifSaveGagal(String notifSaveGagal) {
        Notif.notifSaveGagal = notifSaveGagal;
    }

    public static void setNotifUpdateSuccess(String notifUpdateSuccess) {
        Notif.notifUpdateSuccess = notifUpdateSuccess;
    }

    public static void setNotifUpdateGagal(String notifUpdateGagal) {
        Notif.notifUpdateGagal = notifUpdateGagal;
    }

    public static void setNotifDeleteGagal(String notifDeleteGagal) {
        Notif.notifDeleteGagal = notifDeleteGagal;
    }

    public static void setNotifError(String notifError) {
        Notif.notifError = notifError;
    }
    
}
