/*
 * Copyright 2012 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.kie.guvnor.dtablexls.backend.server.conversion.builders;

import java.util.List;

import org.drools.guvnor.models.guided.dtable.shared.model.DTCellValue52;

/**
 * Something that can convert a String value into one or more DTCellValue52's
 */
public interface ParameterizedValueBuilder {

    public String getTemplate();

    public List<String> getParameters();

    public List<List<DTCellValue52>> getColumnData();

    public void addCellValue( final int row,
                              final int column,
                              final String value );

}
