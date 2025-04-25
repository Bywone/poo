public class Main {
    public static void main(String[] args) {
        // Nota: en el main se pone los valores que quieres en el constructor, pero en
        // la clase se define el constructor
        Persona p = new Persona("Carlos", 25, 1.80, "Masculino", "Italiano");
        
        /*set: Se usa para modificar el valor del atributo
          get: Se usa para obtener el valor del atríbulo, para leerlo e imprimirlo*/

        /*Cuando ponemos los parámetros en privado y creamos los getter y setter se ocupa el getter para imprimirlo: */
        // Se modifica el nombre con el setter (esto es opcional):
        p.setNombre("Enrique");

        // Después se imprime el nombre con el getter:
        System.out.println("El papu se llama: " + p.getNombre());
        System.out.println("Tiene " + p.getEdad() + " añitos");
        System.out.println("Mide: " + p.getAltura() + " metros, crack");

        p.hablar();
        p.caminar();
        p.comer();
        p.dormir();

        System.out.println("Información de la Persona:");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Género: " + p.getGenero());
        System.out.println("Nacionalidad: " + p.getNacionalidad());

        // Crear un Estudiante Universitario
        EstudianteUniversitario eu = new EstudianteUniversitario("Ana", 22, 1.65, "Femenino", "Argentina", "C987654", "Ingeniería", "Universidad Nacional");
        System.out.println("\nInformación del Estudiante Universitario:");
        System.out.println("Nombre: " + eu.getNombre());
        System.out.println("Edad: " + eu.getEdad());
        System.out.println("Altura: " + eu.getAltura());
        System.out.println("Género: " + eu.getGenero());
        System.out.println("Nacionalidad: " + eu.getNacionalidad());
        System.out.println("Matrícula: " + eu.getMatricula());
        System.out.println("Carrera: " + eu.getCarrera());
        System.out.println("Universidad: " + eu.getUniversidad());
    }
}
