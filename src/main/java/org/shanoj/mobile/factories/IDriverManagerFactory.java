package org.shanoj.mobile.factories;

import org.shanoj.mobile.enums.Platform;
import org.shanoj.mobile.exceptions.PlatformNotSupportedException;
import org.shanoj.mobile.managers.IDriverManager;

public interface IDriverManagerFactory {
    IDriverManager getManager(Platform platform) throws PlatformNotSupportedException;
}
