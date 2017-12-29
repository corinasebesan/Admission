/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cory4
 */
@Stateless
public class UserSessionImpl implements UserSession {
    @Override
    public String welcomeUser (String name){
        return "Bine ai venit " + name + "!";
    }
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void editUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteUser(int iduser) {
        em.remove(getUser(iduser));
    }

    @Override
    public User getUser(int iduser) {
        return em.find(User.class, iduser);
    }

    @Override
    public List<User> getAllUsers() {
        return em.createNamedQuery("User.getAll").getResultList();
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        String name=(String)em.createNamedQuery("User.getNameByEmailAndPassword").setParameter("email", email).setParameter("password", password).getSingleResult();
        return name;
    }
    
}

