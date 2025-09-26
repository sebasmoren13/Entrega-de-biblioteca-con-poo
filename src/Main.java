import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    // MENU
    public static void menu() {
        Scanner menu = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        List<Libro> lstLista = new ArrayList<>();


        int op;

        do {
            Libro l1 = new Libro();

            System.out.println("1. Agregar libro");
            System.out.println("2. Mostar libro");
            System.out.println("3. Prestar libro ");
            System.out.println("4. Devolver libro");
            System.out.println("5. Buscar libro");
            System.out.println("6. Eliminar libro");
            System.out.println("7. Salir");


            op = menu.nextInt();

            switch (op) {

                case 1:
                    System.out.println("1. Agregar libro");

                    System.out.println("Agregue la ID del libro para agregarlo");
                    l1.setId(teclado.nextInt());
                    System.out.println("Esciba el titulo del libro ");
                    l1.setTitulo(teclado.next());
                    System.out.println("Escriba el nombre del autor ");
                    l1.setAutor(teclado.next());
                    System.out.println("Escriba la cantidad de unidades que quiere agregar ");
                    l1.setCantidad_total(teclado.nextInt());
                    System.out.println("Digita la cantidad de libros disponibles a prestar ");
                    l1.setCantidad_disponible(teclado.nextInt());


                    lstLista.add(l1);


                    break;
                case 2:

                    System.out.println("2. Mostar libro");


                    for (Libro l : lstLista) {

                        System.out.println(l);
                    }

                    break;
                case 3:

                    System.out.println("3. Prestar libro por ID");
                    System.out.print("Ingrese el ID del libro a prestar: ");
                    int idPrestar = teclado.nextInt();
                    boolean encontradoPrestar = false;

                    for (Libro l : lstLista) {
                        if (l.getId() == idPrestar) {
                            l.prestarLibro();
                            encontradoPrestar = true;
                            break;
                        }
                    }

                    if (!encontradoPrestar) {
                        System.out.println("No se encontró ningún libro con ese ID.");
                    }




                    break;
                case 4:

                    System.out.println("4. Devolver libro por ID");
                    System.out.print("Ingrese el ID del libro a devolver: ");
                    int idDevolver = teclado.nextInt();
                    boolean encontradoDevolver = false;

                    for (Libro l : lstLista) {
                        if (l.getId() == idDevolver) {
                            l.devolverLibro();
                            encontradoDevolver = true;
                            break;
                        }
                    }

                    if (!encontradoDevolver) {
                        System.out.println("No se encontró ningún libro con ese ID.");
                    }

                    break;



                case 5:
                    System.out.println("5. Buscar libro por id");
                    int buscar;

                    buscar = teclado.nextInt();
                    Libro libroEncontrado = null;

                    for (Libro l : lstLista) {
                        if (l.getId() == buscar) {
                            libroEncontrado = l;
                            break;
                        }
                    }

                    if (libroEncontrado != null) {
                        System.out.println(" Libro encontrado: " + libroEncontrado);

                    } else {
                        System.out.println(" No se encontró ningun libro con ese id.");
                    }
                    break;

                case 6:

                    Scanner eliminar_libro = new Scanner(System.in);
                    int eliminar;
                    System.out.println("6. Eliminar libro por id");
                    eliminar = eliminar_libro.nextInt();
                    for (Libro l : lstLista) {
                        if (lstLista.isEmpty()) {
                            System.out.println("No exite ningun libro");
                        } else if (l.getId() == (eliminar)) {
                            lstLista.remove(l);
                            System.out.println("El libro fue elimninado");
                        }

                    }

                    break;

                case 7:
                    System.out.println("7. Salir");


                    Libro.fin();


                    break;


                default:
                    System.out.println("Opción inválida.");

            }
        }
        while (op != 7);

    }

}
