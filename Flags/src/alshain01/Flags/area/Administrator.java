package alshain01.Flags.area;

/**
 * Interface that defines if the land system allows for administrator areas.
 * Administrator areas are special areas that differ from areas normal players create.
 *
 * @author Alshain01
 */
public interface Administrator {
	/**
	 * Checks if the area is an Administrator area defined by the system.
	 * @return true if the area is an administrator area
	 */
	public boolean isAdminArea();
}
