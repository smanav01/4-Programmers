/*package datamanagement;*/
import java.util.*; //importing utility class

  public interface IStudent //class starts here
  {
    public Integer getID();

    public String getFirstName();
    public void setFirstName(String firstName); //function for setting first name

    public String getLastName();
    public void setLastName(String lastName); //function for setting last name

    public void addUnitRecord( IStudentUnitRecord record ); /*adding units to student            record*/
    public IStudentUnitRecord getUnitRecord( String unitCode ); //getting unit codes

    public StudentUnitRecordList getUnitRecords(); 

   }
