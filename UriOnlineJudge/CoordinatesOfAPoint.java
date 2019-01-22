import java.util.Scanner;

public class CoordinatesOfAPoint {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float xAxis, yAxis;
    xAxis = sc.nextFloat();
    yAxis = sc.nextFloat();
    System.out.println(whereAmI(xAxis, yAxis));
  }

  private static String whereAmI(float xAxis, float yAxis) {
    if (xAxis == 0 && yAxis == 0){
      return "Origem";
    } else if (xAxis > 0 && yAxis > 0) {
      return "Q1";
    } else if (xAxis < 0 && yAxis > 0) {
      return "Q2";
    } else if (xAxis < 0 && yAxis < 0) {
      return "Q3";
    } else if (xAxis > 0 && yAxis < 0) {
      return "Q4";
    } else if (xAxis == 0 && yAxis < 0 || yAxis > 0) {
      return "Eixo Y";
    } else {
      return "Eixo X";
    }
  }
}