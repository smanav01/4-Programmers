/*import package*/
package datamanagement;
public class ListStudentsCTL  //start of class
 {
   private StudentManager sm;
   public ListStudentsCTL()
  {
    sm = StudentManager.get();
  }
   public void listStudents(IStudentLister lister, String unitCode) /*listing students along with their subject codes*/
  {
   lister.clearStudents();
   StudentMap students = sm.getStudentsByUnit(unitCode);
   for (Integer id : students.keySet()) lister.addStudent(students.get(id));
  }
 }
