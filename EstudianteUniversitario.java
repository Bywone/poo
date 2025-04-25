public class EstudianteUniversitario extends Estudiante {
    private String universidad;    
    
    EstudianteUniversitario(String nombre, int edad, double altura, String genero, String nacionalidad, String matricula, String carrera, String universidad) {
        super(nombre, edad, altura, genero, nacionalidad, matricula, carrera); 
        this.universidad = universidad;
    }
    

    public String getUniversidad(){
        return universidad;
    }

    public void setUniversidad(String universidad){
        this.universidad = universidad;
    }
}
