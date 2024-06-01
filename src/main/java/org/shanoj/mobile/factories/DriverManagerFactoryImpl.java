package org.shanoj.mobile.factories;


import org.shanoj.mobile.enums.Platform;
import org.shanoj.mobile.exceptions.PlatformNotSupportedException;
import org.shanoj.mobile.managers.AndroidDriverManager;
import org.shanoj.mobile.managers.IDriverManager;
import org.shanoj.mobile.managers.IOSDriverManager;

public class DriverManagerFactoryImpl implements IDriverManagerFactory {

    @Override
    public IDriverManager getManager(Platform platform) throws PlatformNotSupportedException {
        IDriverManager iDriverManager;
        switch (platform) {
            case IOS:
                iDriverManager = new IOSDriverManager();
                break;

            case ANDROID:
                iDriverManager = new AndroidDriverManager();
                break;

            default:
                throw new PlatformNotSupportedException(
                        "Platform not supported! Check if you set ios or android on the parameter.");
        }
        return iDriverManager;
    }
}
