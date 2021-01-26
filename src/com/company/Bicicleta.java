class Bicicleta {

    public int velocidadActual;
    private int platoActual;
    private int piñonActual;




    // Bicicleta no argument constructor:
    // inicializacion de instancias de cero, uno, uno...
    public Bicicleta() {
        this(0, 1, 1); // invoke constructor with three arguments
    }




    //constructor with input values
    public Bicicleta(
            int velocidadActual,int platoActual,int piñonActual)
    {

        if (velocidadActual < 0 ) {
            throw new IllegalArgumentException("velocidadActual must be better 0");
        }



        //this.setVelocidadActual(velocidadActual)=velocidadActual;
        this.velocidadActual=velocidadActual;
        this.platoActual=platoActual;
        this.piñonActual=piñonActual;
    }








    /**
     * Devuelve la velocidad actual
     * @return
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * Modifica la velocidad actual
     * @param velocidadActual
     */
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * Devuelve la plato actual
     * @return
     */
    public int getPlatoActual() {
        return platoActual;
    }

    /**
     * Modifica la plato actual
     * @param platoActual
     */
    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    /**
     * Devuelve la piñon actual
     * @return
     */
    public int getPiñonActual() {
        return piñonActual;
    }

    /**
     * Modifica la piñon actual
     * @param piñonActual
     */
    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }




    void info(){
        System.out.println("Velocidad AHORA:\t"+ velocidadActual + "\tPlato Ahora\t" + platoActual + "\tPiñon AHORA:\t"+ piñonActual);
    }


    public int  acelerar()//el valor dado el contructor lo multipica por 2
    {
        setVelocidadActual(2*velocidadActual);
        //System.out.println("acelerar");
        return getVelocidadActual();//  es un metodo de la clase base que toma el valor de un atributo
    }

    public int  frenar()
    {

        setVelocidadActual(velocidadActual/2);
        //System.out.println("frenar");
        return getVelocidadActual();
    }

    public int cambiarPlato(int plato)
    {
        this.platoActual=plato;
        return this.platoActual;
    }

    public int cambiarPlato()
    {
        this.platoActual=1;
        return this.platoActual;
    }

    public int cambiarPiñon(int piñon)
    {
        this.piñonActual=piñon;
        return this.piñonActual;
    }

    public int cambiarPiñon()
    {
        this.piñonActual=1;
        return this.piñonActual;
    }



}



// #ejercicio 5


class BicicletaMontana extends Bicicleta{

    private int suspension;//atributo propio de la bicicleta montaña

    //constructor haciendo uso de super
    public BicicletaMontana(
            int velocidadActual,int platoActual,int piñonActual) {
        super(velocidadActual,platoActual,piñonActual);
        suspension=0;
    }


    public int cambiarSuspension(int suspension)//solo lo ara bicicleta motaña por que es una
    {
        this.suspension=suspension;
        return this.suspension;
    }


    public int getSuspension() {return suspension;}


    //Métodos específicos de la subclase

    public void mostrar() {


        System.out.println ("Velocidad: " + getVelocidadActual() + " \nPlato: " +  getPlatoActual() + " \nPinon: " +  getPiñonActual() +

                " \nCon suspension: " + getSuspension() ); }

    @Override// el metodo se esta sobreescribiendo en la clase bicicleta
    public int acelerar()
    {
        //super.setVelocidadActual(3*velocidadActual);
        //System.out.println("acelerar");
        //return super.getVelocidadActual();
        return 3*((super.acelerar())/2);
    }


}


//BicicletaTandem

class BicicletaTandem extends Bicicleta{

    private int numAsientos;

    //constructor haciendo uso de super
    public BicicletaTandem(
            int velocidadActual,int platoActual,int piñonActual) {
        super(velocidadActual,platoActual,piñonActual);
        numAsientos=0;
    }

    @Override
    public int acelerar()
    {
        return 4*((super.acelerar())/2);
        //super.setVelocidadActual(4*velocidadActual);
        //System.out.println("acelerar");
        //return super.getVelocidadActual();
    }

}
