package com.badlogic.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.drop.Drop;


public class DesktopLauncher {
		public static void main(String[] args) {
		      LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		      config.title = "HungryTardis";
		      config.width = 1280;
		      config.height = 720;
		      new LwjglApplication(new Drop(), config);
	}
}
