/* Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase)
* está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos
* mostrar al final: La nota media del grupo en cada trimestre, la media del alumno se le pedira el nombre al usuario
* para que pueda encontrar al alumno*/
package arreglos.ejercicios;

import javax.swing.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        int[][] primerBimestre = new int[5][10];
        int[][] segundoBimestre = new int[5][10];
        int[][] tercerBimestre = new int[5][10];

        // Solicitamos los nombres de los estudiantes
        JOptionPane.showMessageDialog(null, "Ingrese los nombres de los 5 alumnos");
        for (int i = 0; i < 5; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1));
        }

        // Capturamos las notas del primer bimestre para todos los estudiantes
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese las 10 calificaciones del " +
                    "Primer Bimestre del estudiante: " + nombres[i]);
            for (int j = 0; j < 10; j++) {
                primerBimestre[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota Nº" + (j + 1) +
                        " del Primer Bimestre del estudiante " + nombres[i]));
            }
        }

        // Capturamos las notas del segundo bimestre para todos los estudiantes
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese las 10 calificaciones del " +
                    "Segundo Bimestre del estudiante: " + nombres[i]);
            for (int j = 0; j < 10; j++) {
                segundoBimestre[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota Nº" + (j + 1) +
                        " del Segundo Bimestre del estudiante " + nombres[i]));
            }
        }

        // Capturamos las notas del tercer bimestre para todos los estudiantes
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese las 10 calificaciones del " +
                    "Tercer Bimestre del estudiante: " + nombres[i]);
            for (int j = 0; j < 10; j++) {
                tercerBimestre[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota Nº" + (j + 1) +
                        " del Tercer Bimestre del estudiante " + nombres[i]));
            }
        }

        // Mostrar todas las notas en un solo mensaje, separadas por "-"
        StringBuilder notasEstudiantes = new StringBuilder("Calificaciones de los estudiantes:\n\n");
        for (int i = 0; i < 5; i++) {
            notasEstudiantes.append("El estudiante ").append(nombres[i]).append(" tiene las siguientes calificaciones:\n");
            notasEstudiantes.append("Primer Bimestre: ");
            for (int j = 0; j < 10; j++) {
                notasEstudiantes.append(primerBimestre[i][j]).append(j < 9 ? " - " : "");
            }
            notasEstudiantes.append("\nSegundo Bimestre: ");
            for (int j = 0; j < 10; j++) {
                notasEstudiantes.append(segundoBimestre[i][j]).append(j < 9 ? " - " : "");
            }
            notasEstudiantes.append("\nTercer Bimestre: ");
            for (int j = 0; j < 10; j++) {
                notasEstudiantes.append(tercerBimestre[i][j]).append(j < 9 ? " - " : "");
            }
            notasEstudiantes.append("\n\n");
        }
        JOptionPane.showMessageDialog(null, notasEstudiantes.toString());

        // Calcular y mostrar la media de cada trimestre y la media general del grupo
        double sumaPrimerBimestre = 0, sumaSegundoBimestre = 0, sumaTercerBimestre = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                sumaPrimerBimestre += primerBimestre[i][j];
                sumaSegundoBimestre += segundoBimestre[i][j];
                sumaTercerBimestre += tercerBimestre[i][j];
            }
        }
        double mediaPrimerBimestre = sumaPrimerBimestre / (5 * 10);
        double mediaSegundoBimestre = sumaSegundoBimestre / (5 * 10);
        double mediaTercerBimestre = sumaTercerBimestre / (5 * 10);
        double mediaGeneralGrupo = (mediaPrimerBimestre + mediaSegundoBimestre + mediaTercerBimestre) / 3;

        String mensajeMedias = String.format(
                "Media del Primer Bimestre: %.2f\n" +
                        "Media del Segundo Bimestre: %.2f\n" +
                        "Media del Tercer Bimestre: %.2f\n" +
                        "Media General del Grupo: %.2f",
                mediaPrimerBimestre, mediaSegundoBimestre, mediaTercerBimestre, mediaGeneralGrupo
        );
        JOptionPane.showMessageDialog(null, mensajeMedias);

        // Bucle para permitir al usuario consultar las medias de los estudiantes hasta que decida salir
        while (true) {
            String nombreBuscado = JOptionPane.showInputDialog("Ingrese el nombre del estudiante para calcular su media " +
                    "(o escriba 'salir' para terminar):");
            if (nombreBuscado.equalsIgnoreCase("salir")) {
                break; // Salir del bucle si el usuario escribe 'salir'
            }

            int indiceEstudiante = -1;

            for (int i = 0; i < 5; i++) {
                if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                    indiceEstudiante = i;
                    break;
                }
            }

            if (indiceEstudiante != -1) {
                double sumaNotasEstudiante = 0;

                for (int j = 0; j < 10; j++) {
                    sumaNotasEstudiante += primerBimestre[indiceEstudiante][j];
                    sumaNotasEstudiante += segundoBimestre[indiceEstudiante][j];
                    sumaNotasEstudiante += tercerBimestre[indiceEstudiante][j];
                }

                double mediaEstudiante = sumaNotasEstudiante / 30; // 3 trimestres * 10 notas
                JOptionPane.showMessageDialog(null, String.format("Media General del estudiante %s: %.2f"
                        , nombreBuscado, mediaEstudiante));
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
            }
        }
    }
}
