/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Chadowaker
 */
public abstract class Dao<T>{
    public Connection connect = Connectdb.getInstance();
    //Recherche
    public abstract T recherche(int id);
    //Ajout
    public abstract void ajouter(T obj);
    //Modification 
    public abstract void modifier(T obj, int id);
    //Supprimer
    public abstract void supprimer(int id);
    //List
    public abstract List<T>liste();
}
