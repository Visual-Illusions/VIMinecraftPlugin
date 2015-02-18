/*
 * This file is part of Visual Illusions Minecraft Plugin Base Library.
 *
 * Copyright © 2013-2015 Visual Illusions Entertainment
 *
 * Visual Illusions Minecraft Plugin Base Library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * Visual Illusions Minecraft Plugin Base Library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with Visual Illusions Minecraft Plugin Base Library.
 * If not, see http://www.gnu.org/licenses/lgpl.html.
 */
package net.visualillusionsent.minecraft.plugin;

import net.visualillusionsent.utils.ProgramChecker;
import net.visualillusionsent.utils.ProgramStatus;

import java.util.logging.Logger;

/**
 * Base Visual Illusions Plugin interface
 *
 * @author Jason (darkdiplomat)
 */
public interface VisualIllusionsPlugin {
    /*
      Visual Illusions Dev Notes:
      As of 20 October 2013, versions are now Major.Minor.Revision for all Visual Illusions Plugins
     */

    String getPluginName();

    String getPluginVersion();

    long[] getVersionArray();

    boolean buildSet();

    String getBuild();

    boolean buildTimeSet();

    String getBuildTime();

    String getDevelopers();

    boolean wikiURLSet();

    String getWikiURL();

    String getIssuesURL();

    String getCopyYear();

    ProgramChecker getProgramChecker();

    ProgramStatus getStatus();

    Logger getPluginLogger();
}
