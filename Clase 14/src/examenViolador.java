import java.util.Scanner;

public class examenViolador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option;
		boolean flag = true;
		boolean flag2 = false;
		boolean flag3 = false;
		String orden;
		String orden2;
		int PizzaGrandeDeMuzza = 0;
		int PizzaDobleQuesoConJamón = 0;
		int PizzaVegetariana = 0;
		int GrandeDeMuzza = 0;
		int DobleQuesoConJamón = 0;
		int Vegetariana = 0;

		String Nombres;
		String Ingredientes;
		int tomate = 0;
		int mozzarella = 0;
		int provolone = 0;
		int jamon = 0;
		int acelga = 0;
		int salsaBlanca = 0;
		int quesoRayado = 0;

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.println("¡Hola, soy un microondas!");

		do {
			do {
				System.out.println("¿Que pizza desea?");

				System.out.println("1) Grande de Muzza");
				System.out.println("2) Doble queso con jamón");
				System.out.println("3) Vegetariana");

				option = sc.nextInt();

				if (option < 1 || option > 4) {
					System.err.println("Error, opción no válida.");
					flag2 = true;
				} else {
					flag2 = false;

				}

			} while (flag2);

			switch (option)

			{
			case 1:
				System.out.println(
						"La grande de Muzza se cocina en 5 minutos y sus ingredientes son: Mozzarella y Tomate");
				PizzaGrandeDeMuzza++;
				mozzarella++;
				tomate++;

				break;
			case 2:
				System.out.println(
						"La de doble de queso con jamón se cocina en 10 minutos y sus ingredientes son: mozzarella, provolone, tomate y jamón");
				PizzaDobleQuesoConJamón++;
				mozzarella++;
				provolone++;
				tomate++;
				jamon++;

				break;
			case 3:
				System.out.println(
						"La vegetariana se cocina en 15 y sus ingredientes son: Acelga, Mozzarella, Salsa blanca y Queso rayado");
				PizzaVegetariana++;
				acelga++;
				mozzarella++;
				salsaBlanca++;
				quesoRayado++;

				break;
			default:
				System.out.println("ERROR, opción no válida.");
				break;
			}// terminó el switch

			do {

				System.out.println("Desea desenchufar el microondas?");
				orden2 = sc3.nextLine();
				if (orden2.equalsIgnoreCase("no")) {
					flag3 = false;
				} else {
					flag3 = false;

					System.out.println(
							"Cantidad de pizzas: " + (PizzaGrandeDeMuzza + PizzaDobleQuesoConJamón + PizzaVegetariana));
					System.out.println("Grande de Muzza:" + PizzaGrandeDeMuzza);
					System.out.println("Doble Queso con Jamón: " + PizzaDobleQuesoConJamón);
					System.out.println(" Vegetariana:" + PizzaVegetariana);

					System.out.println("Ingredientes:  " + "Tomate: " + tomate + " Mozzarella: " + mozzarella
							+ " Provolone: " + provolone + " Jamón: " + jamon + " Acelga: " + acelga + " Salsa Blanca: "
							+ salsaBlanca + " Queso Rayado: " + quesoRayado);

				}
			} while (flag3);

			System.out.println("¿Desea realizar otra operación? SI/NO");
			orden = sc2.nextLine();
			if (orden.equalsIgnoreCase("si")) {
				flag = true;
			} else {
				flag = false;
			}

		} while (flag);

		System.out.println("Gracias!");

	}

}
