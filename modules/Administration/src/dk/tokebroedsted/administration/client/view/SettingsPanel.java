package dk.tokebroedsted.administration.client.view;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.TextBox;

public class SettingsPanel extends FlowPanel {
    private FeedItemSetup feedItemSetup;

    public SettingsPanel(FeedItemSetup feedItemSetup) {
        this.feedItemSetup = feedItemSetup;
        setStyleName("settings-panel");
    }

    public void updateView() {
        clear();

        FlowPanel heightInputPanel = new FlowPanel();
        heightInputPanel.add(new InlineLabel("Højde: "));
        final TextBox heightInput = new TextBox();
        heightInput.setValue(String.valueOf(feedItemSetup.feedItem.getHeight()));
        heightInputPanel.add(heightInput);

        FlowPanel widthInputPanel = new FlowPanel();
        widthInputPanel.add(new InlineLabel("Bredde: "));
        final TextBox widthInput = new TextBox();
        widthInput.setValue(String.valueOf(feedItemSetup.feedItem.getWidth()));
        widthInputPanel.add(widthInput);

        FlowPanel colorInputPanel = new FlowPanel();
        colorInputPanel.add(new InlineLabel("Farve: "));
        final TextBox colorInput = new TextBox();
        colorInput.setValue(feedItemSetup.feedItem.getColor());
        colorInputPanel.add(colorInput);

        add(heightInputPanel);
        add(widthInputPanel);
        add(colorInputPanel);

        ChangeHandler changeHappenedHandler = new ChangeHandler() {
            @Override
            public void onChange(ChangeEvent event) {
                feedItemSetup.feedItem.setWidth(Integer.parseInt(widthInput.getValue()));
                feedItemSetup.feedItem.setHeight(Integer.parseInt(heightInput.getValue()));
                feedItemSetup.feedItem.setColor(colorInput.getValue());

                feedItemSetup.updateViews();
            }
        };

        widthInput.addChangeHandler(changeHappenedHandler);
        heightInput.addChangeHandler(changeHappenedHandler);
        colorInput.addChangeHandler(changeHappenedHandler);
    }
}
