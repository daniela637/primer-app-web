/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Empleado2;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author daniela
 */
public class Empleado2JpaController implements Serializable {

    public Empleado2JpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
     public Empleado2JpaController() {
        emf = Persistence.createEntityManagerFactory("loginPruebaPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Empleado2 empleado2) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(empleado2);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Empleado2 empleado2) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            empleado2 = em.merge(empleado2);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = empleado2.getId_empleado();
                if (findEmpleado2(id) == null) {
                    throw new NonexistentEntityException("The empleado2 with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado2 empleado2;
            try {
                empleado2 = em.getReference(Empleado2.class, id);
                empleado2.getId_empleado();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The empleado2 with id " + id + " no longer exists.", enfe);
            }
            em.remove(empleado2);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Empleado2> findEmpleado2Entities() {
        return findEmpleado2Entities(true, -1, -1);
    }

    public List<Empleado2> findEmpleado2Entities(int maxResults, int firstResult) {
        return findEmpleado2Entities(false, maxResults, firstResult);
    }

    private List<Empleado2> findEmpleado2Entities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Empleado2.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Empleado2 findEmpleado2(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Empleado2.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmpleado2Count() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Empleado2> rt = cq.from(Empleado2.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
