package com.saerix.methodcommand;

import org.bukkit.command.CommandSender;

public interface PermissionHandler {
	public boolean hasPermission(CommandSender sender, String[] permissions);
}