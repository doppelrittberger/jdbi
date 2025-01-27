/*
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
package org.jdbi.v3.core.argument;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.jdbi.v3.core.statement.StatementContext;
import org.jdbi.v3.meta.Beta;

/**
 * Returns an Argument based on a name. Used to lookup multiple properties e.g. in a Bean or a Map.
 */
@FunctionalInterface
public interface NamedArgumentFinder {
    Optional<Argument> find(String name, StatementContext ctx);

    /**
     * Returns the names this named argument finder can find. Returns an empty collection otherwise.
     *
     * @return the names this named argument finder can find. Returns an empty collection otherwise.
     */
    @Beta
    default Collection<String> getNames() {
        return Collections.emptySet();
    }
}
