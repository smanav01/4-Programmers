/*import package*/
package datamanagement;

/* students marks for ass1 and ass2 are added to get total marks based on student and 
unitcode*/
public interface IStudentUnitRecord 
{
    public Integer getStudentID();
    public String getUnitCode();

    public void setAsg1(float mark); 
    public float getAsg1();

    public void setAsg2(float mark);
    public float getAsg2();

    public void setExam(float mark);
    public float getExam();

    public float getTotal(); //total marks of both the assignments
}
