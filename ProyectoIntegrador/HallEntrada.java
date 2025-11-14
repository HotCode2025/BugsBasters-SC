/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

/**
 
 */
public class HallEntrada {

    // Scanner único para todo el programa (UTF-8 si la JVM lo soporta)
    static Scanner sc = new Scanner(System.in);

    /** Clase para contener datos del paciente y datos extra */
    static class Patient {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        int edad = 0;
        int dni = 0;
        String domicilio = "";
        String telefono = "";
        String correo = "";
        String fechaCita = "";
        String horaCita = "";
        String obraSocial = "";
        Map<String, String> extras = new HashMap<>(); // para guardar datos adicionales
    }

    /* ---------------- utilidades de entrada ---------------- */
    static String readLine(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        if (s == null)
            return "";
        return s.trim();
    }

    static int readInt(String prompt) {
        while (true) {
            String s = readLine(prompt);
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
            }
        }
    }

    static boolean readYesNo(String prompt) {
        while (true) {
            String s = readLine(prompt).toLowerCase();
            if (s.equals("si") || s.equals("s"))
                return true;
            if (s.equals("no") || s.equals("n"))
                return false;
            System.out.println("Respuesta inválida. Escriba 'si' o 'no'.");
        }
    }

    static String readOption(String prompt, Set<String> validOptionsLower) {
        while (true) {
            String s = readLine(prompt).toLowerCase();
            if (validOptionsLower.contains(s))
                return s;
            System.out.println("Opción inválida. Intente nuevamente.");
        }
    }

    /* ---------------- subprocesos (especialidades) ---------------- */

    static String geriatria(Patient p) {
        System.out.println();
        System.out.println("* Geriatría *");
        System.out.println("===========================");
        System.out.println("* Historial médico: *");
        System.out.println("===========================");

        boolean tuvoHistoria = readYesNo("¿Ha padecido alguna enfermedad crónica, alergias u otro? (si/no): ");
        if (tuvoHistoria) {
            System.out.println("¿Cuál es su padecimiento?");
            System.out.println("1. Enfermedad crónica");
            System.out.println("2. Alergia");
            System.out.println("3. Otro");
            int opcion2;
            while (true) {
                opcion2 = readInt("Ingrese opción (1/2/3): ");
                if (opcion2 >= 1 && opcion2 <= 3)
                    break;
                System.out.println("Opción no válida.");
            }
            if (opcion2 == 1) {
                String cronic = readLine("¿Qué enfermedad crónica padeció/padece?: ");
                p.extras.put("Enfermedad_cronica", cronic);
            } else if (opcion2 == 2) {
                String alergia = readLine("¿A qué es alérgico/a?: ");
                p.extras.put("Alergia", alergia);
            } else {
                String otros = readLine("Describa su situación: ");
                p.extras.put("Otros_geriatria", otros);
            }
        }

        boolean tomaMedicamento = readYesNo("¿Toma algún medicamento recetado? (si/no): ");
        if (tomaMedicamento) {
            String medicamento = readLine("¿Cuál?: ");
            String razon = readLine("¿Para qué?: ");
            p.extras.put("Medicamento", medicamento);
            p.extras.put("Razon_medicamento", razon);
        }

        return "Evaluación geriátrica registrada.";
    }

    static String psicologiaPediatra(Patient p) {
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Área de diagnóstico psicológico pediátrico:");
        System.out.println("==============================================");

        // Usamos edad ya conocida en Patient, si no estaba, pedimos
        if (p.edad <= 0) {
            p.edad = readInt("Ingrese la edad del niño: ");
        } else {
            System.out.println("Edad registrada: " + p.edad);
        }

        boolean cambiosComportamiento = readYesNo("¿Ha notado cambios en el comportamiento de su hijo? (si/no): ");
        boolean cambiosApetito = readYesNo("¿Ha notado cambios en su apetito? (si/no): ");
        boolean interacciona = readYesNo("¿El niño interactúa con otras personas? (si/no): ");
        boolean asiste = readYesNo("¿Asiste al jardín/colegio? (si/no): ");
        String relacionCompaneros = "bien";
        if (asiste) {
            relacionCompaneros = readOption("¿Cómo se lleva con sus compañeros? (bien/mal): ",
                    new HashSet<>(Arrays.asList("bien", "mal")));
        }
        boolean manifiestaEmociones = readYesNo("¿Manifiesta miedo, tristeza o ansiedad? (si/no): ");

        String diagnostico;
        if (cambiosComportamiento || manifiestaEmociones || cambiosApetito) {
            diagnostico = "Hay algo que preocupa en el comportamiento del niño. Se aconseja consulta con especialista.";
        } else if (!interacciona || relacionCompaneros.equals("mal")) {
            diagnostico = "Posible conducta social problemática. Evaluar entorno social y escolar.";
        } else {
            diagnostico = "No se observan signos claros en esta evaluación inicial.";
        }

        return diagnostico;
    }

    static String psicologiaGeneral(Patient p) {
        System.out.println();
        System.out.println("=================================");
        System.out.println("Área de diagnóstico psicológico:");
        System.out.println("=================================");

        String estadoAnimo = readOption(
                "¿Cómo describiría su estado de ánimo últimamente? (feliz/triste/ansioso/neutral): ",
                new HashSet<>(Arrays.asList("feliz", "triste", "ansioso", "neutral")));

        boolean duermeBien = readYesNo("¿Duerme bien por las noches? (si/no): ");
        boolean cambiosApetito = readYesNo("¿Ha notado cambios en su apetito? (si/no): ");
        boolean motivacion = readYesNo("¿Se siente con motivación para hacer sus actividades diarias? (si/no): ");
        boolean aislamiento = readYesNo("¿Evita estar con otros? (si/no): ");

        String diagnostico;
        if (estadoAnimo.equals("triste") && !duermeBien && !motivacion && aislamiento) {
            diagnostico = "Posibles signos de depresión.";
        } else if (estadoAnimo.equals("ansioso") && !duermeBien) {
            diagnostico = "Posibles signos de ansiedad.";
        } else if (estadoAnimo.equals("neutral") && !motivacion) {
            diagnostico = "Estrés leve. Observar.";
        } else {
            diagnostico = "Estado emocional estable.";
        }

        return diagnostico;
    }

    static String kinesiologia(Patient p) {
        System.out.println();
        System.out.println("=====================================");
        System.out.println("Área de diagnóstico kinesiológico:");
        System.out.println("=====================================");

        String tipoDolor = readOption(
                "¿Siente dolor muscular, articular o ambas? (muscular/articular/ambas): ",
                new HashSet<>(Arrays.asList("muscular", "articular", "ambas")));

        boolean actDificultad = readYesNo("¿Tiene dificultad para realizar ciertas actividades? (si/no): ");
        boolean rangoMovimiento = readYesNo("¿Muestra limitación en el rango de movimiento? (si/no): ");
        boolean perdidaFuerza = readYesNo("¿Siente pérdida de fuerza? (si/no): ");
        boolean tratPrevio = readYesNo("¿Ha recibido tratamiento previo para este problema? (si/no): ");

        String diagnostico;
        if (tipoDolor.equals("muscular") && actDificultad && rangoMovimiento && perdidaFuerza && tratPrevio) {
            diagnostico = "Posibles signos de fatiga muscular. Se recomienda descanso prolongado de 48 a 72 horas y reevaluación.";
        } else if (tipoDolor.equals("articular") && actDificultad) {
            diagnostico = "Se recomienda examen físico de las articulaciones (buscar hinchazón, movilidad, sensibilidad).";
        } else if (tipoDolor.equals("ambas") && rangoMovimiento) {
            diagnostico = "Dolencia muscular y articular severa. Buscar atención médica para diagnóstico y tratamiento.";
        } else {
            diagnostico = "No se detectan síntomas relevantes. Estado físico estable.";
        }

        return diagnostico;
    }

    static String cardiologico(Patient p) {
        System.out.println();
        System.out.println("=================================");
        System.out.println(" Área de diagnóstico Cardiológico ");
        System.out.println("=================================");

        boolean dolorPecho = readYesNo("¿Ha tenido dolor de pecho últimamente? (si/no): ");
        int nivelDolor = -1;
        if (dolorPecho) {
            while (true) {
                nivelDolor = readInt("Escala del 0 al 10 (0 = nada, 10 = máximo): ");
                if (nivelDolor >= 0 && nivelDolor <= 10)
                    break;
                System.out.println("Ingrese un valor entre 0 y 10.");
            }
        }
        boolean palpitaciones = readYesNo("¿Palpitaciones? (si/no): ");
        boolean mareo = readYesNo("¿Mareos o desmayos? (si/no): ");
        boolean edema = readYesNo("¿Hinchazón (edema)? (si/no): ");
        boolean hipertension = readYesNo("¿Hipertensión? (si/no): ");
        boolean colesterol = readYesNo("¿Colesterol alto? (si/no): ");
        boolean diabetes = readYesNo("¿Diabetes? (si/no): ");

        String diagnostico;
        if (dolorPecho && nivelDolor >= 7) {
            diagnostico = "Alto riesgo. Derivar a urgencias.";
        } else if (dolorPecho && palpitaciones) {
            diagnostico = "Posible arritmia o isquemia. Se sugiere realizar ECG.";
        } else if (hipertension || colesterol || diabetes) {
            diagnostico = "Riesgo cardiovascular. Requiere seguimiento médico.";
        } else if (edema || mareo) {
            diagnostico = "Posible insuficiencia cardíaca o problema hemodinámico. Evaluar.";
        } else {
            diagnostico = "Riesgo bajo. Control rutinario recomendado.";
        }

        return diagnostico;
    }

    static String odontologia(Patient p) {
        System.out.println();
        System.out.println("===================================");
        System.out.println(" Área de diagnóstico Odontológico ");
        System.out.println("===================================");

        Set<String> opcionesValidas = new HashSet<>(Arrays.asList("chequeo", "limpieza", "radiografia", "ortodoncia"));
        String consulta = readOption("¿Cuál es su consulta? (chequeo / limpieza / radiografia / ortodoncia): ",
                opcionesValidas);

        // Solo 'limpieza' y 'chequeo' se atienden como consulta inmediata en recepción
        while (!consulta.equals("limpieza") && !consulta.equals("chequeo")) {
            System.out.println("Este tipo de consulta requiere derivación. Será atendido en la fecha asignada.");
            consulta = readOption("Por favor, ingrese nuevamente su consulta (limpieza o chequeo): ",
                    new HashSet<>(Arrays.asList("limpieza", "chequeo", "radiografia", "ortodoncia")));
        }

        String diagnostico;
        if (consulta.equals("limpieza")) {
            diagnostico = "Placa bacteriana detectada. Recomendado limpieza profunda cada 6 meses.";
        } else {
            diagnostico = "Dientes en buen estado. Se sugiere control anual.";
        }

        return "Consulta: " + consulta + ". Diagnóstico odontológico: " + diagnostico;
    }

    /* ---------------- proceso principal (hall de entrada) ---------------- */

    static void hallEntrada() {
        Patient p = new Patient();

        System.out.println("========================================");
        System.out.println("*     HALL DE ENTRADA - SECRETARÍA     *");
        System.out.println("========================================");
        System.out.println("¡Buenos días! Voy a necesitar algunos datos sobre el paciente entrante.");
        System.out.println();

        p.nombre = readLine("Ingrese el nombre del paciente: ");
        p.apellido = readLine("Ingrese el apellido del paciente: ");
        p.fechaNacimiento = readLine("Fecha de nacimiento del paciente (dd/mm/aaaa): ");
        p.edad = readInt("Ingrese la edad del paciente: ");
        p.dni = readInt("Ingrese el número de DNI: ");
        p.domicilio = readLine("Ingrese el domicilio del paciente: ");
        p.telefono = readLine("Número de teléfono del paciente: ");
        p.correo = readLine("Ingrese el correo electrónico del paciente (opcional): ");
        p.fechaCita = readLine("Fecha de la cita (dd/mm/aaaa): ");
        p.horaCita = readLine("Hora de la cita (hh:mm): ");
        p.obraSocial = readLine("Obra social (si tiene): ");

        String diagnosticoPediatrico = "";
        // Si es adulto mayor -> geriatría
        if (p.edad >= 70) {
            String g = geriatria(p);
            p.extras.put("Geriatria_eval", g);
        } else if (p.edad <= 18) {
            // Recolección de datos pediátricos básicos
            System.out.println();
            System.out.println("=================================");
            System.out.println("Área de diagnóstico Pediátrico");
            System.out.println("=================================");
            boolean prematuro = readYesNo("¿Fue un bebé prematuro? (si/no): ");
            int caminarMeses = readInt("¿A los cuántos meses pudo aprender a caminar? (numero): ");
            boolean contactoToxico = readYesNo("¿Tuvo contacto con algún tipo de toxina o tabaco? (si/no): ");
            boolean alergias = readYesNo("¿Tiene algún tipo de alergias? (si/no): ");
            boolean higiene = readYesNo("¿Mantiene la higiene como prioridad? (si/no): ");
            boolean vacunas = readYesNo("¿Tiene las vacunas al día? (si/no): ");

            // Evaluación simple
            if (prematuro && caminarMeses > 15) {
                diagnosticoPediatrico = "Desarrollo psicomotor lento. Consulte con especialista.";
            } else if (contactoToxico || alergias) {
                diagnosticoPediatrico = "Riesgo de infecciones respiratorias o complicaciones. Evaluar con profesional.";
            } else if (!higiene || !vacunas) {
                diagnosticoPediatrico = "Niño vulnerable a contraer infecciones. Actualizar cuidados y vacunas.";
            } else {
                diagnosticoPediatrico = "El niño parece estar sano según esta evaluación inicial.";
            }
            p.extras.put("Diagnostico_pediatrico", diagnosticoPediatrico);
        }

        System.out.println();
        System.out.println("Le haremos unas preguntas guiadas sobre los síntomas del paciente.");
        String[] sintomasArray = {
                "Fiebre", "Tos", "Dolor de cabeza", "Fatiga", "Dolor de garganta",
                "Dificultad para respirar", "Pérdida del olfato", "Dolores musculares",
                "Escalofríos", "Congestión nasal"
        };

        List<String> sintomasGuardados = new ArrayList<>();
        for (String s : sintomasArray) {
            boolean tiene = readYesNo("¿Tiene " + s + "? (si/no): ");
            if (tiene)
                sintomasGuardados.add(s);
        }

        // Selección de especialidad
        int motivoConsulta;
        while (true) {
            System.out.println();
            System.out.println("Seleccione el motivo de la consulta para derivación más precisa:");
            System.out.println("1. Cardiología");
            System.out.println("2. Psicología");
            System.out.println("3. Kinesiología");
            System.out.println("4. Odontología");
            motivoConsulta = readInt("Ingrese (1-4): ");
            if (motivoConsulta >= 1 && motivoConsulta <= 4)
                break;
            System.out.println("Opción inválida. Ingrese 1, 2, 3 o 4.");
        }

        String especialidad = "";
        String diagnosticoEspecialidad = "";

        switch (motivoConsulta) {
            case 1:
                especialidad = "Cardiología";
                diagnosticoEspecialidad = cardiologico(p);
                break;
            case 2:
                especialidad = "Psicología";
                if (p.edad <= 18) {
                    diagnosticoEspecialidad = psicologiaPediatra(p);
                } else {
                    diagnosticoEspecialidad = psicologiaGeneral(p);
                }
                break;
            case 3:
                especialidad = "Kinesiología";
                diagnosticoEspecialidad = kinesiologia(p);
                break;
            case 4:
                especialidad = "Odontología";
                diagnosticoEspecialidad = odontologia(p);
                break;
            default:
                especialidad = "No especificada";
                diagnosticoEspecialidad = "No corresponde";
        }

        // Resumen final
        System.out.println();
        System.out.println("===== RESUMEN DEL PACIENTE =====");
        System.out.println("Nombre: " + p.nombre + " " + p.apellido);
        System.out.println("Nacimiento: " + p.fechaNacimiento + " | Edad: " + p.edad);
        System.out.println("DNI: " + p.dni + " | Teléfono: " + p.telefono);
        System.out.println("Correo: " + p.correo);
        System.out.println("Domicilio: " + p.domicilio);
        System.out.println("Cita: " + p.fechaCita + " a las " + p.horaCita);
        System.out.println("Obra social: " + p.obraSocial);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Síntomas:");
        if (sintomasGuardados.isEmpty()) {
            System.out.println("- Ninguno");
        } else {
            for (String s : sintomasGuardados) {
                System.out.println("- " + s);
            }
        }

        if (p.edad <= 18) {
            System.out.println("------------------------------------------");
            System.out.println("Diagnóstico Pediátrico: "
                    + p.extras.getOrDefault("Diagnostico_pediatrico", diagnosticoPediatrico));
            System.out.println("------------------------------------------");
        }

        System.out.println("------------------------------------------");
        System.out.println("Diagnóstico / Observaciones (" + especialidad + "): " + diagnosticoEspecialidad);
        System.out.println("------------------------------------------");

        System.out.println("Registro completo. Gracias.");
    }

    public static void main(String[] args) {
        hallEntrada();
        sc.close();
    }
}