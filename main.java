import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica: tipo padre (Persona)
        List<Persona> personas = new ArrayList<>();

       
        Persona p = new Persona("Carlos", 25, 1.80, "Masculino", "Italiano");
        personas.add(p);

        // Agregar un Estudiante (hijo de Persona)
        Estudiante e = new Estudiante("Enrique", 20, 1.75, "Masculino", "Mexicano", "12345", "Ingeniería");
        personas.add(e);
        //overload es cuando se asigna parametros en un metodo, overwrite es cuando no tiene parametros
        
        for (Persona persona : personas) {
            System.out.println("-----");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Altura: " + persona.getAltura());
            System.out.println("Género: " + persona.getGenero());
            System.out.println("Nacionalidad: " + persona.getNacionalidad());
                        
            persona.hablar();
            persona.caminar();
            persona.comer();
            persona.dormir();

            // Verificar si es un Estudiante (y castearlo)
            if (persona instanceof Estudiante) {
                Estudiante est = (Estudiante) persona;
                System.out.println("Matrícula: " + est.getMatricula());
                System.out.println("Carrera: " + est.getCarrera());

                // Llamadas a métodos override
                est.hablar();
                est.comer();    // override
                est.caminar();  // override
                est.dormir();   // override

                // Llamadas a métodos overload
                est.comer(3);         // overload
                est.caminar(5);       // overload
                est.dormir(8);        // overload
            }
        }
    }
}