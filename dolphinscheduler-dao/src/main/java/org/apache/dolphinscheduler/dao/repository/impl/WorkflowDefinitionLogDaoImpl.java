/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.dao.repository.impl;

import org.apache.dolphinscheduler.dao.entity.WorkflowDefinitionLog;
import org.apache.dolphinscheduler.dao.mapper.WorkflowDefinitionLogMapper;
import org.apache.dolphinscheduler.dao.repository.BaseDao;
import org.apache.dolphinscheduler.dao.repository.WorkflowDefinitionLogDao;

import lombok.NonNull;

import org.springframework.stereotype.Repository;

@Repository
public class WorkflowDefinitionLogDaoImpl extends BaseDao<WorkflowDefinitionLog, WorkflowDefinitionLogMapper>
        implements
            WorkflowDefinitionLogDao {

    public WorkflowDefinitionLogDaoImpl(@NonNull WorkflowDefinitionLogMapper workflowDefinitionLogMapper) {
        super(workflowDefinitionLogMapper);
    }

    @Override
    public WorkflowDefinitionLog queryByDefinitionCodeAndVersion(long workflowDefinitionCode,
                                                                 int workflowDefinitionVersion) {
        return mybatisMapper.queryByDefinitionCodeAndVersion(workflowDefinitionCode, workflowDefinitionVersion);
    }

    @Override
    public void deleteByWorkflowDefinitionCode(long workflowDefinitionCode) {
        mybatisMapper.deleteByProcessDefinitionCode(workflowDefinitionCode);
    }
}
