package convertidordetemperatura;

public class convertidorcdetemperatura {
    
final double PUNTO_CONGELACION =30.0;
        final double FACTOR_CONVERSION = 5.0 / 9.0;
        double farenheit = 50;
        double celsius;
        
    public void conversion(){
        celsius = FACTOR_CONVERSION * (farenheit - PUNTO_CONGELACION);
        System.out.println(farenheit + " Grados Farenheit =" +  celsius + " Grados Celsius.");
    }

    public static void main(String[] args) {
        convertidordetemperatura temperatura = new convertidordetemperatura();
        temperatura.conversion();
    }
}

