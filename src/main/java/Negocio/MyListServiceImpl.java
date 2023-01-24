/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Mylist;
import datos.MylistDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class MyListServiceImpl implements MylistService {

    @Inject
    private MylistDao mylistDao;
    
    @Override
    public List<Mylist> findAllMylist() {
        return mylistDao.findAllMylist();
    }

    @Override
    public Mylist findMylistByID(Mylist mylist) {
        return mylistDao.findMylistByID(mylist);
    }

    @Override
    public Mylist findMylistByUser(Mylist mylist) {
        return mylistDao.findMylistByUser(mylist);
    }

    @Override
    public void insert(Mylist mylist) {
        mylistDao.insert(mylist);
    }

    @Override
    public void updateMylist(Mylist mylist) {
        mylistDao.updateMylist(mylist);
    }

    @Override
    public void deleteMylist(Mylist mylist) {
        mylistDao.deleteMylist(mylist);
    }
    
}
