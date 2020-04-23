package application;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		LocalTime initHour = LocalTime.parse(sc.next());
		System.out.print("Hora de saída para o almoço: ");
		LocalTime initHourLunch = LocalTime.parse(sc.next());
		LocalTime parcial1 = initHourLunch.minusHours(initHour.getHour()).minusMinutes(initHour.getMinute());
		
		System.out.print("Hora de retorno do almoço: ");
		LocalTime finalHourLunch = LocalTime.parse(sc.next());
		LocalTime saida = LocalTime.parse("08:48");
		LocalTime totalparcial = saida.minusHours(parcial1.getHour()).minusMinutes(parcial1.getMinute());
		LocalTime previsao = finalHourLunch.plusHours(totalparcial.getHour()).plusMinutes(totalparcial.getMinute()); 
		
		System.out.println();
		System.out.println("Total parcial: " + parcial1);
		System.out.println("Previsao de saída sugerida: " + previsao);
		 
		sc.close();

	}

}
