/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Dominio.Anime;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public abstract interface InterfazAnime {
    public Anime findAnimeByLanguage(Anime anime);
    public List findAllAnimes()throws SQLException;
    public Anime findAnimeByID(Anime anime); 
    public Anime findAnimeByName(Anime anime);
    public void insert(Anime anime) ;
    public void updateAnime(Anime anime);
    public void deleteAnime(Anime anime);
}
