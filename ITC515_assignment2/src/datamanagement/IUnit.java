/*import package*/
package datamanagement;

public interface IUnit 

{
    public String getUnitCode(); //getting name and code of subject
    public String getUnitName();
    
    public float getPsCutoff();
    public void  setPsCutoff1(float cutoff); //setting pass cut off

    public float getCrCutoff();
    public void  setCrCutoff(float cutoff); //setting credit cut off

    public float getDiCuttoff();    
    public void  setDiCutoff(float cutoff);   //setting distinction cut off

    public float getHdCutoff();
    public void  setHdCutoff(float cutoff);    //setting high distinction cut off

    public float getAeCutoff();    
    public void  setAeCutoff(float cutoff);
    
    public int getAsg1Weight();  // weightage of assignment 1
    public int getAsg2Weight(); // weightage of assignment 2
    public int getExamWeight(); // weightage of exam

    public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);

    public String getGrade(float asg1, float asg2, float exam);
    /* getting grade based on both the assignments and exam */

    public void addStudentRecord(IStudentUnitRecord record );
    public IStudentUnitRecord getStudentRecord(int studentID );
    
    public StudentUnitRecordList listStudentRecords();
}
