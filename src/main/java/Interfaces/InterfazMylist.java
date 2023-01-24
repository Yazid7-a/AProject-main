/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Mylist;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public abstract interface InterfazMylist {
    public List<Mylist> findAllMylist();
    public Mylist findMylistByID(Mylist mylist);
     public Mylist findMylistByUser(Mylist mylist);
     public void insert(Mylist mylist);
     public void updateMylist(Mylist mylist);
     public void deleteMylist(Mylist mylist);
}
