/*import package*/
package datamanagement;
import java.util.*;
import java.io.*;   //importing input output package

/**
 * @author jtulip
 */

public interface IStudentLister 
  {
    public void clearStudents();
    public void addStudent(IStudent student); // adding students
  }
