package com.org.tav.day8.dp;

//abstract factory interface knows about all product types
public interface GUIFactory {
	Button createbutton();
	Checkboxes createcheckbox();
}
