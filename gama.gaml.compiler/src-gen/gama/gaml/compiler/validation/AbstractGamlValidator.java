/*
 * generated by Xtext
 */
package gama.gaml.compiler.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGamlValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(gama.gaml.compiler.gaml.GamlPackage.eINSTANCE);
		return result;
	}
}
