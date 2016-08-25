/*import package*/
package datamanagement;
public class ListUnitsCTL {
    private UnitManager um;
    public ListUnitsCTL() {
        um = UnitManager.UM();
    }
    public void listUnits(IUnitLister lister) {
        lister.clearUnits(); //clear units
        UnitMap units = um.getUnits();
        for (String s: units.keySet())
            lister.addUnit(units.get(s)); //add units
    }
}