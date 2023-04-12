/*******************************************************************************************************
 *
 * GamlQualifiedNameProvider.java, in msi.gama.lang.gaml, is part of the source code of the
 * GAMA modeling and simulation platform (v.1.9.0).
 *
 * (c) 2007-2022 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 * 
 ********************************************************************************************************/
package gama.gaml.compiler.gaml.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import gama.core.annotations.common.interfaces.IKeyword;
import gama.gaml.compiler.gaml.ArgumentPair;
import gama.gaml.compiler.gaml.GamlDefinition;
import gama.gaml.compiler.gaml.Model;
import gama.gaml.compiler.gaml.S_Reflex;
import gama.gaml.compiler.gaml.speciesOrGridDisplayStatement;
import gama.gaml.compiler.gaml.util.GamlSwitch;
import gaml.core.descriptions.ModelDescription;

/**
 * GAML Qualified Name provider.
 *
 */
public class GamlQualifiedNameProvider extends IQualifiedNameProvider.AbstractImpl {

	/** The Constant NULL. */
	private final static String NULL = "";
	
	/** The Constant SWITCH. */
	private final static GamlSwitch<String> SWITCH = new GamlSwitch<String>() {

		@Override
		public String caseS_Reflex(final S_Reflex s) {
			if (s.getKey().equals(IKeyword.ASPECT)) { return s.getName(); }
			return NULL;
		}

		@Override
		public String casespeciesOrGridDisplayStatement(final speciesOrGridDisplayStatement s) {
			return NULL;
		}

		@Override
		public String caseModel(final Model o) {
			return o.getName() + ModelDescription.MODEL_SUFFIX;
		}

		@Override
		public String defaultCase(final EObject e) {
			return NULL;
		}

		@Override
		public String caseGamlDefinition(final GamlDefinition object) {
			return object.getName();
		}

		@Override
		public String caseArgumentPair(final ArgumentPair object) {
			return object.getOp();
		}

	};

	@Override
	public QualifiedName getFullyQualifiedName(final EObject input) {
		final String string = SWITCH.doSwitch(input);
		if (string == null || string.equals(NULL)) { return null; }
		return QualifiedName.create(string);
	}

}