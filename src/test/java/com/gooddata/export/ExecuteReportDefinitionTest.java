/*
 * Copyright (C) 2004-2017, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.export;

import org.testng.annotations.Test;

import static net.javacrumbs.jsonunit.JsonMatchers.jsonEquals;
import static net.javacrumbs.jsonunit.core.util.ResourceUtils.resource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.MatchesPattern.matchesPattern;

public class ExecuteReportDefinitionTest {

    @Test
    public void testSerialization() throws Exception {
        final ReportRequest request = new ExecuteReportDefinition("DEF-URI");
        assertThat(request, jsonEquals(resource("report/executeDefinition.json")));
    }

    @Test
    public void testToStringFormat() {
        final ReportRequest request = new ExecuteReportDefinition("DEF-URI");

        assertThat(request.toString(), matchesPattern(ExecuteReportDefinition.class.getSimpleName() + "\\[.*\\]"));
    }
}