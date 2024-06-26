/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.jso.dom.html;

import org.teavm.jso.JSProperty;
import org.teavm.jso.canvas.CanvasImageSource;

public abstract class HTMLImageElement extends HTMLElement implements CanvasImageSource {
    @JSProperty
    public abstract String getAlt();

    @JSProperty
    public abstract void setAlt(String alt);

    @JSProperty
    public abstract int getWidth();

    @JSProperty
    public abstract void setWidth(int width);

    @JSProperty
    public abstract int getHeight();

    @JSProperty
    public abstract void setHeight(int height);

    @JSProperty
    public abstract int getNaturalWidth();

    @JSProperty
    public abstract int getNaturalHeight();

    @JSProperty
    public abstract String getSrc();

    @JSProperty
    public abstract void setSrc(String src);

    @JSProperty
    public abstract String getCrossOrigin();

    @JSProperty
    public abstract void setCrossOrigin(String crossOrigin);
}
