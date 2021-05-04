package org.eclipse.emf.parsley.examples.rap.ui;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.edit.action.IMenuContributionSpecification;
import org.eclipse.emf.parsley.examples.rap.model.Element;
import org.eclipse.emf.parsley.runtime.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

public class SignalMenuBuilder extends EditingMenuBuilder {
	public List<IMenuContributionSpecification> emfMenuContributions(final Element element) {

		final IAcceptor<Element> _function = (Element e) -> {

			e.setName("test");
		};

		IMenuContributionSpecification _actionChange = this.<Element>actionChange("Add a new element", element,
				_function);
		return Collections.<IMenuContributionSpecification>unmodifiableList(
				CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionChange));
	}
}
