/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Utilidades {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //NOMBRES: array de 20 nombres
    private String[] nombres = {"Ana", "Carolina", "Viviana", "Sofia", "Gabriela",
        "Carla", "Mariela", "Estela", "Lorena", "Vanina", "Juan", "Carlos",
        "Pedro", "Ricardo", "Luis", "Esteban", "Rogelio", "César", "Eduardo", "Ariel"};

    public String nombre() {
        String aux;
        int i = (int) (Math.random() * nombres.length);
        aux = nombres[i];
        return aux;
    }

    //APELLIDOS: array de 15 apellidos
    private String[] apellidos = {"Perez", "Lopez", "Sosa", "Zapata", "Sabino", "Sanchez",
        "Cueto", "Lobos", "Paz", "Salinas", "Lebon", "Luna", "Diaz", "Storni", "Paez"};

    public String apellido() {
        String aux;
        int i = (int) (Math.random() * apellidos.length);
        aux = apellidos[i];
        return aux;
    }

    //ESTADO CIVIL: array de 5 estados
    private String[] estadoCivil = {"Casado/a", "Soltero/a", "Divorciado/a", "Viudo/a", "Otro"};

    public String estadoCivil() {
        String aux;
        int i = (int) (Math.random() * estadoCivil.length);
        aux = estadoCivil[i];
        return aux;
    }

    //DNI entrega un String (valor entre 10.000.000 y 49.999.999)
    public String crearDni() {
        String aux;
        int i = (int) ((Math.random() * 40000000) + 10000000);
        aux = String.valueOf(i);
        aux = (aux.substring(0, 2) + "." + aux.substring(2, 5) + "." + aux.substring(5, 8));
        return aux;
    }

    //INCORPORACION (valor entre 1993 Y 2023)
    public String incorporacion() {
        String aux;
        int i = (int) ((Math.random() * 30) + 1993);
        aux = String.valueOf(i);
        return aux;
    }

    //DESPACHO (valor entre 1 y 9)
    public int despacho() {
        int i = (int) ((Math.random() * 9) + 1);
        return i;
    }

    //DEPARTAMENTOS: array de 10 departamentos
    private String[] departamentos = {"Arquitectura", "Lenguaje", "Física", "Matemáticas",
        "Química", "Sociolagía", "Informática", "Civil", "Agro", "Electrónica"};

    public String departamento() {
        String aux;
        int i = (int) (Math.random() * departamentos.length);
        aux = departamentos[i];
        return aux;
    }

    //SECCION: array de 10 secciones
    String[] secciones = {"Biblioteca", "Secretaría", "Alumnado", "Decanato",
        "Personal", "Limpieza", "Cursos", "Contaduría", "Vigilancia", "Rectoría"};

    public String seccion() {
        String aux;
        int i = (int) (Math.random() * secciones.length);
        aux = secciones[i];
        return aux;
    }

    //CURSO: array de 15 cursos
    private String[] cursos = {"Programación", "Bioquímica", "Farmacia", "Matemáticas",
        "Psicología", "Sociología", "Contador", "Turismo", "Informática", "Electrónica",
        "Inglés", "Historia", "Geografía", "Mecánica", "Electricidad"};

    public String curso() {
        String aux;
        int i = (int) (Math.random() * cursos.length);
        aux = cursos[i];
        return aux;
    }

    //MENU GENERICO
    private String menu(String[] st) {
        String aux;
        for (int i = 1; i <= st.length; i++) {
            System.out.println(i + " - " + st[i - 1]);
        }
        System.out.println("Elija una opción");
        aux = st[(leer.nextInt()) - 1];

        return aux;

    }
}
