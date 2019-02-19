/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2019 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.factory.swt;

import uk.co.caprica.vlcj.factory.discovery.NativeDiscovery;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;

import java.util.Collection;

// FIXME should we build an SwtEmbeddedMediaPlayerComponent that extends Composite, similar to how we extend JPanel for SWT?

/**
 * Extension to the default {@link MediaPlayerFactory} that provides SWT components.
 */
public class SwtMediaPlayerFactory extends MediaPlayerFactory {

    private final SwtService swtService;

    public SwtMediaPlayerFactory(NativeDiscovery discovery, String... libvlcArgs) {
        super(discovery, libvlcArgs);

        this.swtService = new SwtService(this);
    }

    public SwtMediaPlayerFactory(String... libvlcArgs) {
        this(null, libvlcArgs);
    }

    public SwtMediaPlayerFactory(NativeDiscovery discovery, Collection<String> libvlcArgs) {
        this(discovery, libvlcArgs.toArray(new String[libvlcArgs.size()]));
    }

    public SwtMediaPlayerFactory(Collection<String> libvlcArgs) {
        this(null, libvlcArgs.toArray(new String[libvlcArgs.size()]));
    }

    /**
     *
     *
     * @return
     */
    public final SwtService swt() {
        return swtService;
    }

    @Override
    public void onBeforeRelease() {
        swtService.release();
    }

}
