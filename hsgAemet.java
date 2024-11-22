import java.util.Scanner;

public class hsgAemet {

    static int NCiudades = 8;
    static String[] nombres = { "Almeria", "Granada", "Cordoba", "Jaen", "Malaga", "Sevilla", "Cadiz" };
    static int registroTemp;

    public static void main(String[] args) {
        hsgRegCiudad.hsgGenerarTemp();
        hsgListarRegistroTemp();
        hsgGenerarRegistroTemp();
    }

    public static void hsgGenerarRegistroTemp() {
        System.out.printf("%20s", "");
      
      for(int i = 0;i<NCiudades;i++)
    {
        System.out.printf("%20s", nombres[i] + "   ");

    }
}

    public static void hsgListarRegistroTemp(){
        System.out.println("------ LISTADO DE Temperaturas --------------");
        System.out.printf("%20s", "");
        for (int i = 0; i < hsgRegCiudad.NDias; i++) {
            System.out.printf("%10s", hsgRegCiudad.diasSemana[i] + "  ");
            
        }
        System.out.println();
        for (int i = 0; i < NCiudades; i++) {
            System.out.printf("%20s", nombres[i] + "   ");
            
            for (int j = 0; j < hsgRegCiudad.NDias; j++) {
                System.out.printf("%10.2s", hsgRegCiudad.temperatura[i][j] + "        ");
                
            }
            System.out.println();
        }
     }

    public static int hsggetDatosDia(String dia) {
        
    }
}
