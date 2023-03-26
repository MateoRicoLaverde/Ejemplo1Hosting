/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.Person;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Jonathan
 */
@Stateless
public class PersonFacade extends AbstractFacade<Person> implements PersonFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_p_csm_5_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonFacade() {
        super(Person.class);
    }

    @Override
     public Person loginUser(String user, String pass){
    Person per = new Person();
        try {
            Query q = em.createQuery("SELECT p FROM Person p WHERE p.firstName = :user and p.lastName = :pass");
            q.setParameter("user", user);
            q.setParameter("pass", pass);
            List<Person> lista = q.getResultList();
            if (!lista.isEmpty()){
            per = lista.get(0);
            }else{
            per=null;
            }
        } catch (Exception e) {
        }
    
    return per;
    
}}
