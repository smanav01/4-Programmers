/*import datamanagement package*/
package datamanagement;

//  class defined cgCTL
public class cgCTL 
	{

	cgUI CGUI;
	String cuc = null;			// cuc defined as null
	Integer currentStudentID = null;	// CurrentStudentID as null
	boolean changed = false;

	public cgCTL() 
	{
	}

	public void execute() 
	{
		CGUI = new cgUI(this); 		// object declaration
		CGUI.setState1(false);

		CGUI.setState2(false);
		CGUI.setState3(false);
		CGUI.setState4(false);
		CGUI.setState5(false);
		CGUI.setState6(false);
		CGUI.Refresh3();

		ListUnitsCTL luCTL = new ListUnitsCTL(); // call object
		luCTL.listUnits(CGUI);
		CGUI.setVisible(true);
		CGUI.setState1(true);
	}

	public void unitSelected(String code) // method declaration and variable defined code
	{

		if (code.equals("NONE"))
			CGUI.setState2(false);
		
		else 
	{
			ListStudentsCTL lsCTL = new ListStudentsCTL(); // object declaration 
			lsCTL.listStudents(CGUI, code);
			cuc = code;
			CGUI.setState2(true);
	}
			CGUI.setState3(false);
	}

	public void studentSelected(Integer id)  // method declaration and student id variable declared
	{
		currentStudentID = id;
	
		if (currentStudentID.intValue() == 0) 
		{
			CGUI.Refresh3();
			CGUI.setState3(false);
			CGUI.setState4(false);
			CGUI.setState5(false);
			CGUI.setState6(false);
		}

		else 
		
		{
			IStudent s = StudentManager.get().getStudent(id);

			IStudentUnitRecord r = s.getUnitRecord(cuc);

			CGUI.setRecord(r);
			CGUI.setState3(true);
			CGUI.setState4(true);
			CGUI.setState5(false);
			CGUI.setState6(false);
			changed = false;

		}
	}

	public String checkGrade(float f, float g, float h) //method checkGread declaration 
	{
		IUnit u = UnitManager.UM().getUnit(cuc);
		String s = u.getGrade(f, g, h);
		CGUI.setState4(true);
		CGUI.setState5(false);
		
		if (changed) 
		{
			CGUI.setState6(true);
		}
		return s;
	}

	public void enableChangeMarks() 
	{
		CGUI.setState4(false);
		CGUI.setState6(false);
		CGUI.setState5(true);
		changed = true;
	}

	public void saveGrade(float asg1, float asg2, float exam) // variable diclaration
	{

		IUnit u = UnitManager.UM().getUnit(cuc);
		IStudent s = StudentManager.get().getStudent(currentStudentID);

		IStudentUnitRecord r = s.getUnitRecord(cuc);
		r.setAsg1(asg1);
		r.setAsg2(asg2);
		r.setExam(exam);
		StudentUnitRecordManager.instance().saveRecord(r);
		CGUI.setState4(true);
		CGUI.setState5(false);
		CGUI.setState6(false);
	}
}
