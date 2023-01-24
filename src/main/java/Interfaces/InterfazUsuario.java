/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Dominio.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public abstract interface InterfazUsuario {
    
    public List<User> findAllUser();
    public User findUserByID(User user);
    public User findUserByEmail(User user);
    public void insert(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
