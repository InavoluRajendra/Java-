package com.org.tav.day8.dp;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createbutton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public Checkboxes createcheckbox() {
		// TODO Auto-generated method stub
		return new Windowscheckbox();
	}

}
