/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.UsuarioRol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonathan
 */
@Stateless
public class UsuarioRolFacade extends AbstractFacade<UsuarioRol> {

    @PersistenceContext(unitName = "com.mycompany_p_csm_5_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioRolFacade() {
        super(UsuarioRol.class);
    }
    
}
