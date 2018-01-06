/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.AdmissionSession;
import entity.CountDetails;
import entity.Documents;
import entity.HighschoolEducation;
import entity.OtherData;
import entity.PersonalData;
import entity.StableReidency;
import entity.Taxes;
import entity.UniversityEducation;
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
    
    void addUniversityEducation(UniversityEducation universityEducation);

    void editUniversityEducation(UniversityEducation universityEducation);

    void deleteUniversityEducation(int iduniv);

    UniversityEducation getUniversityEducation(int iduniv);

    List<UniversityEducation> getAllUniversityEducation();
    
    void addStableReidency(StableReidency stableReidency);

    void editStableReidency(StableReidency stableReidency);

    void deleteStableReidency(int idres);

    StableReidency getStableReidency(int idres);

    List<StableReidency> getAllStableReidency();
    
    void addOtherData(OtherData otherData);

    void editOtherData(OtherData otherData);

    void deleteOtherData(int idoth);

    OtherData getOtherData(int idoth);

    List<OtherData> getAllOtherData();
    
    void addHighschoolEducation(HighschoolEducation highschoolEducation);

    void editHighschoolEducation(HighschoolEducation highschoolEducation);

    void deleteHighschoolEducation(int idhigh);

    HighschoolEducation getHighschoolEducation(int idhigh);

    List<HighschoolEducation> getAllHighschoolEducation();
    
    void addPersonalData(PersonalData personalData);

    void editPersonalData(PersonalData personalData);

    void deletePersonalData(int idper);

    PersonalData getPersonalData(int idper);

    List<PersonalData> getAllPersonalData();
    
    void addCountDetails(CountDetails countDetails);

    void editCountDetails(CountDetails countDetails);

    void deleteCountDetails(int idacc);

    CountDetails getCountDetails(int idacc);

    List<CountDetails> getAllCountDetails();
    
    void addAdmissionSession(AdmissionSession admissionSession);

    void editAdmissionSession(AdmissionSession admissionSession);

    void deleteAdmissionSession(int idses);

    AdmissionSession getAdmissionSession(int idses);

    List<AdmissionSession> getAllAdmissionSession();

    List<AdmissionSession> getAllSessionsAndSpecialtys();
    
    void addDocuments(Documents documents);

    void editDocuments(Documents documents);

    void deleteDocuments(int iddoc);

    Documents getDocuments(int iddoc);

    List<Documents> getAllDocuments();
    
    void addTaxes(Taxes taxes);

    void editTaxes(Taxes taxes);

    void deleteTaxes(int idtax);

    Taxes getTaxes(int idtax);

    List<Taxes> getAllTaxes();

}


