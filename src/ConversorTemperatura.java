public class ConversorTemperatura {
    
    private double ValorIngresado;
    private String OpcionConversion;
    private double ValorConvertido;
    //"ºC a K", "ºC a ºF", "K a ºF"
    // "K a ºC", "ºF a ºC", "ºF a K"

    public double ConvertirTemperatura(double valorIngresado, String opcionConversion) {
        this.ValorIngresado = valorIngresado;
        this.OpcionConversion = opcionConversion;

        switch (opcionConversion){
            case "ºC a K":
                ValorConvertido = ValorIngresado + 273.15;
            break;

            case "K a ºC":
                ValorConvertido = valorIngresado-273.15;
            break;

            case "ºC a ºF":
                ValorConvertido = (9/5)*valorIngresado+32;
            break;

            case "ºF a ºC":
                ValorConvertido = (5/9)*(valorIngresado-32);
            break;

            case "K a ºF":
                ValorConvertido = (9/5)*valorIngresado-459.67;
            break;
            
            case "ºF a K":
                ValorConvertido = (5/9)*(valorIngresado+459.67);
            break;            
        }
        return ValorConvertido;        
    }

    public String getOpcionConversion() {
        return OpcionConversion;
    }
}
