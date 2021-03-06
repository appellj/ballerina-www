package org.ballerinalang.platform.playground.controller.containercluster;

import java.util.List;

public interface ContainerRuntimeClient {

    public boolean createDeployment(int deploymentNameSuffix, String reason);

    public boolean createService(int serviceNameSuffix, String reason);

    public boolean deleteDeployment(String deploymentName);

    public boolean deleteService(String serviceName);

    public List<String> getDeployments();

    public List<String> getServices();

    public boolean deploymentExists(String deploymentName);

    public boolean serviceExists(String serviceName);

//    public Deployment getDeploymentByName(String deploymentName);
}