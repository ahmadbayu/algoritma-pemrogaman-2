/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanUAS;


import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mm c compt
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int nik,String nama, String jabatan, String email ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql = "insert into tabelkaryawan values('" + nik + "','" + nama + "','" + jabatan + "','" + email + "');";

            statement.executeUpdate(sql);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}


