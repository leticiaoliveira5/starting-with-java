package first_steps;

public class Boo {
  public static void main(String[] args) {
    boolean resultado;
    resultado = false;
    System.out.print(resultado);

    // operador AND (&&)
    boolean fimDeSemana = true;
    boolean tempoBom = true;
    boolean vamosAPraia = fimDeSemana && tempoBom;
    System.out.println(vamosAPraia);

    // operador OR (||)
    boolean chovendo = true;
    boolean jaChoveu = false;
    boolean chaoTaMolhado = chovendo || jaChoveu;
    System.out.println(chaoTaMolhado);

    // operador ternário (x ? y : z)
    String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
    System.out.println(mensagem);
    
  }
}
