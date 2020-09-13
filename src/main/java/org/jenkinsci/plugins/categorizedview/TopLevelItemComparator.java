package org.jenkinsci.plugins.categorizedview;

import java.io.Serializable;
import java.util.Comparator;

import hudson.model.TopLevelItem;

final class TopLevelItemComparator implements Comparator<TopLevelItem>, Serializable {
	private static final long serialVersionUID = 4675871668915456895L;

	@Override
	public int compare(final TopLevelItem o1, final TopLevelItem o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
}