package com.mostlyhard;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MostlyHardTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MostlyHardPlugin.class);
		RuneLite.main(args);
	}
}