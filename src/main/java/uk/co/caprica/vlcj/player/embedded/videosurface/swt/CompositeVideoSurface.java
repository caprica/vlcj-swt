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

package uk.co.caprica.vlcj.player.embedded.videosurface.swt;

import org.eclipse.swt.widgets.Composite;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.embedded.videosurface.VideoSurface;
import uk.co.caprica.vlcj.player.embedded.videosurface.VideoSurfaceAdapter;

/**
 * Implementation of a video surface component that uses an SWT Composite.
 */
public class CompositeVideoSurface extends VideoSurface {

    /**
     *
     */
    private final Composite composite;

    /**
     *
     *
     * @param composite
     * @param videoSurfaceAdapter
     */
    public CompositeVideoSurface(Composite composite, VideoSurfaceAdapter videoSurfaceAdapter) {
        super(videoSurfaceAdapter);
        this.composite = composite;
    }

    @Override
    public void attach(MediaPlayer mediaPlayer) {
        videoSurfaceAdapter.attach(mediaPlayer, composite.embeddedHandle);
    }

}
