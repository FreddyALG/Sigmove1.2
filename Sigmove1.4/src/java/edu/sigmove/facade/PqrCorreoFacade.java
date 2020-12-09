/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sigmove.facade;

import edu.sigmove.entity.PqrCorreo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Freddy
 */
@Stateless
public class PqrCorreoFacade extends AbstractFacade<PqrCorreo> implements PqrCorreoFacadeLocal {

    @PersistenceContext(unitName = "Sigmove1.4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PqrCorreoFacade() {
        super(PqrCorreo.class);
    }
    
}
