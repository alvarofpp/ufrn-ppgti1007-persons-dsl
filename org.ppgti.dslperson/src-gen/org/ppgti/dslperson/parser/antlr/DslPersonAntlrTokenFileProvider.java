/*
 * generated by Xtext 2.25.0
 */
package org.ppgti.dslperson.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslPersonAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/ppgti/dslperson/parser/antlr/internal/InternalDslPerson.tokens");
	}
}