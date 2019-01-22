# vlcj-swt
Support classes for vlcj to use an SWT Composite as a video surface in a vlcj EmbeddedMediaPlayer.

This project provides a new factory, SwtMediaPlayerFactory, that can be used to create a new
CompositeVideoSurface.

This video surface can then be attached to a standard vlcj EmbeddedMediaPlayer with no further changes.

## Important
This library requires vlcj-4, it will *not* work with any vlcj-3 release. vlcj-4 is currently in
development and is not yet available from the Maven Central repository.

Check the pom.xml for the architecture-specific dependencies for SWT.

At the present time, this project defaults to 64-bit Linux.

Other changes may need to be made for other platforms.
