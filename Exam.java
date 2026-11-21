public class Exam extends Assessment {

    private double pointsEach;

    public Exam(int questions, int missed) {

        pointsEach = 100.0 / questions;

        int score = (int)Math.round(100 - (missed * pointsEach));

        setScore(score);
    }

    public double getPointsEach() {
        return pointsEach;
    }
}