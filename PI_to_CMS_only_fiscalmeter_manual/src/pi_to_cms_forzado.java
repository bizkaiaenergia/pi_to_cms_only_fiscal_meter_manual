




import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


public class pi_to_cms_forzado {
	public static String  ruta_temp_outFile;
	public static String  ruta_cms_outFile;
	
	//public static String ultimo_bucle_generado ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		propiedades Archivopropiedades = new propiedades();
		ruta_temp_outFile = Archivopropiedades.temp_outFile();
		 ruta_cms_outFile=  Archivopropiedades.cms_outFile();
		
		
		System.out.println("Importación ficheros sistema Landis a PI_UFL entre 2 fechas ");
		Scanner user_input = new Scanner( System.in );
		String Fecha_inicio;
		System.out.print("Introducir fecha inicio: [dd/MM/aaaa]");
		Fecha_inicio = user_input.next( );
		//user_input.close();
		String Fecha_fin;
		System.out.print("Introducir fecha final: [dd/MM/aaaa]");
		Fecha_fin = user_input.next( );
		user_input.close();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
		Date fecha_inicio_date = null;
		Date fecha_fin_date = null;
		try {
			fecha_inicio_date = sdf.parse(Fecha_inicio);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fecha_fin_date = sdf.parse(Fecha_fin);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		GregorianCalendar cal_fecha_inicio = new GregorianCalendar ();
		GregorianCalendar cal_fecha_fin = new GregorianCalendar ();
		cal_fecha_inicio.setTime(fecha_inicio_date);
		cal_fecha_fin.setTime(fecha_fin_date);
		
		
		
		while(cal_fecha_fin.after(cal_fecha_inicio)){	
			
			
			System.out.println("Se generarán los ficheros ...");
			
			Date Fecha = cal_fecha_inicio.getTime();
			
			pi_to_cms_fiscalmeter.main(Fecha,ruta_temp_outFile,ruta_cms_outFile);
			
			cal_fecha_inicio.add(Calendar.HOUR_OF_DAY,+1);
			
		
		}
				
			 
		}
		
	}


