package de.vidar.example.ui.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

@SpringView(name = SettingsPage.VIEW_NAME)
public class SettingsPage extends VerticalLayout implements View {

	public static final String VIEW_NAME = "SettingsPage";

	@PostConstruct
	void init() {
		Label title = new Label();
		title.setCaption("Settings");
		title.setValue("Settings view");
		addComponent(title);
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
		// This view is constructed in the init() method()
	}
}
