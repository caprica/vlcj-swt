# vlcj-swt
Support classes for vlcj to use an SWT Composite as a video surface in a vlcj EmbeddedMediaPlayer.

This project provides a new factory, SwtMediaPlayerFactory, that can be used to create a new
CompositeVideoSurface.

This video surface can then be attached to a standard vlcj EmbeddedMediaPlayer with no further changes.

## Important
This library requires vlcj-4, it will *not* work with any vlcj-3 release. vlcj-4 is currently in
development and is not yet available from the Maven Central repository.

## Building
Since this project uses SWT, there are platform-specific concerns to be aware of as SWT uses different
artefacts per platform.

This project pom uses standard Maven profiles to build the project for a particular run-time platform.

By default, if you run `mvn install` on your platform the correct profile should be detected and the
correct SWT dependency for your platform will be pulled in.

If you want to build for multiple platforms, you can specify the profile to use:

 - `mvn -P linux-x86-64 clean install`
 - `mvn -P linux-x86 clean install`
 - `mvn -P win32-x86-64 clean install`
 - `mvn -P win32-x86 clean install`
 - `mvn -P macosx-x86-64 clean install`

Check the pom.xml for the architecture-specific dependencies for SWT.

Other changes may need to be made for other platforms.
