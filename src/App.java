public class App {
    //abrimos el metodo copiando el metodo para realizar el insertionSort
    public static void insertionSort(int[] Stock, String[] videojuegos ) {
        //copio la base de guia y cambio las variables agregando el vector de videojuegos 

        int n = Stock.length;
        for (int i = 1; i < n; i++) {
            int key = Stock[i];
            String juego = videojuegos[i];
            int j = i - 1;
            //utilizamos el key para que se guarde y empieze a ordenar el arreglo
            while (j >= 0 && Stock[j] > key) {
                Stock[j + 1] = Stock[j];
                videojuegos[j + 1] = videojuegos[j];
                j--;
            }
            Stock[j + 1] = key;
            videojuegos[j + 1] = juego;
        }
    }
    public static void main(String[] args) throws Exception{
        //abrimos la matriz con el Stock y los videojuegos de la tienda
        int[] Stock = {15, 34, 12, 30, 38, 44, 57};
        String[] videojuegos = {"Dave the diver", "The crew", "God of war", "Halo", "Forza", "Horizon", "Call of duty"};
        //empezamos a mostrar la lista sin ordenar
        System.out.println("Lista de juegos antes de la ordenación:");
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println(videojuegos[i] + " Stock: " + Stock[i]);
        }
        //llamamos al metodo para que ordene la lista y mostramos la lista ya ordenanda
       insertionSort(Stock, videojuegos);

        System.out.println("\nLista de juegos después de la ordenación:");
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println(videojuegos[i] + " Stock: " + Stock[i]);
       }     
     }
}
