import java.util.ArrayList;

class main {

    public static void main(String[] args) {

        Bicicleta miBicicleta= new Bicicleta(1,1,1);
        Bicicleta tuBicicleta= new Bicicleta(8,2,2);


        //Objetos de la clase 5
        BicicletaMontana bicicletaMontana= new BicicletaMontana(4,1,1);

        BicicletaTandem bicicletaTandem= new BicicletaTandem(6,1,1);


        bicicletaMontana.cambiarSuspension(1);
        bicicletaMontana.mostrar();



        //ejercicio 6

        System.out .printf("Acelerar BicicletaMontaña: %d " ,bicicletaMontana.acelerar());
        System.out.printf("\n");
        System.out .printf("Acelerar BicicletaTandem: %d" ,bicicletaTandem.acelerar());
        System.out.printf(" ");
        System.out.printf(" ");
        System.out.printf(" ");

        //ejercicio #7

        ArrayList<Bicicleta> bicicletas = new ArrayList();

        //bicicletas.add(miBicicleta);
        bicicletas.add(bicicletaMontana);
        bicicletas.add(bicicletaTandem);

        for(Bicicleta bici:bicicletas){
            if(bici instanceof BicicletaMontana){
                System.out .printf("\nAcelerar tomado de lista: %d" ,((Bicicleta) bici ).acelerar());
                System.out.printf("\n");
            }
            if(bici instanceof BicicletaTandem){
                System.out .printf("Acelerar tomado de lista: %d" ,((Bicicleta ) bici ).acelerar());
            }
        }





    }
}

