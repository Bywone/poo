public class main {
    public static void main(String[] args) {
        //Nota: en el main se pone los valores que quieres en el constructor, pero en la clase se define el constructor
        persona p = new persona("Carlos",25,1.80,"Masculino", "Italiano");

        p.hablar();
        p.caminar();
        p.comer();
        p.dormir(); 
    }
}
