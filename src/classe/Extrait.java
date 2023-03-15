/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classe;

/**
 *
 * @author Chadowaker
 */
public class Extrait {
    private int id;
    private String NumActe;
    private String Prenom;
    private String Nom;
    private String date_nais;
    private String lieu_nais;
    private String sexe;
    private String Prenom_Pere;
    private String Nom_Pere;
    private String domicile_Pere;
    private String Profession_Pere;
    private String Prenom_Mere;
    private String Nom_Mere;
    private String domicile_Mere;
    private String Profession_Mere;
    private String date_delivrance;
    
    public Extrait(){
        
    }
    
    public Extrait(String NumActe,String Prenom,String Nom,String date_nais,String lieu_nais,String sexe,String Prenom_Pere,String Nom_Pere,String domicile_Pere,String Profession_Pere,
    String Prenom_Mere,String Nom_Mere,String domicile_Mere,String Profession_Mere,String date_delivrance){
        this.NumActe = NumActe;
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.date_nais = date_nais;
        this.lieu_nais = lieu_nais;
        this.sexe = sexe;
        this.Prenom_Pere = Prenom_Pere;
        this.Nom_Pere = Nom_Pere;
        this.domicile_Pere = domicile_Pere;
        this.Profession_Pere = Profession_Pere;
        this.Prenom_Mere = Prenom_Mere;
        this.Nom_Mere = Nom_Mere;
        this.domicile_Mere = domicile_Mere;
        this.Profession_Mere = Profession_Mere;
        this.date_delivrance = date_delivrance;
    }
    public Extrait(int id,String NumActe,String Prenom,String Nom,String date_nais,String lieu_nais,String sexe,String Prenom_Pere,String Nom_Pere,String domicile_Pere,String Profession_Pere,
    String Prenom_Mere,String Nom_Mere,String domicile_Mere,String Profession_Mere,String date_delivrance){
        this.id = id;
        this.NumActe = NumActe;
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.date_nais = date_nais;
        this.lieu_nais = lieu_nais;
        this.sexe = sexe;
        this.Prenom_Pere = Prenom_Pere;
        this.Nom_Pere = Nom_Pere;
        this.domicile_Pere = domicile_Pere;
        this.Profession_Pere = Profession_Pere;
        this.Prenom_Mere = Prenom_Mere;
        this.Nom_Mere = Nom_Mere;
        this.domicile_Mere = domicile_Mere;
        this.Profession_Mere = Profession_Mere;
        this.date_delivrance = date_delivrance;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNumActe() {
        return NumActe;
    }

    public void setNumActe(String NumActe) {
        this.NumActe = NumActe;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getDate_nais() {
        return date_nais;
    }

    public void setDate_nais(String date_nais) {
        this.date_nais = date_nais;
    }

    
    public String getLieu_nais() {
        return lieu_nais;
    }

    public void setLieu_nais(String lieu_nais) {
        this.lieu_nais = lieu_nais;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPrenom_Pere() {
        return Prenom_Pere;
    }

    public void setPrenom_Pere(String Prenom_Pere) {
        this.Prenom_Pere = Prenom_Pere;
    }

    public String getNom_Pere() {
        return Nom_Pere;
    }

    public void setNom_Pere(String Nom_Pere) {
        this.Nom_Pere = Nom_Pere;
    }

    public String getDomicile_Pere() {
        return domicile_Pere;
    }

    public void setDomicile_Pere(String domicile_Pere) {
        this.domicile_Pere = domicile_Pere;
    }

    public String getProfession_Pere() {
        return Profession_Pere;
    }

    public void setProfession_Pere(String Profession_Pere) {
        this.Profession_Pere = Profession_Pere;
    }

    public String getPrenom_Mere() {
        return Prenom_Mere;
    }

    public void setPrenom_Mere(String Prenom_Mere) {
        this.Prenom_Mere = Prenom_Mere;
    }

    public String getNom_Mere() {
        return Nom_Mere;
    }

    public void setNom_Mere(String Nom_Mere) {
        this.Nom_Mere = Nom_Mere;
    }

    public String getDomicile_Mere() {
        return domicile_Mere;
    }

    public void setDomicile_Mere(String domicile_Mere) {
        this.domicile_Mere = domicile_Mere;
    }

    public String getProfession_Mere() {
        return Profession_Mere;
    }

    public void setProfession_Mere(String Profession_Mere) {
        this.Profession_Mere = Profession_Mere;
    }

    public String getDate_delivrance() {
        return date_delivrance;
    }

    public void setDate_delivrance(String date_delivrance) {
        this.date_delivrance = date_delivrance;
    }
    
    
}
