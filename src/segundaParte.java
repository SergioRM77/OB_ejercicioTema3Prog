public class segundaParte {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        System.out.println(miCoche.showPuertas());

        miCoche.IncrementarPuertas();

        System.out.println(miCoche.showPuertas());

    }

}
class Coche{
    private int numPuertas = 4;

    public void IncrementarPuertas(){
        this.numPuertas++;
    }

    public int showPuertas(){
        return this.numPuertas;
    }
}