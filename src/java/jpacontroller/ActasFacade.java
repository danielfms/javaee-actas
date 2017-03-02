/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpacontroller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Actas;

/**
 *
 * @author danielfms
 */
@Stateless
public class ActasFacade extends AbstractFacade<Actas> {

    @PersistenceContext(unitName = "actasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActasFacade() {
        super(Actas.class);
    }
    
}
