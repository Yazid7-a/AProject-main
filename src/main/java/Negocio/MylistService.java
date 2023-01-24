/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio;

import Dominio.Mylist;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface MylistService {
    public List<Mylist> findAllMylist();
    public Mylist findMylistByID(Mylist mylist);
     public Mylist findMylistByUser(Mylist mylist);
     public void insert(Mylist mylist);
     public void updateMylist(Mylist mylist);
     public void deleteMylist(Mylist mylist);
}
