/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.liquorshop.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.liquorshop.fulfilmentprocess.constants.LiquorshopFulfilmentProcessConstants;

public class LiquorshopFulfilmentProcessManager extends GeneratedLiquorshopFulfilmentProcessManager
{
	public static final LiquorshopFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (LiquorshopFulfilmentProcessManager) em.getExtension(LiquorshopFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
