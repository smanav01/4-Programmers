/*import package*/
package datamanagement;
public class ListUnitsCTL { //declaring class 
    private UnitManager um;
    public ListUnitsCTL() { //method declaration
        um = UnitManager.UM();
    }
    public void listUnits(IUnitLister lister) { //declaring default constructor
        lister.clearUnits(); //clear units
        UnitMap units = um.getUnits();
        for (String s: units.keySet())
            lister.addUnit(units.get(s)); //add units
    }
}