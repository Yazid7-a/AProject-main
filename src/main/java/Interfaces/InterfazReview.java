/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Review;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public abstract interface InterfazReview {
    public List<Review> findAllReview();
    public Review findReviewByID(Review review);
    public Review findReviewByUser(Review Review);
    public void insert(Review review);
    public void updateReview(Review review);
public void deleteReview(Review review);
}
