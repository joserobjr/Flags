package alshain01.Flags.area;

/**
 * Interface that defines area types that can be placed under
 * siege by the land management system
 * 
 * @author Alshain01
  */
public interface Siege {
	/**
	 * Checks if the area is under siege.
	 * (Grief Prevention Feature)
	 * 
	 * @return true if the area is under siege
	 */
	public boolean isUnderSiege();
}
