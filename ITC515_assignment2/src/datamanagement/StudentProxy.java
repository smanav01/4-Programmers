/*import package for the class*/
package datamanagement;
public class StudentProxy implements IStudent { //defining class StudentProx which implements IStudent class
    private Integer I; //declaring variables
    private String l;
    private String Il;
    private StudentManager lI;
    public StudentProxy(Integer id, String fn, String Il) { //Passing variables to StudentProxy Constructor
        this.I = id; //assigning values to the variables
        this.l = fn;
        this.Il = Il;
        this.lI = StudentManager.get();
    }

    public Integer getID() {
        return I; //This will return the Id of the student
    }

    public String getFirstName() {
        return l; //This will return the first name of student
    }

    public String getLastName() {
        return Il; // This will return the lastname of student
    }

    public void setFirstName(String firstName) {
        lI.getStudent(I).setFirstName(firstName); //Setting first name
    }

    public void setLastName(String lastName) {
        lI.getStudent(I).setLastName(lastName); //Setting last name
    }

    public void addUnitRecord(IStudentUnitRecord record) {
        lI.getStudent(I).addUnitRecord(record); // adding unit records
    }

    public IStudentUnitRecord getUnitRecord(String unitCode) {
        return lI.getStudent(I).getUnitRecord(unitCode); //getting unit records
    }

    public StudentUnitRecordList getUnitRecords() {
        return lI.getStudent(I).getUnitRecords();
    }
}