public class persona{
    String nombre;
    int edad;
    double altura;
    String genero;
    String nacionalidad;

//aqui se define el constructor para que funcione el main, si no lo tiene no va a funcionar
    public persona(String nombre, int edad, double altura, String genero, String nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }


    void hablar(){
    System.out.println(nombre + " te dijo hola");
}

    void caminar(){
        System.out.println(nombre + " está llegando al parque a ver a su ex con otro");
    }

    void comer(){
        System.out.println(nombre + " está viendo como está comiendo con otro");
    }

    void dormir(){
        System.out.println(nombre + " está soñando con ella");
    }

}