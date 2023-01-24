/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Chapters;
import datos.ChaptersDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class ChaptersServiceImpl implements ChaptersService{

    @Inject  
    private ChaptersDao chaptersDao;
    
    @Override
    public List<Chapters> findAllChapters() {
        return chaptersDao.findAllChapters();
    }

    @Override
    public Chapters findChaptersByID(Chapters chapters) {
        return chaptersDao.findChaptersByID(chapters);
    }

    @Override
    public Chapters findChaptersByName(Chapters chapters) {
        return chaptersDao.findChaptersByName(chapters);
    }

    @Override
    public void insert(Chapters chapters) {
        chaptersDao.insert(chapters);
    }

    @Override
    public void updateChapters(Chapters chapters) {
        chaptersDao.updateChapters(chapters);
    }

    @Override
    public void deleteChapters(Chapters chapters) {
        chaptersDao.deleteChapters(chapters);
    }
    
}
