/** 
 * Computes return values for the respective methods in the Icosahedron
 * class described in this project.
 *
 * @author Tae Myles
 * @version 09/16/18
 */
public class Grade {
   
   // instance variables
   private double exam1, exam2, finalExam, activityAvg, quizAvg, projectAvg;
   private String studentName;
  /**
   * Initializing exam scores.
   */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
                  FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
                  QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
  /**
   * Constructor
   *
   * Initializing studentName to a string.
   *
   * @param studentNameIn String.
   */
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
   
  /**
   * Methods
   *
   * Initializing activity and quiz average.
   *
   * @param activityAvgIn double.
   * @param quizAvgIn double.
   */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
  /**
   * Initializing project average.
   *
   * @param projectAvgIn double.
   */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
  /**
   * Initializing exam average.
   *
   * @param examScoreIn double.
   * @param examType int.
   */
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
  /**
   * Calculates the total grade average.
   * @return returns grade.
   */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      
      return grade;
   }
  /**
   * Shows total grade along with students name.
   * @return returns to toString
   */
   public String toString() {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
       
   }
}