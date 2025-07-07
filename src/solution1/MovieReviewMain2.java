package solution1;

//기존 문제에 배열을 도입하고 
//for문을 통해 sout을 한번만 사용하여라.

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();

        movieReview1.title="인셉션";
        movieReview1.review="인생은 무한 루프!";

        movieReview2.title="어바웃 타임";
        movieReview2.review="인생 시간 영화!";

        MovieReview [] movieReviews = new MovieReview[2];
        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;

        for(MovieReview mv : movieReviews){
            System.out.println("영화 제목 : " + mv.title + " " + "내용 : " + mv.review );
        }
    }
}
