//import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Conversor_main {
    public static void main(String[] args) {
        
        Object[] OpcionesConversor = {"Moneda.", "Temperatura.", "Longitud."};
        Object[] OpcionesMoneda = {"Peso Colombiano a Dólar","Peso Colombiano a Euro","Peso Colombiano a Libra Esterlina","Peso Colombiano a Yen Japonés","Peso Colombiano a  Won sul-coreano", 
        "Dólar a Peso Colombiano","Euro a Peso Colombiano","Libra Esterlina a Peso Colombiano","Yen Japonés a Peso Colombiano","Won sul-coreano a Peso Colombiano"};
        Object[] OpcionesTemperatura = {"ºC a K", "ºC a ºF", "K a ºF", "K a ºC", "ºF a ºC", "ºF a K"};
        Object[] OpcionesLongitud = {"km a millas", "millas a km","cm a in", "in a cm"};
        
        String OpcionConversorElegido;
        String OpcionMonedaElegida;
        String OpcionTemperaturaElegida;
        String OpcionLongitudElegida;        
        int ValorIngresado=0;
        int continuar=0; //0=aceptar/si; 1=no; 2=cancelar

        while (continuar==0){
                //menú principal
            OpcionConversorElegido = (String)JOptionPane.showInputDialog(null, "Seleccione el conversor deseado.", "Conversores",JOptionPane.PLAIN_MESSAGE,null,OpcionesConversor,OpcionesConversor[0]);
            
            try{
                ValorIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desee convertir"));
                
                switch (OpcionConversorElegido){
                    case "Moneda.":
                        ConversorMoneda Moneda = new ConversorMoneda();            
                        OpcionMonedaElegida = (String)JOptionPane.showInputDialog(null, "Seleccione el conversor deseado.","Conversor de moneda.",JOptionPane.PLAIN_MESSAGE,null,OpcionesMoneda, OpcionesMoneda[0]);
                        JOptionPane.showInternalMessageDialog(null,"El resultado de la conversión es"+"\n"+Moneda.ConvertirMoneda(ValorIngresado, OpcionMonedaElegida));
                    break;
    
                    case "Temperatura.":
                        ConversorTemperatura Temperatura = new ConversorTemperatura();
                        OpcionTemperaturaElegida = (String)JOptionPane.showInputDialog(null, "Seleccione el conversor deseado.","Conversor de Temperatura.",JOptionPane.PLAIN_MESSAGE,null,OpcionesTemperatura, OpcionesTemperatura[0]);
                        JOptionPane.showInternalMessageDialog(null,"El resultado de la conversión es"+"\n"+Temperatura.ConvertirTemperatura(ValorIngresado, OpcionTemperaturaElegida));
                    break;
    
                    case "Longitud.":
                        ConversorLongitud Longitud = new ConversorLongitud();
                        OpcionLongitudElegida = (String)JOptionPane.showInputDialog(null, "Seleccione el conversor deseado.","Conversor de Longitud.",JOptionPane.PLAIN_MESSAGE,null,OpcionesLongitud, OpcionesLongitud[0]);
                        JOptionPane.showInternalMessageDialog(null,"El resultado de la conversión es"+"\n"+Longitud.ConvertirLongitud(ValorIngresado, OpcionLongitudElegida));
                    break;
                }
            }
            catch(Exception error) {
                JOptionPane.showMessageDialog(null,"El valor ingresado debe ser un número.","Error",JOptionPane.WARNING_MESSAGE);
            }
            
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
            System.out.println(continuar);
            
        }
        if(continuar==1||continuar==2){
            JOptionPane.showMessageDialog(null, "Programa Terminado");
            System.exit(0);
        }
    }
}
