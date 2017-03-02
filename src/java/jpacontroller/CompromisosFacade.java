/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpacontroller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.Compromisos;

/**
 *
 * @author danielfms
 */
@Stateless
public class CompromisosFacade extends AbstractFacade<Compromisos> {

    @PersistenceContext(unitName = "actasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompromisosFacade() {
        super(Compromisos.class);
    }
    
}
