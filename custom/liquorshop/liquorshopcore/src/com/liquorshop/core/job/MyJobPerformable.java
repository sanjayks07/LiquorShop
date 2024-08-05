package com.liquorshop.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

public class MyJobPerformable extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(MyJobPerformable.class.getName());

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info("**********************************");
        LOG.info("Greeting from MyJobPerformable!!!");
        LOG.info("**********************************");

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
