/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.liquorshop.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.liquorshop.core.constants.LiquorshopCoreConstants;
import com.liquorshop.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class LiquorshopCoreManager extends GeneratedLiquorshopCoreManager
{
	public static final LiquorshopCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (LiquorshopCoreManager) em.getExtension(LiquorshopCoreConstants.EXTENSIONNAME);
	}
}
