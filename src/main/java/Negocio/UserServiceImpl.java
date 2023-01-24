/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.User;
import datos.UserDao;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserByID(User user) {
        return userDao.findUserByID(user);
    }

    @Override
    public User findUserByEmail(User user) {
        return userDao.findUserByEmail(user);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
    
      @Override
    public boolean comprobar(User user){
        int num = this.userDao.findAllUser().size();     //Lo he tenido que meter en una variable para que funcione...
        for (int i = 0; i < num; i++) {
            //System.out.println(seleccionar().size());
            if(this.userDao.findAllUser().get(i).getEmail().equalsIgnoreCase(user.getEmail()) && this.userDao.findAllUser().get(i).getPassword().equalsIgnoreCase(user.getPassword())){
                return true;
            }
        }
    return false;  
    }
    
    @Override
    public String cifrarMD5(String input) throws Exception {
        String md5 = null;
        if (null == input)
            return null;
        // Create MessageDigest object for MD5
        MessageDigest digest = MessageDigest.getInstance("MD5");
        // Update input string in message digest
        digest.update(input.getBytes(), 0, input.length());
        // Converts message digest value in base 16 (hex)
        md5 = new BigInteger(1, digest.digest()).toString(16);
        
        return md5;
    }
    
}
