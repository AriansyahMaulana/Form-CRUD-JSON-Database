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
package com.arimaulana.akun.utils;

import com.arimaulana.akun.view.MainForm;
import javax.swing.JPanel;

/**
 *
 * @author ariansyahPC
 */
public class Utils {
    
    public static void setContent(MainForm mainForm, JPanel panel) {
        mainForm.getPnContent().removeAll();
        mainForm.getPnContent().add(panel);
        mainForm.setVisible(true);
    }
}
