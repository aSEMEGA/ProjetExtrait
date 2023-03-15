/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.Extrait;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chadowaker
 */
public class ExtraitDao extends Dao<Extrait> {

    @Override
    public Extrait recherche(int id) {
        Extrait ex = new Extrait();
        try {

            ResultSet rs = this.connect.createStatement().executeQuery("select* from extrait where id = " + id);
            if (rs.next()) {
                ex.setId(rs.getInt("id"));
                ex.setNumActe(rs.getString("numacte"));
                ex.setPrenom(rs.getString("prenom"));
                ex.setNom(rs.getString("nom"));
                ex.setDate_nais(rs.getString("datenais"));
                ex.setLieu_nais(rs.getString("lieunais"));
                ex.setSexe(rs.getString("sexe"));
                ex.setPrenom_Pere(rs.getString("prenom_p"));
                ex.setNom_Pere(rs.getString("nom_p"));
                ex.setDomicile_Pere(rs.getString("domicile_p"));
                ex.setProfession_Pere(rs.getString("profession_p"));
                ex.setPrenom_Mere(rs.getString("prenom_m"));
                ex.setNom_Mere(rs.getString("nom_p"));
                ex.setDomicile_Mere(rs.getString("domicile_m"));
                ex.setProfession_Mere(rs.getString("profession_m"));
                ex.setDate_delivrance(rs.getString("date_d"));

            }
        } catch (SQLException ex1) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return ex;
    }

    @Override
    public void ajouter(Extrait obj) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("insert into extrait(numacte,prenom,nom,datenais,lieunais,sexe,prenom_p,nom_p,domicile_p,profession_p,prenom_m,nom_m,domicile_m,profession_m,date_d) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, obj.getNumActe());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getNom());
            pst.setString(4, obj.getDate_nais());
            pst.setString(5, obj.getLieu_nais());
            pst.setString(6, obj.getSexe());
            pst.setString(7, obj.getPrenom_Pere());
            pst.setString(8, obj.getNom_Pere());
            pst.setString(9, obj.getDomicile_Pere());
            pst.setString(10, obj.getProfession_Pere());
            pst.setString(11, obj.getPrenom_Mere());
            pst.setString(12, obj.getNom_Mere());
            pst.setString(13, obj.getDomicile_Mere());
            pst.setString(14, obj.getProfession_Mere());
            pst.setString(15, obj.getDate_delivrance());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Extrait obj, int id) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("update extrait set numacte = ?, prenom = ?,nom = ?,datenais = ?,lieunais = ?,sexe = ?,prenom_p = ?,nom_p = ?,domicile_p = ?,profession_p = ?,prenom_m = ?,nom_m = ?,domicile_m = ?,profession_m = ?,date_d = ? where  id = "+id );
            pst.setString(1,  obj.getNumActe());
            pst.setString(2,  obj.getPrenom());
            pst.setString(3,  obj.getNom());
            pst.setString(4,  obj.getDate_nais());
            pst.setString(5,  obj.getLieu_nais());
            pst.setString(6,  obj.getSexe());
            pst.setString(7,  obj.getPrenom_Pere());
            pst.setString(8,  obj.getNom_Pere());
            pst.setString(9,  obj.getDomicile_Pere());
            pst.setString(10, obj.getProfession_Pere());
            pst.setString(11, obj.getPrenom_Mere());
            pst.setString(12, obj.getNom_Mere());
            pst.setString(13, obj.getDomicile_Mere());
            pst.setString(14, obj.getProfession_Mere());
            pst.setString(15, obj.getDate_delivrance());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement pst = connect.prepareStatement("delete from extrait where id ="+id);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Extrait> liste() {
        List<Extrait> Extrait_list = new ArrayList<>();
         Extrait ex = new Extrait();
         
          try {

            ResultSet rs = this.connect.createStatement().executeQuery("select* from extrait ");
            while (rs.next()) {
                ex.setId(rs.getInt("id"));
                ex.setNumActe(rs.getString("numacte"));
                ex.setPrenom(rs.getString("prenom"));
                ex.setNom(rs.getString("nom"));
                ex.setDate_nais(rs.getString("datenais"));
                ex.setLieu_nais(rs.getString("lieunais"));
                ex.setSexe(rs.getString("sexe"));
                ex.setPrenom_Pere(rs.getString("prenom_p"));
                ex.setNom_Pere(rs.getString("nom_p"));
                ex.setDomicile_Pere(rs.getString("domicile_p"));
                ex.setProfession_Pere(rs.getString("profession_p"));
                ex.setPrenom_Mere(rs.getString("prenom_m"));
                ex.setNom_Mere(rs.getString("nom_p"));
                ex.setDomicile_Mere(rs.getString("domicile_m"));
                ex.setProfession_Mere(rs.getString("profession_m"));
                ex.setDate_delivrance(rs.getString("date_d"));
                Extrait_list.add(ex);
                ex = new Extrait();
            }
        } catch (SQLException ex1) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return Extrait_list;
    }

}
