package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate=true)
public class DemoPressRelease {

    
    private static final Logger LOG = LoggerFactory.getLogger(DemoPressRelease.class);
    @Reference
    
    DemoService demoService;

    @Activate
    public void activate() 
    {
        String result=demoService.PrintData();
        LOG.info("DemoPressRelease activate() started");
        LOG.info("Result{}",result);
    
    }

    @Deactivate
    public void deactivate() {
        LOG.info("DemoPressRelease deactivate() end");
    }

    @Modified
    public void modify() {
        LOG.info("DemoSeDemoPressRelease modify() started");
    }

    
}