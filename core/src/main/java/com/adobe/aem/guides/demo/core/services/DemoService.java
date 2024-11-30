package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = DemoService.class , immediate=true,enabled =true)
public class DemoService {

    private static final Logger LOG = LoggerFactory.getLogger(DemoService.class);

    @Activate
    public void activate() {
        LOG.info("DemoService activate() started");
    }

    @Deactivate
    public void deactivate() {
        LOG.info("DemoService deactivate() end");
    }

    @Modified
    public void modify() {
        LOG.info("DemoService modify() started");
    }
    public String PrintData()
    {
        return "print data of DemoPressRelease";
    }


}
