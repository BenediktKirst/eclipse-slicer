package de.hu_berlin.slice.plugin.jobs;

import org.eclipse.jdt.core.IJavaProject;

import com.ibm.wala.ipa.callgraph.AnalysisScope;
import com.ibm.wala.ipa.cha.ClassHierarchy;

import de.hu_berlin.slice.plugin.context.EditorContextFactory.EditorContext;

/**
 * @author IShowerNaked
 * 
 * Collects all the necessary information needed to run the slice
 */
public class SlicingContext {

    EditorContext editorContext;

    AnalysisScope analysisScope;

    ClassHierarchy classHierarchy;

    public SlicingContext(EditorContext editorContext) {
        this.editorContext = editorContext;
    }

    //GETTER-Methods
    public IJavaProject getJavaProject() {
        return editorContext.getJavaProjectContext().getJavaProject();
    }

    public AnalysisScope getAnalysisScope() {
        return analysisScope;
    }

    public ClassHierarchy getClassHierarchy() {
        return classHierarchy;
    }
}