/**
 * Copyright 2014 Telefonica Investigación y Desarrollo, S.A.U <br>
 * This file is part of FI-WARE project.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License.
 * </p>
 * <p>
 * You may obtain a copy of the License at:<br>
 * <br>
 * http://www.apache.org/licenses/LICENSE-2.0
 * </p>
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * </p>
 * <p>
 * See the License for the specific language governing permissions and limitations under the License.
 * </p>
 * <p>
 * For those usages not covered by the Apache version 2.0 License please contact with opensource@tid.es
 * </p>
 */

package com.telefonica.euro_iaas.paasmanager.manager;

import java.util.List;

import com.telefonica.fiware.commons.dao.AlreadyExistsEntityException;
import com.telefonica.fiware.commons.dao.EntityNotFoundException;
import com.telefonica.fiware.commons.dao.InvalidEntityException;
import com.telefonica.euro_iaas.paasmanager.exception.InfrastructureException;
import com.telefonica.euro_iaas.paasmanager.model.Rule;

public interface RuleManager {

    /**
     * Create an rule.
     * 
     * @param rule
     * @return the securityGroup.
     */
    Rule create(String region, String token, String vdc, Rule rule) throws InvalidEntityException,
            AlreadyExistsEntityException, InfrastructureException;

    /**
     * Destroy a previously creted rule.
     * 
     * @param rule
     *            the candidate to rule
     */
    void destroy(String region, String token, String vdc, Rule rule) throws InvalidEntityException,
            InfrastructureException;

    /**
     * Find the rule using the given name.
     * 
     * @param name
     *            the name
     * @return the rule
     * @throws EntityNotFoundException
     *             if the product instance does not exists
     */
    Rule load(String name) throws EntityNotFoundException;

    /**
     * Retrieve all Environment created in the system.
     * 
     * @return the existent environments.
     */
    List<Rule> findAll();

}
