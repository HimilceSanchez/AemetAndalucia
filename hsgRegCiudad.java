public class hsgRegCiudad {
    static int NDias=7;
    static int TEMP=3;
    String Nombre;
    public static int tmax=-1;
    public static int tmin=40;
    static String[] diasSemana= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    public static int [][]temperatura=new int[NDias][hsgAemet.NCiudades];
    public static int temp;

    public static void hsgGenerarTemp(){
        
        for (int i=0; i<hsgRegCiudad.NDias; i++){
        for (int j=0; j<hsgAemet.NCiudades; j++){
         hsgRegCiudad.temperatura[i][j]=(int)(Math.random()*39)+1;
         temp= hsgRegCiudad.temperatura[i][j];
         
        }
    }
}
    // public static void MostrarTabla(){
    //     System.out.println(hsgGenerarTemp());
    // }

   


    // }
    public static void hsggetCiudadTempMax(){
        for(int i=0; i < temp; i++){
            if(temp<tmax){
                tmax=temp;
            }
        }
    }

}

