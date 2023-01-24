/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface UserService {
    public List<User> findAllUser();
    public User findUserByID(User user);
    public User findUserByEmail(User user);
    public void insert(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public boolean comprobar(User user);
     public String cifrarMD5(String input) throws Exception;
}
