/*
 * Copyright 2013-2014 Urs Wolfer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.urswolfer.gerrit.client.rest.http.common;

import com.google.gerrit.extensions.api.projects.TagInfo;

/**
 * @author Pavel Bely
 */
public class TagInfoBuilder {
    private final TagInfo tagInfo = new TagInfo(null, null, false, null);

    public TagInfo get() {
        return tagInfo;
    }

    public TagInfoBuilder withRef(String ref) {
        tagInfo.ref = ref;
        return this;
    }

    public TagInfoBuilder withRevision(String revision) {
        tagInfo.revision = revision;
        return this;
    }

    public TagInfoBuilder withCanDelete(boolean canDelete) {
        tagInfo.canDelete = canDelete;
        return this;
    }
}
