/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cory4
 */
@Local
public interface UserSession {
    String welcomeUser(String name);

    void addUser(User user);

    void editUser(User user);

    void deleteUser(int iduser);

    User getUser(int iduser);

    List<User> getAllUsers();

    String getNameByEmailAndPassword(String email, String password);
}

