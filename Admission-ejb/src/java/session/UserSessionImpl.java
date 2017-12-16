/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;

/**
 *
 * @author cory4
 */
@Stateless
public class UserSessionImpl implements UserSession {
    @Override
    public String welcomeUser (String name){
        return "Welcome to our website, " + name + "!";
    }
}

