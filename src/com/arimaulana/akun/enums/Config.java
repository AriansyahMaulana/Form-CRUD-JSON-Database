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
 * @author AriMaulana99
 */
public class Config extends com.arimaulana.crudjson.enums.Config {

    public static void setSECRET_KEY(String SECRET_KEY) {
        Config.SECRET_KEY = SECRET_KEY;
    }

    public static void setPATH_DATABASE(String PATH_DATABASE) {
        Config.PATH_DATABASE = PATH_DATABASE;
    }

}
