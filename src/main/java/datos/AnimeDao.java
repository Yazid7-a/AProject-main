/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import Dominio.Anime;
import Interfaces.InterfazAnime;
import static datos.Conexion.close;
import static datos.Conexion.getConnection;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class AnimeDao implements InterfazAnime {
     // El EJB se encarga de forma automática de hacer las transacciones.
    
    // Ahora inyectamos la unidad de persistencia a través del API de JPA
    // Simplemente tenemos que usar la anotación e indicar el nombre de nuestra
    // unidad de persistencia
    @PersistenceContext(unitName="AnimePU")
    EntityManager em;
    
    // Con este objeto de em ya podemos interactuar con nuestra BD
   
    @Override
    public List<Anime> findAllAnimes() {
        // Creamos un NamedQuery, y el listado lo leemos con getResultList
        // Por lo que estamos escribiendo menos código
        return em.createNamedQuery("Anime.findAll").getResultList();
    }

   
    @Override
    public Anime findAnimeByID(Anime anime) {
        // Especificamos la clase que queremos buscar y luego el campo por el 
        // que queremos buscar
        return em.find(Anime.class, anime.getIdanime());
    }

    
    @Override
    public Anime findAnimeByName(Anime anime) {
        // En este caso no vamos a usar un NamedQuery, que podríamos haber 
        // agregado en la Entidad de Persona sino que vamos a incluirlo directamente.
        Query query = em.createQuery("from Anime a where a.name = :name");
        query.setParameter("name", anime.getName());
        // Y ahroa sólo esperamos un resultado, porque el email debe de ser único
        // sino lo hemos definido así lo modificamos en nuestra tabla como unique
        return (Anime) query.getSingleResult();
    }

     @Override
    public Anime findAnimeByLanguage(Anime anime) {
        // En este caso no vamos a usar un NamedQuery, que podríamos haber 
        // agregado en la Entidad de Persona sino que vamos a incluirlo directamente.
        Query query = em.createQuery("from Anime a where a.language = :language");
        query.setParameter("language", anime.getName());
        // Y ahroa sólo esperamos un resultado, porque el email debe de ser único
        // sino lo hemos definido así lo modificamos en nuestra tabla como unique
        return (Anime) query.getSingleResult();
    }
    
    @Override
    public void insert(Anime anime) {
        em.persist(anime);
    }

    
    @Override
    public void updateAnime(Anime anime){
        // Sincroniza cualquier modificamos que hayamos hecho de la persona en la BD
        em.merge(anime);
    }
    
    @Override
    public void deleteAnime(Anime anime) {
        // 1. actualizamos el estado del objeto en la base de datos => se borra.
        em.remove(em.merge(anime));
    }


        
}

