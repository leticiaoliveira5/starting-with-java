package first_steps;

public class Conditional {
  public static void main(String[] args) {
    int nota = 70;
    String graduacao;
    
    if (nota >= 70) {
      graduacao = "Graduação A";
    } else if (nota < 80 && nota >= 70) {
      graduacao = "Graduação B";
    } else if (nota < 60 && nota >= 80) {
      graduacao = "Graduação C";
    } else {
      graduacao = "Nota inválida";
    }

    System.out.println(graduacao);
  };
}
