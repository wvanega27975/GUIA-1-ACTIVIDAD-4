
/**
 * Write a description of class EjercicioTroncoDeCono here.
 *
 * @author (WVANEGAS)
 * @version (1_20190804)
 */
import java.util.Scanner;
public class EjercicioTroncoDeCono
{
        public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double ri;
        double h;
        double pi;
        double rs;
        double volumen;
        
        System.out.print("\nIngrese la altura del cono: ");
        String Ingreso = entrada.next();
        h = Double.parseDouble(Ingreso);
        
        System.out.print("\nIngrese le valor del radio inferiro: ");
        String Ingresob = entrada.next();
        ri = Double.parseDouble(Ingresob);
        
        System.out.print("\nIngrese le valor del radio superior: ");
        String Ingresoc = entrada.next();
        rs = Double.parseDouble(Ingresoc);
        
        System.out.print("\nIngrese le valor de PI: ");
        String Ingresod = entrada.next();
        pi = Double.parseDouble(Ingresod);
        
        volumen = (pi*(Math.pow(ri,2)+Math.pow(rs,2)+(ri*rs))*h)/3;
        
        System.out.println(volumen);
        
    }
    
}
