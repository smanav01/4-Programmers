/*import datamanagement package*/
package datamanagement;
public class UnitProxy implements IUnit 
	
{

// variable declaration 
private String UC;
private String un;
UnitManager   um;

/* constructor UnitProxy 
	@param 
		-unitCode and unitName
*/
    public UnitProxy( String unitCode, String unitName ) 
	{
        	this.UC = unitCode;
            	this.un = unitName;
                um = UnitManager.UM(); 
	}
/*
Method getUnitCode
@return 
	-UC
*/
    public String getUnitCode() 
	{ 
            	return this.UC;
	}

/*
Method getUnitName
@return 
	-un
*/

    public String getUnitName()		 	
	{ 
            	return this.un; 
        }

    public void setPsCutoff1(float cutoff) 
	{
            	um.getUnit(UC).setPsCutoff1(cutoff);
	}
   
/*
Method getPsCutoff
@return 
	-getPsCutoff
*/ 
	public float getPsCutoff() 
	{
        	return um.getUnit(UC).getPsCutoff();
	}

/*
Method setCrCutoff
@param
	-Crcutoff

*/
    public void setCrCutoff(float cutoff)
	{
		um.getUnit(UC).setCrCutoff(cutoff);
    	}

/*
Method getPsCutoff1
@return
	-Crcutoff

*/
    public float getCrCutoff() 
	{
		return um.getUnit(UC).getCrCutoff();
    	}

/*
Method setDiCutoff
@param
	-Dicutoff

*/
    public void setDiCutoff(float cutoff) 
	{
		um.getUnit(UC).setDiCutoff(cutoff);
	}

/*
Method getDiCutoff1
@return
	-Dicutoff

*/
    public float getDiCuttoff() 
	{
		return um.getUnit(UC).getDiCuttoff();
	}

/*
Method setHdCutoff
@param
	-Hdcutoff

*/
    public void setHdCutoff(float cutoff)
 	{
    		um.getUnit(UC).setHdCutoff(cutoff);
	}
/*
Method getHdCutoff1
@return
	-Hdcutoff

*/
    public float getHdCutoff() 
	{
	        return um.getUnit(UC).getHdCutoff();
	}

/*
Method setAeCutoff
@param
	-Aecutoff

*/
    public void setAeCutoff(float cutoff) 
	{
		um.getUnit(UC).setAeCutoff(cutoff);
    	}
/*
Method getAeCutoff1
@return
	-Aecutoff

*/
    public float getAeCutoff() 	
	{
		return um.getUnit(UC).getAeCutoff();
	}
/*
Method getGrade
@param
	-getGrade

*/
    public String getGrade(float f1, float f2, float f3) 
	{
		return um.getUnit(UC).getGrade(f1, f2, f3);
    	}
    public void addStudentRecord(IStudentUnitRecord record) 
	{ 
		um.getUnit(UC).addStudentRecord(record);
    	}
    public IStudentUnitRecord getStudentRecord(int s) 
	{
		return um.getUnit(UC).getStudentRecord(s);
	}
    public StudentUnitRecordList listStudentRecords() 
	{
    		return um.getUnit(UC).listStudentRecords();
	}
    public int getAsg1Weight() 
	{
		return um.getUnit(UC).getAsg1Weight();
	}
    public int getAsg2Weight() 
	{
		return um.getUnit(UC).getAsg2Weight();
	}
    public int getExamWeight() 
	{
		return um.getUnit(UC).getExamWeight();
	}
    public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt)
 	{
		um.getUnit(UC).setAssessmentWeights(asg1Wgt, asg2Wgt, examWgt);
	}
	}
