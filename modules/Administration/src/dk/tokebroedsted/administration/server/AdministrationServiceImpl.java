package dk.tokebroedsted.administration.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import dk.tokebroedsted.administration.client.AdministrationService;

public class AdministrationServiceImpl extends RemoteServiceServlet implements AdministrationService {

    // Implementation of sample interface method
    public String getMessage() {
        return "Der var hul";
    }
}