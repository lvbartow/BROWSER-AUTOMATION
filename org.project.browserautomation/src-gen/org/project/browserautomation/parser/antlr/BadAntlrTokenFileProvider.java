/*
 * generated by Xtext 2.36.0
 */
package org.project.browserautomation.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BadAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/project/browserautomation/parser/antlr/internal/InternalBad.tokens");
	}
}
