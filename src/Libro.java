

import java.util.Scanner;


public class Libro {

//Atributos clases

    Scanner teclado = new Scanner(System.in);
    //ATRIBIUTOS CLASES

    private int id;
    private String titulo;
    private String autor;
    private int cantidad_total;
    private int cantidad_disponible;


//CONSTRUCTOR VACIO


    public Libro() {
    }



    //CONSTRUCTOR CON TODOS LOS PARAMETROS


    public Libro(int id, String titulo, String autor, int cantidad_total, int cantidad_disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad_total = cantidad_total;
        this.cantidad_disponible = cantidad_disponible;
    }

    //GETTER AND SETTER


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }


//METODO TO STRING


    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidad_total=" + cantidad_total +
                ", cantidad_disponible=" + cantidad_disponible +
                '}';
    }



   // METODOS PRESTAR


    public boolean prestarLibro() {
        if (cantidad_disponible > 0) {
            cantidad_disponible--;
            System.out.println("Libro prestado correctamente.");
            return true;
        } else {
            System.out.println("No hay unidades disponibles para prestar.");
            return false;
        }
    }

    // METODOS DEVOLVER

    public boolean devolverLibro() {
        if (cantidad_disponible < cantidad_total) {
            cantidad_disponible++;
            System.out.println("Libro devuelto correctamente.");
            return true;
        } else {
            System.out.println("Ya se devolvieron todas las unidades.");
            return false;
        }
    }









    // FIN
    public static void fin() {
        System.out.println("Gracias por utilizar la biblioteca virtual :) ");
    }











}


