import java.util.Scanner;

public class Average3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a, b, c, d, media, extra, a2;
    a = sc.nextFloat();
    b = sc.nextFloat();
    c = sc.nextFloat();
    d = sc.nextFloat();
    media = ((a * 2) + (b * 3) + (c * 4) + (d)) / (10);

    if (media >= 7.0) {
      System.out.printf("Media: %.1f\n", media);
      System.out.println("Aluno aprovado.");
    } else if (media >= 5.0 && media <= 6.9) {
      System.out.printf("Media: %.1f\n", media);
      System.out.println("Aluno em exame.");
      extra = sc.nextFloat();
      System.out.printf("Nota do exame: %.1f\n", extra);
      a2 = (media + extra) / 2;
      System.out.println(a2 >= 5.0 ? "Aluno aprovado." : "Aluno reprovado.");
      System.out.printf("Media final: %.1f\n", a2);
    } else if (media < 5.0) {
      System.out.printf("Media: %.1f\n", media);
      System.out.println("Aluno reprovado.");
    }
  }
}