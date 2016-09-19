package datamanagement;

public class Student implements IStudent {
/*declare variables*/
    private Integer id;
    private String fn;
    private String ln;
    private StudentUnitRecordList su;
    public Student(Integer id, String fn, String ln, StudentUnitRecordList su) { //passing parameters to Student 
        this.id = id;
        this.fn = fn;
        this.ln = ln;
        this.su =
            su == null ? new StudentUnitRecordList() :
            su;
    }

    public Integer getID() { //This method will get the Id of student
        return this.id;
    }

    public String getFirstName() { //This method will get the first name of Student
        return fn;
    }

    public void setFirstName(String firstName) { //This method will set the first name of Student
        this.fn = firstName;
    }

    public String getLastName() { //This method will get the last name of Student
        return ln;
    }

    public void setLastName(String lastName) { //This method will set the last name of Student
        this.ln = lastName;
    }

    public void addUnitRecord(IStudentUnitRecord record) { //This method will add the unit records
        su.add(record);
    }

    public IStudentUnitRecord getUnitRecord(String unitCode) { //This method will get the unit records
        for (IStudentUnitRecord r: su)
            if (r.getUnitCode().equals(unitCode))
                return r;
        return null;
    }

    public StudentUnitRecordList getUnitRecords() { //This method will get the unit records into the list
        return su;
    }
}