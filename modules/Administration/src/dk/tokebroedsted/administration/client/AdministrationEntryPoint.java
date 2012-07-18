package dk.tokebroedsted.administration.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class AdministrationEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        final RootPanel rootPanel = RootPanel.get("gwt_administration");

        AdministrationServiceAsync administrationService = AdministrationService.App.getInstance();
        rootPanel.add(new FeedSetupView(administrationService));

        /*AdministrationServiceAsync instance = AdministrationService.App.getInstance();
        instance.getMessage(new AsyncCallback<String>() {
            @Override
            public void onFailure(Throwable caught) {
            }

            @Override
            public void onSuccess(String result) {
                rootPanel.add(new Label(result));
            }
        });*/
    }
}
