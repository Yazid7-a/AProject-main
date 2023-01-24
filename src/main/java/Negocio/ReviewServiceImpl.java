/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Review;
import datos.ReviewDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class ReviewServiceImpl implements ReviewService {

    @Inject
        private ReviewDao reviewDao;
    
    @Override
    public List<Review> findAllReview() {
        return reviewDao.findAllReview();
    }

    @Override
    public Review findReviewByID(Review review) {
        return reviewDao.findReviewByID(review);
    }

    @Override
    public Review findReviewByUser(Review Review) {
        return reviewDao.findReviewByUser(Review);
    }

    @Override
    public void insert(Review review) {
        reviewDao.insert(review);
    }

    @Override
    public void updateReview(Review review) {
    reviewDao.updateReview(review);
    }

    @Override
    public void deleteReview(Review review) {
      reviewDao.deleteReview(review);
    }
    
}
