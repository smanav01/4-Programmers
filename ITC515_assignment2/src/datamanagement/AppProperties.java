/*import package*/
package datamanagement;
import java.util.*;
import java.io.*;    /*importing utility and input and output package*/

public class AppProperties /*Class starts here*/
{
  private static AppProperties self = null;  
  private Properties properties;            

  public static AppProperties getInstance()
 {
  if (self == null)  
 {
  self = new AppProperties();  /* assigning property*/
 }
  return self;     
 }
  private AppProperties()
 {
  properties = new Properties();
  try                          
 {
  properties.load(new FileInputStream("Properties.prop")); /*opening file*/
 } 
  catch (IOException e)      /*throwing exception*/
 {
  throw new RuntimeException("Could not read property file");
 }
 }
    public Properties getProperties()
 {
  return properties;
 }
 }
