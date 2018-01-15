package de.hu_berlin.slice.plugin;

import javax.inject.Singleton;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * Service Class to get all the needed Information regarding the workspace.
 * @author IShowerNaked
 */
@Singleton
public class WorkspaceService {

	/**
	 * Returns the absolute Path.
	 * @param path
	 * @return the 
	 */
    public IPath getAbsolutePath(IPath path) {

        String absolutePathAsString = getAbsolutePathAsString(path);

        return Path.fromOSString(absolutePathAsString);
    }
    
    /**
     * Returns the absolute Path as a String.
     * @param path
     * @return
     */
    public String getAbsolutePathAsString(IPath path) {

        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

        IResource resource = workspaceRoot.findMember(path);
        if (null == resource) {
            return path.toOSString();
        }
        else {
            return resource.getLocation().toOSString();
        }
    }
}