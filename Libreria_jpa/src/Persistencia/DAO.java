
package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class DAO <T> {
protected final EntityManagerFactory emf;
    protected EntityManager em;

    public DAO() {
        emf = Persistence.createEntityManagerFactory("Libreria_jpaPU");
        
       em = emf.createEntityManager();
    }
    
    protected void conectarBase(){
       if(!em.isOpen()) {
       em = emf.createEntityManager();   
       }
    }
    
    protected void desconectarBase(){
       if(!em.isOpen()) {
          em.close();
       }
    }
    

    protected void persisitrEntidad(T object) {
        try {
            conectarBase();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("No se pudo cargar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally { 
            desconectarBase();
        }
        }

    protected void actualizarEstadoEntidad(T object) {

        try {
            conectarBase();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
           
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el estado");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally { 
            desconectarBase();
        }
        }
    
    protected void borrarEntidad(T object) {

        try {
            conectarBase();
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
           
        } catch (Exception e) {
            System.out.println("No se pudo borrar");
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }finally {
            desconectarBase();
        }
        }
}
//CAMBIOS
/*agregue conectar base desconectar base, y en cada void agregue dentro del try conectar base y al final de cada try
agregue finally desconectar base*/
/*converti la clase DAO en una clase abstracta y le nombre un objeto como "T" y ese objeto "T" lo agregue
a "borrarEntidad" , "actualizarestadoentidad" y "persistirentidad"*/
/*Coloque los void como protected y coloque un metodo override en el resto de las clases DAO
para que puedan heredar los metodos de la clase padre DAO*/