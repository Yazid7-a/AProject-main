/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Anime;
import datos.AnimeDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.Query;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class AnimeServiceImpl implements AnimeService {
    
    @Inject  
    private AnimeDao animeDao;
    
    
        
    @Override
    public List<Anime> listarAnimes() {       
        return animeDao.findAllAnimes();
    }
    
    @Override
   public Anime encontrarAnimePorID(Anime anime){
       return animeDao.findAnimeByID(anime);
   }
    
   @Override
    public Anime econtrarAnimePorNombre(Anime anime){
        return animeDao.findAnimeByName(anime);
    }
    
    @Override
    public Anime econtrarAnimePorIdioma(Anime anime){
        return animeDao.findAnimeByLanguage(anime);
    }
    
    @Override
    public void registrarAnime(Anime anime){
         animeDao.insert(anime);
    }
    
    @Override
    public void modificarAnime(Anime anime){
        animeDao.updateAnime(anime);
    }
    
    @Override
    public void eliminarAnime(Anime anime){
        animeDao.deleteAnime(anime);
    }
}
