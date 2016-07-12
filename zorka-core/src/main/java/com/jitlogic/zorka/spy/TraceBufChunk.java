/**
 * Copyright 2012-2016 Rafal Lewczuk <rafal.lewczuk@jitlogic.com>
 * <p/>
 * This is free software. You can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * <p/>
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this software. If not, see <http://www.gnu.org/licenses/>.
 */

package com.jitlogic.zorka.spy;

public class TraceBufChunk {

    private byte[] buffer;

    private int offset;

    private int size;

    private TraceBufChunk next;

    public TraceBufChunk(int size) {
        this.size = size;
        this.buffer = new byte[size];
    }

    public byte[] getBuffer() {
        return buffer;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TraceBufChunk getNext() {
        return next;
    }

    public void setNext(TraceBufChunk next) {
        this.next = next;
    }

    public void reset() {
        offset = 0;
        size = 0;
        next = null;
    }
}

