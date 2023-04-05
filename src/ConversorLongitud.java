public class ConversorLongitud {

    private double ValorIngresado;
    private String OpcionConversion;
    private double ValorConvertido;
    //"km a millas", "millas a km","cm a in", "in a cm"


    public double ConvertirLongitud(double valorIngresado, String opcionConversion) {
        this.ValorIngresado = valorIngresado;
        this.OpcionConversion = opcionConversion;
        switch(opcionConversion){
            case "km a millas":
                this.ValorConvertido = ValorIngresado/1.609344;
            break;

            case "millas a km":
                this.ValorConvertido = ValorIngresado*1.609344;
            break;

            case "cm a in":
                this.ValorConvertido = ValorIngresado/2.54;
            break;

            case "in a cm":
                this.ValorConvertido = ValorIngresado*2.54;
            break;
        }
        return ValorConvertido;
    }

    public String getOpcionConversion() {
        return OpcionConversion;
    }
}
