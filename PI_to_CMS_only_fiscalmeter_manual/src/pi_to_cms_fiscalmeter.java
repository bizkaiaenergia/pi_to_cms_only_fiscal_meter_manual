




import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Format;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class pi_to_cms_fiscalmeter {

	
	
	
	public static String hora_actual;
	
	public static String minutos_actual;
	
	public static String dia_actual;
	
	public static String año_actual;
	
	public static String año_largo;
	
	public static String mes_actual;
	
	public static String mes_corto;
	
	
	
	
	public static String hora_posterior;
	
	public static String minutos_hora_posterior;
	
	public static String dia_hora_posterior;
	
	public static String año_hora_posterior;
	
	public static String año_hora_posterior_largo;
	
	public static String mes_hora_posterior;
	
	public static String mes_corto_hora_posterior;
	
	
	
	
	public static String 	 hora_menos_dos_horas;
	
	public static String 	 minutos_menos_dos_horas;
	
	public static String 	 dia_menos_dos_horas ;
	
	public static String año_menos_dos_horas_corto;
	public static String 	 año_menos_dos_horas_largo;
	
	
	public static String mes_menos_dos_horas;
	public static String mes_menos_dos_horas_corto ;
	
	
public static String 	 hora_menos_una_hora;
	
	public static String 	 minutos_menos_una_hora;
	
	public static String 	 dia_menos_una_hora ;
	
	public static String año_menos_una_hora_corto;
	public static String 	 año_menos_una_hora_largo;
	
	
	public static String mes_menos_una_hora;
	public static String mes_menos_una_hora_corto ;
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(Date fecha,String ruta_temp_outFile,String ruta_cms_outFile) {
		
		System.out.println("Importación ficheros sistema PI a CMS");
			
		
				try {
				Thread.sleep(1000);
				
			//	Date fecha = new Date();
				
				Format formatter = new SimpleDateFormat("HH");
				 hora_actual= formatter.format(fecha);
				formatter = new SimpleDateFormat("mm");
				 minutos_actual= formatter.format(fecha);
				formatter = new SimpleDateFormat("dd");
				 dia_actual= formatter.format(fecha);
				formatter = new SimpleDateFormat("yy");
				 año_actual= formatter.format(fecha);
				 formatter = new SimpleDateFormat("yyyy");
				 año_largo= formatter.format(fecha);
				 formatter = new SimpleDateFormat("MM");
				 mes_corto= formatter.format(fecha);
				 formatter = new SimpleDateFormat("MMM",new Locale("us_US"));
				 mes_actual= formatter.format(fecha);
				
				 
				GregorianCalendar cal_fecha = new GregorianCalendar ();
				cal_fecha.setTime(fecha);
				cal_fecha.add(Calendar.HOUR_OF_DAY,+1);
				Date Fecha_mas_una_hora = cal_fecha.getTime();
				
				formatter = new SimpleDateFormat("HH");
				 hora_posterior= formatter.format(Fecha_mas_una_hora);
				formatter = new SimpleDateFormat("mm");
				 minutos_hora_posterior= formatter.format(Fecha_mas_una_hora);
				formatter = new SimpleDateFormat("dd");
				 dia_hora_posterior= formatter.format(Fecha_mas_una_hora);
				formatter = new SimpleDateFormat("yy");
				 año_hora_posterior= formatter.format(Fecha_mas_una_hora);
				 formatter = new SimpleDateFormat("yyyy");
				 año_hora_posterior_largo= formatter.format(Fecha_mas_una_hora);
				 formatter = new SimpleDateFormat("MM");
				 mes_corto_hora_posterior= formatter.format(Fecha_mas_una_hora);
				 formatter = new SimpleDateFormat("MMM",new Locale("us_US"));
				 mes_hora_posterior= formatter.format(Fecha_mas_una_hora);
				 
				
				 
				 GregorianCalendar cal_fecha2 = new GregorianCalendar ();
					cal_fecha2.setTime(fecha);
					cal_fecha2.add(Calendar.HOUR_OF_DAY,-2);
					Date Fecha_menos_dos_horas = cal_fecha2.getTime();
					
					formatter = new SimpleDateFormat("HH");
					 hora_menos_dos_horas= formatter.format(Fecha_menos_dos_horas);
					formatter = new SimpleDateFormat("mm");
					 minutos_menos_dos_horas= formatter.format(Fecha_menos_dos_horas);
					formatter = new SimpleDateFormat("dd");
					 dia_menos_dos_horas= formatter.format(Fecha_menos_dos_horas);
					formatter = new SimpleDateFormat("yy");
					 año_menos_dos_horas_corto= formatter.format(Fecha_menos_dos_horas);
					 formatter = new SimpleDateFormat("yyyy");
					 año_menos_dos_horas_largo= formatter.format(Fecha_menos_dos_horas);
					 formatter = new SimpleDateFormat("MM");
					 mes_menos_dos_horas_corto= formatter.format(Fecha_menos_dos_horas);
					 formatter = new SimpleDateFormat("MMM",new Locale("us_US"));
					 mes_menos_dos_horas= formatter.format(Fecha_menos_dos_horas);
				
					 
					 GregorianCalendar cal_fecha3 = new GregorianCalendar ();
						cal_fecha3.setTime(fecha);
						cal_fecha3.add(Calendar.HOUR_OF_DAY,-1);
						Date Fecha_menos_una_hora = cal_fecha3.getTime();
						
						formatter = new SimpleDateFormat("HH");
						 hora_menos_una_hora= formatter.format(Fecha_menos_una_hora);
						formatter = new SimpleDateFormat("mm");
						 minutos_menos_una_hora= formatter.format(Fecha_menos_una_hora);
						formatter = new SimpleDateFormat("dd");
						 dia_menos_una_hora= formatter.format(Fecha_menos_una_hora);
						formatter = new SimpleDateFormat("yy");
						 año_menos_una_hora_corto= formatter.format(Fecha_menos_una_hora);
						 formatter = new SimpleDateFormat("yyyy");
						 año_menos_una_hora_largo= formatter.format(Fecha_menos_una_hora);
						 formatter = new SimpleDateFormat("MM");
						 mes_menos_una_hora_corto= formatter.format(Fecha_menos_una_hora);
						 formatter = new SimpleDateFormat("MMM",new Locale("us_US"));
						 mes_menos_una_hora= formatter.format(Fecha_menos_una_hora);
					 
					 
					 
					 
					 
				
				System.out.println(ruta_temp_outFile);
				System.out.println(ruta_cms_outFile);
				
				//se comentan estas lineas para probar con el comando pisnap.
				String texto1 = "@echo off\r\n@table piarc\r\n@mode list\r\n@istru tag, starttime, endtime, count\r\n@ostru tag, value\r\n@ostru ...\r\n";	
				//String texto2 = "FiscalMeter.Tag,"+ dia_menos_dos_horas+"-"+ mes_menos_dos_horas+"-"+año_menos_dos_horas_corto+" "+hora_menos_dos_horas+":00:00,"+dia_actual+"-"+mes_actual+"-"+año_actual+
				//		" "+hora_actual+":00:00,1\r\n";
				String texto2 = "FiscalMeter.Tag,"+ dia_actual+"-"+ mes_actual+"-"+año_actual+" "+hora_actual+":00:00,"+dia_hora_posterior+"-"+mes_hora_posterior+"-"+año_hora_posterior+
								" "+hora_posterior+":00:00,1\r\n";		
				String texto3 = "@endsection\r\n";
				String todo = texto1+texto2+texto3;
			////////////	String todo= "@echo off\r\n@table pisnap\r\n@mode list\r\n@ostr tag, value\r\n@sele tag=FiscalMeter.Tag\r\n@ends\r\n";
				
				
				System.out.println(todo);
				try {
				File f = new File("0ZIVtag.txt");
				FileWriter fw;
				fw = new FileWriter(f);
				fw.write(todo);
				fw.close();
				Runtime rt = Runtime.getRuntime();
				Process pr1;
				///////String archivo_salida = temp_outFile + "AmorebietaCMSPlantData_" + año_hora_anterior_largo + año_hora_anterior_largo + dia_hora_anterior + hora_anterior + "_ZIV.dat";
				///String archivo_salida = temp_outFile + "AmorebietaCMSPlantData_" + año_menos_dos_horas_largo + mes_menos_dos_horas_corto + dia_menos_dos_horas + hora_menos_dos_horas + "_ZIV.dat";
				//String archivo_salida = ruta_temp_outFile + "AmorebietaCMSPlantData_" + año_largo + mes_corto + dia_actual + hora_actual + "_ZIV.dat";
				String archivo_salida = ruta_temp_outFile + "AmorebietaCMSPlantData_" + año_menos_una_hora_largo + mes_menos_una_hora_corto + dia_menos_una_hora + hora_menos_una_hora + "_ZIV.dat";
				
				
				
				
				String rt_exec = "cmd /c D://PI//adm//piconfig < 0ZIVtag.txt > " + archivo_salida;
				pr1 = rt.exec(rt_exec);
				
			//	System.out.println(rt_exec);
				BufferedReader input = new BufferedReader(new InputStreamReader(pr1.getInputStream()));
				String line=null;
				while((line=input.readLine()) != null) {
			        System.out.println(line); 
			        int exitVal;
			        exitVal = pr1.waitFor();
			        System.out.println("Exited with error code "+exitVal); 
				}			
				
				File file = new File(archivo_salida);
				System.out.println("Se va a mover el archivo " + archivo_salida);
				File dir = new File(ruta_cms_outFile);
				
				boolean success = file.renameTo(new File(dir, file.getName()));
				
				//boolean success = true;
				System.out.println("A la dirección " + ruta_cms_outFile);
				
				if (!success) {
				   System.out.println("No se ha podido mover el fichero");
				}else{
				 // System.out.println("Fichero " + "AmorebietaCMSPlantData_" + año_menos_dos_horas_largo + mes_menos_dos_horas_corto + dia_menos_dos_horas + hora_menos_dos_horas + "_ZIV.dat"+ " movido con exito");
					 System.out.println("Fichero " + "AmorebietaCMSPlantData_" + año_menos_una_hora_largo + mes_menos_una_hora_corto + dia_menos_una_hora + hora_menos_una_hora + "_ZIV.dat"+ " movido con exito");
				}
				
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}finally {
				} 
	}
}

				
				
				
				
					
				
				
			 
			 
			 
			 
			 
			 
		
		
	


