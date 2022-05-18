public static void main(String[] args) {
    int opcion = 0;
    Scanner sc;
    sc = new Scanner(System.in);

    do{
        //Impresion del Menu Calculadora
        System.out.println("*** CALCULADORA ***");
        System.out.println("1. Suma");

        //Recoger valor y transformarlo en un valor entero
        opcion = Integer.parseInt(sc.nextLine());

        if (opcion < 0 || opcion > 5){
            System.out.println("Opción NO valida");
        }else if (opcion != 0){
            System.out.println();
            //Crean variables
            float var1, var2;

            System.out.println("Introduzca el primer número");
            var1 = Float.parseFloat(sc.nextLine());

            System.out.println("Introduzca el segundo número");
            var2 = Float.parseFloat(sc.nextLine());

            System.out.println();
            switch (opcion) {
                case 1: //Suma
                    System.out.println("El resultado de la suma es: " + (var1 + var2));                    
                    break;            
                default:
                    break;
            }
        }

    } while (opcion != 0); //Sale del programa

    //Cerramos el teclado
    sc.close();

    //Cerramos el programa
    System.out.println("Finalizamos la calculadora");
    
}