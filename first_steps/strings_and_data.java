package first_steps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class strings_and_data {
  public static void main(String[] args) {
    String nome = "Letícia";
    System.out.println(nome.toUpperCase());
    System.out.println(nome.length());

    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale("pt", "BR");
    String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

    LocalDateTime agora = LocalDateTime.now();
    String saudacao;

    if (agora.getHour() >= 0 && agora.getHour() < 12) {
      saudacao = "bom dia";
    } else if (agora.getHour() > 12 && agora.getHour() < 18) {
      saudacao = "boa tarde";
    } else if (agora.getHour() > 18) {
      saudacao = "boa noite";
    } else {
      saudacao = "";
    }

    System.out.printf("Ola, %s, Hoje é %s. %s", nome, diaSemana, saudacao);
  }
}
