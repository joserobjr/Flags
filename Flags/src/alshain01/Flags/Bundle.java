/* Copyright 2013 Kevin Seiden. All rights reserved.

 This works is licensed under the Creative Commons Attribution-NonCommercial 3.0

 You are Free to:
    to Share � to copy, distribute and transmit the work
    to Remix � to adapt the work

 Under the following conditions:
    Attribution � You must attribute the work in the manner specified by the author (but not in any way that suggests that they endorse you or your use of the work).
    Non-commercial � You may not use this work for commercial purposes.

 With the understanding that:
    Waiver � Any of the above conditions can be waived if you get permission from the copyright holder.
    Public Domain � Where the work or any of its elements is in the public domain under applicable law, that status is in no way affected by the license.
    Other Rights � In no way are any of the following rights affected by the license:
        Your fair dealing or fair use rights, or other applicable copyright exceptions and limitations;
        The author's moral rights;
        Rights other persons may have either in the work itself or in how the work is used, such as publicity or privacy rights.

 Notice � For any reuse or distribution, you must make clear to others the license terms of this work. The best way to do this is with a link to this web page.
 http://creativecommons.org/licenses/by-nc/3.0/
 */

package alshain01.Flags;

import java.util.Set;

/**
 * API for bundle management.
 * 
 * @author Alshain01
 */
public final class Bundle {
	/**
	 * Gets a bundle from the data store.
	 * 
	 * @param bundle
	 *            The bundle name to retrieve
	 * @return A list containing the bundle. Null if it doesn't exist.
	 */
	public final static Set<Flag> getBundle(String bundle) {
		return Flags.getDataStore().readBundle(bundle);
	}

	/**
	 * Gets a set of bundle names created on the server.
	 * 
	 * @return A set of bundles names configured on the server.
	 */
	public final static Set<String> getBundleNames() {
		return Flags.getDataStore().readBundles();
	}

	/**
	 * Checks if a bundle name exists in the data store.
	 * 
	 * @param bundle
	 *            A string bundle name.
	 * @return True if the string is a valid bundle name.
	 */
	public final static boolean isBundle(String bundle) {
		return getBundleNames().contains(bundle.toLowerCase());
	}

	/**
	 * Sets a bundle to the data file.
	 * 
	 * @param name
	 *            The bundle name
	 * @param flags
	 *            A list of flags in the bundle. (does not verify validity)
	 */
	public final static void setBundle(String name, Set<Flag> flags) {
		Flags.getDataStore().writeBundle(name, flags);
	}

	private Bundle() {
	}
}
