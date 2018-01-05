/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.CountDetails;
import entity.HighschoolEducation;
import entity.OtherData;
import entity.PersonalData;
import entity.StableReidency;
import entity.UniversityEducation;
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

    @Override
    public void addUniversityEducation(UniversityEducation universityEducation) {
        em.persist(universityEducation);
    }

    @Override
    public void editUniversityEducation(UniversityEducation universityEducation) {
        em.merge(universityEducation);
    }

    @Override
    public void deleteUniversityEducation(int iduniv) {
        em.remove(getUniversityEducation(iduniv));
    }

    @Override
    public UniversityEducation getUniversityEducation(int iduniv) {
        return em.find(UniversityEducation.class, iduniv);
    }

    @Override
    public List<UniversityEducation> getAllUniversityEducation() {
        return em.createNamedQuery("UniversityEducation.getAll").getResultList();
    }

    @Override
    public void addStableReidency(StableReidency stableReidency) {
        em.persist(stableReidency);
    }

    @Override
    public void editStableReidency(StableReidency stableReidency) {
        em.merge(stableReidency);
    }

    @Override
    public void deleteStableReidency(int idres) {
        em.remove(getStableReidency(idres));
    }

    @Override
    public StableReidency getStableReidency(int idres) {
        return em.find(StableReidency.class, idres);
    }

    @Override
    public List<StableReidency> getAllStableReidency() {
        return em.createNamedQuery("StableReidency.getAll").getResultList();
    }

    @Override
    public void addOtherData(OtherData otherData) {
        em.persist(otherData);
    }

    @Override
    public void editOtherData(OtherData otherData) {
        em.merge(otherData);
    }

    @Override
    public void deleteOtherData(int idoth) {
        em.remove(getOtherData(idoth));
    }

    @Override
    public OtherData getOtherData(int idoth) {
        return em.find(OtherData.class, idoth);
    }

    @Override
    public List<OtherData> getAllOtherData() {
        return em.createNamedQuery("OtherData.getAll").getResultList();
    }

    @Override
    public void addHighschoolEducation(HighschoolEducation highschoolEducation) {
        em.persist(highschoolEducation);
    }

    @Override
    public void editHighschoolEducation(HighschoolEducation highschoolEducation) {
        em.merge(highschoolEducation);
    }

    @Override
    public void deleteHighschoolEducation(int idhigh) {
        em.remove(getHighschoolEducation(idhigh));
    }

    @Override
    public HighschoolEducation getHighschoolEducation(int idhigh) {
        return em.find(HighschoolEducation.class, idhigh);
    }

    @Override
    public List<HighschoolEducation> getAllHighschoolEducation() {
        return em.createNamedQuery("HighschoolEducation.getAll").getResultList();
    }

    @Override
    public void addPersonalData(PersonalData personalData) {
        em.persist(personalData);
    }

    @Override
    public void editPersonalData(PersonalData personalData) {
        em.merge(personalData);
    }

    @Override
    public void deletePersonalData(int idper) {
        em.remove(getPersonalData(idper));
    }

    @Override
    public PersonalData getPersonalData(int idper) {
        return em.find(PersonalData.class, idper);
    }

    @Override
    public List<PersonalData> getAllPersonalData() {
        return em.createNamedQuery("PersonalData.getAll").getResultList();
    }
    
    @Override
    public void addCountDetails(CountDetails countDetails){
        em.persist(countDetails);
    }

    @Override
    public void editCountDetails(CountDetails countDetails){
        em.merge(countDetails);
    }

    @Override
    public void deleteCountDetails(int idacc){
        em.remove(getCountDetails(idacc));
    }

    @Override
    public CountDetails getCountDetails(int idacc){
        return em.find(CountDetails.class, idacc);
}

    @Override
    public List<PersonalData> getAllCountDetails(){
        return em.createNamedQuery("CountDetails.getAll").getResultList();
}
    
}

