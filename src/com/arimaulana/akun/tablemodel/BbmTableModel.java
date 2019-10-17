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
package com.arimaulana.akun.tablemodel;

import com.arimaulana.akun.domain.Bbm;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AriMaulana99
 */
public class BbmTableModel extends AbstractTableModel {
    private final List<Bbm> bbms;

    public BbmTableModel(List<Bbm> listBbm) {
        this.bbms = listBbm;
    }

    @Override
    public int getRowCount() {
        return bbms.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bbm bbm = bbms.get(rowIndex);
        switch (columnIndex) {
            case 0 : return bbm.getId();
            case 1 : return bbm.getEmail();
            case 2 : return bbm.getNama();
            case 3 : return bbm.getPin();
            case 4 : return bbm.getPassword();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0 : return "ID";
            case 1 : return "EMAIL";
            case 2 : return "NAMA";
            case 3 : return "PIN";
            case 4 : return "PASSWORD";
            default : return "";
        }
    }
}
