package umc.study.service.ReviewService;

import umc.study.domain.Review;

import java.util.List;

public interface ReviewQueryService {
    List<Review> getReviewsByRestaurant(Long restaurantId);
}
