/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.component.soap.config.model;

import org.switchyard.config.model.composer.MessageComposerModel;

/**
 * SOAPMessageComposerModel.
 */
public interface SOAPMessageComposerModel extends MessageComposerModel {

    /**
     * Indicates whether the composer is in "unwrapped" mode.
     * @return true if the composer is in unwrapped mode, false otherwise
     */
    Boolean isUnwrapped();

    /**
     * Specifies that the composer should operate in "unwrapped" mode.
     * @param unwrapped true to operate in unwrapped mode
     * @return this instance (useful for chaining)
     */
    SOAPMessageComposerModel setUnwrapped(boolean unwrapped);

    /**
     * Indicates whether the composer copies namespaces when extracting a body.
     * @return true if the composer copies namespaces, false otherwise
     */
    Boolean isCopyNamespaces();

    /**
     * Specifies that the composer should copy namespaces when extracting a body.
     * @param copyNamespaces true to copy namespaces
     * @return this instance (useful for chaining)
     */
    SOAPMessageComposerModel setCopyNamespaces(boolean copyNamespaces);

}
