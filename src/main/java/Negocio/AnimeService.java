/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Anime;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alumno Mañana
 */
@Local
public interface AnimeService {
    
    public List<Anime> listarAnimes();
    
    public Anime encontrarAnimePorID(Anime anime);
    
    public Anime econtrarAnimePorNombre(Anime anime);
    
    public Anime econtrarAnimePorIdioma(Anime anime);
    
    public void registrarAnime(Anime anime);
    
    public void modificarAnime(Anime anime);
    
    public void eliminarAnime(Anime anime);
}
