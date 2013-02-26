/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2012, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.testing.templateengine.standard.config.test;




public final class DefaultTestNameStandardDirectiveResolver extends AbstractStandardDirectiveResolver<String> {

    public static final DefaultTestNameStandardDirectiveResolver INSTANCE = new DefaultTestNameStandardDirectiveResolver();
    public static final String DEFAULT_VALUE = null; 
    
    
    private DefaultTestNameStandardDirectiveResolver() {
        super(String.class);
    }


    @Override
    public String getValue(final String executionId, final String documentName, 
            final String directiveName, final String directiveQualifier, final String directiveValue) {

        if (directiveValue != null && !(directiveValue.trim().equals(""))) {
            return directiveValue;
        }
        if (documentName != null && !(documentName.trim().equals(""))) {
            return documentName;
        }
        
        return DEFAULT_VALUE;
        
    }

   
}
