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
package com.arimaulana.akun;

import com.arimaulana.akun.enums.Config;
import com.arimaulana.akun.view.FormLogin;
import com.arimaulana.crudjson.utils.Utils;

/**
 *
 * @author AriMaulana99
 */
public class Akun {
    public static void main(String[] args) {
        
        //221110000356666211110087999999
        Config.setPATH_DATABASE("database/");
        Config.setSECRET_KEY("221110000356666211110087");
        
        String userEncrypt = "RrIwFE7pH0ZkrdPqrLGME4zbLpuzC2OVqWROj8ScunaDfDPPyRYGlIuNP6BPh2ba9B4IC2vzzIua4XbA5hHrnrY4jPmYCAjyavU22tJUDa8w8zNVw/BW0oq1lN1gDWSEoGaVL20nTOE=";
        String userDcrypt = "{\"User\":[{\"id\":1,\"username\":\"ari\",\"password\":\"ari\"},{\"id\":2,\"username\":\"ridwan\",\"password\":\"ridwan\"}]}";
        System.out.println(Utils.decrypData(userEncrypt));
        System.out.println(Utils.encrypData(userDcrypt));
        
        new FormLogin().setVisible(true);
    
    }
}
