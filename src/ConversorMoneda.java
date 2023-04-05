public class ConversorMoneda {    

    private double ValorIngresado;
    private String OpcionConversion;
    private double ValorConvertido;
    //"Peso Colombiano a Dólar","Peso Colombiano a Euro","Peso Colombiano a Libra Esterlina","Peso Colombiano a Yen Japonés","Peso Colombiano a  Won sul-coreano", 
    //"Dólar a Peso Colombiano","Euro a Peso Colombiano","Libra Esterlina a Peso Colombiano","Yen Japonés a Peso Colombiano","Won sul-coreano a Peso Colombiano"

    public double ConvertirMoneda(double valorIngresado, String opcionConversion) {
        this.ValorIngresado = valorIngresado;
        this.OpcionConversion = opcionConversion;

        switch (OpcionConversion){
            case "Peso Colombiano a Dólar":
                this.ValorConvertido = valorIngresado*0.00022;
            break;

            case "Peso Colombiano a Euro":
                this.ValorConvertido = valorIngresado*0.002;
            break;

            case "Peso Colombiano a Libra Esterlina":
                this.ValorConvertido = valorIngresado*0.00017;
            break;

            case "Peso Colombiano a Yen Japonés":
                this.ValorConvertido = valorIngresado*0.029;
            break;

            case "Peso Colombiano a  Won sul-coreano":
                this.ValorConvertido = valorIngresado*0.29;
            break;

            case "Dólar a Peso Colombiano":
                this.ValorConvertido = valorIngresado*4591.37;
            break;

            case "Euro a Peso Colombiano":
                this.ValorConvertido = valorIngresado*5025.13;
            break;
            
            case "Libra Esterlina a Peso Colombiano":
                this.ValorConvertido = valorIngresado*5733.94;     
            break;
        
            case "Yen Japonés a Peso Colombiano":
                this.ValorConvertido = valorIngresado*34.84;     
            break;
        
            case "Won sul-coreano a Peso Colombiano":
                this.ValorConvertido = valorIngresado*3.5;     
            break;
        }
        return ValorConvertido;
    }

    public double getValorIngresado() {
        return ValorIngresado;
    }

}
