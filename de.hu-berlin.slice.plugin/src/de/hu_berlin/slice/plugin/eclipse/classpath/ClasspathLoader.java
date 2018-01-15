package de.hu_berlin.slice.plugin.eclipse.classpath;

import com.ibm.wala.cast.java.ipa.callgraph.JavaSourceAnalysisScope;
import com.ibm.wala.types.ClassLoaderReference;

/**
 * This class represents the four keys the classpath entries can be mapped to.
 * @author IShowerNaked
 */
public enum ClasspathLoader {

    APPLICATION (ClassLoaderReference.Application),
    EXTENSION   (ClassLoaderReference.Extension),
    PRIMORDIAL  (ClassLoaderReference.Primordial),
    SOURCE      (JavaSourceAnalysisScope.SOURCE);

    ClassLoaderReference classLoaderReference;

    ClasspathLoader(ClassLoaderReference classLoaderReference) {
        this.classLoaderReference = classLoaderReference;
    }

    public ClassLoaderReference getClassLoaderReference() {
        return classLoaderReference;
    }
}