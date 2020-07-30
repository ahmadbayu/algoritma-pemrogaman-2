/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanUAS;

import Pertemuan10.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmad Ryan
 */
public class Update {

    Koneksi konek = new Koneksi();

   public void update(int nik,String nama, String jabatan, String email ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql_nama = "update tabelkaryawan set nama ='" + nama + "' where nik= '" + nik + "'";
            String sql_jabatan = "update tabelkaryawan set jabatan ='" + jabatan + "' where nik= '" + nik + "'";

            String sql_email = "update tabelkaryawan set email ='" + email + "' where nik= '" + nik + "'";
            
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_jabatan);
            statement.executeUpdate(sql_email);
            
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nik.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
