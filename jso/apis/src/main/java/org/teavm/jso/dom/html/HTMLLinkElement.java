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

public abstract class HTMLLinkElement extends HTMLElement {
    @JSProperty
    public abstract String getHref();

    @JSProperty
    public abstract void setHref(String href);

    @JSProperty
    public abstract String getCrossOrigin();

    @JSProperty
    public abstract void setCrossOrigin(String crossOrigin);

    @JSProperty
    public abstract String getRel();

    @JSProperty
    public abstract void setRel(String rel);

    @JSProperty
    public abstract String getMedia();

    @JSProperty
    public abstract void setMedia(String media);

    @JSProperty
    public abstract String getHreflang();

    @JSProperty
    public abstract void setHreflang(String hreflang);

    @JSProperty
    public abstract String getType();

    @JSProperty
    public abstract void setType(String property);
}
